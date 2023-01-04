package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import com.jmg.consulmedico.view.turno.VMostrarTurnoRealizarEstudio;
import com.jmg.consulmedico.view.turno.VMostrarTurnoVisitaMedico;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.sql.*;
import java.util.List;

@Getter
@Setter
public class Turno {

    

    

   

    protected Integer codigoturno;
    protected Paciente paciente;
    protected Date fechaturno;
    protected Time horarioturno;
    protected boolean activo;
    public String tipodeturno; //variable agregada
    public Turno()
    {
        
    }
    
    
    public Turno(Integer codigoturno, Paciente paciente, Date fechaturno, Time horarioturno, boolean activo) {
        this.codigoturno = codigoturno;
        this.paciente = paciente;
        this.fechaturno = fechaturno;
        this.horarioturno = horarioturno;
        this.activo = activo;
    }



    public static void recuperarFechas(JComboBox cboFechas) {
       int minutos=1440;
       cboFechas.removeAllItems();
       cboFechas.addItem("");
       
        for(int i=0;i<30;i++)
        {
            
            try {
                minutos=minutos+1440;
                 java.sql.Statement statement = ConexionDB.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT date(now() + interval " + minutos + " minute)");
                if(rs.next())
                {
                  cboFechas.addItem(rs.getDate(1));
                  
                    
                }
            } catch (SQLException ex) {
               
            }
            
                    
        }
    }


    public static void ProcesarSolicituddeTurno(Turno turno) {
        ObraSocial obrasocialpaciente = null;
        switch (turno.getClass().getSimpleName()) {
            case "Visita":
                ((Visita) turno).getPaciente().setPacienteobrasocial(new PacienteObraSocial(((Visita) turno).getPaciente()));
                ((Visita) turno).getPaciente().getPacienteobrasocial().buscarObraSocial();

                obrasocialpaciente = ((Visita) turno).getPaciente().getPacienteobrasocial().getObrasocial().get(0);

                break;
            case "TurnoEstudio":
                ((TurnoEstudio) turno).getPaciente().setPacienteobrasocial(new PacienteObraSocial(((TurnoEstudio) turno).getPaciente()));
                ((TurnoEstudio) turno).getPaciente().getPacienteobrasocial().buscarObraSocial();
       
                 obrasocialpaciente = ((TurnoEstudio)turno).getPaciente().getPacienteobrasocial().getObrasocial().get(0);
                  break;
                
        }
         
         
         if(obrasocialpaciente.isActivo())
         {
             if (obrasocialpaciente.verificarVencimiento(turno.getPaciente().getPacienteobrasocial().getFechavencimiento().get(0)) == false) {
                 if (turno.tipodeturno.equals("Realizar Estudio")) {
                     ((TurnoEstudio) turno).ProcesarTurnoEstudio();

                 } else {
                     ((Visita) turno).ProcesarTurnoMedico();
                 }
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "La obra Social " +obrasocialpaciente.getNombreOS() + " del paciente " + turno.getPaciente().getApellido() + ", " + turno.getPaciente().getNombre() + " esta vencida.");

            }
         } else {
             JOptionPane.showConfirmDialog(null, "La obra Social " + obrasocialpaciente.getNombreOS() + " no trabaja más con este consultorio médico.");
         }
    }


    public static void MostrarTurno(Turno turno) {
        turno.almacenarTurno();
        switch (turno.tipodeturno) {
            case "Realizar Estudio":
                EstudioTerciarizado estudioterciarizado;
                estudioterciarizado = new EstudioTerciarizado(((TurnoEstudio) turno).getEstudio().estudio);

                estudioterciarizado.inicializarEstudioTerciarizado();

                if (estudioterciarizado.getAbreviatura() != null) {
                   ((TurnoEstudio)turno).setEstudio(estudioterciarizado);
                   
               }
               VMostrarTurnoRealizarEstudio estudio= new VMostrarTurnoRealizarEstudio(turno);
               break;
           case "Visitar Especialista":
                VMostrarTurnoVisitaMedico vmedico = new  VMostrarTurnoVisitaMedico(turno);
             
               break;
           default :
                 VMostrarTurnoVisitaMedico vmedicos = new  VMostrarTurnoVisitaMedico(turno);
             
               break;
       }
    }

    public void setPaciente(Paciente paciente) {
        this.paciente=paciente;
    }

     public static void buscarTurnosdePaciente(List<Turno> turnosdepaciente,int codigopaciente) {
         Visita.BuscarTurnodeVisitadePaciente(turnosdepaciente, codigopaciente);
         TurnoEstudio.BuscarTurnodeEstudiodePaciente(turnosdepaciente, codigopaciente);


     }

    public void almacenarTurno() {
        CallableStatement procedimiento;


        switch (this.tipodeturno) {
            case "Realizar Estudio":


                try {
                    procedimiento = ConexionDB.getConexion().prepareCall("CALL ALMACENAR_TURNO_ESTUDIO(?,?,?,?,?)");
                    procedimiento.setInt("codigopaciente", this.paciente.getCodigopaciente());
                        procedimiento.setDate("fechaturno",this.fechaturno );
                        procedimiento.setTime("horaturno",this.horarioturno );
                        procedimiento.setString("nombre_estudio", ((TurnoEstudio)this).getEstudio().getEstudio());
                        procedimiento.registerOutParameter("codigo_turno", Types.INTEGER);


                        procedimiento.execute();

                        this.codigoturno=procedimiento.getInt("codigo_turno");
                } catch (SQLException ex) {

                }


               break;
           case "Visitar Especialista":

                try {
                    procedimiento = ConexionDB.getConexion().prepareCall("CALL ALMACENAR_TURNO_VISITA(?,?,?,?,?)");
                    procedimiento.setInt("codigopaciente", this.paciente.getCodigopaciente());
                        procedimiento.setDate("fechaturno",this.fechaturno );
                        procedimiento.setTime("horaturno",this.horarioturno );
                        procedimiento.setInt("codigomedico", ((Visita)this).getMedico().getCodigoMed());
                        procedimiento.registerOutParameter("codigo_turno", Types.INTEGER);


                        procedimiento.execute();

                        this.codigoturno=procedimiento.getInt("codigo_turno");
                } catch (SQLException ex) {

                }



               break;
           default :
               try {
                   procedimiento = ConexionDB.getConexion().prepareCall("CALL ALMACENAR_TURNO_VISITA(?,?,?,?,?)");
                   procedimiento.setInt("codigopaciente", this.paciente.getCodigopaciente());
                        procedimiento.setDate("fechaturno",this.fechaturno );
                        procedimiento.setTime("horaturno",this.horarioturno );
                        procedimiento.setInt("codigomedico", ((Visita)this).getMedico().getCodigoMed());
                        procedimiento.registerOutParameter("codigo_turno", Types.INTEGER);


                        procedimiento.execute();

                        this.codigoturno=procedimiento.getInt("codigo_turno");
                } catch (SQLException ex) {

                }





               break;
       }








    }

    public void cancelarTurno() {
        try {
            CallableStatement procedimiento = ConexionDB.getConexion().prepareCall("CALL CancelarTurno(?)");
              procedimiento.setInt("codigo_turno",this.codigoturno);
              procedimiento.execute();
              
        } catch (SQLException ex) {
          
        }
           
    }

   

   
    
    
    
    
}
