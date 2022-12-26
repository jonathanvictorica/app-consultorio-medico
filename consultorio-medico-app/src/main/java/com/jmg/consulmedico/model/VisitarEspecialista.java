/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class VisitarEspecialista extends OrdenesMedico {
    private Especialidad especialidad;
    private boolean turnosolicitado;

    public VisitarEspecialista(Integer codigoorden, Especialidad especialidad, boolean turnosolicitado, Paciente paciente, Date fechaorden) {
        super(codigoorden, paciente, fechaorden);

        this.especialidad = especialidad;
        this.turnosolicitado = turnosolicitado;
    }


}
