/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemahojacostos;

import javax.swing.JOptionPane;

/**
 *
 * @author Cerrato Jordan
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnUnidades = new javax.swing.JButton();
        btnInsumos = new javax.swing.JButton();
        btnHojas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/iconos/menu1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 51, 153));
        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE HOJAS DE COSTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 80));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUnidades.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnUnidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383827603_Test-paper-32.png"))); // NOI18N
        btnUnidades.setText("Unidades");
        btnUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesActionPerformed(evt);
            }
        });
        jPanel1.add(btnUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, 50));

        btnInsumos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnInsumos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383827658_Paper_airplane.png"))); // NOI18N
        btnInsumos.setText("Insumos");
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 150, 50));

        btnHojas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHojas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/costos.png"))); // NOI18N
        btnHojas.setText("Hojas");
        btnHojas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHojasActionPerformed(evt);
            }
        });
        jPanel1.add(btnHojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 140, 50));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/smiley.png"))); // NOI18N
        jButton5.setText("Integrantes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 150, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, 200));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1383731084_DeleteRed.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "CJ11003    José Manuel Cerrato Jordan \nGH12001    Celina Elizabeth Guerrero Hernadez \nCH12043   José Miguel Chavez Hernandez\nAS11047   Eduardo Alfredo Alvarado Suares");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnHojasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHojasActionPerformed
        // TODO add your handling code here:
        frmHojas hoja = new frmHojas();
        hoja.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHojasActionPerformed

    private void btnUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesActionPerformed
        // TODO add your handling code here:
        frmUnidades uni = new frmUnidades();
         uni.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_btnUnidadesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          System.exit(1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        // TODO add your handling code here:
        frmInsumo ins = new frmInsumo();
        ins.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnInsumosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHojas;
    private javax.swing.JButton btnInsumos;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
