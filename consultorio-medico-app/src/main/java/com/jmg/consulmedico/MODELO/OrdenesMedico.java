/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import java.sql.Date;

/**
 *
 * @author Alumno
 */
public class OrdenesMedico {
    private Integer codigoorden;
    private Paciente paciente;
    private Date fechaorden;

    public OrdenesMedico(Integer codigoorden, Paciente paciente, Date fechaorden) {
        this.codigoorden = codigoorden;
        this.paciente = paciente;
        this.fechaorden = fechaorden;
    }

    public Integer getCodigoorden() {
        return codigoorden;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Date getFechaorden() {
        return fechaorden;
    }
    
    
    
}
