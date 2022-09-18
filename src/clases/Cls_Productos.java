    package clases;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Cls_Productos
{
    private final String SQL_INSERT = "INSERT INTO usuarios (nombre, apellido, usuario, sexo, contrasenia) values (?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM usuarios";
    private final String SQL_CREATE = "create table usuarios(id int not null unique auto_increment,nombre varchar(50) not null,apellido varchar(50) not null,usuario varchar(50) not null,sexo varchar(50) not null,contrasenia varchar(50) not null)";
    private PreparedStatement PS;
    private ResultSet RS;
    private Cls_Conexion CN;
    
    public Cls_Productos() {
        this.PS = null;
        CN = new Cls_Conexion();
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_CREATE);
            PS.executeUpdate();
        }catch (SQLException ex){}
    }
    
    
    public ArrayList<Usuario> getDatos() {
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_SELECT);
            RS = PS.executeQuery();
            ArrayList<Usuario> listadeUsuario = new ArrayList<>();
            while (RS.next()) {
                Usuario us = new Usuario();
                us.setId(RS.getInt("id"));
                us.setNombre(RS.getString("nombre"));
                us.setApellido(RS.getString("apellido"));
                us.setUsuario(RS.getString("usuario"));
                us.setSexo(RS.getString("sexo"));
                us.setContrasenia(RS.getString("contrasenia"));
                listadeUsuario.add(us);
            }
            return listadeUsuario;
        }
        catch (SQLException ex) {
            System.err.println("error: " + ex.getMessage());
        }
        finally {
            PS = null;
            CN.desconectar();
        }
        return null;
    }
    
    public void eliminarDatos(String nombreUsuario) {
        try {
            (this.PS = this.CN.getConnection("mydb2").prepareStatement(String.format("DELETE FROM usuarios where usuario = '%s'", nombreUsuario))).executeUpdate();
        }
        catch (SQLException e) {
            System.err.println("Error "+ e.getMessage());
        }
        finally {
            PS = null;
            CN.desconectar();
        }
    }
    
    public void insertarDatos(final Usuario usuario) {
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_INSERT);
            PS.setString(1, usuario.getNombre());
            PS.setString(2, usuario.getApellido());
            PS.setString(3, usuario.getUsuario());
            PS.setString(4, usuario.getSexo());
            PS.setString(5, usuario.getContrasenia());
            int res = PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }
        }
        catch (SQLException e) {
            System.err.println("error: " + e.getMessage());
        }
        finally {
            PS = null;
            CN.desconectar();
        }
    }
}