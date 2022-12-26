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
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class PacienteMedicoCabecera {

    

  
    private Paciente paciente;
    private List<Medico> medico;
    private List<Date> fechaactualizacion;

    public PacienteMedicoCabecera(Paciente paciente) {
        this.paciente = paciente;
        this.medico = new ArrayList<>();
         this.fechaactualizacion = new ArrayList<>();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public List<Medico> getMedico() {
        return medico;
    }

    public List<Date> getFechaactualizacion() {
        return fechaactualizacion;
    }

    

    public void buscarMedicoCabecera(ConexionDB conexion) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("select medico.codigomedico,medico.nombre,medico.apellido,medico.numeromatricula from medico,pacientemedicocabecera where medico.codigomedico = pacientemedicocabecera.codigomedico and pacientemedicocabecera.codigopaciente = "+ this.paciente.getCodigopaciente()+" order by fechaactualizacion desc limit 1");
                if(rs.next())
                {
                Medico mediconuevo = new Medico(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                mediconuevo.setEspecialidad(new Especialidad("Médico de Cabecera"));
                
                this.medico.add(mediconuevo);
                }
        } catch (SQLException ex) {
            
        }
             
    }
    
      public static void autorizarEstudio(ConexionDB conexion, String paciente, String estudio) {
        try {
            //procedimiento almacenado de almacenar paciente
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL autorizar_estudio(?,?,?)");
                procedimiento.setString("nombredepaciente",paciente);
                procedimiento.setString("nombredeestudio", estudio);
                procedimiento.registerOutParameter("autorizado",Types.BOOLEAN);   
                procedimiento.execute();
                
                   if(procedimiento.getBoolean("autorizado"))
                   {
                       JOptionPane.showMessageDialog(null, "El estudio fue autorizado exitosamente.");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "El estudio no se puede autorizar porque ya tiene un estudio ordenado sin solicitar turno.");
               
                   }
        } catch (SQLException ex) {
           
        }
    }
    
      
      public static void autorizarVisita(ConexionDB conexion, String paciente, String especialidad) {
       try {
            //procedimiento almacenado de almacenar paciente
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL autorizar_visita_especialista(?,?,?)");
                procedimiento.setString("nombre_paciente",paciente);
                procedimiento.setString("nombre_especialidad", especialidad);
                procedimiento.registerOutParameter("autorizado",Types.BOOLEAN);   
                procedimiento.execute();
                
                   if(procedimiento.getBoolean("autorizado"))
                   {
                       JOptionPane.showMessageDialog(null, "La visita fue autorizada exitosamente.");
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null, "La visita no se puede autorizar porque ya tiene un estudio ordenado sin solicitar turno.");
               
                   }
        } catch (SQLException ex) {
           
        }
    }
}