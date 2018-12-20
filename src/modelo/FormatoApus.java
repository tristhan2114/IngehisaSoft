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
public class FormatoApus {

    private String empresa; // 0
    private String proyecto; // 1
    private String analisis; // 2
    private String rubro; // 3
    private String unidad; // 4
    private String detalle; // 5

    private String txtIdEquipo; // 6
    private List<List<String>> tablaEquipo = new ArrayList<>(); // 7
    private String txtIdManObr; // 8
    private String txtSubtEquipo; // 9

    private List<List<String>> tablaManObra = new ArrayList<>(); // 10
    private String txtIdMateriales; // 11
    private String txtSubtManObra; // 12

    private List<List<String>> tablaMateriales = new ArrayList<>(); // 13
    private String txtIdTransport; // 14
    private String txtSubtMateriales; // 15

    private List<List<String>> tablaTransport = new ArrayList<>(); // 16
    private String txtSubtTransport; // 17
    
    
   private String costDirecto; // 18
   private String costTotRubro; // 19
   private String valorOfert; // 20
   // valores que ingreso n= ingreso en txt
   private String nIngrUtil; // 21
   private String nOthUtil; // 22
   // valor que devuelte de haber ingresado r
   private String rIngrUtil; // 23
   private String rOthUtil; // 24

    public FormatoApus() {
    }

