/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author personal1
 */
public class EsquemaPresupuesto {
    // cuando genera el apus hacemo uso de la clas
    // para generar el resumen de presupuesto
    // en la misma hoja donde se guenera el apus
    private List<List<String>> cabeceraTitulo;
    
    private int codigo;
    private String rubro;
    private String unidad;
    private int cantidad; // la escribo yo
    private String preUnit;
    private String preTotM;

    public EsquemaPresupuesto() {
    }

    public EsquemaPresupuesto(List<List<String>> cabeceraTitulo, int codigo, String rubro, String unidad, int cantidad, String preUnit, String preTotM) {
        this.cabeceraTitulo = cabeceraTitulo;
        this.codigo = codigo;
        this.rubro = rubro;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.preUnit = preUnit;
        this.preTotM = preTotM;
    }

    public List<List<String>> getCabeceraTitulo() {
        return cabeceraTitulo;
    }

    public void setCabeceraTitulo(List<List<String>> cabeceraTitulo) {
        this.cabeceraTitulo = cabeceraTitulo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getPreUnit() {
        return preUnit;
    }

    public void setPreUnit(String preUnit) {
        this.preUnit = preUnit;
    }

    public String getPreTotM() {
        return preTotM;
    }

    public void setPreTotM(String preTotM) {
        this.preTotM = preTotM;
    }

    @Override
    public String toString() {
        return "EsquemaPresupuesto{" + "cabeceraTitulo=" + cabeceraTitulo + ", codigo=" + codigo + ", rubro=" + rubro + ", unidad=" + unidad + ", cantidad=" + cantidad + ", preUnit=" + preUnit + ", preTotM=" + preTotM + '}';
    }
    
    
}
