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
import modelo.MaterialesDto;
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
    private MaterialesDto item;

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

    public List<MaterialesDto> getMaterialAll() {
        con = null;
        pst = null;
        sql = "select materiales.id, materiales.id_clasificacion, materiales.id_proveedor, proveedor.nombre as pronombre, "
                + "clasificacion.descripcion as cladesc, materiales.descripcion, materiales.unidad, materiales.precio, materiales.url_imagen "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor order by materiales.id";
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setId_clasificacion(rs.getInt(2));
                item.setId_proveedor(rs.getInt(3));
                
                item.setProveedor(rs.getString(4));
                item.setClasificacion(rs.getString(5));
                
                item.setDescripcion(rs.getString(6));
                item.setUnidad(rs.getString(7));
                item.setPrecio(rs.getDouble(8));
                item.setUrl_imagen(rs.getString(9));

                list.add(item);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }

    public List<MaterialesDto> getMaterialByDescripcion(String dato) {
        con = null;
        pst = null;
        sql = "select materiales.id, materiales.id_clasificacion, materiales.id_proveedor, proveedor.nombre as pronombre, "
                + "clasificacion.descripcion as cladesc, materiales.descripcion, materiales.unidad, materiales.precio, materiales.url_imagen "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where materiales.descripcion ilike '%"+dato+"%' order by materiales.id;";
        System.out.println("SQL "+sql);
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            
            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setId_clasificacion(rs.getInt(2));
                item.setId_proveedor(rs.getInt(3));
                item.setProveedor(rs.getString(4));
                item.setClasificacion(rs.getString(5));
                item.setDescripcion(rs.getString(6));
                item.setUnidad(rs.getString(7));
                item.setPrecio(rs.getDouble(8));
                item.setUrl_imagen(rs.getString(9));                
                
                list.add(item);
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("descrip "+e.getMessage());
        }
        return list;
    }
    
    public List<MaterialesDto> getMaterialByEmpresa(String dato) {
        con = null;
        pst = null;
        sql = "select materiales.id, materiales.id_clasificacion, materiales.id_proveedor, proveedor.nombre as pronombre, "
                + "clasificacion.descripcion as cladesc, materiales.descripcion, materiales.unidad, materiales.precio, materiales.url_imagen "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where proveedor.nombre ilike '%"+dato+"%'";
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setId_clasificacion(rs.getInt(2));
                item.setId_proveedor(rs.getInt(3));
                
                item.setProveedor(rs.getString(4));
                item.setClasificacion(rs.getString(5));
                
                item.setDescripcion(rs.getString(6));
                item.setUnidad(rs.getString(7));
                item.setPrecio(rs.getDouble(8));
                item.setUrl_imagen(rs.getString(9));

                list.add(item);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("empres "+e.getMessage());
        }
        return list;
    }
    
    public List<MaterialesDto> getMaterialByClasificacion(String dato) {
        con = null;
        pst = null;
        sql = "select materiales.id, materiales.id_clasificacion, materiales.id_proveedor, proveedor.nombre as pronombre, "
                + "clasificacion.descripcion as cladesc, materiales.descripcion, materiales.unidad, materiales.precio, materiales.url_imagen "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where clasificacion.descripcion ilike '%"+dato+"%'";
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setId_clasificacion(rs.getInt(2));
                item.setId_proveedor(rs.getInt(3));
                
                item.setProveedor(rs.getString(4));
                item.setClasificacion(rs.getString(5));
                
                item.setDescripcion(rs.getString(6));
                item.setUnidad(rs.getString(7));
                item.setPrecio(rs.getDouble(8));
                item.setUrl_imagen(rs.getString(9));

                list.add(item);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("clasifi "+e.getMessage());
        }
        return list;
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

    public List<MaterialesDto> getMaterialAllModal() {
        con = null;
        pst = null;
        sql = "select materiales.id, proveedor.nombre as pronombre, "
                + "materiales.descripcion, materiales.precio "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "order by clasificacion.id asc";
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setProveedor(rs.getString(2));
                item.setDescripcion(rs.getString(3));
                item.setPrecio(rs.getDouble(4));

                list.add(item);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("dd "+e.getMessage());
        }
        return list;
    }
    
    public List<MaterialesDto> getMaterialByDescripcionModal(String dato) {
        con = null;
        pst = null;
        sql = "select materiales.id, proveedor.nombre as pronombre, "
                + "materiales.descripcion, materiales.precio "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where materiales.descripcion ilike '%"+dato+"%'"
                + "order by clasificacion.id asc";
        List<MaterialesDto> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                item = new MaterialesDto();
                item.setId(rs.getInt(1));
                item.setProveedor(rs.getString(2));
                item.setDescripcion(rs.getString(3));
                item.setPrecio(rs.getDouble(4));

                list.add(item);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("dd "+e.getMessage());
        }
        return list;
    }
    
    public List<Materiales> getMaterialById(int id) {
        con = null;
        pst = null;
        sql = "select descripcion, unidad, precio "
                + "from materiales "
                + "where id = "+id;
        List<Materiales> list = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();                
                datos.setDescripcion(rs.getString(1));
                datos.setUnidad(rs.getString(2));
                datos.setPrecio(rs.getDouble(3));

                list.add(datos);
                item = null;
            }
            stm.close();
            rs.close();
            con.close();
            conPg = null;
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
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
    
    // provee nombre y clasifi descripcion
    public List<Materiales>getMaterByClasificacion(String dto){
       con = null;
        pst = null;
        sql = "select distinct proveedor.nombre  "
                + "from materiales "
                + "left join clasificacion on clasificacion.id = materiales.id_clasificacion "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where clasificacion.descripcion ilike '%"+dto+"%' "
                + "order by proveedor.nombre asc";
        List<Materiales> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();
                datos.setDescripcion(rs.getString(1));
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
    
    public List<Materiales>getMaterByProveedor(String dto){
       con = null;
        pst = null;
        sql = "select materiales.descripcion "
                + "from materiales "
                + "left join proveedor on proveedor.id = materiales.id_proveedor "
                + "where proveedor.nombre ilike '%"+dto+"%' "
                + "order by materiales.descripcion asc";
        List<Materiales> aux = new ArrayList<>();
        conPg = new conexion();
        try {
            con = conPg.conn();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next()) {
                datos = new Materiales();
                datos.setDescripcion(rs.getString(1));
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
    
}
