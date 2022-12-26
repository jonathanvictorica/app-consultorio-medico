/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.MODELO;

/**
 *
 * @author Alumno
 */
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

    public Integer getCodestablecimiento() {
        return codestablecimiento;
    }

    public String getNombreEstablecimiento() {
        return nombreEstablecimiento;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getAltura() {
        return altura;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNota() {
        return Nota;
    }
    
    
}
