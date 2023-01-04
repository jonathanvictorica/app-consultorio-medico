package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Estudio {

 
    

   
    protected Integer codest;
    protected String estudio;
    protected boolean terciarizado = false;
    public Estudio(Integer codest, String estudio) {
        this.codest = codest;
        this.estudio = estudio;
    }

    public Estudio(String estudio) {
        this.estudio=estudio;
    }


     public static List<Estudio> retornarEstudios() {
         List<Estudio> estudios = new ArrayList<>();
         try {
             java.sql.Statement statement = ConexionDB.getConexion().createStatement();
             ResultSet rs = statement.executeQuery("SELECT * from estudio");
             while (rs.next()) {
                 Estudio estudionuevo = new Estudio(rs.getInt(1), rs.getString(2));
                 estudios.add(estudionuevo);
             }

         } catch (SQLException ex) {
          
        }
         return estudios;
            
          
    }

    public static String retornarNombreDia(Date date) {

            try {

                java.sql.Statement statement = ConexionDB.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT  dayname('" + date + "')");
                if(rs.next())
                {
                    String diaseleccionado;
                    diaseleccionado = (String) rs.getObject(1);
                    switch(diaseleccionado)
                    {
                        case "Monday":
                            return "Lunes";
                        case "Tuesday":
                            return "Martes";
                        case "Wednesday":
                            return "Miercoles";
                        case "Thursday":
                            return "Jueves";
                        case "Friday":
                            return "Viernes";
                        default :
                            return "";
                    }


                }
            } catch (SQLException ex) {

            }
           return "";


    }

   public void buscarHorarioDisponible(List<Time> horarios) {
       int minutos=-10;
        for(int i=0;i<72;i++)
        {
            try {
                minutos=minutos+10;
                java.sql.Statement statement = ConexionDB.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT time('2003-12-12 07:00:00' + interval " + minutos + " minute)");
                if(rs.next())
                {
                  horarios.add(rs.getTime(1));


                }
            } catch (SQLException ex) {

            }


        }
    }

    public void inicializarEstudio() {
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select  * from estudio where nombreestudio '" + this.estudio + "'");
            if (rs.next()) {
                this.codest = rs.getInt(1);
                this.estudio = rs.getString(2);

            }
        } catch (SQLException ex) {
            
        }
     
          
    }
    
    
 

    
}
