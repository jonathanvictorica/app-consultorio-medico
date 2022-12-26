/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.view.turno;

import com.jmg.consulmedico.model.Paciente;
import com.jmg.consulmedico.model.Turno;
import com.jmg.consulmedico.model.TurnoEstudio;
import com.jmg.consulmedico.model.Visita;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class VCancelarTurno extends javax.swing.JFrame {

    private Paciente paciente;
    private List<Turno> turnosdepaciente= new ArrayList<>();
    private boolean cambiarturno = false;
    public VCancelarTurno(Paciente paciente,boolean cambiarturno) {
        initComponents();
        this.paciente = paciente;
        Turno.buscarTurnosdePaciente(turnosdepaciente,paciente.getCodigopaciente());
        this.txtDni.setText(this.paciente.getDni());
        this.panelDetalle.setVisible(false);
        this.setLocationRelativeTo(null);
        this.show();
        this.cambiarturno=cambiarturno;
        
        
        
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
        txtDni = new org.edisoncor.gui.textField.TextField();
        cboTipoTurno = new javax.swing.JComboBox();
        cboTurno = new javax.swing.JComboBox();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        panelDetalle = new org.edisoncor.gui.panel.PanelImage();
        lblEstudiooMedico = new java.awt.Label();
        txtEstudiooMedico = new org.edisoncor.gui.textField.TextField();
        lblEstudiooMedico1 = new java.awt.Label();
        txtFechaTurno = new org.edisoncor.gui.textField.TextField();
        lblEstudiooMedico2 = new java.awt.Label();
        txtHoraTurno = new org.edisoncor.gui.textField.TextField();
        cmdCancelarTurno = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDni.setEditable(false);
        txtDni.setBackground(new java.awt.Color(204, 204, 204));
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        panelImage1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 145, 24));

        cboTipoTurno.setBackground(new java.awt.Color(204, 204, 204));
        cboTipoTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Realizar Estudio", "Visitar Médico" }));
        cboTipoTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipoTurnoItemStateChanged(evt);
            }
        });
        panelImage1.add(cboTipoTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 185, 24));

        cboTurno.setBackground(new java.awt.Color(204, 204, 204));
        cboTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTurnoItemStateChanged(evt);
            }
        });
        cboTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTurnoActionPerformed(evt);
            }
        });
        panelImage1.add(cboTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 185, 24));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/CancelarTurnoTitulo.png"))); // NOI18N
        panelImage2.setPreferredSize(new java.awt.Dimension(0, 58));

        javax.swing.GroupLayout panelImage2Layout = new javax.swing.GroupLayout(panelImage2);
        panelImage2.setLayout(panelImage2Layout);
        panelImage2Layout.setHorizontalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );
        panelImage2Layout.setVerticalGroup(
            panelImage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        panelImage1.add(panelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 369, -1));

        panelDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N

        lblEstudiooMedico.setBackground(new java.awt.Color(238, 246, 255));
        lblEstudiooMedico.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEstudiooMedico.setText("Estudio");

        txtEstudiooMedico.setEditable(false);
        txtEstudiooMedico.setBackground(new java.awt.Color(204, 204, 204));
        txtEstudiooMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEstudiooMedico.setForeground(new java.awt.Color(255, 255, 255));
        txtEstudiooMedico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblEstudiooMedico1.setBackground(new java.awt.Color(238, 246, 255));
        lblEstudiooMedico1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEstudiooMedico1.setText("Fecha Turno");

        txtFechaTurno.setEditable(false);
        txtFechaTurno.setBackground(new java.awt.Color(204, 204, 204));
        txtFechaTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFechaTurno.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        lblEstudiooMedico2.setBackground(new java.awt.Color(231, 242, 255));
        lblEstudiooMedico2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEstudiooMedico2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblEstudiooMedico2.setText("Hora Turno");

        txtHoraTurno.setEditable(false);
        txtHoraTurno.setBackground(new java.awt.Color(204, 204, 204));
        txtHoraTurno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtHoraTurno.setForeground(new java.awt.Color(255, 255, 255));
        txtHoraTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtHoraTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraTurnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblEstudiooMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEstudiooMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addComponent(lblEstudiooMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFechaTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addComponent(lblEstudiooMedico2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoraTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstudiooMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblEstudiooMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblEstudiooMedico1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtHoraTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addComponent(lblEstudiooMedico2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        panelImage1.add(panelDetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 187, -1, -1));

        cmdCancelarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/botonCancelarTurno.png"))); // NOI18N
        cmdCancelarTurno.setBorderPainted(false);
        cmdCancelarTurno.setContentAreaFilled(false);
        cmdCancelarTurno.setFocusPainted(false);
        cmdCancelarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarTurnoActionPerformed(evt);
            }
        });
        panelImage1.add(cmdCancelarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 294, 168, 33));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Turno");
        panelImage1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 80, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("DNI");
        panelImage1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de Turno");
        panelImage1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 80, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboTipoTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipoTurnoItemStateChanged
         this.cboTurno.removeAllItems(); 
        
         
         this.cboTurno.addItem("");
        if(((String)this.cboTipoTurno.getSelectedItem()).equals("Realizar Estudio"))
          {
               for(int i=0;i<this.turnosdepaciente.size();i++)
               {
                   if(this.turnosdepaciente.get(i).getClass().getSimpleName().equals("TurnoEstudio"))
                   {
                       this.cboTurno.addItem(this.turnosdepaciente.get(i).getFechaturno()+ " " + this.turnosdepaciente.get(i).getHorarioturno());
                       
                   }
               }
              
          }
        else
        {
            for(int i=0;i<this.turnosdepaciente.size();i++)
               {
                   if(!this.turnosdepaciente.get(i).getClass().getSimpleName().equals("TurnoEstudio"))
                   {
                       this.cboTurno.addItem(this.turnosdepaciente.get(i).getFechaturno()+ " " + this.turnosdepaciente.get(i).getHorarioturno());
                       
                   }
               }
        }
         this.panelDetalle.setVisible(false);
         
         this.txtEstudiooMedico.setText("");
         this.txtFechaTurno.setText("");
         this.txtHoraTurno.setText("");
        this.repaint();
    }//GEN-LAST:event_cboTipoTurnoItemStateChanged

    private void cboTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTurnoItemStateChanged
        this.panelDetalle.setVisible(true);
        for(int i=0;i<this.turnosdepaciente.size();i++)
         {
                   if((this.turnosdepaciente.get(i).getFechaturno()+ " " + this.turnosdepaciente.get(i).getHorarioturno()).equals(this.cboTurno.getSelectedItem()))
                   {
                       if(!this.turnosdepaciente.get(i).getClass().getSimpleName().equals("TurnoEstudio"))
                        {
                           this.lblEstudiooMedico.setText("Medico");
                           this.txtEstudiooMedico.setText(((Visita)this.turnosdepaciente.get(i)).getMedico().getApellidoMed()+ " " +((Visita)this.turnosdepaciente.get(i)).getMedico().getNombreMed());
                           this.txtFechaTurno.setText(((Visita)this.turnosdepaciente.get(i)).getFechaturno()+"");
                           this.txtHoraTurno.setText(((Visita)this.turnosdepaciente.get(i)).getHorarioturno()+"");
                           
                         
                        }
                       else
                       {
                           this.lblEstudiooMedico.setText("Estudio");
                           this.txtEstudiooMedico.setText(((TurnoEstudio)this.turnosdepaciente.get(i)).getEstudio().getEstudio());
                           this.txtFechaTurno.setText(((TurnoEstudio)this.turnosdepaciente.get(i)).getFechaturno()+"");
                           this.txtHoraTurno.setText(((TurnoEstudio)this.turnosdepaciente.get(i)).getHorarioturno()+"");
                           
                       }
                   }
        }
         this.repaint();
    }//GEN-LAST:event_cboTurnoItemStateChanged

    private void txtHoraTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraTurnoActionPerformed

    private void cmdCancelarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarTurnoActionPerformed
     if(this.validardatos())
     {
        for(int i=0;i<this.turnosdepaciente.size();i++)
         {
                   if((this.turnosdepaciente.get(i).getFechaturno()+ " " + this.turnosdepaciente.get(i).getHorarioturno()).equals(this.cboTurno.getSelectedItem()))
                   {
                      this.turnosdepaciente.get(i).cancelarTurno();
                      
                   }
        }
         this.repaint();
         
       
        if(cambiarturno){
             
            
            
                for(int i=0;i<this.turnosdepaciente.size();i++)
                 {
                           if((this.turnosdepaciente.get(i).getFechaturno()+ " " + this.turnosdepaciente.get(i).getHorarioturno()).equals(this.cboTurno.getSelectedItem()))
                           {
                               if(this.turnosdepaciente.get(i).getClass().getSimpleName().equals("TurnoEstudio"))
                              {   
                                  VHorarioEstudio vhorarioestudio = new VHorarioEstudio(this.turnosdepaciente.get(i));
                              }    
                              else
                              {
                               VHorarioMedico vhorariomedico = new VHorarioMedico(this.turnosdepaciente.get(i));
                             
                              }
                              

                           }
                }
               
        }
       else
       {
             JOptionPane.showMessageDialog(panelImage1, "El turno fue cancelado existosamente");
       
       }
    this.hide();
     }
    }//GEN-LAST:event_cmdCancelarTurnoActionPerformed

    private void cboTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTurnoActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboTipoTurno;
    private javax.swing.JComboBox cboTurno;
    private javax.swing.JButton cmdCancelarTurno;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label lblEstudiooMedico;
    private java.awt.Label lblEstudiooMedico1;
    private java.awt.Label lblEstudiooMedico2;
    private org.edisoncor.gui.panel.PanelImage panelDetalle;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private org.edisoncor.gui.textField.TextField txtDni;
    private org.edisoncor.gui.textField.TextField txtEstudiooMedico;
    private org.edisoncor.gui.textField.TextField txtFechaTurno;
    private org.edisoncor.gui.textField.TextField txtHoraTurno;
    // End of variables declaration//GEN-END:variables

    private boolean validardatos() {
       
        if(this.cboTipoTurno.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(panelImage1, "No seleccionó el tipo de turno que desea eliminar");
            return false;
        }
         if(this.cboTurno.getSelectedIndex()==-1)
        {
            JOptionPane.showMessageDialog(panelImage1, "No seleccionó el turno que desea eliminar");
            return false;
        }
          if(this.panelDetalle.isVisible()==false)
        {
        JOptionPane.showMessageDialog(panelImage1, "No seleccionó el turno que desea eliminar");
            return false;
        }
        return true;
    }

    
}