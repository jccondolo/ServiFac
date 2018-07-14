package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author rober
 */
public class GuiCambio extends javax.swing.JDialog {

    /**
     * Creates new form GuiCambio
     */
    boolean bandera = true;
    boolean cred;
    public static double monto;
    public static String cliente;

    public GuiCambio(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("ServiFac - Cambio");
        txtAyudaCred.setVisible(false);
        txtAyudaDeuda.setVisible(false);
    }

    public double getCambio() {
        double cambio = 0.00;
        try {
            cambio = Double.parseDouble(txtCambio.getText());

        } catch (NumberFormatException ex) {

        }
        return cambio;
    }

    public void valida() {
        try {
            double deuda = Double.parseDouble(txtAyudaDeuda.getText());
            double cant = Double.parseDouble(txtAyudaCred.getText());
            double monto2 = monto + deuda;
            if (monto2 > cant) {
                JOptionPane.showMessageDialog(null, "El crédito a realizar excede el monto de crédito aprobado");
                bandera = false;
            } else {
                double aux1 = 0.00;
                double aux2 = Double.parseDouble(txtCambio.getText());

                double total = aux1 + aux2;
                bandera = true;
            }
        } catch (NumberFormatException ex) {
            bandera = false;
        }
    }

    public void cambio() {
        valida();
        if (bandera == true) {
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error en el formato del cambio introducido");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCambio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtAyudaCred = new javax.swing.JLabel();
        txtAyudaDeuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Condensed Light", 1, 24)); // NOI18N
        jLabel1.setText("Por favor ingrese el monto recibido:");

        txtCambio.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        txtCambio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCambioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCambioKeyTyped(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAyudaCred.setText("jLabel2");

        txtAyudaDeuda.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAyudaCred)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAyudaDeuda)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAyudaCred)
                    .addComponent(txtAyudaDeuda)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)
                && (c != '.')) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCambioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cambio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCambioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCambioKeyReleased
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER) {
            cambio();
        }
    }//GEN-LAST:event_txtCambioKeyReleased

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
            java.util.logging.Logger.getLogger(GuiCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GuiCambio dialog = new GuiCambio(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel txtAyudaCred;
    public static javax.swing.JLabel txtAyudaDeuda;
    private javax.swing.JTextField txtCambio;
    // End of variables declaration//GEN-END:variables
}
