/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

/**
 *
 * @author Alumno
 */
public class Localidad {
    private Integer codigoLoc;
    private String nombreLoc;

    public Localidad(Integer codigoLoc, String nombreLoc) {
        this.codigoLoc = codigoLoc;
        this.nombreLoc = nombreLoc;
    }

    public Localidad(String nombreLoc) {
        this.nombreLoc = nombreLoc;
    }

    public Integer getCodigoLoc() {
        return codigoLoc;
    }

    public String getNombreLoc() {
        return nombreLoc;
    }

    
    
    
}
