/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author personal1
 */
public class EsquemaPresupuestoManual {

    private String campo1; // proyecto
    private String campo2; // empresa
    private String campo3; // default

    private String oferta;
    private String fecha;

    private List<EsquemaPresupuestoManualTabla> listTbl = new ArrayList<>();

    private String subtotal;
    private String iva;
    private String subtotalIva;
    private String total;

    private List<String> nota = new ArrayList<>();

    public EsquemaPresupuestoManual() {
    }

    public EsquemaPresupuestoManual(String campo1, String campo2, String campo3, String oferta, String fecha, List<EsquemaPresupuestoManualTabla> listTbl, String subtotal, String iva, String subtotalIva, String total, List<String> nota) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.oferta = oferta;
        this.fecha = fecha;
        this.listTbl = listTbl;
        this.subtotal = subtotal;
        this.iva = iva;
        this.subtotalIva = subtotalIva;
        this.total = total;
        this.nota = nota;
    }

    

    public String getCampo1() {
        return campo1;
    }

    public void setCampo1(String campo1) {
        this.campo1 = campo1;
    }

    public String getCampo2() {
        return campo2;
    }

    public void setCampo2(String campo2) {
        this.campo2 = campo2;
    }

    public String getCampo3() {
        return campo3;
    }

    public void setCampo3(String campo3) {
        this.campo3 = campo3;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<EsquemaPresupuestoManualTabla> getListTbl() {
        return listTbl;
    }

    public void setListTbl(List<EsquemaPresupuestoManualTabla> listTbl) {
        this.listTbl = listTbl;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getSubtotalIva() {
        return subtotalIva;
    }

    public void setSubtotalIva(String subtotalIva) {
        this.subtotalIva = subtotalIva;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<String> getNota() {
        return nota;
    }

    public void setNota(List<String> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "EsquemaPresupuestoManual{" + "campo1=" + campo1 + ", campo2=" + campo2 + ", campo3=" + campo3 + ", oferta=" + oferta + ", fecha=" + fecha + ", listTbl=" + listTbl.toString() + ", subtotal=" + subtotal + ", iva=" + iva + ", subtotalIva=" + subtotalIva + ", total=" + total + ", nota=" + nota + '}';
    }

}
