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
import modelo.Equipo;
import util.conexion;

/**
 *
 * @author personal1
 */
public class equipoController {
    
    String sql="";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg;
    
    private Equipo datos;    
    
    
    public boolean ingresar(Equipo datos){
        con = null;
        pst = null;
        sql = "INSERT INTO equippo (descripcion, diario, hora,  cpc, "
                + "np_nd_ep, vae) values (?,?,?,?,?,?)";
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setDouble(2, datos.getDiario());
            pst.setDouble(3, datos.getHora());
            pst.setString(4, datos.getCpc());
            pst.setString(5, datos.getNp_nd_ep());
            pst.setString(6, datos.getVae());
            
            pst.execute();
            pst.close();
            con.close();
            
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
    
    
    
    
    public boolean actualizar(Equipo datos){
        con = null;
        pst = null;
        sql = "UPDATE equipo SET descripcion=?, diario=?, hora=?, cpc=?, "
                + "np_nd_ep=?, vae=? "
                + " where id=?";
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setDouble(2, datos.getDiario());
            pst.setDouble(3, datos.getHora());
            pst.setString(4, datos.getCpc());
            pst.setString(5, datos.getNp_nd_ep());
            pst.setString(6, datos.getVae());
            pst.setInt(7, datos.getId());
            
            pst.execute();
            pst.close();
            con.close();
            
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
    
    
    
    
    
    public List<Equipo> getEquipoAll(){
        con = null;
        pst = null;
        sql = "select * from equipo";
        List<Equipo> equipos = new ArrayList<>();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Equipo();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setDiario(rs.getDouble(3));
                datos.setHora(rs.getDouble(4));
                datos.setCpc(rs.getString(5));
                datos.setNp_nd_ep(rs.getString(6));
                datos.setVae(rs.getString(7));
                
                equipos.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return equipos; 
    }
    
    
     public List<Equipo> getEquipoByID(int id){
        con = null;
        pst = null;
        sql = "select * from equipo where id="+id;
        List<Equipo> equipos = new ArrayList<>();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Equipo();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setDiario(rs.getDouble(3));
                datos.setHora(rs.getDouble(4));
                datos.setCpc(rs.getString(5));
                datos.setNp_nd_ep(rs.getString(6));
                datos.setVae(rs.getString(7));
                
                equipos.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return equipos; 
    }


    public List<Equipo> getEquipoByDescripcion(String descrip){
        con = null;
        pst = null;
        sql = "select * from equipo where descripcion like '%"+descrip+"%'";;
        List<Equipo> equipos = new ArrayList<>();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                datos = new Equipo();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setDiario(rs.getDouble(3));
                datos.setHora(rs.getDouble(4));
                datos.setCpc(rs.getString(5));
                datos.setNp_nd_ep(rs.getString(6));
                datos.setVae(rs.getString(7));
                
                equipos.add(datos);
                datos = null;
            }  
            stm.close();
            rs.close();
            con.close();
            
        } catch (Exception e) {
            e.getMessage();
        }
        return equipos; 
    }
    
}
