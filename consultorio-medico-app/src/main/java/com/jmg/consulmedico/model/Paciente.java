package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

@Getter
@Setter
public class Paciente {  
   
    private Integer codigopaciente;
    private String dni;
    private String nombre;
    private String apellido;
    private Date fechanacimiento;
    private String Telefono;
    private boolean Sexo;
    private GrupoSanguineo gruposanguineo;
    private String mail;
    private Localidad localidad;
    private String codigopostal;
    private String direccion;
    private String altura;
    private EstadoCivil estadocivil;
    private PacienteObraSocial pacienteobrasocial;
    private PacienteMedicoCabecera pacientemedicocabezera;

    
    public Paciente()
    {
        
    }
    public Paciente(Integer codigopaciente, String dni, String nombre, String apellido, Date fechanacimiento, String Telefono, boolean Sexo, GrupoSanguineo gruposanguineo, String mail, Localidad localidad, String codigopostal, String direccion, String altura, EstadoCivil estadocivil) {
        this.codigopaciente = codigopaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.gruposanguineo = gruposanguineo;
        this.mail = mail;
        this.localidad = localidad;
        this.codigopostal = codigopostal;
        this.direccion = direccion;
        this.altura = altura;
        this.estadocivil = estadocivil;
        
    }

    


            
    public Paciente(String Dni,String nombre, String apellido) {
      this.dni=Dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Paciente(Integer codigopaciente, String dni, String nombre, String apellido,Date fechanacimiento, String Telefono, boolean Sexo, GrupoSanguineo gruposanguineo, String mail, Localidad localidad, String codigopostal, String direccion, String altura, EstadoCivil estadocivil, PacienteObraSocial pacienteobrasocial, PacienteMedicoCabecera pacientemedicocabezera) {
        this.codigopaciente = codigopaciente;
        this.dni = dni;
        this.apellido=apellido;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.gruposanguineo = gruposanguineo;
        this.mail = mail;
        this.localidad = localidad;
        this.codigopostal = codigopostal;
        this.direccion = direccion;
        this.altura = altura;
        this.estadocivil = estadocivil;
        this.pacienteobrasocial = pacienteobrasocial;
        this.pacientemedicocabezera = pacientemedicocabezera;
    }


    public static Paciente inicializarPaciente(String dni_paciente) {
        Paciente paciente = null;
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select * from pacienteinicializado where Dni='" + dni_paciente + "'");

            if (rs.next()) {
                paciente = new Paciente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getBoolean(7), new GrupoSanguineo(rs.getString(8)), rs.getString(9), new Localidad(rs.getString(10)), rs.getString(11), rs.getString(12), rs.getString(13), new EstadoCivil(rs.getString(14)));
            }


        } catch (SQLException ex) {

        }
         return paciente;

    }

    public static Paciente buscarPorDNI(String text) {
       Paciente paciente = null;
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select  count(*) from paciente where dni ='" + text + "'");

             if(rs.next())
           {
               if(rs.getInt(1)>=1)
               {
                   paciente = Paciente.inicializarPaciente(text);
               }

           }
        } catch (SQLException ex) {

        }


       return paciente;
    }

    public static Paciente buscarPorCodigoHistoriaClinica(String text) {
        Paciente paciente = null;
       try {
           Integer codigo_historial = Integer.parseInt(text);

           java.sql.Statement statement = ConexionDB.getConexion().createStatement();
           ResultSet rs = statement.executeQuery("select paciente.dni from paciente,historialmedico where paciente.codigopaciente=historialmedico.codigopaciente and historialmedico.codigohistorial= " + codigo_historial);


           if (rs.next()) {

               paciente = Paciente.inicializarPaciente(rs.getString(1));


           }
        } catch (SQLException ex) {

        }



       return paciente;
    }

    public static Paciente buscarPorNombreyApellido(String text) {
      Paciente paciente = null;

        try {


            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select dni from paciente where CONCAT(nombre,' ',apellido)='" + text + "'");


            if (rs.next()) {

                paciente = Paciente.inicializarPaciente(rs.getString(1));


            }
        } catch (SQLException ex) {

        }

       return paciente;
    }
    
    public void almacenarPaciente() {
        try {
            //procedimiento almacenado de almacenar paciente
            CallableStatement procedimiento = ConexionDB.getConexion().prepareCall("CALL Almacenar_Paciente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            procedimiento.setString("Dni_paciente", this.getDni());
            procedimiento.setString("Nombre_paciente", this.getNombre());
            procedimiento.setString("Apellido_paciente", this.getApellido());
            procedimiento.setDate("Fecha_nacimiento", this.getFechanacimiento());
            procedimiento.setString("telefono_paciente", this.getTelefono());

            procedimiento.setBoolean("sexo_paciente", this.isSexo());

                procedimiento.setString("grupo_sanguineo", this.getGruposanguineo().getTipo());
                procedimiento.setString("mail_paciente", this.getMail());
                procedimiento.setString("localidad_paciente", this.getLocalidad().getNombreLoc());
                procedimiento.setString("codigo_postal", this.getCodigopostal());
                procedimiento.setString("direccion_paciente", this.getDireccion());
                procedimiento.setString("altura_paciente", this.getAltura());
                procedimiento.setString("estado_civil_paciente", this.getEstadocivil().getEstadoC());
                procedimiento.setString("numero_matricula",this.getPacientemedicocabezera().getMedico().get(0).getNumMatricula());
                procedimiento.setString("obra_social", this.getPacienteobrasocial().getObrasocial().get(0).getNombreOS());
                procedimiento.setString("numero_afiliado", this.getPacienteobrasocial().getNumerodeafiliado().get(0));
                procedimiento.setDate("fecha_vencimiento_os", this.getPacienteobrasocial().getFechavencimiento().get(0));

                procedimiento.execute();

        } catch (SQLException ex) {

        }


    }

    public boolean verificarTurnoconMedico(Especialidad especialidad) {
        try {
            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select count(*) from ordenesmedico,visitarespecialista,especialidad where ordenesmedico.codigoorden = visitarespecialista.codigoorden and visitarespecialista.codigoespecialidad = especialidad.codigoespecialidad and especialidad.nombreespecialidad='" + especialidad.getNombreEsp() + "' and ordenesmedico.codigopaciente= " + this.codigopaciente + " and visitarespecialista.turnosolicitado = false");
            if (rs.next()) {
                if (rs.getInt(1) >= 1) {
                    return true;
                } else
                {
                    return false;
                }
            }

        } catch (SQLException ex) {

        }
        return false;

    }

    public boolean VerificarOrdenEstudio(Estudio estudio, int codigopaciente) {
        boolean control = true;
        try {

            java.sql.Statement statement = ConexionDB.getConexion().createStatement();
            ResultSet rs = statement.executeQuery("select  count(*) from realizarestudio,ordenesmedico,estudio where realizarestudio.codigoorden = ordenesmedico.codigoorden and "
                    + "ordenesmedico.codigopaciente=" + codigopaciente + " and realizarestudio.codigoestudio"
                    + " = estudio.codigoestudio and realizarestudio.turnosolicitado = false and estudio.nombre='" + estudio.getEstudio() + "'");
            if (rs.next()) {
                if (rs.getInt(1) >= 1)
               {
                   return control;
               }
               else
               {
                   control=false;
                   return control;
               }
           }
        } catch (SQLException ex) {

        }
         return control;
    }

    
    
    
    
    
    
    
    

        
        
        
        
        
        
  
    
    
    
}
