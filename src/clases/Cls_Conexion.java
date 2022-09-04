
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
    
    public Cls_Conexion() {
        conn = null;
    }
    
    public Connection getConnection(String dbName) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+"/"+dbName, user, password);
            System.out.println(conn); 
           
              
            }
            
        
        catch (ClassNotFoundException | SQLException ex2) {
            System.err.print("error: " + ex2.getMessage());
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