/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author personal1
 */
public class MaterialesDto {
    
    private int id;
    private int id_clasificacion;
    private int id_proveedor;
    
    private String clasificacion;
    private String proveedor;
    
    private String descripcion;
    private String unidad;
    private double precio;
    private String url_imagen;

    public MaterialesDto(int id, int id_clasificacion, int id_proveedor, String clasificacion, String proveedor, String descripcion, String unidad, double precio, String url_imagen) {
        this.id = id;
        this.id_clasificacion = id_clasificacion;
        this.id_proveedor = id_proveedor;
        this.clasificacion = clasificacion;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.precio = precio;
        this.url_imagen = url_imagen;
    }

    public MaterialesDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUrl_imagen() {
        return url_imagen;
    }

    public void setUrl_imagen(String url_imagen) {
        this.url_imagen = url_imagen;
    }

    @Override
    public String toString() {
        return "MaterialesDto{" + "id=" + id + ", id_clasificacion=" + id_clasificacion + ", id_proveedor=" + id_proveedor + ", clasificacion=" + clasificacion + ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", unidad=" + unidad + ", precio=" + precio + ", url_imagen=" + url_imagen + '}';
    }     
    
}
