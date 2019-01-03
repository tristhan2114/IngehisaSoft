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
public class EsquemaPresupuestoManualTabla {

    private String numeracion;
    private String descripcion;
    private String unidad;
    private String cantidad;
    private String preUnit;
    private String preTot;

    public EsquemaPresupuestoManualTabla() {
    }

    public EsquemaPresupuestoManualTabla(String numeracion, String descripcion, String unidad,
            String cantidad, String preUnit, String preTot) {
        this.numeracion = numeracion;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.preUnit = preUnit;
        this.preTot = preTot;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPreUnit() {
        return preUnit;
    }

    public void setPreUnit(String preUnit) {
        this.preUnit = preUnit;
    }

    public String getPreTot() {
        return preTot;
    }

    public void setPreTot(String preTot) {
        this.preTot = preTot;
    }

    @Override
    public String toString() {
        return "listTbl{" + "numeracion=" + numeracion + ", descripcion=" + descripcion + ", unidad=" + unidad + ", cantidad=" + cantidad + ", preUnit=" + preUnit + ", preTot=" + preTot + '}';
    }

}
