/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FichaAtencion {
    private Visita visita;
    private String motivo;
    private String diagnostico;
    private Tratamiento tratamiento;
    private String evolucion;
    private String observacionesgenerales;

    public FichaAtencion(Visita visita, String motivo, String diagnostico, Tratamiento tratamiento, String evolucion, String observacionesgenerales) {
        this.visita = visita;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.evolucion = evolucion;
        this.observacionesgenerales = observacionesgenerales;
    }


    
    
}
