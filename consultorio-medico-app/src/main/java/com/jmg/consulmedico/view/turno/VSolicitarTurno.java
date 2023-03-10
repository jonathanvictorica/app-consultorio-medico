package com.jmg.consulmedico.view.turno;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.jmg.consulmedico.model.*;
import org.edisoncor.gui.panel.PanelImage;

import javax.swing.*;
import java.util.List;


public class VSolicitarTurno extends javax.swing.JFrame {
      Paciente paciente = null;
      Turno turnopaciente = null;
    
    public VSolicitarTurno() {
        initComponents();
        
        RestrictedTextField restricted = new RestrictedTextField(this.txtDniPaciente);
        restricted.setLimit(8);
        
       
        
        
        this.cboTipo.removeAllItems();
         this.lblTipo.setVisible(false);
         this.cboTipo.setVisible(false);
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
        lblNombrePaciente = new javax.swing.JLabel();
        lblApellidodePaciente = new javax.swing.JLabel();
        lblDniPaciente = new javax.swing.JLabel();
        txtDniPaciente = new javax.swing.JTextField();
        txtNombredePaciente = new javax.swing.JTextField();
        txtApellidodePaciente = new javax.swing.JTextField();
        cmdSolicitarTurno = new javax.swing.JButton();
        lblTipodeTurno = new javax.swing.JLabel();
        cboTipodeTurno = new javax.swing.JComboBox();
        lblTipo = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox();

        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombrePaciente.setText("Nombre de Paciente");
        panelImage1.add(lblNombrePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 46, 125, -1));

