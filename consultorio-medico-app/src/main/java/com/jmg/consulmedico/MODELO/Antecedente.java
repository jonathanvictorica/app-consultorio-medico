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
public class Antecedente {
    private Integer codigoantecedente;
    private HistorialMedico historialmedico;
    private String antecendente;
    private Date fecha;

    public Antecedente(Integer codigoantecedente, HistorialMedico historialmedico, String antecendente, Date fecha) {
        this.codigoantecedente = codigoantecedente;
        this.historialmedico = historialmedico;
        this.antecendente = antecendente;
        this.fecha = fecha;
    }

    public Integer getCodigoantecedente() {
        return codigoantecedente;
    }

    public HistorialMedico getHistorialmedico() {
        return historialmedico;
    }

    public String getAntecendente() {
        return antecendente;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
}
