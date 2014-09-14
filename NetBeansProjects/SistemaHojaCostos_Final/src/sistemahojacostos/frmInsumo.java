/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemahojacostos;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class frmInsumo extends javax.swing.JFrame {
    
    DefaultComboBoxModel modeloNOMUnidad = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCODUnidades = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloCODcategoria= new DefaultComboBoxModel();
    DefaultComboBoxModel modeloNOMcategoria = new DefaultComboBoxModel();
    
 boolean nuevo=true, encontrado = false, modificando = false;
 int codInsumo;
    ResultSet rsInsumo = null;
    ResultSet rsUnidades = null;
    ResultSet rsCategoria = null;
    Insumos objInsumo = new Insumos();
    Unidades unidades = new Unidades();
    Categoria categoria = new Categoria();
    public frmInsumo() {
        initComponents();
    
         this.setLocationRelativeTo(null);
          //Llenando el cmbUnidades mediante un modelo
        
        rsUnidades = unidades.llenarUnidades();
        rsCategoria =  categoria.llenarUnidades();
        
        
        try {
            while (rsUnidades.next()) {
                modeloNOMUnidad.addElement(rsUnidades.getString(2));
                modeloCODUnidades.addElement(rsUnidades.getString(1));
                
             
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        
        this.cmbCodUnidad.setModel(modeloCODUnidades);
        this.cmbUnidadNombre.setModel(modeloNOMUnidad);
      
       // lblCodigoUnidad.setText(cmbCodigoUnidades.getSelectedItem().toString());
        
      try {
            while (rsCategoria.next()) {
              
                
              modeloNOMcategoria.addElement(rsCategoria.getString(2));
               this.modeloCODcategoria.addElement(rsCategoria.getString(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        
        
        this.cmbCodCategoria.setModel(modeloCODcategoria);
        this.cmbCategoriaNombre.setModel(modeloNOMcategoria);
       // lblCodigoUnidad.setText(cmbCodigoUnidades.getSelectedItem().toString());
        
      
    
    }

    public void Limpiar(){
        this.txtCodInsumo.setText("");
        this.txtDescripcion.setText("");
        this.txtPrecioUnitario.setText("");
        
    }
    
    public void Bloquear(){
        this.txtCodInsumo.setEnabled(false);
        this.txtDescripcion.setEnabled(false);
        this.txtPrecioUnitario.setEnabled(false);
        this.cmbCodCategoria.setEnabled(false);
        this.cmbCodUnidad.setEnabled(false);
    }
    
    public void Desbloquear(){
        this.txtDescripcion.setEnabled(true);
        this.txtPrecioUnitario.setEnabled(true);
        this.cmbCodCategoria.setEnabled(true);
        this.cmbCodUnidad.setEnabled(true);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCodInsumo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        cmbCodUnidad = new javax.swing.JComboBox();
        cmbCodCategoria = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cmbUnidadNombre = new javax.swing.JComboBox();
        cmbCategoriaNombre = new javax.swing.JComboBox();
        btnAnterior = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        txtcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/cost.png")).getImage());

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 48)); // NOI18N
        jLabel1.setText("Insumos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Codigo Unidad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Precio Unitario");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descripcion");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Codigo Insumo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Codigo Categoria");

        txtCodInsumo.setEnabled(false);
        txtCodInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodInsumoActionPerformed(evt);
            }
        });

        txtDescripcion.setEnabled(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        txtPrecioUnitario.setEnabled(false);

        cmbCodUnidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCodUnidad.setEnabled(false);
        cmbCodUnidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCodUnidadItemStateChanged(evt);
            }
        });
        cmbCodUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodUnidadActionPerformed(evt);
            }
        });

        cmbCodCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCodCategoria.setEnabled(false);
        cmbCodCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCodCategoriaItemStateChanged(evt);
            }
        });
        cmbCodCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCodCategoriaActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729458_new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729470_Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        cmbUnidadNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUnidadNombre.setEnabled(false);

        cmbCategoriaNombre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategoriaNombre.setEnabled(false);

        btnAnterior.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383730960_Previous.png"))); // NOI18N
        btnAnterior.setText("Menú Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSalir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383731084_DeleteRed.png"))); // NOI18N
        btnSalir1.setText("Salir");
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383826946_search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383826676_121.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtcancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729489_stop.png"))); // NOI18N
        txtcancel.setText("Cancelar");
        txtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(4, 4, 4)
                        .addComponent(cmbCodCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(cmbCategoriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnAnterior))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(25, 25, 25)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCodInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1)))
                                .addGap(1, 1, 1)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(21, 21, 21)
                                .addComponent(cmbCodUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(cmbUnidadNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txtCodInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnGuardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnNuevo)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel3))
                            .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnModificar)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(cmbCodUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbUnidadNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcancel))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbCodCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoriaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnAnterior)
                .addGap(5, 5, 5)
                .addComponent(btnSalir1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        
        rsInsumo = objInsumo.contarRegistros();
        int cantidad, mayor;
        
         try {
            while (rsInsumo.next()) {
                cantidad = rsInsumo.getInt(1);
                if (cantidad != 0) {
                    rsInsumo = null;
                    rsInsumo = objInsumo.mayorRegistro();
                    while (rsInsumo.next()) {
                        mayor = rsInsumo.getInt(1) + 1;
                        if (mayor < 10) {
                            this.txtCodInsumo.setText("000000" + mayor);}
                        else if (mayor < 100) {
                            txtCodInsumo.setText("00000" + mayor);}
                        else if (mayor < 1000) {
                            txtCodInsumo.setText("0000" + mayor);}
                        else if (mayor < 10000) {
                           txtCodInsumo.setText("000" + mayor);}
                        else if (mayor < 100000){
                            txtCodInsumo.setText("00" + mayor);}
                        else if (mayor < 1000000){
                           txtCodInsumo.setText("0" + mayor);}
                        else if (mayor < 10000000){
                           txtCodInsumo.setText(""+mayor);}
                    }
                } 
                else {
                   txtCodInsumo.setText("0000001");
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
         this.Desbloquear();
         nuevo = true;
         this.btnGuardar.setEnabled(true);
         this.btnBuscar.setEnabled(false);
         this.btnNuevo.setEnabled(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed


// TODO add your handling code here:
        if (nuevo == true) {
            
            if (this.txtCodInsumo.getText().length() > 0 && this.txtDescripcion.getText().length() > 0 && this.txtPrecioUnitario.getText().length() > 0) {
                int codigoInsumo = Integer.parseInt(this.txtCodInsumo.getText());
                String descripcion = this.txtDescripcion.getText();
                double precioUnitario = Double.parseDouble(this.txtPrecioUnitario.getText());
                String codUnidad = this.cmbCodUnidad.getSelectedItem().toString();
                int codCategoria = Integer.parseInt(this.cmbCodCategoria.getSelectedItem().toString());
                
                this.objInsumo.insertar(codigoInsumo, descripcion, precioUnitario, codUnidad, codCategoria);
             
               
                //llenarTabla();
                btnNuevo.setEnabled(true);
                btnGuardar.setEnabled(false);
                btnBuscar.setEnabled(true);
                Bloquear();
                JOptionPane.showMessageDialog(this, "¡¡¡Registro guardado :)!!!");
                Limpiar();
                
                
           
                
               /*  btnEliminar.setEnabled(true);
                btnCancelar.setEnabled(false);
                btnMostrar.setEnabled(true);*/

            } else {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");

            }
        } else if (modificando == true) {
            if (this.txtCodInsumo.getText().length() > 0 && this.txtDescripcion.getText().length() > 0 && this.txtPrecioUnitario.getText().length() > 0) {
               int codigoInsumo = Integer.parseInt(this.txtCodInsumo.getText());
                String descripcion = this.txtDescripcion.getText();
                double precioUnitario = Double.parseDouble(this.txtPrecioUnitario.getText());
                String codUnidad = this.cmbCodUnidad.getSelectedItem().toString();
                int codCategoria = Integer.parseInt(this.cmbCodCategoria.getSelectedItem().toString());

                this.objInsumo.modificar(codigoInsumo, descripcion, precioUnitario, codUnidad, codCategoria);
                //llenarTabla();
                
                JOptionPane.showMessageDialog(this, "¡¡¡Registro modificado :)!!!");
               
                Limpiar();
                Bloquear();
                btnNuevo.setEnabled(true);
               btnGuardar.setEnabled(false);
                
                btnModificar.setEnabled(false);
                btnBuscar.setEnabled(true);
              
            } else {
                JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
                Bloquear();
            }
        }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cmbCodUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCodUnidadActionPerformed

    private void cmbCodUnidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCodUnidadItemStateChanged
        // TODO add your handling code here:
         int seleccionado;
        seleccionado = this.cmbCodUnidad.getSelectedIndex();
        this.cmbUnidadNombre.setSelectedIndex(seleccionado);
        //lblCodigoUnidad.setText(cmbCodigoUnidades.getSelectedItem().toString());
    }//GEN-LAST:event_cmbCodUnidadItemStateChanged

    private void cmbCodCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCodCategoriaItemStateChanged
        // TODO add your handling code here:
          int seleccionado;
        seleccionado = this.cmbCodCategoria.getSelectedIndex();
        this.cmbCategoriaNombre.setSelectedIndex(seleccionado);
    }//GEN-LAST:event_cmbCodCategoriaItemStateChanged

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:

        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        // TODO add your handling code here:
         System.exit(1);
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void cmbCodCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCodCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCodCategoriaActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
         if (this.txtDescripcion.getText().length() == 100) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        encontrado = false;
        codInsumo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el código del cliente"));
        rsInsumo = this.objInsumo.buscar(codInsumo);

        try {
            while (rsInsumo.next()) {
                this.txtCodInsumo.setText(rsInsumo.getString(1));
                this.txtDescripcion.setText(rsInsumo.getString(2));
                this.txtPrecioUnitario.setText(rsInsumo.getString(3));
              
                encontrado = true;
                this.btnModificar.setEnabled(true);
            }

            if (encontrado == false) {
                JOptionPane.showMessageDialog(this, "Registro no encontrado");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
         
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificando = true;
        nuevo = false;
        this.Desbloquear();
        this.btnBuscar.setEnabled(false);
        this.btnGuardar.setEnabled(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcancelActionPerformed
        // TODO add your handling code here:
        this.Bloquear();
        this.Limpiar();
        this.btnNuevo.setEnabled(true);
        this.btnBuscar.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.btnModificar.setEnabled(false);
    }//GEN-LAST:event_txtcancelActionPerformed

    private void txtCodInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodInsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodInsumoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInsumo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox cmbCategoriaNombre;
    private javax.swing.JComboBox cmbCodCategoria;
    private javax.swing.JComboBox cmbCodUnidad;
    private javax.swing.JComboBox cmbUnidadNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCodInsumo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JButton txtcancel;
    // End of variables declaration//GEN-END:variables
}
