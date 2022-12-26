/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import com.jmg.consulmedico.BD.ConexionDB;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class TalonRetiroEstudio {
    private Turno turno;
    private Estudio estudio;
    private Date fecharetiro;
    private boolean estudioretirado;
    public TalonRetiroEstudio(Turno turno, Estudio estudio, Date fecharetiro) {
        this.turno = turno;
        this.estudio = estudio;
        this.fecharetiro = fecharetiro;
    }

    public TalonRetiroEstudio(Turno turno, Estudio estudio, Date fecharetiro, boolean estudioretirado) {
        this.turno = turno;
        this.estudio = estudio;
        this.fecharetiro = fecharetiro;
        this.estudioretirado = estudioretirado;
    }

    
    
    
    public Turno getTurno() {
        return turno;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public Date getFecharetiro() {
        return fecharetiro;
    }

    public boolean isEstudioretirado() {
        return estudioretirado;
    }

    public void almacenarTalon() {
        try {
             ConexionDB conexion = new ConexionDB();
             CallableStatement procedimiento = conexion.getConexion().prepareCall("CALL Procesarestudio(?,?,?)");
                procedimiento.setInt("codigoturno",this.turno.codigoturno);
                procedimiento.setString("nombreestudio", ((TurnoEstudio)this.turno).getEstudio().getEstudio());
                procedimiento.setDate("fecharetiro", this.fecharetiro);
                
                
                
                  
                procedimiento.execute();

                
        } catch (SQLException ex) {
           
        }
    }
    
    
}
