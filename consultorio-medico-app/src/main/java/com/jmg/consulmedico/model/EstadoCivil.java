package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoCivil {
    private Integer codigoEC;
    private String EstadoC;

    public EstadoCivil(String EstadoC) {
        this.EstadoC = EstadoC;
    }


}
