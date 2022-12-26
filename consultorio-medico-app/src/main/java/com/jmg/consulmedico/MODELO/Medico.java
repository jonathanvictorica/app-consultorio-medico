/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Medico {

   
    private Integer codigoMed;
    private String nombreMed;
    private String apellidoMed;
    private String numMatricula;
    private Especialidad especialidad;
    private MedicoHorario medicohorario;
    
    
    public Medico()
    {
        
    }
    public Medico(String nombreMed, String apellidoMed, String numMatricula, Especialidad especialidad) {
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.numMatricula = numMatricula;
        this.especialidad = especialidad;
    }

    public Medico(Integer codigomedico,String nombreMed, String apellidoMed, String numMatricula) {
        this.nombreMed = nombreMed;
        this.apellidoMed = apellidoMed;
        this.numMatricula = numMatricula;
        this.codigoMed=codigomedico;
    }

    public Integer getCodigoMed() {
        return codigoMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public String getApellidoMed() {
        return apellidoMed;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

  
    
    
     public static void BuscarMedicos(ConexionDB conexion, List<Medico> medicos) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from medico");
            while(rs.next())
            {
                Medico mediconuevo = new Medico(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                 medicos.add(mediconuevo);
            }
            
        } catch (SQLException ex) {
          
        }
        
     }
    public static void BuscarMedicosdeCabeceras(ConexionDB conexion, List<Medico> medicos) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from medico where codigoespecialidad=24");
            while(rs.next())
            {
                Medico mediconuevo = new Medico(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                 medicos.add(mediconuevo);
            }
            
        } catch (SQLException ex) {
          
        }
            
           
    }
     
     
   

 

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad=especialidad;
    }

    public void buscarHorarioDisponible(List<Time> horarios, String dia) {
        ConexionDB conexion = new ConexionDB();
         
            try {
                this.medicohorario= new MedicoHorario(this);
                
                
                java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT * from medicohorario where codigomedico="+this.codigoMed+ " and dia ='"+ dia + "'");
                while(rs.next())
                {
                   this.medicohorario.getDia().add(rs.getString(2));
                   this.medicohorario.getHorainicial().add(rs.getTime(3));
                   this.medicohorario.getHorafinal().add(rs.getTime(4));
                   
                   
                   
                  
                    
                }
                
                for(int i=0;i<this.medicohorario.getDia().size();i++)
                {
                    boolean control=true;
                    int minutos=0;
     
                    while(control==true)
                    {
                        
                     java.sql.Statement statement2 = conexion.getConexion().createStatement();
                     ResultSet rs2 = statement2.executeQuery("SELECT time('2003-12-12 "+ this.medicohorario.getHorainicial().get(i) +"' + interval "+ minutos + " minute)");
                      minutos+=15;
                      if(rs2.next())
                      {
                          if(rs2.getTime(1).before(this.medicohorario.getHorafinal().get(i)))
                          {
                              horarios.add(rs2.getTime(1));
                          }
                          else
                          {
                              control=false;
                          }
                      }
                    
                    }
                }
            } catch (SQLException ex) {
               
            }
            
                    
        
        
    }

    public void recuperarHorariosOcupados(List<Time> horariosocupados, Date dia) {
             ConexionDB conexion = new ConexionDB(); 
            try {
              
                 java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("select horaturno from turno,visita where fechaturno ='" + dia + "' and visita.codigoturno=turno.codigoturno and visita.codigomedico = "+ this.codigoMed);
                
                while(rs.next())
                {
                  horariosocupados.add(rs.getTime(1));
                  
                    
                }
            } catch (SQLException ex) {
               
            }
    }

    public void almacenarMedico() {
        ConexionDB conexion = new ConexionDB();
         try {
            //procedimiento almacenado de almacenar paciente
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL AlmacenarMedico(?,?,?,?,?)");
                procedimiento.setString("numero_matricula",this.numMatricula);
                procedimiento.setString("nombre", this.nombreMed);
                procedimiento.setString("apellido", this.apellidoMed);
                procedimiento.setString("nombre_especialidad", this.especialidad.getNombreEsp());
               procedimiento.registerOutParameter("almacenado", Types.BOOLEAN);
                   procedimiento.execute();
                
                   if(procedimiento.getBoolean("almacenado"))
                   {
                       JOptionPane.showMessageDialog(null, "El médico fue almacenado exitosamente.");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "El médico ya existe en la base de datos.");
               
                   }
        } catch (SQLException ex) {
           
        }
    }

    
     public static List<String> retornarPacientesdeMedico(ConexionDB conexion, int codigomedico) {
        List<String> pacientesmedico = new ArrayList<>();
         try {
              
                 java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("select distinct concat(paciente.nombre,' ',paciente.apellido) from paciente,pacientemedicocabecera where paciente.codigopaciente = pacientemedicocabecera.codigopaciente and " + codigomedico +"= (select codigomedico from pacientemedicocabecera where codigopaciente = paciente.codigopaciente order by fechaactualizacion desc limit 1)");
                
                while(rs.next())
                {
                  pacientesmedico.add(rs.getString(1));
                  
                    
                }
            } catch (SQLException ex) {
               
            }
        
        
        
        return pacientesmedico;
    }

    public void inicializarMedico(String matricula) {
        ConexionDB conexion = new ConexionDB(); 
        try {
              
                 java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("select * from medico where numeromatricula = '" + matricula + "'");
                
                if(rs.next())
                {
                  this.codigoMed=rs.getInt(1);
                  this.nombreMed=rs.getString(2);
                  this.apellidoMed=rs.getString(3);
                  
                  
                    
                }
            } catch (SQLException ex) {
               
            }
    }
    
}
