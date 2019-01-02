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
public class Apus {
    // clase que hara conexion con la base de datos
    private int id;
    private String empresa;
    private String proyecto;
    //private String val_oferta; //tomariamos de datosApus
    
    private String datosApus;
    private String datosPresResu; // presupúesto resumen
    private String url_file;

    public Apus() {
    }

    public Apus(int id, String empresa, String proyecto, String datosApus, String datosPresResu, String url_file) {
        this.id = id;
        this.empresa = empresa;
        this.proyecto = proyecto;
        this.datosApus = datosApus;
        this.datosPresResu = datosPresResu;
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

    public String getDatosApus() {
        return datosApus;
    }

    public void setDatosApus(String datosApus) {
        this.datosApus = datosApus;
    }

    public String getDatosPresResu() {
        return datosPresResu;
    }

    public void setDatosPresResu(String datosPresResu) {
        this.datosPresResu = datosPresResu;
    }

    public String getUrl_file() {
        return url_file;
    }

    public void setUrl_file(String url_file) {
        this.url_file = url_file;
    }

    @Override
    public String toString() {
        return "Apus{" + "id=" + id + ", empresa=" + empresa + ", proyecto=" + proyecto + ", datosApus=" + datosApus + ", datosPresResu=" + datosPresResu + ", url_file=" + url_file + '}';
    }
        
}
