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
import modelo.Proveedor;
import util.conexion;

/**
 *
 * @author personal1
 */
public class proveedorController {

    private String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg = null;

    private Proveedor datos = null;

    // todas las clasficiaciones -> para el cbo en material
    public List<Proveedor> getProveedoresAll() {
        List<Proveedor> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from proveedor order by id asc";
        conPg = new conexion();

        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Proveedor();
                datos.setId(rs.getInt(1));
                datos.setNombre(rs.getString(2));
                datos.setTelefono(rs.getString(3));

                aux.add(datos);
                datos = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg.close();
            conPg = null;
        } catch (Exception e) {
            System.out.println("Error proveeController " + e.getMessage());
            e.getMessage();
        }
        return aux;
    }

    public boolean ingresar(Proveedor datos) {
        con = null;
        pst = null;
        sql = "INSERT INTO proveedor (nombre, telefono) values (?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getTelefono());

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

    public boolean actualizar(Proveedor datos) {
        con = null;
        pst = null;
        sql = "UPDATE proveedor SET nombre=?, telefono=? "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getTelefono());
            pst.setInt(3, datos.getId());

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
