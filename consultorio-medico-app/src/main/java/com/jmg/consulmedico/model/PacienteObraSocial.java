package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PacienteObraSocial {
    private Paciente paciente;
    private List<ObraSocial> obrasocial;
    private List<String> numerodeafiliado;
    private List<Date> fechavencimiento;

    public PacienteObraSocial(Paciente paciente) {
        this.paciente = paciente;
        this.obrasocial= new ArrayList<>();
        this.numerodeafiliado= new ArrayList<>();
        this.fechavencimiento= new ArrayList<>();
    }





    public void buscarObraSocial() {
        try {

            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from pacienteobrasocial_actualizado where codigopaciente =" + this.paciente.getCodigopaciente() + "");
            if (rs.next()) {
                ObraSocial obrasocialnuevo = new ObraSocial(rs.getInt(1), rs.getString(2), new Localidad(rs.getString(3)), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                obrasocialnuevo.setActivo(rs.getBoolean(11));
                this.obrasocial.add(obrasocialnuevo);
                this.numerodeafiliado.add(rs.getString(8));
               this.fechavencimiento.add(rs.getDate(9));
               
           }
        } catch (SQLException ex) {
           
        }
           
    }
    
    
}
