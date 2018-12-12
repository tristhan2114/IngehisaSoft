/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author personal
 */
public class conexion {
    
     String url = "jdbc:postgresql://localhost:5432/inventario";
    String user = "postgres";
    String pass = "123";
    Connection conn = null;
    
    public Connection conn() {
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception es) {
            System.out.println("ERROR AL OBTENER LA CONEXION+ " + es);
        }
        return conn;
    }
    
    public void close() throws SQLException{
        if(conn!= null)
            conn.close();
    }
    
    
    
    
    /*
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost:5432/inventario";
    String user = "postgres";
    String pass = "123";
    Connection conn = null;
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("ok");
        } catch (Exception es) {
            System.out.println("ERROR AL OBTENER LA CONEXION+ " + es);
        }
    }*/
    
}
