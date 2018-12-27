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
import modelo.ManoObra;
import util.conexion;

/**
 * @author personal1
 */
public class manoObraController {
     
    String sql="";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg;
    
    private ManoObra datos;    
    
    
    public boolean ingresar(ManoObra datos){
        con = null;
        pst = null;
        sql = "INSERT INTO manobra (descripcion, sueldo, fsr, diario, hora, "
                + "cpc, np_nd_ep, vae) values (?,?,?,?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setDouble(2, datos.getSueldo());
            pst.setDouble(3, datos.getFsr());
            pst.setDouble(4, datos.getDiario());
            pst.setDouble(5, datos.getHora());
            pst.setString(6, datos.getCpc());
            pst.setString(7, datos.getNp_nd_ep());
            pst.setString(8, datos.getVae());
            
            pst.execute();
            pst.close();
            con.close();
            conPg = null;
            return true;
        } catch (Exception e) {
            System.out.println("err- "+e.getMessage());
            e.getMessage();
            conPg = null;
            return false;
        }
    }
    
   
    
    public boolean actualizar(ManoObra datos){
        con = null;
        pst = null;
        sql = "UPDATE manobra SET descripcion=?, sueldo=?, fsr=?, diario=?, hora=?, cpc=?, "
                + "np_nd_ep=?, vae=? "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setDouble(2, datos.getSueldo());
            pst.setDouble(3, datos.getFsr());
            pst.setDouble(4, datos.getDiario());
            pst.setDouble(5, datos.getHora());
            pst.setString(6, datos.getCpc());
            pst.setString(7, datos.getNp_nd_ep());
            pst.setString(8, datos.getVae());
            pst.setInt(9, datos.getId());
            
            pst.execute();
            pst.close();
            con.close();
            conPg = null;
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
    
    
    public List<ManoObra> getManoObraoAll(){
        con = null;
        pst = null;
        sql = "select * from manobra order by id asc";
        List<ManoObra> manoObras = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new ManoObra();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setSueldo(rs.getDouble(3));
                datos.setFsr(rs.getDouble(4));
                datos.setDiario(rs.getDouble(5));
                datos.setHora(rs.getDouble(6));
                datos.setCpc(rs.getString(7));
                datos.setNp_nd_ep(rs.getString(8));
                datos.setVae(rs.getString(9));
                
                manoObras.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }
    
    
    public List<ManoObra> getManoObraByID(int id){
        con = null;
        pst = null;
        sql = "select * from manobra where id="+id;
        List<ManoObra> manoObras = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new ManoObra();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setSueldo(rs.getDouble(3));
                datos.setFsr(rs.getDouble(4));
                datos.setDiario(rs.getDouble(5));
                datos.setHora(rs.getDouble(6));
                datos.setCpc(rs.getString(7));
                datos.setNp_nd_ep(rs.getString(8));
                datos.setVae(rs.getString(9));
                
                manoObras.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }


    public List<ManoObra> getManoObraByDescripcion(String descrip){
        con = null;
        pst = null;
        sql = "select * from manobra where descripcion ilike '%"+descrip+"%' order by id asc";
        List<ManoObra> manoObras = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new ManoObra();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setSueldo(rs.getDouble(3));
                datos.setFsr(rs.getDouble(4));
                datos.setDiario(rs.getDouble(5));
                datos.setHora(rs.getDouble(6));
                datos.setCpc(rs.getString(7));
                datos.setNp_nd_ep(rs.getString(8));
                datos.setVae(rs.getString(9));
                
                manoObras.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }
    
        // traemos el id sgt para hacer la insercion
    public int getIDSgt() {
        int id = 0;
        con = null;
        stm = null;
        sql = "select count(id) from manobra";
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                id+=rs.getInt(1);
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return (id+ 1);
    }
}
