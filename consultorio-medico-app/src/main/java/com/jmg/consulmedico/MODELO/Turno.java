/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;
import com.jmg.consulmedico.VISTA.SOLICITARTURNO.VMostrarTurnoRealizarEstudio;
import com.jmg.consulmedico.VISTA.SOLICITARTURNO.VMostrarTurnoVisitaMedico;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Types;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
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

    public Integer getCodigoturno() {
        return codigoturno;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getFechaturno() {
        return fechaturno;
    }

    public static void recuperarFechas(JComboBox cboFechas) {
       ConexionDB conexion = new ConexionDB();
       int minutos=1440;
       cboFechas.removeAllItems();
       cboFechas.addItem("");
       
        for(int i=0;i<30;i++)
        {
            
            try {
                minutos=minutos+1440;
                 java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT date(now() + interval "+ minutos + " minute)");
                if(rs.next())
                {
                  cboFechas.addItem(rs.getDate(1));
                  
                    
                }
            } catch (SQLException ex) {
               
            }
            
                    
        }
    }
    
    public Time getHorarioturno() {
        return horarioturno;
    }

    public void setCodigoturno(Integer codigoturno) {
        this.codigoturno = codigoturno;
    }

    public void setFechaturno(Date fechaturno) {
        this.fechaturno = fechaturno;
    }

    public void setHorarioturno(Time horarioturno) {
        this.horarioturno = horarioturno;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setTipodeturno(String tipodeturno) {
        this.tipodeturno = tipodeturno;
    }

    public boolean isActivo() {
        return activo;
    }

   

   
    
  

     public static void ProcesarSolicituddeTurno(ConexionDB conexion, Turno turno) {
            ObraSocial obrasocialpaciente = null;
         switch(turno.getClass().getSimpleName())
        {
            case "Visita":
                  ((Visita)turno).getPaciente().setPacienteobrasocial(new PacienteObraSocial(((Visita)turno).getPaciente()));
                  ((Visita)turno).getPaciente().getPacienteobrasocial().buscarObraSocial(conexion);
                  
                 obrasocialpaciente = ((Visita)turno).getPaciente().getPacienteobrasocial().getObrasocial().get(0);
                  
                break;
            case "TurnoEstudio":
                  ((TurnoEstudio)turno).getPaciente().setPacienteobrasocial(new PacienteObraSocial(   ((TurnoEstudio)turno).getPaciente()));
                    ((TurnoEstudio)turno).getPaciente().getPacienteobrasocial().buscarObraSocial(conexion);
       
                 obrasocialpaciente = ((TurnoEstudio)turno).getPaciente().getPacienteobrasocial().getObrasocial().get(0);
                  break;
                
        }
         
         
         if(obrasocialpaciente.isActivo())
         {
            if(obrasocialpaciente.verificarVencimiento(conexion,turno.getPaciente().getPacienteobrasocial().getFechavencimiento().get(0))==false)
            {
                if(turno.tipodeturno.equals("Realizar Estudio"))
                {
                    ((TurnoEstudio)turno).ProcesarTurnoEstudio(conexion);

                }
                else
                {
                    ((Visita)turno).ProcesarTurnoMedico(conexion);
                }
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "La obra Social " +obrasocialpaciente.getNombreOS() + " del paciente " + turno.getPaciente().getApellido() + ", " + turno.getPaciente().getNombre() + " esta vencida.");
                
            }
         }
         else
         {
             JOptionPane.showConfirmDialog(null, "La obra Social " +obrasocialpaciente.getNombreOS() + " no trabaja más con este consultorio médico." );
         }
    }


    public static void MostrarTurno(ConexionDB conexion, Turno turno) {
       turno.almacenarTurno(conexion);
       switch(turno.tipodeturno)
       {
           case "Realizar Estudio":
               EstudioTerciarizado estudioterciarizado;
               estudioterciarizado = new EstudioTerciarizado(((TurnoEstudio)turno).getEstudio().estudio);
               
               estudioterciarizado.inicializarEstudioTerciarizado(conexion);
               
               if(estudioterciarizado.getAbreviatura()!=null)
               {
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

    public void almacenarTurno(ConexionDB conexion) {
        CallableStatement procedimiento;
        
        
       switch(this.tipodeturno)
       {
           case "Realizar Estudio":
          
              
                try {
                    procedimiento = conexion.getConexion().prepareCall("CALL ALMACENAR_TURNO_ESTUDIO(?,?,?,?,?)");
                     procedimiento.setInt("codigopaciente",this.paciente.getCodigopaciente() );
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
                    procedimiento = conexion.getConexion().prepareCall("CALL ALMACENAR_TURNO_VISITA(?,?,?,?,?)");
                     procedimiento.setInt("codigopaciente",this.paciente.getCodigopaciente() );
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
                    procedimiento = conexion.getConexion().prepareCall("CALL ALMACENAR_TURNO_VISITA(?,?,?,?,?)");
                     procedimiento.setInt("codigopaciente",this.paciente.getCodigopaciente() );
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

     public static void buscarTurnosdePaciente(List<Turno> turnosdepaciente,int codigopaciente) {
           ConexionDB conexion = new ConexionDB();
           Visita.BuscarTurnodeVisitadePaciente(conexion,turnosdepaciente,codigopaciente);
           TurnoEstudio.BuscarTurnodeEstudiodePaciente(conexion,turnosdepaciente,codigopaciente);
           
           
   
     }

    public void cancelarTurno() {
        try {
            ConexionDB conexion = new ConexionDB();
              CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL CancelarTurno(?)");
              procedimiento.setInt("codigo_turno",this.codigoturno);
              procedimiento.execute();
              
        } catch (SQLException ex) {
          
        }
           
    }

   

   
    
    
    
    
}
