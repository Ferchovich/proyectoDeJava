
package clases;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class Cls_Conexion
{
    public static Connection conn;
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "123456";
    public static final String url = "jdbc:mysql://localhost:3306/";
    
    public Cls_Conexion() {
        conn = null;
    }
    
    public Connection getConnection(String dbName) {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url+dbName, user, password);
        }
        catch (ClassNotFoundException | SQLException ex2) {
            System.err.print("error: " + ex2.getMessage());
        }
        return Cls_Conexion.conn;
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