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
