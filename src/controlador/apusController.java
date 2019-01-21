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
import modelo.Apus;
import util.conexion;

/**
 *
 * @author Jonathan
 */
public class apusController {

    private String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg = null;
    private Apus datos = null;

    public int ingresar(Apus datos) {
        int resultado = 0;
        con = null;
        pst = null;
        sql = "INSERT INTO apus (empresa, proyecto, datosapus, datospresresu, id_usuario) "
                + "values (?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, datos.getEmpresa());
            pst.setString(2, datos.getProyecto());
            pst.setString(3, datos.getDatosApus());
            pst.setString(4, datos.getDatosPresResu());
            pst.setInt(5, datos.getId_usuario());

            pst.execute();
            
            // now get the ID:
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                resultado = rs.getInt(1);
            }
            rs.close();
            
            pst.close();
            con.close();
            conPg.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("insert "+e.getMessage());
            e.getMessage();            
        }
        return resultado;
    }

     public boolean actualizarUrlFile(Apus datos) {
        con = null;
        pst = null;
        sql = "UPDATE apus SET url_file=? "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getUrl_file());
            pst.setInt(2, datos.getId());

            pst.execute();
            pst.close();
            con.close();
            conPg.close();
            conPg = null;
            return true;
        } catch (Exception e) {
            System.out.println("update "+e.getMessage());
            e.getMessage();
            return false;
        }
    }
     
     public List<Apus> getApusAll(String id_user) {
        List<Apus> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from apus where id_usuario="+id_user;
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Apus();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setDatosApus(rs.getString(4));
                datos.setDatosPresResu(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
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
     
     public List<Apus> getApusByEmpresa(String dto) {
        List<Apus> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from apus where empresa ='" + dto + "'";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Apus();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setDatosApus(rs.getString(4));
                datos.setDatosPresResu(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
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

     public List<Apus> getApusByProyecto(String dto) {
        List<Apus> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from apus where proyecto ='" + dto + "'";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Apus();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setDatosApus(rs.getString(4));
                datos.setDatosPresResu(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
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

     public List<Apus> getApusByID(String dto, String id_user) {
        List<Apus> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from apus where id =" + dto + " and id_usuario="+id_user;
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Apus();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setDatosApus(rs.getString(4));
                datos.setDatosPresResu(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
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

}
