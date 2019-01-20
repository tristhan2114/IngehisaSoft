/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.Apus;
import modelo.EsquemaPresupuestoManual;
import modelo.EsquemaPresupuestoManualTabla;
import modelo.FormatoApus;
import modelo.Presupuesto;
import util.conexion;
import vista.FrmApusPresupuesto;
import static vistaPanelApus.panelApus.jTextField4;

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

    private EsquemaPresupuestoManual datos1 = null;
    private Apus apus = null;

    public int ingresar(Presupuesto datos) {
        int resultado = 0;
        con = null;
        pst = null;
        sql = "INSERT INTO presupuesto (empresa, proyecto, oferta, datopresupuesto, id_apus, id_manual) "
                + "values (?,?,?,?,?,?)";
        conPg = new conexion();
        try {
            con = conPg.conn();
            pst = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pst.setString(1, datos.getEmpresa());
            pst.setString(2, datos.getProyecto());
            pst.setString(3, datos.getOferta());
            pst.setString(4, datos.getDatosPrespuesto());
            pst.setInt(5, datos.getId_apus());
            pst.setInt(6, datos.getId_manual());

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
            System.out.println("insert Pres " + e.getMessage());
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
            System.out.println("update Pres " + e.getMessage());
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

    public List<Presupuesto> getPresupuestoByID(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where id =" + dto + "";
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
    
    // búsqueda por id_apus tbl apus con presupuesto  para frmDocumentos
    public List<Presupuesto> getPresupuestoByID_Apus(int id_apus) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where id_apus =" + id_apus + " order by fecha_creacion asc";
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

    // para verificar existencia de presupuesto de apus... si count es 0 puede hacer
    // presupúesto OFERTA: INGEHISA 00'id_apus' - REV 001 
    // sino mando mensaje de que solo puede realizar revisiones y envio conteo
    // expresion OFERTA: INGEHISA 00'id_apus' - REV 00'count' --> 
    
    
    
    // metodo para saber si hay un apus como presupuesto ::: dto = id
    public int getCountApusByPresupuesto(String dto) {
        int param = 0;
        con = null;
        rs = null;
        stm = null;
        String sqlAux = "select count(id) from presupuesto where id_apus=" + dto;
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sqlAux);
            if (rs.next()) {
                param = rs.getInt(1);
            }
            
            
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err- " + e.getMessage());
        }
        return param;
    }

    // cuando es busqueda de apus y envia sgt revision
    public List<Presupuesto> getPresupuestoByID_Apus(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from presupuesto where id_apus =" + dto + " order by fecha_creacion desc limit 1";
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
    
    // metodo para traer los presupuestos manuales id_manual !=0
     public List<Presupuesto> getPresupuestoByID_Manual() {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        // select * from presupuesto where id_manual != 0 order by id_manual, fecha_creacion asc
        sql = "select * from presupuesto where id_manual != 0 order by id_manual, fecha_creacion asc";
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
                datos.setId_usuario(rs.getInt(10));

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
    
     // traemos count de id_apus para crear oferta manual sgt
    // metodo para saber si hay un apus como presupuesto Manual
    public int getCountApusByPresupuestoManual() {
        int param = 0;
        con = null;
        rs = null;
        stm = null;
        String sqlAux = "select count(id) from presupuesto";
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sqlAux);
            if (rs.next()) {
                param = rs.getInt(1);
                // jTextField4 rename ::::
            }
            
            
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err- " + e.getMessage());
        }
        return (param+1);
    }
    
    // control de sgt revision segun id_manual
     public int getCountPresupuestoManualById_manual(int dto) {
        int param = 0;
        con = null;
        rs = null;
        stm = null;
        String sqlAux = "select count(id_manual) from presupuesto where id_manual ="+dto;
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sqlAux);
            if (rs.next()) {
                param = rs.getInt(1);
                // jTextField4 rename ::::
            }
            
            
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("err- " + e.getMessage());
        }
        return (param);
    }
     
    // traemos datos de APUS y convertimos a Presupuesto
    public List<Presupuesto> getPresupuestoByApusID(String dto) {
        List<Presupuesto> aux = new ArrayList<>();
        con = null;
        rs = null;
        stm = null;
        sql = "select * from apus where id =" + dto + "";
        conPg = new conexion();
        
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            // devolvemos los datos del apus
            // empresa, proyecto, datosApus;
            // almacenar el id de apus :: variable global   *********
            // consultar en cabecera de oferta para crear una nueva segun sea
            String ofrt = "OFERTA: INGEHISA 00"+dto+" - REV 001";
            //FrmApusPresupuesto.jTextField4.setText(ofrt);
            if (rs.next()) {
                apus = new Apus();
                apus.setId(rs.getInt(1));
                apus.setEmpresa(rs.getString(2));
                apus.setProyecto(rs.getString(3));
                apus.setDatosApus(rs.getString(4));

                // convertimos los datos en EsquemaPresupuestoManual
                String esquema = getEsquema(apus, ofrt);

                datos = new Presupuesto();
                datos.setDatosPrespuesto(esquema);
                datos.setEmpresa(apus.getEmpresa());
                datos.setProyecto(apus.getProyecto());
                datos.setOferta(ofrt);

                // despues 
                aux.add(datos);
                apus = null;
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

    // convertimos a EsquemaPresupuestoManual
    private String getEsquema(Apus apus, String ofrt) {
        EsquemaPresupuestoManual aux = new EsquemaPresupuestoManual();
        aux.setCampo1(apus.getProyecto());
        aux.setCampo2(apus.getEmpresa());
        aux.setCampo3("INGENIERIA HIDROSANITARIA");
        aux.setOferta(ofrt);
        aux.setFecha("Guayaquil, ");

        aux.setSubtotal("0.0");
        aux.setIva("0.0");
        aux.setSubtotalIva("0.0");
        aux.setTotal("0.0");

        List<EsquemaPresupuestoManualTabla> body = new ArrayList<>();
        EsquemaPresupuestoManualTabla item = null;

        Gson gson = new Gson();
        Type tipoObjeto = new TypeToken<List<FormatoApus>>() {
        }.getType();
        ArrayList<FormatoApus> dto = gson.fromJson(convertString(apus), tipoObjeto);

        int num = 1;
        for (FormatoApus formatoApus : dto) {
            item = new EsquemaPresupuestoManualTabla();
            item.setNumeracion(String.valueOf(num));
            item.setDescripcion(formatoApus.getDetalle());
            item.setUnidad(formatoApus.getUnidad());
            item.setCantidad("0");
            item.setPreUnit(formatoApus.getValorOfert());
            item.setPreTot("0.0");

            body.add(item);
            item = null;
            num++;
        }
        aux.setListTbl(body);
        // convertimos en String el dato para pasarlo al presupuesto        
        return gson.toJson(aux);
    }

    private String convertString(Apus aux) {
        return aux.getDatosApus();
    }

}
