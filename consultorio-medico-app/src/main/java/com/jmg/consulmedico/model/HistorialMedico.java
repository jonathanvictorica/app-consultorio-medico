/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HistorialMedico {
    private Integer codigohistorial;
    private Paciente paciente;

    public HistorialMedico(Integer codigohistorial, Paciente paciente) {
        this.codigohistorial = codigohistorial;
        this.paciente = paciente;
    }


}
