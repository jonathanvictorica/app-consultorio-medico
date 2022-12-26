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
public class EstudioRealizado {
    private Integer codigoestudiorealizado;
    private HistorialMedico historialmedico;
    private Estudio estudio;
    private Date fecha;

    public EstudioRealizado(Integer codigoestudiorealizado, HistorialMedico historialmedico, Estudio estudio, Date fecha) {
        this.codigoestudiorealizado = codigoestudiorealizado;
        this.historialmedico = historialmedico;
        this.estudio = estudio;
        this.fecha = fecha;
    }


    
    
    
}
