/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmg.consulmedico.VISTA.SOLICITARTURNO;

import Atxy2k.CustomTextField.RestrictedTextField;
import com.jmg.consulmedico.BD.ConexionDB;
import com.jmg.consulmedico.MODELO.EstadoCivil;
import com.jmg.consulmedico.MODELO.Medico;
import com.jmg.consulmedico.MODELO.PacienteMedicoCabecera;
import com.jmg.consulmedico.MODELO.Turno;
import com.jmg.consulmedico.MODELO.GrupoSanguineo;
import com.jmg.consulmedico.MODELO.Localidad;
import com.jmg.consulmedico.MODELO.ObraSocial;
import com.jmg.consulmedico.MODELO.Paciente;
import com.jmg.consulmedico.MODELO.PacienteObraSocial;
import com.jmg.consulmedico.MODELO.TurnoEstudio;
import com.jmg.consulmedico.MODELO.Visita;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumno
 */
public class VRegistroPaciente extends javax.swing.JFrame {  
    private ConexionDB conexion = new ConexionDB();
    private Paciente paciente;
   private List<Medico> medicos = new ArrayList<>();
   private List<ObraSocial> obrasocial  = new ArrayList<>();
   
   private Turno turnopaciente;
   
    
    public VRegistroPaciente() {
        initComponents();
      
        this.llenarMedicos();
        this.llenarObrasSociales();
        GrupoSanguineo.llenarGruposSanguineo(this.cboGrupoSanguineo);
        this.txtDniPaciente.setText(paciente.getDni());
        this.inicializartext();
        this.setLocationRelativeTo(null);
        this.show();
        
    }

    
    private void inicializartext()
    {
         RestrictedTextField restricted;
          RestrictedTextField restricted1;
           RestrictedTextField restricted2;
            RestrictedTextField restricted3;
             RestrictedTextField restricted4;
              RestrictedTextField restricted5;
               RestrictedTextField restricted6;
                RestrictedTextField restricted7;
                RestrictedTextField restricted8; 
        restricted = new RestrictedTextField(this.txtNombredePaciente);
        restricted.setLimit(30);
          restricted1 = new RestrictedTextField(this.txtApellidodePaciente);
        restricted1.setLimit(30);
        
          restricted2 = new RestrictedTextField(this.txtTelefono);
        restricted2.setLimit(11);
          restricted3 = new RestrictedTextField(this.txtMail);
        restricted3.setLimit(70);
        
          restricted4 = new RestrictedTextField(this.txtLocalidad);
        restricted4.setLimit(50);
          restricted5 = new RestrictedTextField(this.txtCodigoPostal);
        restricted5.setLimit(11);
        
          restricted6 = new RestrictedTextField(this.txtDireccion);
        restricted6.setLimit(50);
          restricted7 = new RestrictedTextField(this.txtAltura);
        restricted7.setLimit(6);
        
        restricted8 = new RestrictedTextField(this.txtNroAfiliado);
        restricted8.setLimit(20);
        
       
    }
    public VRegistroPaciente(Paciente paciente,Turno turnopaciente) {
        initComponents();
        this.llenarMedicos();
        this.llenarObrasSociales();
        this.paciente=paciente;
        this.turnopaciente=turnopaciente;
         this.txtDniPaciente.setText(paciente.getDni());
             this.inicializartext();
             
         this.cboMedicoCabecera.addItem("");
         
         for(int i=0;i<this.medicos.size();i++)
         {
             this.cboMedicoCabecera.addItem(medicos.get(i).getApellidoMed()+" "+medicos.get(i).getNombreMed());
         }
         
          this.cboObraSocial.addItem("");
         for(int i=0;i<this.obrasocial.size();i++)
         {
             this.cboObraSocial.addItem(this.obrasocial.get(i).getNombreOS());
         }
          GrupoSanguineo.llenarGruposSanguineo(this.cboGrupoSanguineo);
       
        this.setLocationRelativeTo(null);
        this.show();
    }

    public Paciente getPaciente() {
        return paciente;
    }

    private void llenarMedicos() {
        Medico.BuscarMedicosdeCabeceras(this.conexion,this.medicos);
    }
    
