/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

/**
 *
 * @author Alumno
 */
public class HistorialMedico {
    private Integer codigohistorial;
    private Paciente paciente;

    public HistorialMedico(Integer codigohistorial, Paciente paciente) {
        this.codigohistorial = codigohistorial;
        this.paciente = paciente;
    }

    public Integer getCodigohistorial() {
        return codigohistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }
    
    
}
