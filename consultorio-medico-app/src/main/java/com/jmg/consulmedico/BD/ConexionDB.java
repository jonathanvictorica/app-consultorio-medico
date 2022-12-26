/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.BD;

/**
 *
 * @author Alumno
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionDB {
    private   java.sql.Connection conexion;

    public Connection getConexion() {
        return conexion;
    }
  
    
    
    public ConexionDB()
    {
       
       
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/consultoriomedico";
            String usuarioDB="root";
            String passwordDB="";
           
            conexion = (java.sql.Connection) DriverManager.getConnection(servidor,usuarioDB,passwordDB);
    
        }
        catch(ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error1 en la Conexión con la com.jmg.consulmedico.BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error2 en la Conexión con la com.jmg.consulmedico.BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex, "Error3 en la Conexión con la com.jmg.consulmedico.BD "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion=null;
        }
        
    }
}