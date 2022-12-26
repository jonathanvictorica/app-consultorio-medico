/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class MedicoHorario {
    private Medico medico;
    private List<String> dia;
    private List<Time> horainicial;
    private List<Time> horafinal;

    public MedicoHorario(Medico medico) {
        this.medico = medico;
        this.dia = new ArrayList<>();
        this.horainicial = new ArrayList<>();
        this.horafinal= new ArrayList<>();
        
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setDia(List<String> dia) {
        this.dia = dia;
    }

    public void setHorainicial(List<Time> horainicial) {
        this.horainicial = horainicial;
    }

    public void setHorafinal(List<Time> horafinal) {
        this.horafinal = horafinal;
    }

    public Medico getMedico() {
        return medico;
    }

    public List<String> getDia() {
        return dia;
    }

    public List<Time> getHorainicial() {
        return horainicial;
    }

    public List<Time> getHorafinal() {
        return horafinal;
    }
    
    
    
    
    
}
