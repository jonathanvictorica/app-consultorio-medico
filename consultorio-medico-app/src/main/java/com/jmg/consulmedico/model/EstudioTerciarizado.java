/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
public class EstudioTerciarizado extends Estudio{
    private Establecimiento establecimiento;
    private String abreviatura;
    private float costoOS;
    private float costoP;

    public EstudioTerciarizado(Establecimiento establecimiento, String abreviatura, float costoOS, float costoP, Integer codest, String estudio) {
        super(codest, estudio);
        this.establecimiento = establecimiento;
        this.abreviatura = abreviatura;
        this.costoOS = costoOS;
        this.costoP = costoP;
    }

    public EstudioTerciarizado(String nombreestudio) 
    {
        super(nombreestudio);
        this.terciarizado=true;
    }



    public void inicializarEstudioTerciarizado(ConexionDB conexion) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
             ResultSet rs = statement.executeQuery("SELECT * from estudioterciarizado_inicial where nombre = '" + this.estudio+ "'");
             if(rs.next())
             {
                 this.codest=rs.getInt(1);
                 this.establecimiento= new Establecimiento(rs.getInt(2),rs.getString(3),rs.getString(4),rs.getBoolean(5),rs.getString(6),rs.getString(7),new Localidad(rs.getString(8)),rs.getString(9),rs.getString(10));
                 this.abreviatura=rs.getString(12);
                 this.costoOS=rs.getFloat(13);
                 this.costoP=rs.getFloat(14);
                 
                 
             }
        } catch (SQLException ex) {
          
        }
         
    }
    
    
    
    
    
}
