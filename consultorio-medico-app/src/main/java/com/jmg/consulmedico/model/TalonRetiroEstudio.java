package com.jmg.consulmedico.model;

import com.jmg.consulmedico.config.ConexionDB;
import lombok.Getter;
import lombok.Setter;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.SQLException;

@Getter
@Setter
public class TalonRetiroEstudio {
    private Turno turno;
    private Estudio estudio;
    private Date fecharetiro;
    private boolean estudioretirado;
    public TalonRetiroEstudio(Turno turno, Estudio estudio, Date fecharetiro) {
        this.turno = turno;
        this.estudio = estudio;
        this.fecharetiro = fecharetiro;
    }

    public TalonRetiroEstudio(Turno turno, Estudio estudio, Date fecharetiro, boolean estudioretirado) {
        this.turno = turno;
        this.estudio = estudio;
        this.fecharetiro = fecharetiro;
        this.estudioretirado = estudioretirado;
    }

    
    
    


    public void almacenarTalon() {
        try {

            CallableStatement procedimiento = ConexionDB.getConexion().prepareCall("CALL Procesarestudio(?,?,?)");
            procedimiento.setInt("codigoturno", this.turno.codigoturno);
            procedimiento.setString("nombreestudio", ((TurnoEstudio) this.turno).getEstudio().getEstudio());
            procedimiento.setDate("fecharetiro", this.fecharetiro);


            procedimiento.execute();


        } catch (SQLException ex) {
           
        }
    }
    
    
}
