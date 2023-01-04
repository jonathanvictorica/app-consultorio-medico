package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import com.jmg.consulmedico.view.turno.VHorarioMedico;
import com.jmg.consulmedico.view.turno.VHorarioMedicoCabecera;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Visita extends Turno{

    

    

   
   

    
    private Medico medico;
    public boolean medicocabecera;

    public Visita(Medico medico, Integer codigoturno, Paciente paciente, Date fechaturno, Time horarioturno, boolean activo) {
        super(codigoturno, paciente, fechaturno, horarioturno, activo);
        this.medico = medico;
    }

    public Visita() {
        super();
    }

   

 

    public Medico getMedico() {
        return medico;
    }

    public static List<Medico> llenarMedicosDisponibles(JComboBox cboMedicos, Date date, Visita visita, String nombreEsp) {
        String dia = Estudio.retornarNombreDia(date);
        List<Medico> medicos = new ArrayList<>();
        if(!"".equals(dia))
        {
            cboMedicos.removeAllItems();

            Visita.buscarMedicosdeEspecialidad(medicos, nombreEsp, dia);


              cboMedicos.addItem("");
            for(int i=0;i<medicos.size();i++)
            {
                cboMedicos.addItem(medicos.get(i).getApellidoMed()+ " " + medicos.get(i).getNombreMed());

            }
            cboMedicos.setEnabled(true);

        }
        else
        {
            cboMedicos.setEnabled(false);
        }
        return medicos;
    }

    private static void buscarMedicosdeEspecialidad(List<Medico> medicos, String nombreEsp, String dia) {
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select distinct medico.codigomedico,nombre,apellido,numeromatricula from medico,especialidad,medicohorario where medico.codigomedico = medicohorario.codigomedico and medicohorario.dia = '" + dia + "' and especialidad.codigoespecialidad=medico.codigoespecialidad and nombreespecialidad = '" + nombreEsp + "'");
            while (rs.next()) {
                Medico mediconuevo = new Medico(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
                mediconuevo.setEspecialidad(new Especialidad(nombreEsp));


                medicos.add(mediconuevo);
            }


        } catch (SQLException ex) {

        }

    }

    static void BuscarTurnodeVisitadePaciente(List<Turno> turnosdepaciente, int codigopaciente) {
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from verturnosvisita where codigopaciente=" + codigopaciente);
            while (rs.next()) {
                Visita visitamedico = new Visita(new Medico(rs.getString(5), rs.getString(6), rs.getString(4), new Especialidad(rs.getString(7))), rs.getInt(1), new Paciente(), rs.getDate(2), rs.getTime(3), true);
                turnosdepaciente.add(visitamedico);
            }
        } catch (SQLException ex) {

        }

    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setMedicocabecera(boolean medicocabecera) {
        this.medicocabecera = medicocabecera;
    }
     
     
     public static void llenarHorariosDisponibles(JComboBox cboHorarios, Date date, Medico medico) {
         String dia = Estudio.retornarNombreDia(date);
         List<Time> horarios = new ArrayList<>();
       
        if(!"".equals(dia))
        {
          medico.inicializarMedico(medico.getNumMatricula());
            medico.buscarHorarioDisponible(horarios,dia);

            List<Time> horariosocupados = new ArrayList<>();
            medico.recuperarHorariosOcupados(horariosocupados,date);

            for(int i=0;i<horarios.size();i++)
            {
                for(int j=0;j<horariosocupados.size();j++)
                {
                    if(horarios.get(i).equals(horariosocupados.get(j)))
                    {
                        horarios.remove(i);
                    }
                }
            }

            
            cboHorarios.removeAllItems();
            for(int i=0;i<horarios.size();i++)
            {
                cboHorarios.addItem(horarios.get(i));
            }
            cboHorarios.setEnabled(true);

        }
        else
        {
            cboHorarios.setEnabled(false);
        }
        
    }

    public void ProcesarTurnoMedico() {
        if (medicocabecera) {
            this.paciente.setPacientemedicocabezera(new PacienteMedicoCabecera(this.paciente));
            this.paciente.getPacientemedicocabezera().buscarMedicoCabecera();
            this.medico = this.paciente.getPacientemedicocabezera().getMedico().get(0);

            VHorarioMedicoCabecera vhorariomedicos = new VHorarioMedicoCabecera(this);
        } else {
            if (this.paciente.verificarTurnoconMedico(this.medico.getEspecialidad())) {
                VHorarioMedico vhorariomedico = new VHorarioMedico(this);
            } else {
                JOptionPane.showMessageDialog(null, "El Paciente no esta autorizado por su medico de cabecera a visitar un especialista.");
            }
        }
    }

    public void procesarTurnoVisita() {
        try {
            CallableStatement procedimiento = ConexionDB.getConexion().prepareCall("CALL ModificarEstadoTurno(?)");
            procedimiento.setInt("codigo_visita", this.codigoturno);


            procedimiento.execute();
            JOptionPane.showMessageDialog(null, "El turno del Paciente ha sido atendido. El médico correspondiente lo atenderá.");

        } catch (SQLException ex) {

        }

    }
     

}


