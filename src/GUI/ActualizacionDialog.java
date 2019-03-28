/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Clases.Producto;
import Dat.DATMaterial;
import static GUI.Inventario.tblProd;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ActualizacionDialog extends javax.swing.JDialog {

    Producto producto;
    DATMaterial material;
    int fila;
    public BufferedImage image = null;

    public ActualizacionDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        material = new DATMaterial();
        initComponents();
        lblPrecioCompra.setVisible(false);
        lblIVA.setVisible(false);
        lblCod.setVisible(false);
        txtIngreso.setVisible(false);
        txtFila.setVisible(false);
        setIconImage(new ImageIcon(getClass().getResource("/Recursos/ServiFac.png")).getImage());
        this.setTitle(Constantes.Constantes.NOMBRE_PROGRAMA);
        this.setLocationRelativeTo(null);
    }

    public void obtenerProducto() {
        ArrayList<Producto> detalleProd = material.obtenerDetalleProd(lblCod.getText());
        int cant = detalleProd.size();
        for (int i = 0; i < cant; i++) {
            producto = detalleProd.get(i);
            String nombreProd = producto.getStrNombreProd();
            double precioNormal = producto.getFltPrecio();
            double precioMayor = producto.getFltPrecioMayor();
            int cantidad = producto.getIntCantidad();
            String ubicacion = producto.getStrUbicacion();
            String categoria = producto.getStrCategoria();
            String proveedor = producto.getStrProveedor();
            String iva = producto.getIva();

            txtNombreProd.setText(nombreProd);
            txtPrecio.setText(String.valueOf(precioNormal));
            txtPrecioM.setText(String.valueOf(precioMayor));
            txtCantidad.setText(String.valueOf(cantidad));
            txtUbicacion.setText(ubicacion);
            txtCategoria.setText(categoria);
            txtProveedor.setText(proveedor);
            lblIVA.setText(iva);

        }
    }

    public int obtenerIvaEntero() {
        String[] strIva = lblIVA.getText().split("%");

        int intIva = Integer.parseInt(strIva[0]);
        System.out.println(intIva);
        return intIva;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtFila = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnActualizaPrecio = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreProd = new javax.swing.JLabel();
        btnActualizaNombre = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        btnActualizaCantidad = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JLabel();
        btnActualizaUbicacion = new javax.swing.JLabel();
        txtPrecioM = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        lblMenos = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JLabel();
        btnActualizaCategoria = new javax.swing.JLabel();
        btnActualizaProveedor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblIVA = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lblPrecioCompra = new javax.swing.JLabel();
        txtIngreso = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        txtFila.setText("jLabel6");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles del producto"));
        jPanel2.setMaximumSize(new java.awt.Dimension(743, 145));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel6.setText("$");

        btnActualizaPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/intercambio 32.png"))); // NOI18N
        btnActualizaPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaPrecioMouseClicked(evt);
            }
        });

        txtPrecio.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 153, 0));
        txtPrecio.setFocusable(false);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Precio al por mayor:");

        txtNombreProd.setText("----------");
        txtNombreProd.setAutoscrolls(true);
        txtNombreProd.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNombreProd.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        txtNombreProd.setMaximumSize(new java.awt.Dimension(150, 16));

        btnActualizaNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/intercambio.png"))); // NOI18N
        btnActualizaNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaNombreMouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Nombre del Producto:");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Cantidad:");

        txtCantidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCantidad.setText("----------");

        btnActualizaCantidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/mas.png"))); // NOI18N
        btnActualizaCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaCantidadMouseClicked(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Ubicacion:");

        txtUbicacion.setText("----------");
        txtUbicacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnActualizaUbicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/intercambio.png"))); // NOI18N
        btnActualizaUbicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaUbicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaUbicacionMouseClicked(evt);
            }
        });

        txtPrecioM.setText("----------");
        txtPrecioM.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setText("Precio de Venta:");

        lblMenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/negativo.png"))); // NOI18N
        lblMenos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenosMouseClicked(evt);
            }
        });

        jButton2.setText("Dar de baja producto");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Categoria:");

        txtCategoria.setText("----------");
        txtCategoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Proveedor:");

        txtProveedor.setText("----------");
        txtProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnActualizaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/intercambio.png"))); // NOI18N
        btnActualizaCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaCategoriaMouseClicked(evt);
            }
        });

        btnActualizaProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/intercambio.png"))); // NOI18N
        btnActualizaProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizaProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizaProveedorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizaNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUbicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnActualizaUbicacion)
                                    .addComponent(btnActualizaCategoria)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnActualizaProveedor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblMenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 496, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecioM, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizaPrecio)
                        .addGap(61, 61, 61))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addComponent(btnActualizaPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioM)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnActualizaNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCantidad)
                                .addComponent(jLabel11))
                            .addComponent(btnActualizaCantidad)
                            .addComponent(lblMenos))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizaUbicacion)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUbicacion)
                                .addComponent(jLabel12)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtCategoria))
                            .addComponent(btnActualizaCategoria))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtProveedor))
                            .addComponent(btnActualizaProveedor)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(4, 4, 4)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblIVA.setText("jLabel5");

        lblCod.setText("jLabel5");

        lblPrecioCompra.setText("jLabel4");

        txtIngreso.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIngreso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCod)
                .addGap(26, 26, 26)
                .addComponent(lblIVA)
                .addGap(18, 18, 18)
                .addComponent(txtFila)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(494, 494, 494)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFila)
                    .addComponent(lblIVA)
                    .addComponent(lblCod)
                    .addComponent(lblPrecioCompra)
                    .addComponent(txtIngreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void btnActualizaPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaPrecioMouseClicked
        ActualizacionPrecio actPrecio = new ActualizacionPrecio(new javax.swing.JDialog(), true);
        int iva = obtenerIvaEntero();
        actPrecio.lblIVA.setText(String.valueOf(iva));
        actPrecio.lblCod.setText(lblCod.getText());
        actPrecio.setVisible(true);
    }//GEN-LAST:event_btnActualizaPrecioMouseClicked

    private void btnActualizaNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaNombreMouseClicked
        try {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre de:\n" + txtNombreProd.getText(),txtNombreProd.getText()).toUpperCase();
            if (!(txtIngreso.getText().equals("ingreso"))) {
                System.out.println("aqui");
                String cod = (String) tblProd.getModel().getValueAt(fila, 2);
                producto = new Producto(nombre, Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtPrecioM.getText()), Integer.parseInt(txtCantidad.getText()), cod);
                material.UpdateProducto(producto);
                fila = Integer.parseInt(txtFila.getText());
                tblProd.setValueAt(nombre, fila, 1);
                System.out.println(fila);
                txtNombreProd.setText(nombre);
            } else {
                String cod = lblCod.getText();
                producto = new Producto(nombre, Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtPrecioM.getText()), Integer.parseInt(txtCantidad.getText()), cod);
                material.UpdateProducto(producto);
                txtNombreProd.setText(nombre);
            }
        } catch (NullPointerException | NumberFormatException e) {

        }
    }//GEN-LAST:event_btnActualizaNombreMouseClicked

    private void btnActualizaCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaCantidadMouseClicked
        int cantInicial = Integer.parseInt(txtCantidad.getText());
        try {
            String nume = JOptionPane.showInputDialog(
                    "Ingrese la cantidad que desea agregar a:\n" + txtNombreProd.getText());
            int cant1 = Integer.parseInt(nume);
            int tot = cantInicial + cant1;
            producto = new Producto(cant1, txtNombreProd.getText());
            material.AumentaCant(producto);
            String nuevaCantTxt = String.valueOf(tot);
            txtCantidad.setText(nuevaCantTxt);
            if (!(txtIngreso.getText().equals("ingreso"))) {
                fila = Integer.parseInt(txtFila.getText());
                Inventario.tblProd.setValueAt(nuevaCantTxt, fila, 0);
            }
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se agregó nada a:\n" + txtNombreProd.getText());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnActualizaCantidadMouseClicked

    private void btnActualizaUbicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaUbicacionMouseClicked
        ActualzarUbicacionDialog aj = new ActualzarUbicacionDialog(new javax.swing.JDialog(), true);
        aj.setVisible(true);
        ActualzarUbicacionDialog.lblProd.setText(txtNombreProd.getText());
    }//GEN-LAST:event_btnActualizaUbicacionMouseClicked

    private void lblMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenosMouseClicked
        int cant2 = Integer.parseInt(txtCantidad.getText());
        try {
            String nume = JOptionPane.showInputDialog(
                    "Ingrese la cantidad que desea restar a:\n" + txtNombreProd.getText());
            int cant1 = Integer.parseInt(nume);
            int tot = cant2 - cant1;
            producto = new Producto(cant1, txtNombreProd.getText());
            material.UpdateCantFactura(producto);
            String nuevaCantTxt = String.valueOf(tot);
            txtCantidad.setText(nuevaCantTxt);
            if (!(txtIngreso.getText().equals("ingreso"))) {
                fila = Integer.parseInt(txtFila.getText());
                Inventario.tblProd.setValueAt(nuevaCantTxt, fila, 0);
            }
        } catch (NullPointerException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No se mermó nada a:\n" + txtNombreProd.getText());
        }
    }//GEN-LAST:event_lblMenosMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (txtIngreso.getText().equals("ingreso")) {
            this.dispose();
        } else {
            fila = Integer.parseInt(txtFila.getText());
            if (lblPrecioCompra.getText().equals("jLabel4")) {
                this.dispose();
            } else {
                Inventario.tblProd.setValueAt(txtPrecio.getText(), fila, 4);
                Inventario.tblProd.setValueAt(txtPrecioM.getText(), fila, 5);
                Inventario.tblProd.setValueAt(lblPrecioCompra.getText(), fila, 3);
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizaCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaCategoriaMouseClicked
        ActualizaCategoriaDialog updCat = new ActualizaCategoriaDialog(new javax.swing.JDialog(), true);
        updCat.txtProducto.setText(txtNombreProd.getText());
        updCat.setVisible(true);

    }//GEN-LAST:event_btnActualizaCategoriaMouseClicked

    private void btnActualizaProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizaProveedorMouseClicked
        ActualizaProveedorDialog updProv = new ActualizaProveedorDialog(new javax.swing.JDialog(), true);
        updProv.txtProducto.setText(txtNombreProd.getText());
        updProv.setVisible(true);
    }//GEN-LAST:event_btnActualizaProveedorMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        obtenerProducto();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Módulo no disponible");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizacionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ActualizacionDialog dialog = new ActualizacionDialog(new javax.swing.JDialog(), true);
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
    private javax.swing.JLabel btnActualizaCantidad;
    private javax.swing.JLabel btnActualizaCategoria;
    private javax.swing.JLabel btnActualizaNombre;
    private javax.swing.JLabel btnActualizaPrecio;
    private javax.swing.JLabel btnActualizaProveedor;
    private javax.swing.JLabel btnActualizaUbicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JLabel lblCod;
    public javax.swing.JLabel lblIVA;
    private javax.swing.JLabel lblMenos;
    public static javax.swing.JLabel lblPrecioCompra;
    public javax.swing.JLabel txtCantidad;
    public static javax.swing.JLabel txtCategoria;
    public javax.swing.JLabel txtFila;
    public static javax.swing.JLabel txtIngreso;
    public javax.swing.JLabel txtNombreProd;
    public static javax.swing.JTextField txtPrecio;
    public static javax.swing.JLabel txtPrecioM;
    public static javax.swing.JLabel txtProveedor;
    public javax.swing.JLabel txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
