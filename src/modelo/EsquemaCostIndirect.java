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
public class EsquemaCostIndirect {
    
    private String costIndirecto;
    private String porcent;
    
    private List<List<String>> tblGT = new ArrayList<>();
    private List<List<String>> tblPS = new ArrayList<>();
    private List<List<String>> tblCS = new ArrayList<>();
    private List<List<String>> tblCa = new ArrayList<>();
    private List<List<String>> tblSe = new ArrayList<>();
    
    private String totSubtotal;
    private String totParcial;
    private String totPorcentaje;
    
    private String indirect;
    private String imprevist;
    private String utilidad;
    private String total;

    public EsquemaCostIndirect() {
    }

    public EsquemaCostIndirect(String costIndirecto, String porcent, String totSubtotal, String totParcial, String totPorcentaje, String indirect, String imprevist, String utilidad, String total) {
        this.costIndirecto = costIndirecto;
        this.porcent = porcent;
        this.totSubtotal = totSubtotal;
        this.totParcial = totParcial;
        this.totPorcentaje = totPorcentaje;
        this.indirect = indirect;
        this.imprevist = imprevist;
        this.utilidad = utilidad;
        this.total = total;
    }

    public String getCostIndirecto() {
        return costIndirecto;
    }

    public void setCostIndirecto(String costIndirecto) {
        this.costIndirecto = costIndirecto;
    }

    public String getPorcent() {
        return porcent;
    }

    public void setPorcent(String porcent) {
        this.porcent = porcent;
    }

    public List<List<String>> getTblGT() {
        return tblGT;
    }

    public void setTblGT(List<List<String>> tblGT) {
        this.tblGT = tblGT;
    }

    public List<List<String>> getTblPS() {
        return tblPS;
    }

    public void setTblPS(List<List<String>> tblPS) {
        this.tblPS = tblPS;
    }

    public List<List<String>> getTblCS() {
        return tblCS;
    }

    public void setTblCS(List<List<String>> tblCS) {
        this.tblCS = tblCS;
    }

    public List<List<String>> getTblCa() {
        return tblCa;
    }

    public void setTblCa(List<List<String>> tblCa) {
        this.tblCa = tblCa;
    }

    public List<List<String>> getTblSe() {
        return tblSe;
    }

    public void setTblSe(List<List<String>> tblSe) {
        this.tblSe = tblSe;
    }

    public String getTotSubtotal() {
        return totSubtotal;
    }

    public void setTotSubtotal(String totSubtotal) {
        this.totSubtotal = totSubtotal;
    }

    public String getTotParcial() {
        return totParcial;
    }

    public void setTotParcial(String totParcial) {
        this.totParcial = totParcial;
    }

    public String getTotPorcentaje() {
        return totPorcentaje;
    }

    public void setTotPorcentaje(String totPorcentaje) {
        this.totPorcentaje = totPorcentaje;
    }

    public String getIndirect() {
        return indirect;
    }

    public void setIndirect(String indirect) {
        this.indirect = indirect;
    }

    public String getImprevist() {
        return imprevist;
    }

    public void setImprevist(String imprevist) {
        this.imprevist = imprevist;
    }

    public String getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(String utilidad) {
        this.utilidad = utilidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "EsquemaCostIndirect{" + "costIndirecto=" + costIndirecto + ", porcent=" + porcent + ", tblGT=" + tblGT + ", tblPS=" + tblPS + ", tblCS=" + tblCS + ", tblCa=" + tblCa + ", tblSe=" + tblSe + ", totSubtotal=" + totSubtotal + ", totParcial=" + totParcial + ", totPorcentaje=" + totPorcentaje + ", indirect=" + indirect + ", imprevist=" + imprevist + ", utilidad=" + utilidad + ", total=" + total + '}';
    }
        
}