        lblApellidodePaciente.setText("Apellido de Paciente");
        panelImage1.add(lblApellidodePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, 125, -1));

        lblDniPaciente.setText("Dni Paciente");
        panelImage1.add(lblDniPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 99, -1));

        txtDniPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniPacienteActionPerformed(evt);
            }
        });
        txtDniPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniPacienteKeyReleased(evt);
            }
        });
        panelImage1.add(txtDniPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 17, 177, -1));

        txtNombredePaciente.setEditable(false);
        panelImage1.add(txtNombredePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 43, 177, -1));

        txtApellidodePaciente.setEditable(false);
        panelImage1.add(txtApellidodePaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 69, 175, -1));

        cmdSolicitarTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AceptarTurno.png"))); // NOI18N
        cmdSolicitarTurno.setBorderPainted(false);
        cmdSolicitarTurno.setContentAreaFilled(false);
        cmdSolicitarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSolicitarTurnoActionPerformed(evt);
            }
        });
        panelImage1.add(cmdSolicitarTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 180, -1));

        lblTipodeTurno.setText("Tipo de Turno");
        panelImage1.add(lblTipodeTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 125, -1));

        cboTipodeTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Visitar M??dico de Cabecera", "Visitar Especialista", "Realizar Estudio" }));
        cboTipodeTurno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboTipodeTurnoItemStateChanged(evt);
            }
        });
        panelImage1.add(cboTipodeTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 95, 175, -1));

        lblTipo.setText("Estudio");
        panelImage1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, 119, -1));

        panelImage1.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 121, 175, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JComboBox getCboTipo() {
        return cboTipo;
    }

    private void cmdSolicitarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSolicitarTurnoActionPerformed
       if(this.validardato())
       {
        switch((String)this.getCboTipodeTurno().getSelectedItem())
        {
          
                case "Visitar M??dico de Cabecera":
                    turnopaciente = new Visita(null,null,paciente,null,null,true);
                    turnopaciente.tipodeturno="Visitar M??dico";
                    
                    ((Visita)turnopaciente).medicocabecera=true;
                    break;
                case "Visitar Especialista":
                     turnopaciente = new Visita(this.retornarEspecialidadMedico(),null,paciente,null,null,true);
                    turnopaciente.tipodeturno="Visitar Especialista"; 
                    ((Visita)turnopaciente).medicocabecera=false;
                    break;
                   
                case "Realizar Estudio":
                     turnopaciente = new TurnoEstudio(this.retornarEstudio(),null,paciente,null,null,true);
                       turnopaciente.tipodeturno="Realizar Estudio";              
                            
                    break;
                 
        }
        if(this.paciente==null)
        {
            paciente= new Paciente();
            paciente.setDni(this.txtDniPaciente.getText());
            VRegistroPaciente registrarpaciente = new VRegistroPaciente(this.paciente,this.turnopaciente);
            this.hide();
        }
        else
        {
            switch(this.turnopaciente.getClass().getSimpleName())
            {
                case "Visita":
                     ((Visita)turnopaciente).setPaciente(paciente);
                    break;
               case "TurnoEstudio":
                     ((TurnoEstudio)turnopaciente).setPaciente(paciente);
                    break;
                    
            }
          
            
            Turno.ProcesarSolicituddeTurno(this.turnopaciente);
            this.hide();
            
        }
        
        
       }
    }//GEN-LAST:event_cmdSolicitarTurnoActionPerformed

    public JLabel getLblTipo() {
        return lblTipo;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setTurnopaciente(Turno turnopaciente) {
        this.turnopaciente = turnopaciente;
    }

    public void setCboTipo(JComboBox cboTipo) {
        this.cboTipo = cboTipo;
    }

    public void setCboTipodeTurno(JComboBox cboTipodeTurno) {
        this.cboTipodeTurno = cboTipodeTurno;
    }

    public void setCmdSolicitarTurno(JButton cmdSolicitarTurno) {
        this.cmdSolicitarTurno = cmdSolicitarTurno;
    }

    public void setLblApellidodePaciente(JLabel lblApellidodePaciente) {
        this.lblApellidodePaciente = lblApellidodePaciente;
    }

    public void setLblDniPaciente(JLabel lblDniPaciente) {
        this.lblDniPaciente = lblDniPaciente;
    }

    public void setLblNombrePaciente(JLabel lblNombrePaciente) {
        this.lblNombrePaciente = lblNombrePaciente;
    }

    public void setLblTipo(JLabel lblTipo) {
        this.lblTipo = lblTipo;
    }

    public void setLblTipodeTurno(JLabel lblTipodeTurno) {
        this.lblTipodeTurno = lblTipodeTurno;
    }

    public void setPanelImage1(PanelImage panelImage1) {
        this.panelImage1 = panelImage1;
    }

    public void setTxtApellidodePaciente(JTextField txtApellidodePaciente) {
        this.txtApellidodePaciente = txtApellidodePaciente;
    }

    public void setTxtDniPaciente(JTextField txtDniPaciente) {
        this.txtDniPaciente = txtDniPaciente;
    }

    public void setTxtNombredePaciente(JTextField txtNombredePaciente) {
        this.txtNombredePaciente = txtNombredePaciente;
    }

    private void cboTipodeTurnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboTipodeTurnoItemStateChanged
        if(this.cboTipodeTurno.getSelectedItem().equals("Realizar Estudio"))
        {
            List<Estudio> estudios = Estudio.retornarEstudios();
           this.cboTipo.removeAllItems();
             this.lblTipo.setVisible(true);
           this.lblTipo.setText("Estudios");
         this.cboTipo.setVisible(true);
            for(int i=0;i<estudios.size();i++)
            {
                this.cboTipo.addItem(estudios.get(i).getEstudio());
            }
        }
        else
        {
              
            if(this.cboTipodeTurno.getSelectedItem().equals("Visitar Especialista"))
            {
                this.lblTipo.setText("Especialidad");
                this.lblTipo.setVisible(true);
                this.cboTipo.setVisible(true);
                List<Especialidad> especialidades = Especialidad.retornarEspecialidad();
                this.cboTipo.removeAllItems();
                for(int i=0;i<especialidades.size();i++)
                {
                     if(!especialidades.get(i).equals("M??dico"))
                    {
                           this.cboTipo.addItem(especialidades.get(i).getNombreEsp());
                       }
                }
            }
            else
            {
                this.lblTipo.setText("");
                this.lblTipo.setVisible(false);
                this.cboTipo.setVisible(false);
            }
            
        }
        this.repaint();
    }//GEN-LAST:event_cboTipodeTurnoItemStateChanged

    private void txtDniPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniPacienteKeyReleased
        this.paciente = Paciente.inicializarPaciente(this.txtDniPaciente.getText());
            if( this.paciente!=null)
            {
                this.txtNombredePaciente.setText( this.paciente.getNombre());
                this.txtApellidodePaciente.setText( this.paciente.getApellido());
                
                
                this.txtNombredePaciente.setEditable(false);
                this.txtApellidodePaciente.setEditable(false);
                this.repaint();
            }
            else
            {
                 this.txtNombredePaciente.setText("");
                this.txtApellidodePaciente.setText("");
                
                
                this.txtNombredePaciente.setEditable(false);
                this.txtApellidodePaciente.setEditable(false);
                this.repaint();
            }
    }//GEN-LAST:event_txtDniPacienteKeyReleased

    private void txtDniPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniPacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniPacienteActionPerformed

    public JComboBox getCboTipodeTurno() {
        return cboTipodeTurno;
    }

    public JButton getCmdSolicitarTurno() {
        return cmdSolicitarTurno;
    }

    public JLabel getLblApellidodePaciente() {
        return lblApellidodePaciente;
    }

    public JLabel getLblDniPaciente() {
        return lblDniPaciente;
    }

    public JLabel getLblNombrePaciente() {
        return lblNombrePaciente;
    }

    public JLabel getLblTipodeTurno() {
        return lblTipodeTurno;
    }

    public PanelImage getPanelImage1() {
        return panelImage1;
    }

    public JTextField getTxtApellidodePaciente() {
        return txtApellidodePaciente;
    }

    public JTextField getTxtDniPaciente() {
        return txtDniPaciente;
    }

    public JTextField getTxtNombredePaciente() {
        return txtNombredePaciente;
    }

    

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboTipo;
    private javax.swing.JComboBox cboTipodeTurno;
    private javax.swing.JButton cmdSolicitarTurno;
    private javax.swing.JLabel lblApellidodePaciente;
    private javax.swing.JLabel lblDniPaciente;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTipodeTurno;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JTextField txtApellidodePaciente;
    private javax.swing.JTextField txtDniPaciente;
    private javax.swing.JTextField txtNombredePaciente;
    // End of variables declaration//GEN-END:variables

    

    private Medico retornarEspecialidadMedico() {
        Medico mediconuevo = new Medico();
        Especialidad especialidad = new Especialidad((String)this.cboTipo.getSelectedItem());
        mediconuevo.setEspecialidad(especialidad);
        return mediconuevo;
    }

    private Estudio retornarEstudio() {
         Estudio estudio = new Estudio((String)this.cboTipo.getSelectedItem());
        estudio.inicializarEstudio();
        return estudio;
    }

    private boolean validardato() {
        if(this.txtDniPaciente.getText().equals(""))
         {
             JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el DNI de ning??n paciente para solicitar el turno.");
            return false;
         }
       
        
         
        
        
        
        return true;
    }
}
