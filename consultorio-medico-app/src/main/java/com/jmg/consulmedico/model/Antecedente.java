package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
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


}
