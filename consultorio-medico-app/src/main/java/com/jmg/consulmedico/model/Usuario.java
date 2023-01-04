package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
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

            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from users where nombre='" + this.nombre + "' and cargo = '" + this.cargo + "'");
            if (rs.next()) {

                this.cargo = rs.getString(4);
                if (this.clave.equals(rs.getString(3))) {
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

    public void registrarUsuario() {
        try {

            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("SELECT * from users where nombre='" + this.nombre + "'");
            if (!rs.next()) {
                try {
                    CallableStatement procedimiento;
                    procedimiento = ConexionDB.getConexion().prepareCall("CALL RegistrarUsuario(?,?,?)");
                    procedimiento.setString("nombre", this.nombre);
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


    public void modificarUsuario(String contranueva) {
        try {
            CallableStatement procedimiento;
            procedimiento = ConexionDB.getConexion().prepareCall("CALL modificarcontrasenia(?,?)");
            procedimiento.setString("nombreusuario", this.nombre);
            procedimiento.setString("clavenueva", contranueva);


            procedimiento.execute();
            JOptionPane.showMessageDialog(null, "La contraseña ha sido modificada exitosamente.");
                      
                } catch (SQLException ex) {

                }
    }


    
    
}
