/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class Especialidad {

   
    private Integer codigoEsp;
    private String NombreEsp;

    public Especialidad(Integer codigoEsp, String NombreEsp) {
        this.codigoEsp = codigoEsp;
        this.NombreEsp = NombreEsp;
    }

    public Especialidad(String NombreEsp) {
        this.NombreEsp = NombreEsp;
    }

    public Integer getCodigoEsp() {
        return codigoEsp;
    }

    public String getNombreEsp() {
        return NombreEsp;
    }
    
     public static List<Especialidad> retornarEspecialidad(ConexionDB conexion) {
        List<Especialidad> especialidades = new ArrayList<>();
         try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from especialidad");
            while(rs.next())
            {
                Especialidad especialidadnueva = new Especialidad(rs.getInt(1),rs.getString(2));
                especialidades.add(especialidadnueva);
            }
            
        } catch (SQLException ex) {
          
        }
         return especialidades;
    }
    
    
    
}
