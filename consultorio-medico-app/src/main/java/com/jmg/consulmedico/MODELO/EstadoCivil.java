/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

/**
 *
 * @author Alumno
 */
public class EstadoCivil {
    private Integer codigoEC;
    private String EstadoC;

    public EstadoCivil(String EstadoC) {
        this.EstadoC = EstadoC;
    }

    public Integer getCodigoEC() {
        return codigoEC;
    }

    public String getEstadoC() {
        return EstadoC;
    }

    public void setCodigoEC(Integer codigoEC) {
        this.codigoEC = codigoEC;
    }
    
    public int buscarestadocivil()
    {
        int codigoestadocivil=0;
        
        return codigoestadocivil;
    }

   
    
    
}
