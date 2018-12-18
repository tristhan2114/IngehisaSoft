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

    private String campo1;
    private String campo2;
    private String campo3;
    
    private String oferta;
    private String fecha;
    
    private List<tableDts>listTbl = new ArrayList<>();
    
    private String subtotal;
    private String iva;
    private String subtotalIva;
    private String total;

    private List<String[]> nota;

    public EsquemaPresupuestoManual() {
    }

    public EsquemaPresupuestoManual(String campo1, String campo2, String campo3, String oferta, String fecha, String subtotal, String iva, String subtotalIva, String total, List<String[]> nota) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.oferta = oferta;
        this.fecha = fecha;
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

    public List<tableDts> getListTbl() {
        return listTbl;
    }

    public void setListTbl(List<tableDts> listTbl) {
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

    public List<String[]> getNota() {
        return nota;
    }

    public void setNota(List<String[]> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "EsquemaPresupuestoManual{" + "campo1=" + campo1 + ", campo2=" + campo2 + ", campo3=" + campo3 + ", oferta=" + oferta + ", fecha=" + fecha + ", listTbl=" + listTbl + ", subtotal=" + subtotal + ", iva=" + iva + ", subtotalIva=" + subtotalIva + ", total=" + total + ", nota=" + nota + '}';
    }

        
    
    
    // clase que sera lista contenedora de la tabla segun presupuesto / oferta de manera manual   **************************
    public class tableDts {
        private String numeracion;
        private String descripcion;
        private String unidad;
        private String cantidad;
        private String preUnit;
        private String preTot;

        public tableDts() {
        }

        public tableDts(String numeracion, String descripcion, String unidad, 
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
            return "tableDts{" + "numeracion=" + numeracion + ", descripcion=" + descripcion + ", unidad=" + unidad + ", cantidad=" + cantidad + ", preUnit=" + preUnit + ", preTot=" + preTot + '}';
        }
        
        
        
    }

}
