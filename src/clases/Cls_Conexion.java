
package clases;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cls_Conexion
{
    public static Connection conn;
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "123456";
    public static final String url = "jdbc:mysql://localhost:3306";
    private PreparedStatement PS;
    
    public Cls_Conexion() {
        conn = null;
    }
    
    public Connection getConnection(String dbName) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            PS = conn.prepareStatement("CREATE DATABASE " + dbName);
            PS.executeUpdate();
            
        }
            
        catch (ClassNotFoundException | SQLException ex2) {
            
            try {
                PS = null;
                conn = DriverManager.getConnection(url+"/"+dbName, user, password);
            } catch (SQLException ex) {
                System.err.println("error: " + ex.getMessage());
            }
        }
        return conn;
    }
    
    public void desconectar() {
        try {
            conn.close();
        }
        catch (SQLException e) {
            System.out.println("Error al desconectar de la base de datos");
        }
    }
}