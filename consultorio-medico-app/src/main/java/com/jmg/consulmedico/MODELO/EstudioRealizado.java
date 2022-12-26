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

    public Integer getCodigoestudiorealizado() {
        return codigoestudiorealizado;
    }

    public HistorialMedico getHistorialmedico() {
        return historialmedico;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    
}
