package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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


    
     public static List<Especialidad> retornarEspecialidad() {
         List<Especialidad> especialidades = new ArrayList<>();
         try {
             java.sql.Statement statement = ConexionDB.getConexion().createStatement();
             ResultSet rs = statement.executeQuery("SELECT * from especialidad");
             while (rs.next()) {
                 Especialidad especialidadnueva = new Especialidad(rs.getInt(1), rs.getString(2));
                 especialidades.add(especialidadnueva);
             }

         } catch (SQLException ex) {
          
        }
         return especialidades;
    }
    
    
    
}
