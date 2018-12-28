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
public class Transporte {
    private int id;
    private String descripcion;
    private String unidad;
    private int cantidad;
    private double tarifa;
    private double costUnit;

    public Transporte() {
    }

    public Transporte(int id, String descripcion, String unidad, int cantidad, double tarifa, double costUnit) {
        this.id = id;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.cantidad = cantidad;
        this.tarifa = tarifa;
        this.costUnit = costUnit;
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

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(double costUnit) {
        this.costUnit = costUnit;
    }

    @Override
    public String toString() {
        return "Transporte{" + "id=" + id + ", descripcion=" + descripcion + ", unidad=" + unidad + ", cantidad=" + cantidad + ", tarifa=" + tarifa + ", costUnit=" + costUnit + '}';
    }

        
}
