package Dat;

import Clases.Categoria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rober
 */
public class DATCategoria {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public ArrayList<Categoria> obtenerCategoria() throws ClassNotFoundException{
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String sentencia = "SELECT id_categoria, nombre_categoria FROM categoria";
            ps = con.prepareStatement(sentencia);
            rs = ps.executeQuery();
            while (rs.next()) {
                int idCat = rs.getInt("id_categoria");
                String cat = rs.getString("nombre_categoria");
                Categoria objCat = new Categoria(idCat, cat);
                listaCategoria.add(objCat);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                rs.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return listaCategoria;
    }
    public void IngresarCat(Categoria cat) throws ClassNotFoundException {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa", "root", "ticowrc2017");
            String Sentencia = "INSERT INTO categoria (nombre_categoria)"
                    + "VALUES (?)";
            ps = con.prepareStatement(Sentencia);
            ps.setString(1, cat.getStrCat());
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
}
