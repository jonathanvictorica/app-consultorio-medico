package com.jmg.consulmedico;

import com.jmg.consulmedico.view.VLoginSistema;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppConsultorioMedico {

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VLoginSistema().setVisible(true);
            }
        });
        SpringApplication.run(AppConsultorioMedico.class, args);

    }
}
