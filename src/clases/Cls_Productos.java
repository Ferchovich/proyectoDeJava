package clases;

import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import clases.Usuario;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Cls_Productos
{
    private final String SQL_INSERT = "INSERT INTO usuarios (nombre, apellido, usuario, sexo, contrasenia) values (?,?,?,?,?)";
    private final String SQL_SELECT = "SELECT * FROM usuarios";
    private final String SQL_CREATE = """
                                                       create table usuarios(
                                                       id int not null unique auto_increment,
                                                       nombre varchar(50) not null,
                                                       apellido varchar(50) not null,
                                                       usuario varchar(50) not null,
                                                       sexo varchar(50) not null,
                                                       contrasenia varchar(50) not null
                                                       )""";
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
            this.PS = this.CN.getConnection("mydb2").prepareStatement(SQL_SELECT);
            this.RS = this.PS.executeQuery();
            final ArrayList<Usuario> listadeUsuario = new ArrayList<>();
            while (this.RS.next()) {
                final Usuario us = new Usuario();
                us.setId(this.RS.getInt("id"));
                us.setNombre(this.RS.getString("nombre"));
                us.setApellido(this.RS.getString("apellido"));
                us.setUsuario(this.RS.getString("usuario"));
                us.setSexo(this.RS.getString("sexo"));
                us.setContrasenia(this.RS.getString("contrasenia"));
                listadeUsuario.add(us);
            }
            return listadeUsuario;
        }
        catch (SQLException ex) {
            System.err.println("error: " + ex.getMessage());
        }
        finally {
            this.PS = null;
            this.CN.desconectar();
        }
        return null;
    }
    
    public void eliminarDatos(final String nombreUsuario) {
        try {
            (this.PS = this.CN.getConnection("mydb2").prepareStatement(String.format("DELETE FROM usuarios where usuario = '%s'", nombreUsuario))).executeUpdate();
        }
        catch (SQLException e) {
            System.err.println("Error "+ e.getMessage());
        }
        finally {
            this.PS = null;
            this.CN.desconectar();
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
            int res = this.PS.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
            }
        }
        catch (SQLException e) {
            System.err.println("error: " + e.getMessage());
        }
        finally {
            this.PS = null;
            this.CN.desconectar();
        }
    }
}