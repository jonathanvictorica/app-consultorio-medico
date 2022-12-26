/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;

/**
 *
 * @author Alumno
 */
public class GrupoSanguineo {

    
    private Integer codigoGS;
    private String tipo;

    public GrupoSanguineo(Integer codigoGS, String tipo) {
        this.codigoGS = codigoGS;
        this.tipo = tipo;
    }

    public GrupoSanguineo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCodigoGS() {
        return codigoGS;
    }

    public String getTipo() {
        return tipo;
    }

   
    
    public static void llenarGruposSanguineo(JComboBox cboGrupoSanguineo) {
        ConexionDB conexion = new ConexionDB();
        
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from gruposanguineo");
           cboGrupoSanguineo.removeAllItems();
            cboGrupoSanguineo.addItem("      ");
            while(rs.next())
            {
                 cboGrupoSanguineo.addItem(rs.getString(2));
            }
            
        } catch (SQLException ex) {
          
        }
    }
    
    
    
    
}
