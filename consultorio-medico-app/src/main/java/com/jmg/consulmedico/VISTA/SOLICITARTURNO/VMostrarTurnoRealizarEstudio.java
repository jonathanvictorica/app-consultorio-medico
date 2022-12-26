/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.VISTA.SOLICITARTURNO;

import com.jmg.consulmedico.MODELO.EstudioTerciarizado;
import com.jmg.consulmedico.MODELO.Turno;
import com.jmg.consulmedico.MODELO.TurnoEstudio;

/**
 *
 * @author Alumno
 */
public class VMostrarTurnoRealizarEstudio extends javax.swing.JFrame {

    /**
     * Creates new form VMostrarTurnoRealizarEstudio
     */
    private Turno turnoestudio;
    public VMostrarTurnoRealizarEstudio(Turno turnoestudio) {
        initComponents();
        this.turnoestudio=turnoestudio;
        
        
         this.txtCodigoTurno.setText(this.turnoestudio.getCodigoturno()+"");
       
        this.txtFechaTurno.setText(this.turnoestudio.getFechaturno()+"");
        this.txtHoraTurno.setText(this.turnoestudio.getHorarioturno()+"");
        this.txtApellido.setText(this.turnoestudio.getPaciente().getApellido());
        this.txtNombre.setText(this.turnoestudio.getPaciente().getNombre());
         
        if(((TurnoEstudio)this.turnoestudio).getEstudio().getClass().getSimpleName().equals("EstudioTerciarizado"))
        {
            this.panelEstablecimiento.setVisible(true);
            this.txtEstablecimiento.setText(((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getEstablecimiento().getNombreEstablecimiento());
            this.txtDireccion.setText(((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getEstablecimiento().getDireccion());
            this.txtAltura.setText(((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getEstablecimiento().getAltura());
            this.txtLocalidad.setText(((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getEstablecimiento().getLocalidad().getNombreLoc());
            this.txtTelefono.setText(((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getEstablecimiento().getTelefono());
            this.txtCostoEstudio.setText(""+((EstudioTerciarizado)(((TurnoEstudio)this.turnoestudio).getEstudio())).getCostoOS());
            this.txtEstudio.setText(((EstudioTerciarizado)((TurnoEstudio)this.turnoestudio).getEstudio()).getEstudio());
      
      
        }
        else
        {
             this.txtEstudio.setText(((TurnoEstudio)this.turnoestudio).getEstudio().getEstudio());
        this.panelEstablecimiento.setVisible(false);
        }
      
        
        
        
      
       
        
        
        
        
        
        
        
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

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        lblMadera = new javax.swing.JLabel();
        lblMadera1 = new javax.swing.JLabel();
        label2 = new java.awt.Label();
        txtCodigoTurno = new org.edisoncor.gui.textField.TextField();
        txtFechaTurno = new org.edisoncor.gui.textField.TextField();
        txtHoraTurno = new org.edisoncor.gui.textField.TextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        txtApellido = new org.edisoncor.gui.textField.TextField();
        txtNombre = new org.edisoncor.gui.textField.TextField();
        label6 = new java.awt.Label();
        txtEstudio = new org.edisoncor.gui.textField.TextField();
        panelEstablecimiento = new org.edisoncor.gui.panel.PanelImage();
        label7 = new java.awt.Label();
        txtEstablecimiento = new org.edisoncor.gui.textField.TextField();
        txtDireccion = new org.edisoncor.gui.textField.TextField();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        txtAltura = new org.edisoncor.gui.textField.TextField();
        label10 = new java.awt.Label();
        txtTelefono = new org.edisoncor.gui.textField.TextField();
        label11 = new java.awt.Label();
        txtLocalidad = new org.edisoncor.gui.textField.TextField();
        txtLocalidad1 = new org.edisoncor.gui.textField.TextField();
        label12 = new java.awt.Label();
        txtCostoEstudio = new org.edisoncor.gui.textField.TextField();
        label13 = new java.awt.Label();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        cmdAceptar1 = new javax.swing.JButton();

        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMadera.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMadera.setText("Código de Turno");
        panelImage1.add(lblMadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 109, 24));

        lblMadera1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblMadera1.setText("Datos de Paciente");
        panelImage1.add(lblMadera1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 171, 24));

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Apellido");
        panelImage1.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 113, -1));

        txtCodigoTurno.setEditable(false);
        panelImage1.add(txtCodigoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 58, -1));

        txtFechaTurno.setEditable(false);
        panelImage1.add(txtFechaTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 100, -1));

        txtHoraTurno.setEditable(false);
        panelImage1.add(txtHoraTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 71, -1));

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("Fecha de Turno");
        panelImage1.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Hora de Turno");
        panelImage1.add(label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Nombre");
        panelImage1.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 113, -1));

        txtApellido.setEditable(false);
        panelImage1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 258, -1));

        txtNombre.setEditable(false);
        panelImage1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 258, -1));

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Estudio");
        panelImage1.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 113, -1));

        txtEstudio.setEditable(false);
        panelImage1.add(txtEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 160, -1));

        panelEstablecimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N
        panelEstablecimiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label7.setText("Establecimiento");
        panelEstablecimiento.add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 113, -1));

        txtEstablecimiento.setEditable(false);
        panelEstablecimiento.add(txtEstablecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 11, 247, -1));

        txtDireccion.setEditable(false);
        panelEstablecimiento.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 42, 247, -1));

        label8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label8.setText("Dirección");
        panelEstablecimiento.add(label8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 113, -1));

        label9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label9.setText("Altura");
        panelEstablecimiento.add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 73, 113, -1));

        txtAltura.setEditable(false);
        panelEstablecimiento.add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 73, 60, -1));

        label10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label10.setText("Teléfono");
        panelEstablecimiento.add(label10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 104, 113, -1));

        txtTelefono.setEditable(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panelEstablecimiento.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 104, 125, -1));

        label11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label11.setText("Costo Estudio");
        panelEstablecimiento.add(label11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 113, -1));

        txtLocalidad.setEditable(false);
        txtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadActionPerformed(evt);
            }
        });
        panelEstablecimiento.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 135, 125, -1));

        txtLocalidad1.setEditable(false);
        txtLocalidad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidad1ActionPerformed(evt);
            }
        });
        panelEstablecimiento.add(txtLocalidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 135, 125, -1));

        label12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label12.setText("Localidad");
        panelEstablecimiento.add(label12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 113, -1));

        txtCostoEstudio.setEditable(false);
        panelEstablecimiento.add(txtCostoEstudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 70, -1));

        label13.setText("Localidad");
        panelEstablecimiento.add(label13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 135, 113, -1));

        panelImage1.add(panelEstablecimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 400, 200));

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MostrarTurno.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 60));

        cmdAceptar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Aceptar.png"))); // NOI18N
        cmdAceptar1.setBorderPainted(false);
        cmdAceptar1.setContentAreaFilled(false);
        cmdAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptar1ActionPerformed(evt);
            }
        });
        panelImage1.add(cmdAceptar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocalidad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidad1ActionPerformed

    private void txtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void cmdAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptar1ActionPerformed
       this.hide();
    }//GEN-LAST:event_cmdAceptar1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAceptar1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JLabel lblMadera;
    private javax.swing.JLabel lblMadera1;
    private org.edisoncor.gui.panel.PanelImage panelEstablecimiento;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private org.edisoncor.gui.textField.TextField txtAltura;
    private org.edisoncor.gui.textField.TextField txtApellido;
    private org.edisoncor.gui.textField.TextField txtCodigoTurno;
    private org.edisoncor.gui.textField.TextField txtCostoEstudio;
    private org.edisoncor.gui.textField.TextField txtDireccion;
    private org.edisoncor.gui.textField.TextField txtEstablecimiento;
    private org.edisoncor.gui.textField.TextField txtEstudio;
    private org.edisoncor.gui.textField.TextField txtFechaTurno;
    private org.edisoncor.gui.textField.TextField txtHoraTurno;
    private org.edisoncor.gui.textField.TextField txtLocalidad;
    private org.edisoncor.gui.textField.TextField txtLocalidad1;
    private org.edisoncor.gui.textField.TextField txtNombre;
    private org.edisoncor.gui.textField.TextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}