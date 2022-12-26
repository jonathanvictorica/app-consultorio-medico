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
public class RealizarEstudio extends OrdenesMedico {
    private Estudio estudio;
    private boolean turnosolicitado;

    public RealizarEstudio(Estudio estudio, boolean turnosolicitado, Integer codigoorden, Paciente paciente, Date fechaorden) {
        super(codigoorden, paciente, fechaorden);
        this.estudio = estudio;
        this.turnosolicitado = turnosolicitado;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public boolean isTurnosolicitado() {
        return turnosolicitado;
    }
    
    
}
