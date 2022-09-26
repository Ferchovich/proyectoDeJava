    package clases;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Cls_Productos
{
    private final String SQL_INSERT_USUARIOS = "INSERT INTO usuarios (nombre, apellido, usuario, sexo, contrasenia) values (?,?,?,?,?)";
    private final String SQL_INSERT_EVENTOS = "insert into eventos (nombre, fecha, capacidad, requisitos, direccion, horaDeInicio, horaDeCierre) value (?,?,?,?,?,?,?)";    private final String SQL_SELECT = "SELECT * FROM ";
    private final String SQL_CREATE_EVENTOS = """
                                              create table eventos(
                                                id int not null auto_increment,
                                                nombre varchar(45) not null,
                                                fecha varchar(45) not null,
                                                direccion varchar(45) not null,
                                                capacidad int not null,
                                                requisitos varchar(45) not null,
                                                horaDeInicio varchar(45) not null,
                                                horaDeCierre varchar(45) not null,
                                                primary key (id)
                                              );""";
    private final String SQL_CREATE_USUARIOS = "create table usuarios (id int not null unique auto_increment,nombre varchar(50) not null,apellido varchar(50) not null,usuario varchar(50) not null,sexo varchar(50) not null,contrasenia varchar(50) not null)";
    private PreparedStatement PS;
    private ResultSet RS;
    private Cls_Conexion CN;
    
    public Cls_Productos() {
        this.PS = null;
        CN = new Cls_Conexion();
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_CREATE_USUARIOS);
            
            PS.executeUpdate();
            
            PS = CN.getConnection("mydb2").prepareStatement(SQL_CREATE_EVENTOS);
            PS.executeUpdate();
        }catch (SQLException ex){}
    }
    
    
    public ArrayList getDatos(String tableName) {
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_SELECT + tableName);
            RS = PS.executeQuery();
            
            if (tableName.equals("usuarios")){
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
            else if (tableName.equals("eventos")){
                ArrayList<Evento> listadeEventos = new ArrayList<>();
                
                while (RS.next()) {
                    
                    Evento ev = new Evento();
                    ev.setNombre(RS.getString("nombre"));
                    ev.setFecha(RS.getString("fecha"));
                    ev.setCapacidad(RS.getInt("capacidad"));
                    ev.setDireccion(RS.getString("direccion"));
                    ev.setRequisitos(RS.getString("requisitos"));
                    ev.setHoraInicio(RS.getString("horaDeInicio"));
                    ev.setHoraCierre(RS.getString("horaDeCierre"));
                    listadeEventos.add(ev);
                    
                }
                    
                return listadeEventos;
                
            }
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
    
    public void eliminarDatos(String nombreUsuario, String tableName) {
        try {
            (this.PS = this.CN.getConnection("mydb2").prepareStatement(String.format("DELETE FROM %s where usuario = '%s'", tableName, nombreUsuario))).executeUpdate();
        }
        catch (SQLException e) {
            System.err.println("Error "+ e.getMessage());
        }
        finally {
            PS = null;
            CN.desconectar();
        }
    }
    
    public void insertarDatos(Usuario usuario) {
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_INSERT_USUARIOS);
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
    public void insertarDatos(Evento evento){
        try {
            PS = CN.getConnection("mydb2").prepareStatement(SQL_INSERT_EVENTOS);
            PS.setString(1, evento.getNombre());
            PS.setString(2, evento.getFecha());
            PS.setInt(3, evento.getCapacidad());
            PS.setString(4, evento.getRequisitos());
            PS.setString(5, evento.getDireccion());
            PS.setString(6, evento.getHoraInicio());
            PS.setString(7, evento.getHoraCierre());
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