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
import modelo.Presupuesto;
import util.conexion;

/**
 *
 * @author personal1
 */
public class presupuestoController {
    
    private String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg = null;
    private Presupuesto datos = null;

    public int ingresar(Presupuesto datos) {
        int resultado = 0;
        con = null;
        pst = null;
        sql = "INSERT INTO presupuesto (empresa, proyecto, oferta, datopresupuesto) "
                + "values (?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, datos.getEmpresa());
            pst.setString(2, datos.getProyecto());
            pst.setString(3, datos.getOferta());
            pst.setString(4, datos.getDatosPrespuesto());

            pst.execute();
            
            // now get the ID:
            ResultSet rs = pst.getGeneratedKeys();
            if (rs.next()) {
                resultado = rs.getInt(1);
            }
            rs.close();
            
            pst.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("insert Pres "+e.getMessage());
            e.getMessage();            
        }
        return resultado;
    }

     public boolean actualizarUrlFile(Presupuesto datos) {
        con = null;
        pst = null;
        sql = "UPDATE presupuesto SET url_file=? "
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
            conPg = null;
            return true;
        } catch (Exception e) {
            System.out.println("update Pres "+e.getMessage());
            e.getMessage();
            return false;
        }
    }
     
     public List<Presupuesto> getPresupuestoAll() {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Presupuesto();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setOferta(rs.getString(4));
                datos.setDatosPrespuesto(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("Error clasifiController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }
     
     public List<Presupuesto> getPresupuestoByEmpresa(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where empresa '" + dto + "'";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Presupuesto();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setOferta(rs.getString(4));
                datos.setDatosPrespuesto(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("Error clasifiController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }

     public List<Presupuesto> getPresupuestoByProyecto(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where proyecto ='" + dto + "'";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Presupuesto();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setOferta(rs.getString(4));
                datos.setDatosPrespuesto(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("ErrorPresuController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }
    
     public List<Presupuesto> getPresupuestoByOferta(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where oferta ='" + dto + "'";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Presupuesto();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setProyecto(rs.getString(3));
                datos.setOferta(rs.getString(4));
                datos.setDatosPrespuesto(rs.getString(5));
                datos.setUrl_file(rs.getString(6));
               
                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("ErrorPresuController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }
     
}
