/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Proveedor;
import Dat.DATProveedor;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class ActualizaProvDialog extends javax.swing.JDialog {

    Proveedor prov = new Proveedor();
    DATProveedor manejadorProv;
    String nombreCta;
    String numeroCta;
    String ruc;
    String tipoCta;
    String telf;
    int indiceTipoCta;
    int cont = 0;

    public ActualizaProvDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        manejadorProv = new DATProveedor();
        initComponents();
        txtEmpresa.setTransferHandler(null);
        txtNombreCuenta.setTransferHandler(null);
        txtNumCuenta.setTransferHandler(null);
        txtRUC.setTransferHandler(null);
        txtTelefono.setTransferHandler(null);
        this.setLocationRelativeTo(null);
        txtFila.setVisible(false);
        txtEmpresa.setEditable(false);
        txtRUC.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void inicializaVariables() {
        nombreCta = txtNombreCuenta.getText();
        numeroCta = txtNumCuenta.getText();
        ruc = txtRUC.getText();
        indiceTipoCta = jComboBox1.getSelectedIndex();
        telf = txtTelefono.getText();
        lblTipo.setText("Tipo de cuenta");
    }

    public void validaCambios() {
        if (lblNombreCta.getText().length() != 19) {
            cont = cont + 1;
            System.out.println("nombre");
        }
        if (lblNumCta.getText().length() != 16) {
            cont = cont + 1;
            System.out.println("num");
        }
        if (lblTelefono.getText().length() != 8) {
            cont = cont + 1;
            System.out.println("tel");
        }
        if (lblTipo.getText().length() != 14) {
            cont = cont + 1;
            System.out.println("tipo");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNumCta = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        txtRUC = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtTelefono = new javax.swing.JTextField();
        txtNumCuenta = new javax.swing.JTextField();
        txtNombreCuenta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btbCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        lblNombreCta = new javax.swing.JLabel();
        txtFila = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Empresa");

        lblTipo.setText("Tipo de cuenta");

        jLabel3.setText("RUC");

        lblNumCta.setText("Número de cuenta");

        lblTelefono.setText("Teléfono");

        txtEmpresa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtEmpresa.setText("jTextField1");

        txtRUC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRUC.setText("jTextField2");

        jComboBox1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cta. Corriente", "Cta. Ahorros" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTelefono.setText("jTextField3");
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtNumCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNumCuenta.setText("jTextField4");
        txtNumCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumCuentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumCuentaKeyTyped(evt);
            }
        });

        txtNombreCuenta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombreCuenta.setText("jTextField5");
        txtNombreCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreCuentaKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setText("Actualización del proveedor");

        btbCerrar.setText("Cancelar");
        btbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCerrarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblNombreCta.setText("Nombre de la cuenta");

        txtFila.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumCuenta)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblTelefono)
                    .addComponent(lblNumCta)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnGuardar)
                        .addContainerGap(277, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 221, Short.MAX_VALUE)
                                .addComponent(lblTipo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblNombreCta))
                        .addGap(101, 101, 101))))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(btbCerrar))
                    .addComponent(txtFila))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumCta)
                    .addComponent(lblNombreCta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtNombreCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbCerrar)
                    .addComponent(btnGuardar))
                .addGap(3, 3, 3)
                .addComponent(txtFila))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        validaCambios();
        int fila = Integer.parseInt(txtFila.getText());
        if (cont == 0) {
            JOptionPane.showMessageDialog(this, "No han habido cambios");
            this.dispose();
        } else {
            int seleccion = JOptionPane.showConfirmDialog(this, "Han habido " + cont + " cambio(s) ¿Desea guardar de todas formas?", "Mensaje", JOptionPane.YES_NO_OPTION);
            if (seleccion == JOptionPane.YES_OPTION) {
                prov = new Proveedor(txtNombreCuenta.getText(), jComboBox1.getSelectedItem().toString(), txtNumCuenta.getText(), txtTelefono.getText(), txtRUC.getText());
                manejadorProv.actualizaProveedor(prov);
                PagoProveedor.tblProv.setValueAt(txtNombreCuenta.getText(), fila, 2);
                PagoProveedor.tblProv.setValueAt(jComboBox1.getSelectedItem().toString(), fila, 3);
                PagoProveedor.tblProv.setValueAt(txtNumCuenta.getText(), fila, 4);
                PagoProveedor.tblProv.setValueAt(txtTelefono.getText(), fila, 6);
                this.dispose();
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btbCerrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        inicializaVariables();
    }//GEN-LAST:event_formWindowOpened

    private void txtNumCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCuentaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9' || txtNumCuenta.getText().length() > 14)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumCuentaKeyTyped

    private void txtNumCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumCuentaKeyReleased
        if (!txtNumCuenta.getText().equals(numeroCta)) {
            lblNumCta.setText("Número de cuenta*");
        } else {
            lblNumCta.setText("Número de cuenta");
        }
    }//GEN-LAST:event_txtNumCuentaKeyReleased

    private void txtNombreCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCuentaKeyReleased
        if (!txtNombreCuenta.getText().equals(nombreCta)) {
            lblNombreCta.setText("Nombre de la cuenta*");
        } else {
            lblNombreCta.setText("Nombre de la cuenta");
        }
    }//GEN-LAST:event_txtNombreCuentaKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        if (!txtTelefono.getText().equals(telf)) {
            lblTelefono.setText("Teléfono*");
        } else {
            lblTelefono.setText("Teléfono");
        }
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedIndex() == indiceTipoCta) {
            lblTipo.setText("Tipo de cuenta");
        } else {
            lblTipo.setText("Tipo de cuenta*");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9' || txtTelefono.getText().length() > 9)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

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
            java.util.logging.Logger.getLogger(ActualizaProvDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizaProvDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizaProvDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizaProvDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActualizaProvDialog dialog = new ActualizaProvDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btbCerrar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombreCta;
    private javax.swing.JLabel lblNumCta;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipo;
    public javax.swing.JTextField txtEmpresa;
    public javax.swing.JLabel txtFila;
    public javax.swing.JTextField txtNombreCuenta;
    public javax.swing.JTextField txtNumCuenta;
    public javax.swing.JTextField txtRUC;
    public javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
