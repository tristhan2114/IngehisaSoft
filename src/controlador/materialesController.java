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
import modelo.Materiales;
import util.conexion;

/**
 *
 * @author Jonathan
 */
public class materialesController {

    String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg;

    private Materiales datos;

    public boolean ingresar(Materiales datos) {
        con = null;
        pst = null;
        sql = "INSERT INTO materiales (id_clasificacion, id_proveedor, descripcion, unidad, "
                + "precio, url_imagen ) values (?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setInt(1, datos.getId_clasificacion());
            pst.setInt(2, datos.getId_proveedor());
            pst.setString(3, datos.getDescripcion());
            pst.setString(4, datos.getUnidad());
            pst.setDouble(5, datos.getPrecio());
            pst.setString(6, datos.getUrl_imagen());

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

    public boolean actualizar(Materiales datos) {
        con = null;
        pst = null;
        sql = "UPDATE materiales SET id_clasificacion=?, id_proveedor=?, descripcion=?, unidad=?, "
                + "precio=?, url_imagen=? "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setInt(1, datos.getId_clasificacion());
            pst.setInt(2, datos.getId_proveedor());
            pst.setString(3, datos.getDescripcion());
            pst.setString(4, datos.getUnidad());
            pst.setDouble(5, datos.getPrecio());
            pst.setString(6, datos.getUrl_imagen());
            pst.setInt(7, datos.getId());

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

    public List<Materiales> getMaterialAll() {
        con = null;
        pst = null;
        sql = "select * from materiales";
        List<Materiales> equipos = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();
                datos.setId(rs.getInt(1));
                datos.setId_clasificacion(rs.getInt(2));
                datos.setId_proveedor(rs.getInt(3));
                datos.setDescripcion(rs.getString(4));
                datos.setUnidad(rs.getString(5));
                datos.setPrecio(rs.getDouble(6));
                datos.setUrl_imagen(rs.getString(7));

                equipos.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return equipos;
    }

    public List<Materiales> getMaterialByID(int id) {
        con = null;
        pst = null;
        sql = "select * from equipo where id=" + id;
        List<Materiales> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();
                datos.setId(rs.getInt(1));
                datos.setId_clasificacion(rs.getInt(2));
                datos.setId_proveedor(rs.getInt(3));
                datos.setDescripcion(rs.getString(4));
                datos.setUnidad(rs.getString(5));
                datos.setPrecio(rs.getDouble(6));
                datos.setUrl_imagen(rs.getString(7));

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

    public List<Materiales> getMaterialByDescripcion(String descrip) {
        con = null;
        pst = null;
        sql = "select * from equipo where descripcion ilike '%" + descrip + "%'";
        //sql = "select * from equipo where LOWER(descripcion) = LOWER('"+descrip+"')";
        List<Materiales> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();
                datos.setId(rs.getInt(1));
                datos.setId_clasificacion(rs.getInt(2));
                datos.setId_proveedor(rs.getInt(3));
                datos.setDescripcion(rs.getString(4));
                datos.setUnidad(rs.getString(5));
                datos.setPrecio(rs.getDouble(6));
                datos.setUrl_imagen(rs.getString(7));

                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("err- " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }

    // traemos el id sgt para hacer la insercion
    public int getIDSgt() {
        int id = 0;
        con = null;
        stm = null;
        sql = "select count(id) from materiales";
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                id += rs.getInt(1);
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return (id + 1);
    }
}