    private void llenarObrasSociales() {
        ObraSocial.BuscarObrasSocialesActiva(this.conexion,this.obrasocial);
        
    }
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
        cmdRegistrarPaciente = new javax.swing.JButton();
        lblTipodeTurno = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox();
        lblDniPaciente1 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        lblNombrePaciente1 = new javax.swing.JLabel();
        lblApellidodePaciente1 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblDniPaciente2 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtCodigoPostal = new javax.swing.JTextField();
        lblNombrePaciente2 = new javax.swing.JLabel();
        lblApellidodePaciente2 = new javax.swing.JLabel();
        lblApellidodePaciente3 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JComboBox();
        lblDniPaciente5 = new javax.swing.JLabel();
        cboObraSocial = new javax.swing.JComboBox();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        lblTipodeTurno1 = new javax.swing.JLabel();
        lblDniPaciente3 = new javax.swing.JLabel();
        lblDniPaciente4 = new javax.swing.JLabel();
        lblApellidodePaciente4 = new javax.swing.JLabel();
        lblDniPaciente6 = new javax.swing.JLabel();
        txtNroAfiliado = new javax.swing.JTextField();
        txtFechaVencimiento = new javax.swing.JFormattedTextField();
        txtTelefono = new javax.swing.JTextField();
        txtMail = new javax.swing.JTextField();
        cboMedicoCabecera = new javax.swing.JComboBox();
        panelImage2 = new org.edisoncor.gui.panel.PanelImage();
        cboGrupoSanguineo = new javax.swing.JComboBox();

        setResizable(false);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapacientefondo.png"))); // NOI18N

        lblNombrePaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombrePaciente.setText("Nombre de Paciente");

        lblApellidodePaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidodePaciente.setText("Apellido de Paciente");

        lblDniPaciente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente.setText("Dni Paciente");

        txtDniPaciente.setEnabled(false);

        cmdRegistrarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/AltaPacienteguardar.png"))); // NOI18N
        cmdRegistrarPaciente.setBorderPainted(false);
        cmdRegistrarPaciente.setContentAreaFilled(false);
        cmdRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRegistrarPacienteActionPerformed(evt);
            }
        });

        lblTipodeTurno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTipodeTurno.setText("Sexo");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Masculino", "Femenino" }));

        lblDniPaciente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente1.setText("Grupo Sanguineo");

        lblNombrePaciente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombrePaciente1.setText("Localidad");

        lblApellidodePaciente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidodePaciente1.setText("Direccion");

        lblDniPaciente2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente2.setText("Altura");

        lblNombrePaciente2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombrePaciente2.setText("Codigo Postal");

        lblApellidodePaciente2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidodePaciente2.setText("Estado Civil");

        lblApellidodePaciente3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidodePaciente3.setText("Fecha de Nacimiento");

        txtEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Casado", "Viudo", "Divorciado", "Soltero", "Concubino" }));

        lblDniPaciente5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente5.setText("Obra Social");

        txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));

        lblTipodeTurno1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTipodeTurno1.setText("Medico Cabezera");

        lblDniPaciente3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente3.setText("E-Mail");

        lblDniPaciente4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente4.setText("Teléfono");

        lblApellidodePaciente4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblApellidodePaciente4.setText("Fecha Vencimiento");

        lblDniPaciente6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDniPaciente6.setText("N° Afiliado");

        txtFechaVencimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        panelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Altapaciente.png"))); // NOI18N

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

        cboGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Masculino", "Femenino" }));

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDniPaciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniPaciente4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTipodeTurno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(lblApellidodePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(2, 2, 2)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDniPaciente)
                            .addComponent(txtNombredePaciente)
                            .addComponent(txtApellidodePaciente)
                            .addComponent(cboSexo, 0, 117, Short.MAX_VALUE)))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDniPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblNombrePaciente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblApellidodePaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLocalidad)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addComponent(cboGrupoSanguineo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(179, 179, 179))))
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelImage1Layout.createSequentialGroup()
                                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDniPaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNombrePaciente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblApellidodePaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                                .addComponent(lblApellidodePaciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMedicoCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCodigoPostal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstadoCivil, javax.swing.GroupLayout.Alignment.LEADING, 0, 113, Short.MAX_VALUE)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(lblDniPaciente5)
                    .addGroup(panelImage1Layout.createSequentialGroup()
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblApellidodePaciente4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDniPaciente6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblTipodeTurno1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addComponent(panelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente)
                    .addComponent(txtDniPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePaciente)
                    .addComponent(txtNombredePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidodePaciente)
                    .addComponent(txtApellidodePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipodeTurno)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente1)
                    .addComponent(cboGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePaciente1)
                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidodePaciente1)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente2)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePaciente2)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidodePaciente2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidodePaciente3)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipodeTurno1)
                    .addComponent(cboMedicoCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente3)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidodePaciente4)
                    .addComponent(txtFechaVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniPaciente6)
                    .addComponent(txtNroAfiliado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboObraSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniPaciente5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdRegistrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void cmdRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRegistrarPacienteActionPerformed
      if(this.validardatos())
      {
        boolean sexo = false;
        if(((String)this.cboSexo.getSelectedItem()).equals("Masculino"))
        {
            sexo = true;
        }
          Date fecha1;
            int dia = Integer.parseInt(""+ this.txtFechaNacimiento.getText().charAt(0)+this.txtFechaNacimiento.getText().charAt(1));
            int mes=Integer.parseInt(""+ this.txtFechaNacimiento.getText().charAt(3)+this.txtFechaNacimiento.getText().charAt(4));
            int anio =Integer.parseInt(""+ this.txtFechaNacimiento.getText().charAt(6)+this.txtFechaNacimiento.getText().charAt(7)+ this.txtFechaNacimiento.getText().charAt(8)+this.txtFechaNacimiento.getText().charAt(9));
           fecha1 = new Date(anio,mes,dia);
    
       
        
        
        
        
        this.paciente= new Paciente(0,this.txtDniPaciente.getText(),this.txtNombredePaciente.getText(), this.txtApellidodePaciente.getText(),fecha1,this.txtTelefono.getText(),sexo,new GrupoSanguineo((String)this.cboGrupoSanguineo.getSelectedItem()),this.txtMail.getText(), new Localidad(this.txtLocalidad.getText()),this.txtCodigoPostal.getText(),this.txtDireccion.getText(),this.txtAltura.getText(),new EstadoCivil((String)this.txtEstadoCivil.getSelectedItem()),this.retornarPacienteObraSocial(),this.retornarMedicoCabecera());
     /*
        this.paciente.setPacienteobrasocial(new PacienteObraSocial(paciente));
        this.paciente.getPacienteobrasocial().getFechavencimiento().add(fecha1);
        this.paciente.getPacienteobrasocial().getNumerodeafiliado().add(this.txtNroAfiliado.getText());
        this.paciente.getPacienteobrasocial().getObrasocial().add(this.obrasocial.get(this.cboObraSocial.getSelectedIndex()));
      
        this.paciente.setPacientemedicocabezera(new PacienteMedicoCabecera(this.paciente));
        this.paciente.getPacientemedicocabezera().getMedico().add(this.medicos.get(this.cboMedicoCabecera.getSelectedIndex()));
        */
        this.paciente.almacenarPaciente(conexion);
        
        this.paciente=Paciente.inicializarPaciente(conexion, this.txtDniPaciente.getText());
        
     
         switch(this.turnopaciente.getClass().getSimpleName())
            {
                case "Visita":
                     ((Visita)turnopaciente).setPaciente(paciente);
                    break;
               case "TurnoEstudio":
                     ((TurnoEstudio)turnopaciente).setPaciente(paciente);
                    break;
                    
            }
           
     
          JOptionPane.showMessageDialog(panelImage1, "El Paciente fue registrado con exito!!!");  
         Turno.ProcesarSolicituddeTurno(new ConexionDB(),this.turnopaciente);
         this.hide();
      }
    }//GEN-LAST:event_cmdRegistrarPacienteActionPerformed

    private PacienteObraSocial retornarPacienteObraSocial()
    {
        PacienteObraSocial pacienteobrasocial = new PacienteObraSocial(null);
        for( int i=0;i<this.obrasocial.size();i++)
        {
            if(((String)this.cboObraSocial.getSelectedItem()).equals(this.obrasocial.get(i).getNombreOS()))
            {
            pacienteobrasocial.getObrasocial().add(this.obrasocial.get(i));
            Date fechanueva;
            int dia = Integer.parseInt(""+ this.txtFechaVencimiento.getText().charAt(0)+this.txtFechaVencimiento.getText().charAt(1));
            int mes=Integer.parseInt(""+ this.txtFechaVencimiento.getText().charAt(3)+this.txtFechaVencimiento.getText().charAt(4));
            int anio =Integer.parseInt(""+ this.txtFechaVencimiento.getText().charAt(6)+this.txtFechaVencimiento.getText().charAt(7)+ this.txtFechaVencimiento.getText().charAt(8)+this.txtFechaVencimiento.getText().charAt(9));
                fechanueva = new Date(anio,mes,dia);
            
            pacienteobrasocial.getFechavencimiento().add(fechanueva);
            pacienteobrasocial.getNumerodeafiliado().add(this.txtNroAfiliado.getText());
            return pacienteobrasocial;
            }
        }
        return null;
        
    }
    private PacienteMedicoCabecera retornarMedicoCabecera()
    {
        PacienteMedicoCabecera pacientemedico = new PacienteMedicoCabecera(null);
        for( int i=0;i<this.medicos.size();i++)
        {
            if(((String)this.cboMedicoCabecera.getSelectedItem()).equals(this.medicos.get(i).getApellidoMed()+" "+this.medicos.get(i).getNombreMed()))
            {
            pacientemedico.getMedico().add(this.medicos.get(i));
            return pacientemedico;
            }
        }
        return null;
       
        
        
    }
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cboGrupoSanguineo;
    private javax.swing.JComboBox cboMedicoCabecera;
    private javax.swing.JComboBox cboObraSocial;
    private javax.swing.JComboBox cboSexo;
    private javax.swing.JButton cmdRegistrarPaciente;
    private javax.swing.JLabel lblApellidodePaciente;
    private javax.swing.JLabel lblApellidodePaciente1;
    private javax.swing.JLabel lblApellidodePaciente2;
    private javax.swing.JLabel lblApellidodePaciente3;
    private javax.swing.JLabel lblApellidodePaciente4;
    private javax.swing.JLabel lblDniPaciente;
    private javax.swing.JLabel lblDniPaciente1;
    private javax.swing.JLabel lblDniPaciente2;
    private javax.swing.JLabel lblDniPaciente3;
    private javax.swing.JLabel lblDniPaciente4;
    private javax.swing.JLabel lblDniPaciente5;
    private javax.swing.JLabel lblDniPaciente6;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JLabel lblNombrePaciente1;
    private javax.swing.JLabel lblNombrePaciente2;
    private javax.swing.JLabel lblTipodeTurno;
    private javax.swing.JLabel lblTipodeTurno1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelImage panelImage2;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtApellidodePaciente;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDniPaciente;
    private javax.swing.JComboBox txtEstadoCivil;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JFormattedTextField txtFechaVencimiento;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombredePaciente;
    private javax.swing.JTextField txtNroAfiliado;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private boolean validardatos() {
        if(this.txtNombredePaciente.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el nombre del paciente.");
            return false;
        }
         if(this.txtAltura.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado la altura.");
            return false;
        }
          if(this.txtApellidodePaciente.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el apellido del paciente.");
            return false;
        }
           if(this.txtCodigoPostal.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el codigo postal del paciente.");
            return false;
        }
            if(this.txtDireccion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado la dirección del paciente.");
            return false;
        }
             if(this.txtFechaNacimiento.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado la fecha de nacimiento del paciente.");
            return false;
        }
              if(this.txtFechaVencimiento.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado la fecha de vencimiento del carnet de la obra social del paciente.");
            return false;
        }
               if(this.txtLocalidad.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado la localidad del paciente.");
            return false;
        }
                if(this.txtMail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el e-mail del paciente.");
            return false;
        }
                 if(this.txtNroAfiliado.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el numero de afiliado de la obra social del paciente.");
            return false;
        }
                 
                         if(this.txtTelefono.getText().equals(""))
        {
            JOptionPane.showMessageDialog(panelImage1, "No ha ingresado el telefono del paciente.");
            return false;
        }
        if(this.cboGrupoSanguineo.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(panelImage1, "No ha seleccionado el grupo sanguineo del paciente.");
            return false;
        }
        if(this.cboMedicoCabecera.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(panelImage1, "No ha seleccionado el médico de cabecera del paciente.");
            return false;
        }
        if(this.cboObraSocial.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(panelImage1, "No ha seleccionado la obra social del paciente.");
            return false;
        }
        if(this.cboSexo.getSelectedIndex()==-1)
        {
             JOptionPane.showMessageDialog(panelImage1, "No ha seleccionado el sexo del paciente.");
            return false;
        }
                 
        
        
        
        return true;
    }

    
}
