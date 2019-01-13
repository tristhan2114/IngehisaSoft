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
import modelo.Oferta;
import util.conexion;

/**
 *
 * @author Jonathan
 */
public class ofertController {

    private String sql = "";
    private Connection con;
    private PreparedStatement pst;
    private Statement stm;
    private ResultSet rs;
    private conexion conPg = null;

    private Oferta datos = null;

    public void ingresar(List<Oferta> datos) {
        // elementos de la base de datos
        List<Oferta> aux = getOfertasAll();
        // recorro todo los elementos que vengan de la vista -> la tabla
        for (Oferta dato : datos) {
            // consultamos la base de datos y verificamos que campos vamos
            // a hacer insert y cual va al update
            if (aux.isEmpty()) {
                insert(dato);
            } else {
                for (Oferta oferta : aux) {
                    // si se cumple --> update
                    if (oferta.getOferta().equals(dato.getOferta())) {
                        actualizar(dato);
                    } else {
                        insert(dato);
                    }
                }
            }
        }
    }

    public void insert(Oferta dato) {
        con = null;
        pst = null;

        sql = "INSERT INTO oferta (oferta, empresa, descripcion,  ubicacion, responsable, "
                + "elaborado_por, fecha, subtotal, telefono "
                + ") values (?,?,?,?,?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql);
            pst.setString(1, dato.getOferta());
            pst.setString(2, dato.getEmpresa());
            pst.setString(3, dato.getDescripcion());
            pst.setString(4, dato.getUbicacion());
            pst.setString(5, dato.getResponsable());
            pst.setString(6, dato.getElab_por());
            pst.setString(7, dato.getFecha());
            pst.setString(8, dato.getSubtotal());
            pst.setString(9, dato.getTelefono());

            pst.execute();
            pst.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("dd " + e.getMessage());
        }

    }

    public boolean actualizar(Oferta datos) {
        con = null;
        pst = null;
        sql = "UPDATE oferta SET empresa=?, descripcion=?, ubicacion=?, responsable=?, elaborado_por=? "
                + ", fecha=?, subtotal=?, telefono=?"
                + " where oferta=?";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst.setString(1, datos.getEmpresa());
            pst.setString(2, datos.getDescripcion());
            pst.setString(3, datos.getUbicacion());
            pst.setString(4, datos.getResponsable());
            pst.setString(5, datos.getElab_por());
            pst.setString(6, datos.getFecha());
            pst.setString(7, datos.getSubtotal());
            pst.setString(8, datos.getTelefono());
            pst.setString(9, datos.getOferta());

            pst.execute();
            pst.close();
            con.close();
            conPg = null;
            return true;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("dd " + e.getMessage());
            return false;
        }
    }

    public List<Oferta> getOfertasAll() {
        con = null;
        pst = null;
        sql = "select oferta, empresa, descripcion,  ubicacion, responsable, elaborado_por, fecha, subtotal, telefono from oferta";
        List<Oferta> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Oferta();
                datos.setOferta(rs.getString(1));
                datos.setEmpresa(rs.getString(2));
                datos.setDescripcion(rs.getString(3));
                datos.setUbicacion(rs.getString(4));
                datos.setResponsable(rs.getString(5));
                datos.setElab_por(rs.getString(6));
                datos.setFecha(rs.getString(7));
                datos.setSubtotal(rs.getString(8));
                datos.setTelefono(rs.getString(9));

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

    public List<Oferta> getOfertByPresuApus() {
        List<Oferta> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select id, empresa, oferta, fecha_creacion, id_apus from presupuesto where id_apus !=0 "
                + "group by id_apus , id "
                + "order by id_apus asc";
        conPg = new conexion();

        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Oferta();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setOferta(rs.getString(3));

                datos.setDescripcion("");
                datos.setUbicacion("");
                datos.setResponsable("");
                datos.setElab_por("");
                datos.setFecha("");
                datos.setSubtotal("");
                datos.setTelefono("");

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

    public List<Oferta> getOfertByPresuManual() {
        List<Oferta> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select id, empresa, oferta, fecha_creacion, id_manual from presupuesto where id_manual !=0 "
                + "group by id_manual , id "
                + "order by id_manual asc";
        conPg = new conexion();

        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Oferta();
                datos = new Oferta();
                datos.setId(rs.getInt(1));
                datos.setEmpresa(rs.getString(2));
                datos.setOferta(rs.getString(3));

                datos.setDescripcion("");
                datos.setUbicacion("");
                datos.setResponsable("");
                datos.setElab_por("");
                datos.setFecha("");
                datos.setSubtotal("");
                datos.setTelefono("");

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

}
