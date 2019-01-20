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
    
    private int id_apus;
    private int id_manual;
    
    private int id_usuario;

    public Presupuesto() {
    }

    public Presupuesto(int id, String empresa, String proyecto, String oferta, String datosPrespuesto, String url_file, int id_apus, int id_manual, int id_usuario) {
        this.id = id;
        this.empresa = empresa;
        this.proyecto = proyecto;
        this.oferta = oferta;
        this.datosPrespuesto = datosPrespuesto;
        this.url_file = url_file;
        this.id_apus = id_apus;
        this.id_manual = id_manual;
        this.id_usuario = id_usuario;
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

    public int getId_apus() {
        return id_apus;
    }

    public void setId_apus(int id_apus) {
        this.id_apus = id_apus;
    }

    public int getId_manual() {
        return id_manual;
    }

    public void setId_manual(int id_manual) {
        this.id_manual = id_manual;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Presupuesto{" + "id=" + id + ", empresa=" + empresa + ", proyecto=" + proyecto + ", oferta=" + oferta + ", datosPrespuesto=" + datosPrespuesto + ", url_file=" + url_file + ", id_apus=" + id_apus + ", id_manual=" + id_manual + ", id_usuario=" + id_usuario + '}';
    }
    
}
