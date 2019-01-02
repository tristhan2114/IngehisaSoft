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
public class Presupuesto {
    // clase que hara conexion con la base de datos
    private int id;
    private String empresa;
    private String proyecto;
    private String oferta;
    
    private String datosPrespuesto;
    private String url_file;

    public Presupuesto() {
    }

    public Presupuesto(int id, String empresa, String proyecto, String oferta, String datosPrespuesto, String url_file) {
        this.id = id;
        this.empresa = empresa;
        this.proyecto = proyecto;
        this.oferta = oferta;
        this.datosPrespuesto = datosPrespuesto;
        this.url_file = url_file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getDatosPrespuesto() {
        return datosPrespuesto;
    }

    public void setDatosPrespuesto(String datosPrespuesto) {
        this.datosPrespuesto = datosPrespuesto;
    }

    public String getUrl_file() {
        return url_file;
    }

    public void setUrl_file(String url_file) {
        this.url_file = url_file;
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "id=" + id + ", empresa=" + empresa + ", proyecto=" + proyecto + ", oferta=" + oferta + ", datosPrespuesto=" + datosPrespuesto + ", url_file=" + url_file + '}';
    }
    
}
