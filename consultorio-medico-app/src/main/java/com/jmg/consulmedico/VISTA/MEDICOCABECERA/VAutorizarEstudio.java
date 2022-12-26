/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.VISTA.MEDICOCABECERA;

import com.jmg.consulmedico.BD.ConexionDB;
import com.jmg.consulmedico.MODELO.Estudio;
import com.jmg.consulmedico.MODELO.Medico;
import com.jmg.consulmedico.MODELO.PacienteMedicoCabecera;

import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class VAutorizarEstudio extends javax.swing.JFrame {
    private JLabel jLabel7;
    private JLabel jLabel8;

    /**
     * Creates new form VAutorizarEstudio
     */
    public VAutorizarEstudio(int codigomedico ) {
         initComponents();
         List<Estudio> estudios = Estudio.retornarEstudios(new ConexionDB());
         for(int i=0;i<estudios.size();i++)
         {
            this.cboEstudios.addItem(estudios.get(i).getEstudio());
         }
         List<String> nombrepacientes = Medico.retornarPacientesdeMedico(new ConexionDB(),codigomedico);
         for(int i=0;i<nombrepacientes.size();i++)
         {
             this.cboPacientes.addItem(nombrepacientes.get(i));
         }
         this.repaint();
         
          this.setLocationRelativeTo(null);
        this.show();
    }

	
	
	 private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        cboPacientes = new javax.swing.JComboBox();
        cboEstudios = new javax.swing.JComboBox();
        cmdAutorizarEstudio = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N

        cboPacientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Paciente" }));

        cboEstudios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elegir Estudio" }));

        cmdAutorizarEstudio.setText("Autorizar Estudio");
        cmdAutorizarEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutorizarEstudioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Paciente");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("Estudio a Autorizar");

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboEstudios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboPacientes, 0, 193, Short.MAX_VALUE)))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(cmdAutorizarEstudio)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(cmdAutorizarEstudio)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  
  
  
  
    private void cmdAutorizarEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutorizarEstudioActionPerformed
         if(this.validarDatos())
         {
             PacienteMedicoCabecera.autorizarEstudio(new ConexionDB(),(String)this.cboPacientes.getSelectedItem(),(String)this.cboEstudios.getSelectedItem());
          this.hide();
         }
         else
         {
             JOptionPane.showMessageDialog(this, "Debe Selecionar el paciente y el estudio primero. Verifique haberlo hecho.");
         }
    }//GEN-LAST:event_cmdAutorizarEstudioActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboEstudios;
    private javax.swing.JComboBox cboPacientes;
    private javax.swing.JButton cmdAutorizarEstudio;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables

    private boolean validarDatos() {
        if(this.cboPacientes.getSelectedIndex()==-1)
        {
            return false;
        }
        if(this.cboEstudios.getSelectedIndex()==-1)
        {
            return false;
        }
        return true;
    }
}
