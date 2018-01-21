package Dat;

import Clases.Producto;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DATMaterial {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    //int longitudbytes = 9;

    public ArrayList<Producto> Consultar() throws ClassNotFoundException {
        ArrayList<Producto> listaProductos = new ArrayList<Producto>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "SELECT p.Nombre_Producto, p.Codigo, p.precio_compra, p.precio, p.Precio_Mayor, p.ganancia, p.ganancia_mayor, u.nombre_ubicacion, p.Cantidad FROM producto p, ubicacion u WHERE p.id_ubicacion = u.id_ubicacion ORDER BY p.Nombre_Producto Asc";
            ps = con.prepareStatement(Sentencia);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString(1);
                String codigo = rs.getString(2);
                double precioCompra = rs.getDouble(3);
                double precio = rs.getDouble(4);
                double precioMayor = rs.getDouble(5);
                double ganancia = rs.getDouble(6);
                double gananciaMayor = rs.getDouble(7);
                String ubicacion = rs.getString(8);
                int cant = rs.getInt(9);
                Producto prod = new Producto(nombre, codigo, precio, precioCompra, ganancia, gananciaMayor, precioMayor, cant, ubicacion);
                listaProductos.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaProductos;
    }

    public ArrayList<Producto> ConsultarMinimo() throws SQLException {
        ArrayList<Producto> listadoMinimos = new ArrayList<Producto>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String sentencia = "SELECT p.Nombre_Producto, p.Codigo, p.Precio, "
                    + "p.Precio_Mayor, u.nombre_ubicacion, p.Cantidad, "
                    + "p.Cantidad_Minima, pr.Empresa FROM producto p, ubicacion u,"
                    + " proveedores pr WHERE p.id_ubicacion = u.id_ubicacion AND"
                    + " p.ruc = pr.ruc ORDER BY p.Nombre_Producto";
            ps = con.prepareStatement(sentencia);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombreProd = rs.getString(1);
                String cod = rs.getString(2);
                double precio = rs.getDouble(3);
                double precioProdMayor = rs.getDouble(4);
                String ubi = rs.getString(5);
                int cant = rs.getInt(6);
                int cantMin = rs.getInt(7);
                String empresa = rs.getString(8);
                Producto prod = new Producto(nombreProd, cod, precio, precioProdMayor, ubi, cant, cantMin, empresa);
                listadoMinimos.add(prod);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            rs.close();
            con.close();
        }
        return listadoMinimos;
    }

    public ArrayList<Producto> ConsultarPorNombre(String nombre) throws SQLException {
        ArrayList<Producto> listaProductosNombre = new ArrayList<Producto>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "SELECT p.Nombre_Producto, p.Codigo, p.precio_compra,"
                    + " p.precio, p.Precio_Mayor, p.ganancia, p.ganancia_mayor,"
                    + " u.nombre_ubicacion, p.Cantidad FROM producto p, ubicacion u "
                    + "WHERE  p.id_ubicacion = u.id_ubicacion AND Nombre_Producto REGEXP CONCAT('^',?) "
                    + "ORDER BY Nombre_Producto Asc";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombreprod = rs.getString(1);
                String codigo = rs.getString(2);
                double precioCompra = rs.getDouble(3);
                double precio = rs.getDouble(4);
                double precioMayor = rs.getDouble(5);
                double ganancia = rs.getDouble(6);
                double gananciaMayor = rs.getDouble(7);
                String ubicacion = rs.getString(8);
                int cant = rs.getInt(9);
                Producto prod = new Producto(nombreprod, codigo, precio, precioCompra, ganancia, gananciaMayor, precioMayor, cant, ubicacion);
                listaProductosNombre.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            con.close();
        }
        return listaProductosNombre;
    }
    
     public ArrayList<Producto> ConsultarPorCodigo(String nombre) throws SQLException {
        ArrayList<Producto> listaProductosNombre = new ArrayList<Producto>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "SELECT p.Nombre_Producto, p.Codigo, p.precio_compra,"
                    + " p.precio, p.Precio_Mayor, p.ganancia, p.ganancia_mayor,"
                    + " u.nombre_ubicacion, p.Cantidad FROM producto p, ubicacion u "
                    + "WHERE  p.id_ubicacion = u.id_ubicacion AND Codigo "
                    + "REGEXP CONCAT ('^',?) ORDER BY Nombre_Producto Asc";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                String nombreprod = rs.getString(1);
                String codigo = rs.getString(2);
                double precioCompra = rs.getDouble(3);
                double precio = rs.getDouble(4);
                double precioMayor = rs.getDouble(5);
                double ganancia = rs.getDouble(6);
                double gananciaMayor = rs.getDouble(7);
                String ubicacion = rs.getString(8);
                int cant = rs.getInt(9);
                Producto prod = new Producto(nombreprod, codigo, precio, precioCompra, ganancia, gananciaMayor, precioMayor, cant, ubicacion);
                listaProductosNombre.add(prod);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            rs.close();
            con.close();
        }
        return listaProductosNombre;
    }
