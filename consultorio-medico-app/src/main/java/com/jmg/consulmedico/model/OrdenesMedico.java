package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class OrdenesMedico {
    private Integer codigoorden;
    private Paciente paciente;
    private Date fechaorden;

    public OrdenesMedico(Integer codigoorden, Paciente paciente, Date fechaorden) {
        this.codigoorden = codigoorden;
        this.paciente = paciente;
        this.fechaorden = fechaorden;
    }


    
    
    
}
