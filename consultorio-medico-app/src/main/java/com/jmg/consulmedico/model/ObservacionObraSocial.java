package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class ObservacionObraSocial {
    private ObraSocial obrasocial;
    private ArrayList<String> tipoobservacion;

    public ObservacionObraSocial(ObraSocial obrasocial, ArrayList<String> tipoobservacion) {
        this.obrasocial = obrasocial;
        this.tipoobservacion = tipoobservacion;
    }


}
