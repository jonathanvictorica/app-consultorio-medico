package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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


    
    
    
    
    
}