//
//    public ResultSet ConsultarCodigo(String codigo) throws ClassNotFoundException, SQLException {
//        //Statement st = c.getConnection().createStatement();
//        String Sentencia = "SELECT Nombre_Producto, Codigo, Precio, Precio_Mayor, Ubicacion, Cantidad FROM producto WHERE Codigo REGEXP CONCAT('^',?)";
//        PreparedStatement ps = c.getConnection().prepareStatement(Sentencia);
//        //ResultSet re = st.executeQuery(Sentencia);
//        ps.setString(1, codigo);
//        return ps.executeQuery();
//    }
    
    public void actualizarUbicacion(Producto producto){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String sentencia = "UPDATE producto SET id_ubicacion = ? WHERE nombre_producto = ?";
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, producto.getIntUbicacion());
            ps.setString(2, producto.getStrNombreProd());
            ps.executeUpdate();
        } catch (SQLException ex){
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean IngresarProducto(Producto producto) throws SQLException, ClassNotFoundException {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            FileInputStream fis = new FileInputStream(producto.getFotoProd());
            FileInputStream fisCod = new FileInputStream(producto.getImgCodigoProd());
            System.out.println(fis);
            System.out.println(fisCod);
            String Sentencia = "INSERT INTO producto (nombre_producto, codigo,"
                    + " precio_Compra, precio, precio_mayor, ganancia, ganancia_Mayor,"
                    + "id_categoria, id_ubicacion, cantidad, cantidad_Minima,"
                    + " ruc, iva, imagen_producto,imagen_codigo)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, producto.getStrNombreProd());
            ps.setString(2, producto.getStrCod());
            ps.setDouble(3, producto.getPrecioCompra());
            ps.setDouble(4, producto.getFltPrecio());
            ps.setDouble(5, producto.getFltPrecioMayor());
            ps.setDouble(6, producto.getGanancia());
            ps.setDouble(7, producto.getGananciaMayor());
            ps.setInt(8, producto.getIdCategoria());
            ps.setInt(9, producto.getIntUbicacion());
            ps.setInt(10, producto.getIntCantidad());
            ps.setInt(11, producto.getIntCantidadMinima());
            ps.setString(12, producto.getStrRUC());
            ps.setString(13, producto.getIva());
            ps.setBinaryStream(14, fis, (int) producto.getFotoProd().length());
            ps.setBinaryStream(15, fisCod, (int) producto.getImgCodigoProd().length());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nombre o codigo ya ingresados");
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return true;
    }

    public void UpdateFormaCantMin(Producto producto) throws ClassNotFoundException, SQLException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String sentencia = "UPDATE producto SET Cantidad_Minima = ? WHERE Nombre_Producto = ?";
            ps = con.prepareStatement(sentencia);
            ps.setInt(1, producto.getIntCantidad());
            ps.setString(2, producto.getStrNombreProd());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            ps.close();
            con.close();
        }
    }
//

//    public int UpdateCantFactura(String nombre, int strCant) throws ClassNotFoundException, SQLException {
//        String Sentencia = "UPDATE producto SET Cantidad = ? WHERE Nombre_Producto = ?";
//        PreparedStatement ps = c.getConnection().prepareStatement(Sentencia);
//        ps.setInt(1, strCant);
//        ps.setString(2, nombre);
//        return ps.executeUpdate();
//    }
////

    public void UpdateProducto(Producto producto) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "UPDATE producto SET Nombre_Producto = ? WHERE Codigo = ?";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, producto.getStrNombreProd());
            ps.setString(2, producto.getStrCod());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void UpdateNombreProducto(Producto producto, String codigo) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "UPDATE producto SET Nombre_Producto = ?,Precio = ?, Precio_Mayor = ?, Cantidad = ?, Ubicacion = ? WHERE Codigo = ?";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, producto.getStrNombreProd());
            ps.setDouble(2, producto.getFltPrecio());
            ps.setDouble(3, producto.getFltPrecioMayor());
            ps.setInt(4, producto.getIntCantidad());
            ps.setString(5, producto.getStrUbicacion());
            ps.setString(6, producto.getStrCod());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//    //mod abajo

    public int CuentaRegistros() {
        int cant = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String sentencia = "SELECT count(*) FROM producto WHERE Cantidad <= Cantidad_Minima";
            ps = con.prepareStatement(sentencia);
            rs = ps.executeQuery();
            while (rs.next()) {
                cant = rs.getInt(1);
                Producto prod = new Producto();
            }

        } catch (SQLException ex) {
            Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cant;
    }

    public void eliminarProducto(String nombre){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa","root","ticowrc2017");
            String sentencia = "DELETE FROM producto WHERE codigo = ?";
            ps = con.prepareStatement(sentencia);
            ps.setString(1, nombre);
            ps.executeUpdate();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "No se puede eliminar el producto");
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(DATMaterial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
//
//    public ResultSet Venta(String codigo) throws ClassNotFoundException, SQLException {
//        String Sentencia = "SELECT Nombre_Producto, Precio, Codigo FROM producto WHERE Cantidad > 0 AND Codigo = ?";
//        PreparedStatement ps = c.getConnection().prepareStatement(Sentencia);
//        ps.setString(1, codigo);
//        return ps.executeQuery();
//    }
//
//    public ResultSet comprobarCant(String nombre) throws ClassNotFoundException, SQLException {
//        String sentencia = "SELECT Cantidad FROM producto Where Nombre_Producto = ?";
//        PreparedStatement ps = c.getConnection().prepareStatement(sentencia);
//        ps.setString(1, nombre);
//        return ps.executeQuery();
//    }
}
