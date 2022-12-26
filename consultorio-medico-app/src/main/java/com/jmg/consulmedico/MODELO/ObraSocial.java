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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class ObraSocial {

    
    private Integer codigoOS;
    private String nombreOS;
    private boolean activo;
    private Localidad localidad;
    private String direccion;
    private String altura;
    private String telefono;
    private String codigopostal;

    public ObraSocial(String nombreOS) {
        this.nombreOS = nombreOS;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public ObraSocial(Integer codigoOS, String nombreOS, Localidad localidad, String direccion, String altura, String telefono, String codigopostal) {
        this.codigoOS = codigoOS;
        this.nombreOS = nombreOS;
        this.localidad = localidad;
        this.direccion = direccion;
        this.altura = altura;
        this.telefono = telefono;
        this.codigopostal = codigopostal;
    }

    public ObraSocial(String nombreOS, Localidad localidad, String direccion, String altura, String telefono, String codigopostal) {
        this.nombreOS = nombreOS;
        this.localidad = localidad;
        this.direccion = direccion;
        this.altura = altura;
        this.telefono = telefono;
        this.codigopostal = codigopostal;
    }

    public static void BuscarObrasSocialesActiva(ConexionDB conexion, List<ObraSocial> obrasocial) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from obrasocial where activo=true");
            while(rs.next())
            {
                ObraSocial obrasocialnueva = new ObraSocial(rs.getString(2));
                obrasocial.add(obrasocialnueva);
            }
        } catch (SQLException ex) {
           
        }
            
           
    }
    
    public Integer getCodigoOS() {
        return codigoOS;
    }

    public String getNombreOS() {
        return nombreOS;
    }

    public boolean isActivo() {
        return activo;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAltura() {
        return altura;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCodigopostal() {
        return codigopostal;
    }

    public boolean verificarVencimiento(ConexionDB conexion, Date fechavencimiento) {
        try {
            java.sql.Statement statement = conexion.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT date(now())");
            if(rs.next())
            {
                if(rs.getDate(1).after(fechavencimiento))
                {
                    return true;
                }
                else
                {
                    if(rs.getDate(1).equals(fechavencimiento))
                    {
                        return false;
                    }
                    else
                    {
                    return false;
                    }
                }
            }
        } catch (SQLException ex) {
         
        }
        return false;
           
              
    }

    public void almacenarObraSocial(ConexionDB conexion, String observacion) {
          try {
            //procedimiento almacenado de almacenar paciente
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL AlmacenarObraSocial(?,?,?,?,?,?,?,?)");
                procedimiento.setString("nombre_obra_social",this.nombreOS);
                procedimiento.setString("nombre_localidad", this.localidad.getNombreLoc());
                procedimiento.setString("direccion", this.direccion);
                procedimiento.setString("altura",this.altura);
                procedimiento.setString("telefono", this.telefono);
                procedimiento.setString("codigopostal", this.codigopostal);
                procedimiento.setString("observacion", observacion);
               
                procedimiento.registerOutParameter("registrado", Types.BOOLEAN);        
                procedimiento.execute();
                
                
                if(procedimiento.getBoolean("registrado"))
                {
                    JOptionPane.showMessageDialog(null, "La Obra Social ha sido registrada exitosamente.");
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "La Obra Social ya existe en la base de datos.");
                }
        } catch (SQLException ex) {
           
        }
    }
    
    
}
