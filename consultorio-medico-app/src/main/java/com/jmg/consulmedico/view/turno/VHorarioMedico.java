package com.jmg.consulmedico.view.turno;

import com.jmg.consulmedico.model.Medico;
import com.jmg.consulmedico.model.Turno;
import com.jmg.consulmedico.model.Visita;

import javax.swing.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class VHorarioMedico extends javax.swing.JFrame {

    private List<Medico> medicos = new ArrayList<>();
    private Turno turnomedico;
    private boolean control=false;
    private boolean control2=false;
    public VHorarioMedico(Turno turnomedico) {
        initComponents();
        this.turnomedico=turnomedico;
        Turno.recuperarFechas(this.cboFechas2);
        
        this.txtNombre2.setText(this.turnomedico.getPaciente().getNombre());
        this.txtApellido2.setText(this.turnomedico.getPaciente().getApellido());
        this.txtDni2.setText(this.turnomedico.getPaciente().getDni());
        
        this.txtEstudio2.setText(((Visita)this.turnomedico).getMedico().getEspecialidad().getNombreEsp());
       
         this.control=true;
        this.setLocationRelativeTo(null);
        this.show();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        txtNombre2 = new org.edisoncor.gui.textField.TextField();
        txtApellido2 = new org.edisoncor.gui.textField.TextField();
        cboFechas2 = new javax.swing.JComboBox();
        label7 = new java.awt.Label();
        txtDni2 = new org.edisoncor.gui.textField.TextField();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        cboHorarios2 = new javax.swing.JComboBox();
        cmdAgendarTurno2 = new javax.swing.JButton();
        txtEstudio2 = new org.edisoncor.gui.textField.TextField();
        label10 = new java.awt.Label();
        cboMedicos = new javax.swing.JComboBox();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();

        setResizable(false);

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N

        txtNombre2.setEditable(false);

        txtApellido2.setEditable(false);

        cboFechas2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboFechas2ItemStateChanged(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setText("Fecha");

        txtDni2.setEditable(false);
        txtDni2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDni2ActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setText("DNI");

        label9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label9.setText("Horario");

        cboHorarios2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboHorarios2ItemStateChanged(evt);
            }
        });

        cmdAgendarTurno2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Aceptar.png"))); // NOI18N
        cmdAgendarTurno2.setBorderPainted(false);
        cmdAgendarTurno2.setContentAreaFilled(false);
        cmdAgendarTurno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgendarTurno2ActionPerformed(evt);
            }
        });

        txtEstudio2.setEditable(false);

        label10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label10.setText("Médico");

        cboMedicos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboMedicosItemStateChanged(evt);
            }
        });

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/SolicitarTurno.png"))); // NOI18N
        panelImage2.setPreferredSize(new java.awt.Dimension(0, 58));

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboFechas2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboHorarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtEstudio2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelImage3Layout.createSequentialGroup()
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cboMedicos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
            .addGroup(panelImage3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(cmdAgendarTurno2)
                .addContainerGap())
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage3Layout.createSequentialGroup()
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(txtEstudio2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboFechas2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboHorarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cmdAgendarTurno2)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboFechas2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboFechas2ItemStateChanged
        if(this.control==true)
        {
            this.cboHorarios2.removeAllItems();
           
           
            this.control2=false;
            this.medicos=Visita.llenarMedicosDisponibles(this.cboMedicos,((Date)this.cboFechas2.getSelectedItem()),((Visita)this.turnomedico),((Visita)this.turnomedico).getMedico().getEspecialidad().getNombreEsp());
            this.control2=true;
            this.repaint();
        }
    }//GEN-LAST:event_cboFechas2ItemStateChanged

    private void cboHorarios2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboHorarios2ItemStateChanged

    }//GEN-LAST:event_cboHorarios2ItemStateChanged

    private void cmdAgendarTurno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgendarTurno2ActionPerformed
        if(this.validardatos())
        {
        this.turnomedico.setFechaturno((Date)this.cboFechas2.getSelectedItem());
        this.turnomedico.setHorarioturno((Time)this.cboHorarios2.getSelectedItem());
       ((Visita) this.turnomedico).setMedico(this.retornarMedico());
            Turno.MostrarTurno(this.turnomedico);
            this.hide();
        }
    }//GEN-LAST:event_cmdAgendarTurno2ActionPerformed

    private void cboMedicosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboMedicosItemStateChanged
        if(this.control2==true)
           {
             
                  
                   Visita.llenarHorariosDisponibles(this.cboHorarios2,((Date)this.cboFechas2.getSelectedItem()),this.retornarMedico());
                   
                  this.repaint();
                 
           }           
    }//GEN-LAST:event_cboMedicosItemStateChanged

    private void txtDni2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDni2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDni2ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboFechas2;
    private javax.swing.JComboBox cboHorarios2;
    private javax.swing.JComboBox cboMedicos;
    private javax.swing.JButton cmdAgendarTurno2;
    private java.awt.Label label10;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.textField.TextField txtApellido2;
    private org.edisoncor.gui.textField.TextField txtDni2;
    private org.edisoncor.gui.textField.TextField txtEstudio2;
    private org.edisoncor.gui.textField.TextField txtNombre2;
    // End of variables declaration//GEN-END:variables

    private Medico retornarMedico() {
        
        for(int i=0;i<this.medicos.size();i++)
        {
            String palabra = this.medicos.get(i).getApellidoMed() + " " +this.medicos.get(i).getNombreMed();
            if(palabra.equals(this.cboMedicos.getSelectedItem()))
            {
                return this.medicos.get(i);
            }
        }
        return null;
    }  

    private boolean validardatos() {
          if(this.cboFechas2.getSelectedIndex()==-1)
       {
           JOptionPane.showMessageDialog(this, "No ha seleccionado la fecha del estudio.");
       return false;
       }
            if(this.cboMedicos.getSelectedIndex()==-1)
       {
           JOptionPane.showMessageDialog(this, "No ha seleccionado el medico.");
       return false;
       }
        if(this.cboHorarios2.getSelectedIndex()==-1)
       {
           JOptionPane.showMessageDialog(this, "No ha seleccionado la hora del estudio.");
       return false;
       }
        
        
        
        
        return true;
   
    }
}
