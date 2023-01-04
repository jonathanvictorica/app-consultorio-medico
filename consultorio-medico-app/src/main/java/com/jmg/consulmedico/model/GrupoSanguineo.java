package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
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



   
    
    public static void llenarGruposSanguineo(JComboBox cboGrupoSanguineo) {

        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
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
