/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class Usuario {
    private String nombre;
    private String clave;
    private String cargo;

    public Usuario(String nombre, String clave,String cargo) {
        this.nombre = nombre;
        this.clave = clave;
        this.cargo=cargo;
    }
    
    public boolean ValidarUsuario()
    {
        try {
            ConexionDB conexion = new ConexionDB();
            
             java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT * from users where nombre='"+this.nombre+"' and cargo = '" + this.cargo+ "'");
                if(rs.next())
                {
                                  
                    this.cargo=rs.getString(4);
                    if(this.clave.equals(rs.getString(3)))
                    {
                        JOptionPane.showMessageDialog(null, "Bienvenido al Sistema!!!");
                        return true;
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "La constraseña es incorrecta");
                        return false;
                    }
               
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El usuario no existe.");
                    return false;
                }
        } catch (SQLException ex) {
            
        }
          return false; 
        
    }
            
    public void registrarUsuario(ConexionDB conexion)
    {
         try {
           
             java.sql.Statement statement = conexion.getConexion().createStatement();
                ResultSet rs = statement.executeQuery("SELECT * from users where nombre='"+this.nombre+"'");
                if(!rs.next())
                {
                        try {
                             CallableStatement procedimiento;
                       procedimiento = conexion.getConexion().prepareCall("CALL RegistrarUsuario(?,?,?)");
                       procedimiento.setString("nombre",this.nombre );
                        procedimiento.setString("clave",this.clave );
                        procedimiento.setString("cargo",this.cargo );
                        

                        procedimiento.execute();
                        JOptionPane.showMessageDialog(null, "El usuario ha sido registrado exitosamente.");
                      
                } catch (SQLException ex) {

                }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario ya esta siendo usado, elija otro.");
                 
                }
        } catch (SQLException ex) {
            
        }
                
    }

    public void setCargo(String cargo) {
        this.cargo=cargo;
    }

   
    public void modificarUsuario(ConexionDB conexion, String contranueva) {
       try {
                             CallableStatement procedimiento;
                       procedimiento = conexion.getConexion().prepareCall("CALL modificarcontrasenia(?,?)");
                       procedimiento.setString("nombreusuario",this.nombre );
                        procedimiento.setString("clavenueva",contranueva);
                        
                        

                        procedimiento.execute();
                        JOptionPane.showMessageDialog(null, "La contraseña ha sido modificada exitosamente.");
                      
                } catch (SQLException ex) {

                }
    }

    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public String getCargo() {
        return cargo;
    }
    
    
}