    public FormatoApus(String empresa, String proyecto, String analisis, String rubro, String unidad, 
            String detalle, String txtIdEquipo, List<List<String>> tablaEquipo, String txtIdManObr, String txtSubtEquipo, 
            List<List<String>> tablaManObra, String txtIdMateriales, String txtSubtManObra, List<List<String>> tablaMateriales, 
            String txtIdTransport, String txtSubtMateriales, List<List<String>> tablaTransport, String txtSubtTransport, 
            String costDirecto, String costTotRubro, String valorOfert, String nIngrUtil, String nOthUtil, String rIngrUtil, String rOthUtil) {
        this.empresa = empresa;
        this.proyecto = proyecto;
        this.analisis = analisis;
        this.rubro = rubro;
        this.unidad = unidad;
        this.detalle = detalle;
        this.txtIdEquipo = txtIdEquipo;
        this.tablaEquipo = tablaEquipo;
        this.txtIdManObr = txtIdManObr;
        this.txtSubtEquipo = txtSubtEquipo;
        this.tablaManObra = tablaManObra;
        this.txtIdMateriales = txtIdMateriales;
        this.txtSubtManObra = txtSubtManObra;
        this.tablaMateriales = tablaMateriales;
        this.txtIdTransport = txtIdTransport;
        this.txtSubtMateriales = txtSubtMateriales;
        this.tablaTransport = tablaTransport;
        this.txtSubtTransport = txtSubtTransport;
        this.costDirecto = costDirecto;
        this.costTotRubro = costTotRubro;
        this.valorOfert = valorOfert;
        this.nIngrUtil = nIngrUtil;
        this.nOthUtil = nOthUtil;
        this.rIngrUtil = rIngrUtil;
        this.rOthUtil = rOthUtil;
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

    public String getAnalisis() {
        return analisis;
    }

    public void setAnalisis(String analisis) {
        this.analisis = analisis;
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getTxtIdEquipo() {
        return txtIdEquipo;
    }

    public void setTxtIdEquipo(String txtIdEquipo) {
        this.txtIdEquipo = txtIdEquipo;
    }

    public List<List<String>> getTablaEquipo() {
        return tablaEquipo;
    }

    public void setTablaEquipo(List<List<String>> tablaEquipo) {
        this.tablaEquipo = tablaEquipo;
    }

    public String getTxtIdManObr() {
        return txtIdManObr;
    }

    public void setTxtIdManObr(String txtIdManObr) {
        this.txtIdManObr = txtIdManObr;
    }

    public String getTxtSubtEquipo() {
        return txtSubtEquipo;
    }

    public void setTxtSubtEquipo(String txtSubtEquipo) {
        this.txtSubtEquipo = txtSubtEquipo;
    }

    public List<List<String>> getTablaManObra() {
        return tablaManObra;
    }

    public void setTablaManObra(List<List<String>> tablaManObra) {
        this.tablaManObra = tablaManObra;
    }

    public String getTxtIdMateriales() {
        return txtIdMateriales;
    }

    public void setTxtIdMateriales(String txtIdMateriales) {
        this.txtIdMateriales = txtIdMateriales;
    }

    public String getTxtSubtManObra() {
        return txtSubtManObra;
    }

    public void setTxtSubtManObra(String txtSubtManObra) {
        this.txtSubtManObra = txtSubtManObra;
    }

    public List<List<String>> getTablaMateriales() {
        return tablaMateriales;
    }

    public void setTablaMateriales(List<List<String>> tablaMateriales) {
        this.tablaMateriales = tablaMateriales;
    }

    public String getTxtIdTransport() {
        return txtIdTransport;
    }

    public void setTxtIdTransport(String txtIdTransport) {
        this.txtIdTransport = txtIdTransport;
    }

    public String getTxtSubtMateriales() {
        return txtSubtMateriales;
    }

    public void setTxtSubtMateriales(String txtSubtMateriales) {
        this.txtSubtMateriales = txtSubtMateriales;
    }

    public List<List<String>> getTablaTransport() {
        return tablaTransport;
    }

    public void setTablaTransport(List<List<String>> tablaTransport) {
        this.tablaTransport = tablaTransport;
    }

    public String getTxtSubtTransport() {
        return txtSubtTransport;
    }

    public void setTxtSubtTransport(String txtSubtTransport) {
        this.txtSubtTransport = txtSubtTransport;
    }

    public String getCostDirecto() {
        return costDirecto;
    }

    public void setCostDirecto(String costDirecto) {
        this.costDirecto = costDirecto;
    }

    public String getCostTotRubro() {
        return costTotRubro;
    }

    public void setCostTotRubro(String costTotRubro) {
        this.costTotRubro = costTotRubro;
    }

    public String getValorOfert() {
        return valorOfert;
    }

    public void setValorOfert(String valorOfert) {
        this.valorOfert = valorOfert;
    }

    public String getnIngrUtil() {
        return nIngrUtil;
    }

    public void setnIngrUtil(String nIngrUtil) {
        this.nIngrUtil = nIngrUtil;
    }

    public String getnOthUtil() {
        return nOthUtil;
    }

    public void setnOthUtil(String nOthUtil) {
        this.nOthUtil = nOthUtil;
    }

    public String getrIngrUtil() {
        return rIngrUtil;
    }

    public void setrIngrUtil(String rIngrUtil) {
        this.rIngrUtil = rIngrUtil;
    }

    public String getrOthUtil() {
        return rOthUtil;
    }

    public void setrOthUtil(String rOthUtil) {
        this.rOthUtil = rOthUtil;
    }

    @Override
    public String toString() {
        return "FormatoApus{" + "empresa=" + empresa + ", proyecto=" + proyecto + ", analisis=" + analisis + ", rubro=" + rubro + ", unidad=" + unidad + ", detalle=" + detalle + ", txtIdEquipo=" + txtIdEquipo + ", tablaEquipo=" + tablaEquipo + ", txtIdManObr=" + txtIdManObr + ", txtSubtEquipo=" + txtSubtEquipo + ", tablaManObra=" + tablaManObra + ", txtIdMateriales=" + txtIdMateriales + ", txtSubtManObra=" + txtSubtManObra + ", tablaMateriales=" + tablaMateriales + ", txtIdTransport=" + txtIdTransport + ", txtSubtMateriales=" + txtSubtMateriales + ", tablaTransport=" + tablaTransport + ", txtSubtTransport=" + txtSubtTransport + ", costDirecto=" + costDirecto + ", costTotRubro=" + costTotRubro + ", valorOfert=" + valorOfert + ", nIngrUtil=" + nIngrUtil + ", nOthUtil=" + nOthUtil + ", rIngrUtil=" + rIngrUtil + ", rOthUtil=" + rOthUtil + '}';
    }
   

}
