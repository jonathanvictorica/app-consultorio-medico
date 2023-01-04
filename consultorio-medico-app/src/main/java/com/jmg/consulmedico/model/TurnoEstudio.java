package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import com.jmg.consulmedico.view.turno.VHorarioEstudio;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class TurnoEstudio extends Turno {

     
    private Estudio estudio;

    public TurnoEstudio(Estudio estudio, Integer codigoturno, Paciente paciente, Date fechaturno, Time horarioturno, boolean activo) {
        super(codigoturno, paciente, fechaturno, horarioturno, activo);
        this.estudio = estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    public String getTipodeturno() {
        return tipodeturno;
    }


    public Estudio getEstudio() {
        return estudio;
    }

    public static void BuscarTurnodeEstudiodePaciente(List<Turno> turnosdepaciente, int codigopaciente) {
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from verturnoestudio where codigopaciente=" + codigopaciente);
            while (rs.next()) {
                TurnoEstudio turnoestudio = new TurnoEstudio(new Estudio(rs.getString(4)), rs.getInt(1), new Paciente(), rs.getDate(2), rs.getTime(3), true);
                turnosdepaciente.add(turnoestudio);
            }
        } catch (SQLException ex) {

        }
    }
    
    public static void llenarHorariosDisponibles(JComboBox horas, Date date,TurnoEstudio turnoestudio) {
        String dia = Estudio.retornarNombreDia(date);
         List<Time> horarios = new ArrayList<>();
        horas.removeAllItems();
         if(!"".equals(dia))
        {
       
        turnoestudio.getEstudio().buscarHorarioDisponible(horarios);
        
        List<Time> horariosocupados = new ArrayList<>();
        turnoestudio.recuperarHorariosOcupados(horariosocupados,date);
        
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
        
        for(int i=0;i<horarios.size();i++)
        {
            horas.addItem(horarios.get(i));
        }
        horas.setEnabled(true);
        
        }
        else
        {
            horas.setEnabled(false);
        }
        
        
        
        
    }

    public void ProcesarTurnoEstudio() {
        if (this.paciente.VerificarOrdenEstudio(this.estudio, this.paciente.getCodigopaciente())) {
            VHorarioEstudio vhorarioestudio = new VHorarioEstudio(this);

        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene una orden para realizar este estudio o ya tiene un turno asignado para realizarlo.");


        }
    }

    private void recuperarHorariosOcupados(List<Time> horariosocupados,Date dia) {

        try {

            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select horaturno from turno,turnoestudio,estudio where turnoestudio.codigoestudio = estudio.codigoestudio and turno.codigoturno=turnoestudio.codigoturno and fechaturno ='" + dia + "' and estudio.nombre ='" + this.estudio.getEstudio() + "'");

                while(rs.next())
                {
                  horariosocupados.add(rs.getTime(1));


                }
            } catch (SQLException ex) {

            }

    }

    public void procesarTurnoEstudio() {
         try {

             CallableStatement procedimiento = ConexionDB.getConexion().prepareCall("CALL ModificarEstadoTurno(?)");
             procedimiento.setInt("codigo_visita", this.codigoturno);


             procedimiento.execute();

         } catch (SQLException ex) {
           
        }

    }

   

    

    public TalonRetiroEstudio ProcesarEstudio(Date fechaderetiro) {
       TalonRetiroEstudio talon= new TalonRetiroEstudio(this,this.estudio, fechaderetiro);
       talon.almacenarTalon();
       
               
       return talon;
    }
}
