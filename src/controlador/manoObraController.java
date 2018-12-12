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
 *
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
        sql = "INSERT INTO equippo (descripcion, sueldo, fsr, diario, hora,  cpc, "
                + "np_nd_ep, vae) values (?,?,?,?,?,?,?,?)";
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
            
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
   
    
    public boolean actualizar(ManoObra datos){
        con = null;
        pst = null;
        sql = "UPDATE equipo SET descripcion=?, sueldo=?, fsr=?, diario=?, hora=?, cpc=?, "
                + "np_nd_ep=?, vae=? "
                + " where id=?";
        try {
            con = conPg.conn();
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
            
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
    
    
    public List<ManoObra> getEquipoAll(){
        con = null;
        pst = null;
        sql = "select * from manoObra";
        List<ManoObra> manoObras = new ArrayList<>();
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
            
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }
    
    
    public List<ManoObra> getEquipoByID(int id){
        con = null;
        pst = null;
        sql = "select * from manoObra where id="+id;
        List<ManoObra> manoObras = new ArrayList<>();
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
            
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }


    public List<ManoObra> getEquipoByDescripcion(String descrip){
        con = null;
        pst = null;
        sql = "select * from manoObra where descripcion like '%"+descrip+"%'";;
        List<ManoObra> manoObras = new ArrayList<>();
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
            
        } catch (Exception e) {
            e.getMessage();
        }
        return manoObras; 
    }
}
