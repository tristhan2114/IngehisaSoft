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
public class ManoObra {
    
    private int id;
    private String descripcion;
    private double sueldo;
    private double fsr;
    private double diario;
    private double hora;
    private String cpc;
    private String np_nd_ep;
    private String vae;

    public ManoObra() {
    }

    public ManoObra(int id, String descripcion, double sueldo, double fsr, double diario, double hora, String cpc, String np_nd_ep, String vae) {
        this.id = id;
        this.descripcion = descripcion;
        this.sueldo = sueldo;
        this.fsr = fsr;
        this.diario = diario;
        this.hora = hora;
        this.cpc = cpc;
        this.np_nd_ep = np_nd_ep;
        this.vae = vae;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getFsr() {
        return fsr;
    }

    public void setFsr(double fsr) {
        this.fsr = fsr;
    }

    public double getDiario() {
        return diario;
    }

    public void setDiario(double diario) {
        this.diario = diario;
    }

    public double getHora() {
        return hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public String getCpc() {
        return cpc;
    }

    public void setCpc(String cpc) {
        this.cpc = cpc;
    }

    public String getNp_nd_ep() {
        return np_nd_ep;
    }

    public void setNp_nd_ep(String np_nd_ep) {
        this.np_nd_ep = np_nd_ep;
    }

    public String getVae() {
        return vae;
    }

    public void setVae(String vae) {
        this.vae = vae;
    }

    @Override
    public String toString() {
        return "ManoObra{" + "id=" + id + ", descripcion=" + descripcion + ", sueldo=" + sueldo + ", fsr=" + fsr + ", diario=" + diario + ", hora=" + hora + ", cpc=" + cpc + ", np_nd_ep=" + np_nd_ep + ", vae=" + vae + '}';
    }
    
    
        
}
