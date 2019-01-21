/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Clasificacion;
import util.conexion;

/**
 *
 * @author personal1
 */
public class clasificacionController {

    private String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg = null;
    
    private Clasificacion datos = null;

    // todas las clasficiaciones -> para el cbo en material
    public List<Clasificacion> getClasificacionAll() {
        List<Clasificacion> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from clasificacion";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Clasificacion();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
               
                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("Error clasifiController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }


    public boolean ingresar(Clasificacion datos){
        con = null;
        pst = null;
        sql = "INSERT INTO clasificacion (descripcion) values (?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);            
            pst.setString(1, datos.getDescripcion());
                       
            pst.execute();
            pst.close();
            con.close();
            conPg.close();
            conPg = null;
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
    
}

