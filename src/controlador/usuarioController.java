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
import modelo.Usuarios;
import util.conexion;

/**
 *
 * @author personal1
 */
public class usuarioController {

    String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg;

    private Usuarios datos;

    public boolean ingresar(Usuarios datos) {
        con = null;
        pst = null;
        sql = "INSERT INTO usuarios (nombres, apellidos, username,  contrasenia "
                + ") values (?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getNombres());
            pst.setString(2, datos.getApellidos());
            pst.setString(3, datos.getUsername());
            pst.setString(4, datos.getContrasenia());
            pst.setInt(5, datos.getResponsable());

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

    public boolean actualizar(Usuarios datos) {
        con = null;
        pst = null;
        sql = "UPDATE usuarios SET nombres=?, apellidos=?, username=?, contrasenia=?, "
                + " "
                + " where id=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, datos.getNombres());
            pst.setString(2, datos.getApellidos());
            pst.setString(3, datos.getUsername());
            pst.setString(4, datos.getContrasenia());
            pst.setInt(5, datos.getResponsable());
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

    public List<Usuarios> getUsuariosAll() {
        con = null;
        pst = null;
        sql = "select * from usuarios";
        List<Usuarios> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Usuarios();
                datos.setId(rs.getInt(1));
                datos.setNombres(rs.getString(2));
                datos.setApellidos(rs.getString(3));
                datos.setUsername(rs.getString(4));
                datos.setContrasenia(rs.getString(5));
                datos.setResponsable(rs.getInt(6));

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

    public List<Usuarios> getUsuariosByID(int id) {
        con = null;
        pst = null;
        sql = "select * from usuarios where id=" + id;
        List<Usuarios> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Usuarios();
                datos.setId(rs.getInt(1));
                datos.setNombres(rs.getString(2));
                datos.setApellidos(rs.getString(3));
                datos.setUsername(rs.getString(4));
                datos.setContrasenia(rs.getString(5));
                datos.setResponsable(rs.getInt(6));

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

    public List<Usuarios> getUsuariosByApellidos(String descrip) {
        con = null;
        pst = null;
        sql = "select * from usuarios where apellidos ilike '%" + descrip + "%'";
        List<Usuarios> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Usuarios();
                datos.setId(rs.getInt(1));
                datos.setNombres(rs.getString(2));
                datos.setApellidos(rs.getString(3));
                datos.setUsername(rs.getString(4));
                datos.setContrasenia(rs.getString(5));
                datos.setResponsable(rs.getInt(6));

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
        sql = "select count(id) from usuarios";
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

    // metodo para cambiar de contraseña del usuario;
    public boolean setCambiarContraseñaByUsuarioID(int id){
        boolean resultado = false;
        
        return resultado;
    }
}
