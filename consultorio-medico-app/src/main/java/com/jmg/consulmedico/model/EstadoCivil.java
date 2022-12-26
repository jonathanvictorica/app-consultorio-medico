/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoCivil {
    private Integer codigoEC;
    private String EstadoC;

    public EstadoCivil(String EstadoC) {
        this.EstadoC = EstadoC;
    }


    public int buscarestadocivil()
    {
        int codigoestadocivil=0;
        
        return codigoestadocivil;
    }

   
    
    
}
