package GUI;

/**
 *
 * @author rober
 */
import Clases.Proveedor;
import Dat.DATProveedor;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NuevoProveedorDialgo extends javax.swing.JDialog {

    Proveedor objP = new Proveedor();
    Principal objPr = new Principal();
    DATProveedor prov;
    String informacion = "";
    
    public String getInformacion(){
        return informacion;
    }
    
    public NuevoProveedorDialgo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle(Constantes.Constantes.NOMBRE_PROGRAMA);
        prov = new DATProveedor();
        combo();
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/ServiFac.png")).getImage());
        this.setTitle(Constantes.Constantes.NOMBRE_PROGRAMA);
        this.setLocationRelativeTo(null);
    }

    public void combo() {
        cmbTipo.addItem("Cta. Corriente");
        cmbTipo.addItem("Cta. Ahorros");
    }

    public void guardarProveedor() {
        try {
            String nombreCta = txtNombre.getText().toUpperCase();
            String empresa = txtEmpresa.getText().toUpperCase();
            String ruc = txtRuc.getText();
            String tipoCuenta = cmbTipo.getSelectedItem().toString();
            String numCuenta = (txtNumero.getText());
            double deuda = Double.parseDouble(txtDeuda.getText());
            if (txtDeuda.getText().isEmpty()) {
                deuda = 0;
            }
            DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
            simbolo.setDecimalSeparator('.');
            DecimalFormat formato = new DecimalFormat("0.00", simbolo);
            
            String strDeuda = formato.format(deuda);
            deuda = Double.parseDouble(strDeuda);
            String telf = txtTelf.getText();
            
            if (txtTelf.getText().isEmpty()) {
                telf = "0000000000";
            }
            objP = new Proveedor(empresa, ruc, nombreCta, tipoCuenta, numCuenta, deuda, telf);
            try {
                if (prov.ingresoProveedor(objP)) {
                    JOptionPane.showMessageDialog(null, "Proveedor creado satisfactoriamente");
                    txtDeuda.setText("");
                    txtEmpresa.setText("");
                    txtNombre.setText("");
                    txtNumero.setText("");
                    txtTelf.setText("");
                    txtRuc.setText("");
                    this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "El valor ingresado en deuda no"
                    + " es valido\nEjemplo (99.99)");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtRuc = new javax.swing.JTextField();
        cmbTipo = new javax.swing.JComboBox<>();
        txtDeuda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/apreton-de-manos.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Ingreso de proveedor");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel9.setText("RUC:");

        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });

        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        txtDeuda.setText("0.00");
        txtDeuda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDeudaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeudaFocusLost(evt);
            }
        });
        txtDeuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeudaKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Empresa:");

        jButton2.setText("Atrás");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre de cuenta:");

        jLabel6.setText("Teléfono:");

        jLabel3.setText("Tipo de cuenta:");

        txtTelf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelfKeyTyped(evt);
            }
        });

        jLabel4.setText("Número de cuenta:");

        jLabel5.setText("Deuda:");

        txtEmpresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmpresaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtRuc)
                            .addComponent(txtEmpresa)
                            .addComponent(cmbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNumero)
                            .addComponent(txtDeuda)
                            .addComponent(txtTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButton2)
                        .addGap(77, 77, 77)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(txtNombre.getText().length() > 29){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' || txtNumero.getText().length() > 14) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9' || txtRuc.getText().length() > 12){
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtDeudaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeudaKeyTyped
        char c = evt.getKeyChar();

        if (((c < '0') || (c > '9'))
            && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDeudaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtNombre.getText().isEmpty() || txtRuc.getText().isEmpty()
            || txtEmpresa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos que no se pueden dejar vacios");
        } else {
            guardarProveedor();
            informacion = "bandera";//Envia este campo al Frame IngresoProd para actualizar combobox de proveedor
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal objPr = new Principal();
        if (!txtDeuda.getText().isEmpty() || !txtEmpresa.getText().isEmpty()
            || !txtNombre.getText().isEmpty() || !txtNumero.getText().isEmpty()) {
            int n = JOptionPane.showConfirmDialog(null, "Hay datos que no han sido guardados\n¿Desea salir?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                objPr.setVisible(true);
                this.dispose();
            }
        } else {
            objPr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTelfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelfKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9' || txtTelf.getText().length() > 9){
            evt.consume();
        }
    }//GEN-LAST:event_txtTelfKeyTyped

    private void txtEmpresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmpresaKeyTyped
        if(txtEmpresa.getText().length() > 49){
            evt.consume();
        }
    }//GEN-LAST:event_txtEmpresaKeyTyped

    private void txtDeudaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeudaFocusGained
        if(txtDeuda.getText().equals("0.00")){
            txtDeuda.setText("");
        } else {
            //Do nothing
        }
    }//GEN-LAST:event_txtDeudaFocusGained

    private void txtDeudaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeudaFocusLost
        if(txtDeuda.getText().equals("")){
            txtDeuda.setText("0.00");
        } else {
           //Do nothing 
        }
    }//GEN-LAST:event_txtDeudaFocusLost

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoProveedorDialgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProveedorDialgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProveedorDialgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProveedorDialgo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevoProveedorDialgo dialog = new NuevoProveedorDialgo(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDeuda;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
