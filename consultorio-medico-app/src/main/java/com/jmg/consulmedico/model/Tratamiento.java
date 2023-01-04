package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tratamiento {
    private Integer codigotratamiento;
    private String nombretratamiento;

    public Tratamiento(Integer codigotratamiento, String nombretratamiento) {
        this.codigotratamiento = codigotratamiento;
        this.nombretratamiento = nombretratamiento;
    }


}
