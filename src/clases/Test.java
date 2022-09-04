/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author octavio
 */
public class Test {
    public static final String driver = "com.mysql.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "123456";
    public static final String url = "jdbc:mysql://localhost:3306";
    private Connection conn;
    private PreparedStatement PS;
    public static void main(String[] args) {
        Test test = new Test();
        test.test();
      
    }
    
    
    public void test(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            PS = conn.prepareStatement("CREATE DATABASE mydb2");
            PS.executeUpdate();
            System.out.println("base de batos mydb2 creada");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
}
