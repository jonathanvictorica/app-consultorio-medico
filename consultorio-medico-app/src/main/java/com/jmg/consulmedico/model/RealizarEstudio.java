package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class RealizarEstudio extends OrdenesMedico {
    private Estudio estudio;
    private boolean turnosolicitado;

    public RealizarEstudio(Estudio estudio, boolean turnosolicitado, Integer codigoorden, Paciente paciente, Date fechaorden) {
        super(codigoorden, paciente, fechaorden);
        this.estudio = estudio;
        this.turnosolicitado = turnosolicitado;
    }


}
