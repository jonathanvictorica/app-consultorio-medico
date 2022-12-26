package com.jmg.consulmedico.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Establecimiento {
    private Integer codestablecimiento;
    private String nombreEstablecimiento;
    private String abreviatura;
    private boolean activo;
    private String direccion;
    private String altura;
    private Localidad localidad;
    private String codpostal;
    private String telefono;
    private String Nota;

    public Establecimiento(Integer codestablecimiento, String nombreEstablecimiento, String abreviatura, boolean activo, String direccion, String altura, Localidad localidad, String codpostal, String telefono) {
        this.codestablecimiento = codestablecimiento;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.abreviatura = abreviatura;
        this.activo = activo;
        this.direccion = direccion;
        this.altura = altura;
        this.localidad = localidad;
        this.codpostal = codpostal;
        this.telefono = telefono;
    }


    
    
}
