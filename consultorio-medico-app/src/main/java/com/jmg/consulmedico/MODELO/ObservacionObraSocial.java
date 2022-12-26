/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class ObservacionObraSocial {
    private ObraSocial obrasocial;
    private ArrayList<String> tipoobservacion;

    public ObservacionObraSocial(ObraSocial obrasocial, ArrayList<String> tipoobservacion) {
        this.obrasocial = obrasocial;
        this.tipoobservacion = tipoobservacion;
    }

    public ObraSocial getObrasocial() {
        return obrasocial;
    }

    public void setObrasocial(ObraSocial obrasocial) {
        this.obrasocial = obrasocial;
    }

    public ArrayList<String> getTipoobservacion() {
        return tipoobservacion;
    }

    public void setTipoobservacion(ArrayList<String> tipoobservacion) {
        this.tipoobservacion = tipoobservacion;
    }
    
    
    
}
