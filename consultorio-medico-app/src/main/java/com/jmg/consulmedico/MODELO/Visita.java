/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;
import com.jmg.consulmedico.VISTA.SOLICITARTURNO.VHorarioMedico;
import com.jmg.consulmedico.VISTA.SOLICITARTURNO.VHorarioMedicoCabecera;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Visita extends Turno{

    

    

   
   

    
    private Medico medico;
    public boolean medicocabecera;

    public Visita(Medico medico, Integer codigoturno, Paciente paciente, Date fechaturno, Time horarioturno, boolean activo) {
        super(codigoturno, paciente, fechaturno, horarioturno, activo);
        this.medico = medico;
    }

    public Visita() {
        super();
    }

   

 

    public Medico getMedico() {
        return medico;
    }

    public void ProcesarTurnoMedico(ConexionDB conexion) {
        if(medicocabecera)
        {
            this.paciente.setPacientemedicocabezera(new PacienteMedicoCabecera(this.paciente));
            this.paciente.getPacientemedicocabezera().buscarMedicoCabecera(conexion);
            this.medico=this.paciente.getPacientemedicocabezera().getMedico().get(0);
            
            VHorarioMedicoCabecera vhorariomedicos = new VHorarioMedicoCabecera(this);
        }
        else
        {
                if(this.paciente.verificarTurnoconMedico(conexion, this.medico.getEspecialidad()))
                {
                          VHorarioMedico vhorariomedico = new VHorarioMedico(this);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El Paciente no esta autorizado por su medico de cabecera a visitar un especialista.");
                }
        }
    }

   
    public void inicializarTurnoVisita(ConexionDB conexion) {
        
    }
  
    
    public static List<Medico> llenarMedicosDisponibles(JComboBox cboMedicos, Date date, Visita visita, String nombreEsp) {
        String dia = Estudio.retornarNombreDia(date);
        List<Medico> medicos = new ArrayList<>();
        if(!"".equals(dia))
        {
            cboMedicos.removeAllItems();
           
            Visita.buscarMedicosdeEspecialidad(new ConexionDB(),medicos,nombreEsp,dia);


              cboMedicos.addItem("");
            for(int i=0;i<medicos.size();i++)
            {
                cboMedicos.addItem(medicos.get(i).getApellidoMed()+ " " + medicos.get(i).getNombreMed());

            }
            cboMedicos.setEnabled(true);
        
        }
        else
        {
            cboMedicos.setEnabled(false);
        }
        return medicos;
    }
    
    
     private static void buscarMedicosdeEspecialidad(ConexionDB conexion, List<Medico> medicos, String nombreEsp,String dia) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select distinct medico.codigomedico,nombre,apellido,numeromatricula from medico,especialidad,medicohorario where medico.codigomedico = medicohorario.codigomedico and medicohorario.dia = '" + dia + "' and especialidad.codigoespecialidad=medico.codigoespecialidad and nombreespecialidad = '"+ nombreEsp + "'");
            while(rs.next())
            {
                Medico mediconuevo = new Medico(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                mediconuevo.setEspecialidad(new Especialidad(nombreEsp));
                
                
                medicos.add(mediconuevo);
            }


        } catch (SQLException ex) {
           
        }
              
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setMedicocabecera(boolean medicocabecera) {
        this.medicocabecera = medicocabecera;
    }
     
     
     public static void llenarHorariosDisponibles(JComboBox cboHorarios, Date date, Medico medico) {
         String dia = Estudio.retornarNombreDia(date);
         List<Time> horarios = new ArrayList<>();
       
        if(!"".equals(dia))
        {
          medico.inicializarMedico(medico.getNumMatricula());
            medico.buscarHorarioDisponible(horarios,dia);

            List<Time> horariosocupados = new ArrayList<>();
            medico.recuperarHorariosOcupados(horariosocupados,date);

            for(int i=0;i<horarios.size();i++)
            {
                for(int j=0;j<horariosocupados.size();j++)
                {
                    if(horarios.get(i).equals(horariosocupados.get(j)))
                    {
                        horarios.remove(i);
                    }
                }
            }

            
            cboHorarios.removeAllItems();
            for(int i=0;i<horarios.size();i++)
            {
                cboHorarios.addItem(horarios.get(i));
            }
            cboHorarios.setEnabled(true);

        }
        else
        {
            cboHorarios.setEnabled(false);
        }
        
    }
     
     
     static void BuscarTurnodeVisitadePaciente(ConexionDB conexion,List<Turno> turnosdepaciente, int codigopaciente) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
              ResultSet rs = statement.executeQuery("select * from verturnosvisita where codigopaciente="+ codigopaciente );
              while(rs.next())
              {
                  Visita visitamedico = new Visita(new Medico(rs.getString(5), rs.getString(6),rs.getString(4) , new Especialidad(rs.getString(7))) , rs.getInt(1), new Paciente(), rs.getDate(2), rs.getTime(3), true);
                  turnosdepaciente.add(visitamedico);
              }
        } catch (SQLException ex) {
         
        }
            
    }

    public void procesarTurnoVisita(ConexionDB conexion) {
         try {
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL ModificarEstadoTurno(?)");
                procedimiento.setInt("codigo_visita",this.codigoturno);
                
                  
                procedimiento.execute();
                JOptionPane.showMessageDialog(null, "El turno del Paciente ha sido atendido. El médico correspondiente lo atenderá.");
                
        } catch (SQLException ex) {
           
        }

    }
     

}


