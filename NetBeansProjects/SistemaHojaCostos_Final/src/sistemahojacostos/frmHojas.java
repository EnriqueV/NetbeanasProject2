package sistemahojacostos;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmHojas extends javax.swing.JFrame {
    ArrayList<String> columnas= new ArrayList<>();
    DefaultComboBoxModel modeloUnidad = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloUnidades = new DefaultComboBoxModel();
    DefaultComboBoxModel modeloInsumo = new DefaultComboBoxModel();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    ResultSet rsUnidades = null;
    ResultSet rsHojas = null;
    ResultSet rsInsumos = null;
    ResultSet rsInsumo = null;  //para el subform
    ResultSet rsInsumosxHoja = null;
    Unidades unidades = new Unidades();
    Hojas hojas = new Hojas();
    Insumos insumos = new Insumos();
    Insumos insumo = new Insumos();
    InsumosxHoja insumosxHoja = new InsumosxHoja();
    int codigoHoja, columnasDeTabla, columna;  
    boolean comprobar, borrar=false, modificarHojas=false, modificarinsumosxHoja=false;
    String criterio="codigoHoja";
    
    private void Desbloquear(){
        txtDescripcion.setEnabled(true);
        cmbUnidades.setEnabled(true);
        txtDescripcion.requestFocus();
    }
    
    private void Bloquear(){
        txtDescripcion.setEnabled(false);
        cmbUnidades.setEnabled(false);
    }
    
    private void Limpiar(){
        txtCodigoHoja.setText("");
        txtDescripcion.setText("");
        modeloInsumo.removeAllElements();
        txtCantidad.setText(null);
        lblPrecioUnitario.setText(null);
        lblCodigoInsumo.setText(null);
        lblUnidad.setText(null);
        
    }

    public void Columnas(){
          columnas.clear();
          columnas.add("Codigo Hoja");
          columnas.add("Codigo Insumo");
          columnas.add(("Descripcion"));
          columnas.add("Precio Unitario");
          columnas.add(("Cantidad"));
          columnas.add("SubTotal");
      }
      
    public void Eliminar(boolean eliminar){
    this.borrar=eliminar;
    }
    
    public boolean gettEliminar(){
    return borrar;
    }
    
    public frmHojas() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        //Llenando el cmbUnidades mediante un modelo
        try{
        rsUnidades = unidades.llenarUnidades();
        if (rsUnidades.first()) {
            rsUnidades.beforeFirst();
          while (rsUnidades.next()) {
                modeloUnidad.addElement(rsUnidades.getString(2));
                modeloUnidades.addElement(rsUnidades.getString(1));
            }
          
          cmbUnidades.setModel(modeloUnidad);
        cmbCodigoUnidades.setModel(modeloUnidades);
        lblCodigoUnidad.setText(cmbCodigoUnidades.getSelectedItem().toString());
        
        rsInsumos = insumos.llenarInsumos();
        
        try {
            while (rsInsumos.next()) {
                modeloInsumo.addElement(rsInsumos.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbInsumos.setModel(modeloInsumo);
      }
        
        else{
        JOptionPane.showMessageDialog(rootPane, "No se Encontrro Ninguna Unidad");
        //comprobar=true;
        }
        
     } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbUnidades = new javax.swing.JComboBox();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtCodigoHoja = new javax.swing.JFormattedTextField();
        pnlInsumos = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cmbInsumos = new javax.swing.JComboBox();
        Insumo = new javax.swing.JLabel();
        btnGuardarInsumo = new javax.swing.JButton();
        scrPanel = new javax.swing.JScrollPane();
        tblInsumosxHojas = new javax.swing.JTable();
        lblUnidad = new javax.swing.JLabel();
        lblPrecioUnitario = new javax.swing.JLabel();
        lblCodigoInsumo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnCancelarr = new javax.swing.JButton();
        btnBuscarDes = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JButton();
        cmbCodigoUnidades = new javax.swing.JComboBox();
        lblCodigoUnidad = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCancelarr1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/costos.png")).getImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigo.setText("Código");
        getContentPane().add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descripción");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 70, -1));

        txtDescripcion.setEnabled(false);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 480, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Unidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        cmbUnidades.setEnabled(false);
        cmbUnidades.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUnidadesItemStateChanged(evt);
            }
        });
        cmbUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUnidadesActionPerformed(evt);
            }
        });
        getContentPane().add(cmbUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, -1));

        btnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729458_new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 110, -1));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729470_Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 110, 30));

        txtCodigoHoja.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0000000"))));
        txtCodigoHoja.setEnabled(false);
        getContentPane().add(txtCodigoHoja, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 70, -1));

        pnlInsumos.setBackground(new java.awt.Color(204, 204, 255));
        pnlInsumos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cantidad");
        pnlInsumos.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 50, -1));

        txtCantidad.setEnabled(false);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        pnlInsumos.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 50, 30));

        cmbInsumos.setEnabled(false);
        cmbInsumos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInsumosItemStateChanged(evt);
            }
        });
        cmbInsumos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbInsumosFocusGained(evt);
            }
        });
        pnlInsumos.add(cmbInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 30));

        Insumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Insumo.setText("Insumo:");
        pnlInsumos.add(Insumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnGuardarInsumo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729470_Save.png"))); // NOI18N
        btnGuardarInsumo.setText("Guardar");
        btnGuardarInsumo.setEnabled(false);
        btnGuardarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnGuardarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 110, 30));

        tblInsumosxHojas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Hoja", "Codigo Insumo", "Descripcion", "Precio Unitario", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblInsumosxHojas.getTableHeader().setResizingAllowed(false);
        tblInsumosxHojas.getTableHeader().setReorderingAllowed(false);
        tblInsumosxHojas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInsumosxHojasMouseClicked(evt);
            }
        });
        tblInsumosxHojas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblInsumosxHojasFocusLost(evt);
            }
        });
        scrPanel.setViewportView(tblInsumosxHojas);
        if (tblInsumosxHojas.getColumnModel().getColumnCount() > 0) {
            tblInsumosxHojas.getColumnModel().getColumn(0).setResizable(false);
            tblInsumosxHojas.getColumnModel().getColumn(1).setResizable(false);
            tblInsumosxHojas.getColumnModel().getColumn(2).setResizable(false);
            tblInsumosxHojas.getColumnModel().getColumn(3).setResizable(false);
            tblInsumosxHojas.getColumnModel().getColumn(4).setResizable(false);
            tblInsumosxHojas.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlInsumos.add(scrPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 690, 140));
        pnlInsumos.add(lblUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 180, 20));
        pnlInsumos.add(lblPrecioUnitario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 210, 30));
        pnlInsumos.add(lblCodigoInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 200, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Unidad:");
        pnlInsumos.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Buscar por");
        pnlInsumos.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Precio Unitario $");
        pnlInsumos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        txtBuscar.setForeground(new java.awt.Color(128, 128, 128));
        txtBuscar.setEnabled(false);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscarMouseClicked(evt);
            }
        });
        txtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarFocusLost(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        pnlInsumos.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 220, 30));

        btnCancelarr.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729489_stop.png"))); // NOI18N
        btnCancelarr.setText("Cancelar");
        btnCancelarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarrActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnCancelarr, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        btnBuscarDes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscarDes.setText("Descripcion");
        btnBuscarDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDesActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnBuscarDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 100, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Código:");
        pnlInsumos.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, -1));

        btnBuscar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar1.setText("Codigo De hoja");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        getContentPane().add(pnlInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 730, 370));

        cmbCodigoUnidades.setEnabled(false);
        getContentPane().add(cmbCodigoUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 60, 30));

        lblCodigoUnidad.setForeground(new java.awt.Color(153, 153, 153));
        getContentPane().add(lblCodigoUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 150, 20));

        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383730960_Previous.png"))); // NOI18N
        btnAnterior.setText("Menú Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383731084_DeleteRed.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 80, 30));

        btnCancelarr1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383729489_stop.png"))); // NOI18N
        btnCancelarr1.setText("Cancelar");
        btnCancelarr1.setEnabled(false);
        btnCancelarr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarr1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LlenarConboboxInsumos(){
     rsInsumos=null;
     modeloInsumo.removeAllElements();
     rsInsumos = insumos.llenarInsumos();
        
        try {
            while (rsInsumos.next()) {
                modeloInsumo.addElement(rsInsumos.getString(2));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", 0);
        }
        cmbInsumos.setModel(modeloInsumo);
    }
    
    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       this.btnCancelarr1.setEnabled(true);
        rsHojas = hojas.contarRegistros();
        /////
        this.Limpiar();
        this.Bloquear();
        this.btnGuardar.setEnabled(false);
        modificarHojas=false;
        modificarinsumosxHoja=false;
        cmbInsumos.setEnabled(false);
        txtCantidad.setEnabled(false);
        this.txtBuscar.setText("");
        this.btnGuardarInsumo.setEnabled(false);
       
        modeloTabla=new DefaultTableModel();
        this.Columnas();
        tblInsumosxHojas.setModel(modeloTabla);
        for (int i = 0; i < 6; i++) {
            modeloTabla.addColumn(columnas.get(i));
        }
        btnNuevo.requestFocus();
        this.txtBuscar.setEnabled(false);
        this.btnNuevo.setEnabled(true);
        ////
        
        int cantidad, mayor;
        
        try {
            while (rsHojas.next()) {
                cantidad = rsHojas.getInt(1);
                if (cantidad != 0) {
                    rsHojas = null;
                    rsHojas = hojas.mayorRegistro();
                    while (rsHojas.next()) {
                        mayor = rsHojas.getInt(1) + 1;
                        if (mayor < 10) {
                            txtCodigoHoja.setText("000000" + mayor);}
                        else if (mayor < 100) {
                            this.txtCodigoHoja.setText("00000" + mayor);}
                        else if (mayor < 1000) {
                            txtCodigoHoja.setText("0000" + mayor);}
                        else if (mayor < 10000) {
                            txtCodigoHoja.setText("000" + mayor);}
                        else if (mayor < 100000){
                            txtCodigoHoja.setText("00" + mayor);}
                        else if (mayor < 1000000){
                            txtCodigoHoja.setText("0" + mayor);}
                        else if (mayor < 10000000){
                            txtCodigoHoja.setText(""+mayor);}
                    }
                } 
                else {
                    txtCodigoHoja.setText("0000001");
                }
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        this.btnGuardar.setEnabled(true);
       
        this.btnCancelarr1.setEnabled(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            Object objetoUnidad;
            String codigoUnidad;
            
            if (modificarHojas) {
                this.LlenarConboboxInsumos();
                modificarHojas=false;
            objetoUnidad=cmbCodigoUnidades.getSelectedItem();
            codigoUnidad = objetoUnidad.toString();
                
                hojas.modificar(Integer.parseInt(txtCodigoHoja.getText()),txtDescripcion.getText(), codigoUnidad);
                Bloquear();
                cmbInsumos.requestFocus();
                cmbInsumos.setEnabled(true);
                txtCantidad.setEnabled(true);
        }
            
            else{
                
            if (txtDescripcion.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Falta ingresar la descripción de la hoja de costos");
                txtDescripcion.requestFocus();
            }
            else if (cmbUnidades.getSelectedItem()==null){
                JOptionPane.showMessageDialog(null, "Falta seleccionar la unidad");                
                cmbUnidades.requestFocus();
            }
            else{
                this.LlenarConboboxInsumos();
                rsInsumo=null;
                try{
                rsInsumo=insumo.verificar();
                    if (rsInsumo.first()) {
                        rsInsumo.beforeFirst();
                        objetoUnidad=cmbCodigoUnidades.getSelectedItem();
                        codigoUnidad = objetoUnidad.toString();
                
                hojas.insertar(Integer.parseInt(txtCodigoHoja.getText()),txtDescripcion.getText(), codigoUnidad);
                JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
                Bloquear();
                cmbInsumos.requestFocus();
                cmbInsumos.setEnabled(true);
                txtCantidad.setEnabled(true);
                //Limpiar();
                this.btnGuardar.setEnabled(false);
                this.btnGuardarInsumo.setEnabled(true);
                this.btnCancelarr1.setEnabled(false);
                    }
                    
                    else{
                    JOptionPane.showMessageDialog(rootPane, "No Se Encontro Ningun Insumo");
                    }
                }catch(SQLException e){
                JOptionPane.showMessageDialog(rootPane, "ERROR:\n" + e.getMessage());
                }
              }
            }     
           
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarInsumoActionPerformed
        this.Columnas();
        int verificar;
        String codigo;
        int codigoInsumo = 0;
        if (modeloInsumo.getSize()>0) {
            if (!lblCodigoInsumo.getText().isEmpty()) {
             codigo = lblCodigoInsumo.getText().toString();
             codigoInsumo = Integer.parseInt(codigo);
           }
        }
        
        verificar=tblInsumosxHojas.getRowCount();
        modeloTabla=new DefaultTableModel();
        
        if (modificarinsumosxHoja) {
             modificarinsumosxHoja=false;
            insumosxHoja.modificar(Integer.parseInt(txtCodigoHoja.getText()),codigoInsumo,Double.parseDouble(txtCantidad.getText()));
            txtCantidad.setText("");
            cmbInsumos.requestFocus();
        
        JOptionPane.showMessageDialog(rootPane, "Registro Modificado con Exito");
        this.Limpiar();
        this.Bloquear();
        
        cmbInsumos.setEnabled(false);
        txtCantidad.setEnabled(false); 
        tblInsumosxHojas.setModel(modeloTabla);
            for (int i = 0; i < 6; i++) {
                modeloTabla.addColumn(columnas.get(i));
            }
            btnNuevo.requestFocus();
          }
        
        else{
            
            
        if (txtCantidad.getText().equals("")){ 
            JOptionPane.showMessageDialog(null, "Debe ingresar la cantidad del insumo que necesita");
            txtCantidad.requestFocus();
        }
        
        else if (lblUnidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necesita Selecionar un Insumo");
            cmbInsumos.requestFocus();
        }
        
        else if (lblCodigoInsumo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necesita Selecionar un Insumo");
            cmbInsumos.requestFocus();
        }
        
        else if (lblPrecioUnitario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Necesita Selecionar un Insumo");
            cmbInsumos.requestFocus();
        }
        else{
        insumosxHoja.insertar(Integer.parseInt(txtCodigoHoja.getText()),codigoInsumo,Double.parseDouble(txtCantidad.getText()));
        txtCantidad.setText("");
        cmbInsumos.requestFocus();
        
        
        //segunda parte: mostrar
        
        rsInsumosxHoja=null;
        codigoHoja = Integer.parseInt(txtCodigoHoja.getText());
        rsInsumosxHoja = insumosxHoja.llenarTabla(codigoHoja);               
        this.tblInsumosxHojas.setModel(modeloTabla);
        
        try {
            ResultSetMetaData rsInsumosxHojaMD = rsInsumosxHoja.getMetaData();
            columnasDeTabla = rsInsumosxHojaMD.getColumnCount();
            
            
            //para llenar la tablas
            for (columna=1; columna<=columnasDeTabla; columna++){
                modeloTabla.addColumn(columnas.get(columna-1));}
                                   
            while (rsInsumosxHoja.next()){
                Object[]fila = new Object[columna];
                for (int y=0;y<columnasDeTabla;y++){
                    fila[y]=rsInsumosxHoja.getObject(y+1);
                    
                }
                modeloTabla.addRow(fila); 
            }
            //finaliza llenado de tabla
            
            
        } catch (SQLException ex) {
            Logger.getLogger(frmHojas.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            if (verificar!=tblInsumosxHojas.getRowCount()) {
                JOptionPane.showMessageDialog(null, "Insumo agregado");
                borrar=true;
                this.Eliminar(borrar);
                if (modeloInsumo.getSize()==1) {
                     this.Limpiar();
        this.Bloquear();
       
        cmbInsumos.setEnabled(false);
        txtCantidad.setEnabled(false);
        modeloTabla=new DefaultTableModel();
        tblInsumosxHojas.setModel(modeloTabla);
            for (int i = 0; i < 6; i++) {
                modeloTabla.addColumn(columnas.get(i));
            }
            btnNuevo.requestFocus();
                }
                }
             
            else{
               JOptionPane.showMessageDialog(null, "El Insumo no se Pudo Agregar"); 
            }
        
        }
        
        }        
    }//GEN-LAST:event_btnGuardarInsumoActionPerformed

    private void cmbUnidadesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUnidadesItemStateChanged
        int seleccionado;
        seleccionado = cmbUnidades.getSelectedIndex();
        cmbCodigoUnidades.setSelectedIndex(seleccionado);
        lblCodigoUnidad.setText(cmbCodigoUnidades.getSelectedItem().toString());
    }//GEN-LAST:event_cmbUnidadesItemStateChanged

    private void cmbInsumosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInsumosItemStateChanged
        if (modeloInsumo.getSize()>0) {
           String descripcion;
        descripcion = cmbInsumos.getSelectedItem().toString();
        rsInsumo = insumo.busca(descripcion);
        try {
            while (rsInsumo.next()) {
            lblCodigoInsumo.setText(rsInsumo.getString(1));
            lblUnidad.setText(rsInsumo.getString(4));
            lblPrecioUnitario.setText(rsInsumo.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmHojas.class.getName()).log(Level.SEVERE, null, ex);
        } 
        } 
    }//GEN-LAST:event_cmbInsumosItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      lblPrecioUnitario.setText("");
        if (comprobar) {
          this.dispose();  
        }
      
    }//GEN-LAST:event_formWindowOpened

    private void cmbInsumosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbInsumosFocusGained
        if (modeloInsumo.getSize()>0) {
            this.LlenarInsumos(0, this.gettEliminar()); 
        }
        
    }//GEN-LAST:event_cmbInsumosFocusGained

    public void LlenarInsumos(int indice, boolean eliminar){
        if (eliminar) {
            modeloInsumo.removeElementAt(indice);
            cmbInsumos.setModel(modeloInsumo);
            borrar=false;
        }
        else{
            if (modeloInsumo.getSize()>0) {
                try{
        String descripcion;
        rsInsumo=null;
        descripcion = cmbInsumos.getSelectedItem().toString();
        rsInsumo=null;
        rsInsumo=insumo.busca(descripcion);
        while (rsInsumo.next()) {
            lblCodigoInsumo.setText(rsInsumo.getString(1));
            lblUnidad.setText(rsInsumo.getString(4));
            lblPrecioUnitario.setText(rsInsumo.getString(3));
            }
        }catch(SQLException e){
        JOptionPane.showInputDialog(this, "ERROR:\n " + e.getMessage());
        }
        } 
            }
         }
    
    private void txtBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMouseClicked
        txtBuscar.setText("");
        txtBuscar.setForeground(Color.BLACK);
        
    }//GEN-LAST:event_txtBuscarMouseClicked

    private void txtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarFocusLost
        txtBuscar.setText(null);
        txtBuscar.setForeground(Color.GRAY);
        txtBuscar.setText("Buscar: por Codigo de Hoja");
        criterio="codigoHoja";
    }//GEN-LAST:event_txtBuscarFocusLost

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
         if (txtBuscar.getText().isEmpty()) {
            modeloTabla=new DefaultTableModel();
            this.Columnas();
            this.tblInsumosxHojas.setModel(modeloTabla);
         for (int i = 0; i < 6; i++) {
            modeloTabla.addColumn(columnas.get(i));
        }
        }
         
         else{
         modeloTabla=new DefaultTableModel();
         this.Columnas();
         rsInsumosxHoja=null;
         rsInsumosxHoja = insumosxHoja.BusquedaProgresiva(txtBuscar.getText(), criterio);               
         this.tblInsumosxHojas.setModel(modeloTabla);
         
        try {
            ResultSetMetaData rsInsumosxHojaMD = rsInsumosxHoja.getMetaData();
            columnasDeTabla = rsInsumosxHojaMD.getColumnCount();
            
            
            //para llenar la tablas
            for (columna=1; columna<=columnasDeTabla; columna++){
                modeloTabla.addColumn(columnas.get(columna-1));}
                                   
            while (rsInsumosxHoja.next()){
                Object[]fila = new Object[columna];
                for (int y=0;y<columnasDeTabla;y++){
                    fila[y]=rsInsumosxHoja.getObject(y+1);
                    
                }
                modeloTabla.addRow(fila); 
            }
            //finaliza llenado de tabla
            
            
        } catch (SQLException ex) {
            Logger.getLogger(frmHojas.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
         
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tblInsumosxHojasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblInsumosxHojasFocusLost
        this.tblInsumosxHojas.clearSelection();
    }//GEN-LAST:event_tblInsumosxHojasFocusLost

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        switch (criterio) {
            case "codigoHoja":
                if (Character.isLetter(evt.getKeyChar())) {
                    evt.consume();
                }
                break;
            case "descripcion":
                if (Character.isDigit(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
                    evt.consume();
                }
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void tblInsumosxHojasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInsumosxHojasMouseClicked
        if (this.tblInsumosxHojas.getSelectedRow()!=-1) {
             modificarHojas=true;
             modificarinsumosxHoja=true;
             btnCancelarr.setVisible(true); 
             rsHojas=null;
             rsHojas=hojas.Consulta(String.valueOf(tblInsumosxHojas.getValueAt(tblInsumosxHojas.getSelectedRow(), 0)));
             this.Desbloquear();
             cmbInsumos.setEnabled(false);
             txtCantidad.setEnabled(false);
             try{
             rsHojas.first();
             txtDescripcion.setText(rsHojas.getString(2));
             }catch(SQLException ex){
             JOptionPane.showMessageDialog(rootPane, "ERROR:\n" + ex.getMessage());
             }
             
             String codigo=String.valueOf(tblInsumosxHojas.getValueAt(tblInsumosxHojas.getSelectedRow(), 0));
             if (Integer.parseInt(codigo) < 10) {
                txtCodigoHoja.setText("000000" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 100) {
                txtCodigoHoja.setText("00000" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 1000) {
                txtCodigoHoja.setText("0000" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 10000) {
                txtCodigoHoja.setText("000" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 100000) {
                txtCodigoHoja.setText("00" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 1000000) {
                txtCodigoHoja.setText("0" + codigo);
            }
             
             else if (Integer.parseInt(codigo) < 10000000) {
                txtCodigoHoja.setText("" + codigo);
            }
            modeloInsumo.removeAllElements();
            modeloInsumo.addElement(tblInsumosxHojas.getValueAt(tblInsumosxHojas.getSelectedRow(), 2));
            cmbInsumos.setModel(modeloInsumo);
            txtCantidad.setText(String.valueOf(tblInsumosxHojas.getValueAt(tblInsumosxHojas.getSelectedRow(), 4)));
         
        }
    }//GEN-LAST:event_tblInsumosxHojasMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (Character.isDigit(evt.getKeyChar()) && !Character.isSpaceChar(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void cmbUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUnidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUnidadesActionPerformed

    private void btnBuscarDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDesActionPerformed
        // TODO add your handling code here:
        this.txtBuscar.setEnabled(true);
         criterio="descripcion";
        txtBuscar.setForeground(Color.RED);
        txtBuscar.setText("Descripcion");
    }//GEN-LAST:event_btnBuscarDesActionPerformed

    private void btnCancelarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarrActionPerformed
        // TODO add your handling code here:
        this.Limpiar();
        this.Bloquear();
        this.btnGuardar.setEnabled(false);
        modificarHojas=false;
        modificarinsumosxHoja=false;
        cmbInsumos.setEnabled(false);
        txtCantidad.setEnabled(false);
        this.txtBuscar.setText("");
       
        modeloTabla=new DefaultTableModel();
        this.Columnas();
        tblInsumosxHojas.setModel(modeloTabla);
        for (int i = 0; i < 6; i++) {
            modeloTabla.addColumn(columnas.get(i));
        }
        btnNuevo.requestFocus();
        this.txtBuscar.setEnabled(false);
        this.btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnCancelarrActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        // TODO add your handling code here:
         this.txtBuscar.setEnabled(true);
        criterio="codigoHoja";
        txtBuscar.setForeground(Color.RED);
        txtBuscar.setText("Codigo de Hoja");
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:

        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(1);
        
        
        //this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarr1ActionPerformed
        // TODO add your handling code here:
        this.Limpiar();
        this.btnGuardar.setEnabled(false);
        this.btnNuevo.setEnabled(true);
         this.txtDescripcion.setEnabled(false);
        this.cmbUnidades.setEnabled(false);
        this.btnCancelarr1.setEnabled(false);
    }//GEN-LAST:event_btnCancelarr1ActionPerformed

  
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
            java.util.logging.Logger.getLogger(frmHojas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHojas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHojas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHojas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHojas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Insumo;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscarDes;
    private javax.swing.JButton btnCancelarr;
    private javax.swing.JButton btnCancelarr1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarInsumo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbCodigoUnidades;
    private javax.swing.JComboBox cmbInsumos;
    private javax.swing.JComboBox cmbUnidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoInsumo;
    private javax.swing.JLabel lblCodigoUnidad;
    private javax.swing.JLabel lblPrecioUnitario;
    private javax.swing.JLabel lblUnidad;
    private javax.swing.JPanel pnlInsumos;
    private javax.swing.JScrollPane scrPanel;
    private javax.swing.JTable tblInsumosxHojas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JFormattedTextField txtCodigoHoja;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
