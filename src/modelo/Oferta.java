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
public class Oferta {
    // clase que hara conexion con la base de datos
    private int id;
    private String oferta;
    private String empresa;
    private String descripcion;
    private String ubicacion;
    private String responsable;
    private String elab_por; // elaborado por
    private String fecha;
    private String subtotal;
    private String telefono;
    
    private String datosOferta;
    private String url_file;

    public Oferta() {
    }

    public Oferta(int id, String oferta, String empresa, String descripcion, String ubicacion, String responsable, String elab_por, String fecha, String subtotal, String telefono, String datosOferta, String url_file) {
        this.id = id;
        this.oferta = oferta;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.responsable = responsable;
        this.elab_por = elab_por;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.telefono = telefono;
        this.datosOferta = datosOferta;
        this.url_file = url_file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getElab_por() {
        return elab_por;
    }

    public void setElab_por(String elab_por) {
        this.elab_por = elab_por;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDatosOferta() {
        return datosOferta;
    }

    public void setDatosOferta(String datosOferta) {
        this.datosOferta = datosOferta;
    }

    public String getUrl_file() {
        return url_file;
    }

    public void setUrl_file(String url_file) {
        this.url_file = url_file;
    }

    @Override
    public String toString() {
        return "Oferta{" + "id=" + id + ", oferta=" + oferta + ", empresa=" + empresa + ", descripcion=" + descripcion + ", ubicacion=" + ubicacion + ", responsable=" + responsable + ", elab_por=" + elab_por + ", fecha=" + fecha + ", subtotal=" + subtotal + ", telefono=" + telefono + ", datosOferta=" + datosOferta + ", url_file=" + url_file + '}';
    }
    
}
