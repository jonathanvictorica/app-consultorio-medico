/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

/**
 *
 * @author Alumno
 */
public class Tratamiento {
    private Integer codigotratamiento;
    private String nombretratamiento;

    public Tratamiento(Integer codigotratamiento, String nombretratamiento) {
        this.codigotratamiento = codigotratamiento;
        this.nombretratamiento = nombretratamiento;
    }

    public Integer getCodigotratamiento() {
        return codigotratamiento;
    }

    public String getNombretratamiento() {
        return nombretratamiento;
    }
    
    
}
