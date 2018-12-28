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
import modelo.Transporte;
import util.conexion;

/**
 *
 * @author personal1
 */
public class transporteController {
    
    String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg;

    private Transporte datos;

    public boolean ingresar(Transporte datos) {
        con = null;
        pst = null;
        sql = "INSERT INTO transporte (descripcion, unidad, cantidad,  tarifa, "
                + "costunit) values (?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setString(2, datos.getUnidad());
            pst.setInt(3, datos.getCantidad());
            pst.setDouble(4, datos.getTarifa());
            pst.setDouble(5, datos.getCostUnit());

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

    public boolean actualizar(Transporte datos) {
        con = null;
        pst = null;
        sql = "UPDATE transporte SET descripcion=?, unidad=?, cantidad=?, tarifa=?, "
                + "costUnit=? "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getDescripcion());
            pst.setString(2, datos.getUnidad());
            pst.setInt(3, datos.getCantidad());
            pst.setDouble(4, datos.getTarifa());
            pst.setDouble(5, datos.getCostUnit());
            pst.setInt(6, datos.getId());

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

    public List<Transporte> getTransporteAll() {
        con = null;
        pst = null;
        sql = "select * from transporte";
        List<Transporte> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Transporte();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setUnidad(rs.getString(3));
                datos.setCantidad(rs.getInt(4));
                datos.setTarifa(rs.getDouble(5));
                datos.setCostUnit(rs.getDouble(6));

                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return aux;
    }

    public List<Transporte> getTransporteByID(int id) {
        con = null;
        pst = null;
        sql = "select * from transporte where id=" + id;
        List<Transporte> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Transporte();
                datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setUnidad(rs.getString(3));
                datos.setCantidad(rs.getInt(4));
                datos.setTarifa(rs.getDouble(5));
                datos.setCostUnit(rs.getDouble(6));

                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return aux;
    }

    public List<Transporte> getTransporteByDescripcion(String descrip) {
        con = null;
        pst = null;
        sql = "select * from transporte where descripcion ilike '%" + descrip + "%'";
        //sql = "select * from equipo where LOWER(descripcion) = LOWER('"+descrip+"')";
        List<Transporte> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Transporte();
               datos.setId(rs.getInt(1));
                datos.setDescripcion(rs.getString(2));
                datos.setUnidad(rs.getString(3));
                datos.setCantidad(rs.getInt(4));
                datos.setTarifa(rs.getDouble(5));
                datos.setCostUnit(rs.getDouble(6));

                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("err- "+e.getMessage());
            e.getMessage();
        }
        return aux;
    }

    // traemos el id sgt para hacer la insercion
    public int getIDSgt() {
        int id = 0;
        con = null;
        stm = null;
        sql = "select count(id) from transporte";
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
