/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.lang.reflect.Type;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import static vista.FrmApus.panel1;
import static vista.FrmApus.panel10;
import static vista.FrmApus.panel100;
import static vista.FrmApus.panel101;
import static vista.FrmApus.panel102;
import static vista.FrmApus.panel103;
import static vista.FrmApus.panel104;
import static vista.FrmApus.panel105;
import static vista.FrmApus.panel106;
import static vista.FrmApus.panel107;
import static vista.FrmApus.panel108;
import static vista.FrmApus.panel109;
import static vista.FrmApus.panel11;
import static vista.FrmApus.panel110;
import static vista.FrmApus.panel111;
import static vista.FrmApus.panel112;
import static vista.FrmApus.panel113;
import static vista.FrmApus.panel114;
import static vista.FrmApus.panel115;
import static vista.FrmApus.panel116;
import static vista.FrmApus.panel117;
import static vista.FrmApus.panel118;
import static vista.FrmApus.panel119;
import static vista.FrmApus.panel12;
import static vista.FrmApus.panel120;
import static vista.FrmApus.panel121;
import static vista.FrmApus.panel122;
import static vista.FrmApus.panel123;
import static vista.FrmApus.panel124;
import static vista.FrmApus.panel125;
import static vista.FrmApus.panel126;
import static vista.FrmApus.panel127;
import static vista.FrmApus.panel128;
import static vista.FrmApus.panel129;
import static vista.FrmApus.panel13;
import static vista.FrmApus.panel130;
import static vista.FrmApus.panel131;
import static vista.FrmApus.panel132;
import static vista.FrmApus.panel133;
import static vista.FrmApus.panel134;
import static vista.FrmApus.panel135;
import static vista.FrmApus.panel136;
import static vista.FrmApus.panel137;
import static vista.FrmApus.panel138;
import static vista.FrmApus.panel139;
import static vista.FrmApus.panel14;
import static vista.FrmApus.panel140;
import static vista.FrmApus.panel141;
import static vista.FrmApus.panel142;
import static vista.FrmApus.panel143;
import static vista.FrmApus.panel144;
import static vista.FrmApus.panel145;
import static vista.FrmApus.panel146;
import static vista.FrmApus.panel147;
import static vista.FrmApus.panel148;
import static vista.FrmApus.panel149;
import static vista.FrmApus.panel15;
import static vista.FrmApus.panel150;
import static vista.FrmApus.panel151;
import static vista.FrmApus.panel152;
import static vista.FrmApus.panel153;
import static vista.FrmApus.panel154;
import static vista.FrmApus.panel155;
import static vista.FrmApus.panel156;
import static vista.FrmApus.panel157;
import static vista.FrmApus.panel158;
import static vista.FrmApus.panel159;
import static vista.FrmApus.panel16;
import static vista.FrmApus.panel160;
import static vista.FrmApus.panel161;
import static vista.FrmApus.panel162;
import static vista.FrmApus.panel163;
import static vista.FrmApus.panel164;
import static vista.FrmApus.panel165;
import static vista.FrmApus.panel166;
import static vista.FrmApus.panel167;
import static vista.FrmApus.panel168;
import static vista.FrmApus.panel169;
import static vista.FrmApus.panel17;
import static vista.FrmApus.panel170;
import static vista.FrmApus.panel171;
import static vista.FrmApus.panel172;
import static vista.FrmApus.panel173;
import static vista.FrmApus.panel174;
import static vista.FrmApus.panel175;
import static vista.FrmApus.panel176;
import static vista.FrmApus.panel177;
import static vista.FrmApus.panel178;
import static vista.FrmApus.panel179;
import static vista.FrmApus.panel18;
import static vista.FrmApus.panel180;
import static vista.FrmApus.panel181;
import static vista.FrmApus.panel182;
import static vista.FrmApus.panel183;
import static vista.FrmApus.panel184;
import static vista.FrmApus.panel185;
import static vista.FrmApus.panel186;
import static vista.FrmApus.panel187;
import static vista.FrmApus.panel188;
import static vista.FrmApus.panel189;
import static vista.FrmApus.panel19;
import static vista.FrmApus.panel190;
import static vista.FrmApus.panel191;
import static vista.FrmApus.panel192;
import static vista.FrmApus.panel193;
import static vista.FrmApus.panel194;
import static vista.FrmApus.panel195;
import static vista.FrmApus.panel196;
import static vista.FrmApus.panel197;
import static vista.FrmApus.panel198;
import static vista.FrmApus.panel199;
import static vista.FrmApus.panel2;
import static vista.FrmApus.panel20;
import static vista.FrmApus.panel200;
import static vista.FrmApus.panel21;
import static vista.FrmApus.panel22;
import static vista.FrmApus.panel23;
import static vista.FrmApus.panel24;
import static vista.FrmApus.panel25;
import static vista.FrmApus.panel26;
import static vista.FrmApus.panel27;
import static vista.FrmApus.panel28;
import static vista.FrmApus.panel29;
import static vista.FrmApus.panel3;
import static vista.FrmApus.panel30;
import static vista.FrmApus.panel31;
import static vista.FrmApus.panel32;
import static vista.FrmApus.panel33;
import static vista.FrmApus.panel34;
import static vista.FrmApus.panel35;
import static vista.FrmApus.panel36;
import static vista.FrmApus.panel37;
import static vista.FrmApus.panel38;
import static vista.FrmApus.panel39;
import static vista.FrmApus.panel4;
import static vista.FrmApus.panel40;
import static vista.FrmApus.panel41;
import static vista.FrmApus.panel42;
import static vista.FrmApus.panel43;
import static vista.FrmApus.panel44;
import static vista.FrmApus.panel45;
import static vista.FrmApus.panel46;
import static vista.FrmApus.panel47;
import static vista.FrmApus.panel48;
import static vista.FrmApus.panel49;
import static vista.FrmApus.panel5;
import static vista.FrmApus.panel50;
import static vista.FrmApus.panel51;
import static vista.FrmApus.panel52;
import static vista.FrmApus.panel53;
import static vista.FrmApus.panel54;
import static vista.FrmApus.panel55;
import static vista.FrmApus.panel56;
import static vista.FrmApus.panel57;
import static vista.FrmApus.panel58;
import static vista.FrmApus.panel59;
import static vista.FrmApus.panel6;
import static vista.FrmApus.panel60;
import static vista.FrmApus.panel61;
import static vista.FrmApus.panel62;
import static vista.FrmApus.panel63;
import static vista.FrmApus.panel64;
import static vista.FrmApus.panel65;
import static vista.FrmApus.panel66;
import static vista.FrmApus.panel67;
import static vista.FrmApus.panel68;
import static vista.FrmApus.panel69;
import static vista.FrmApus.panel7;
import static vista.FrmApus.panel70;
import static vista.FrmApus.panel71;
import static vista.FrmApus.panel72;
import static vista.FrmApus.panel73;
import static vista.FrmApus.panel74;
import static vista.FrmApus.panel75;
import static vista.FrmApus.panel76;
import static vista.FrmApus.panel77;
import static vista.FrmApus.panel78;
import static vista.FrmApus.panel79;
import static vista.FrmApus.panel8;
import static vista.FrmApus.panel80;
import static vista.FrmApus.panel81;
import static vista.FrmApus.panel82;
import static vista.FrmApus.panel83;
import static vista.FrmApus.panel84;
import static vista.FrmApus.panel85;
import static vista.FrmApus.panel86;
import static vista.FrmApus.panel87;
import static vista.FrmApus.panel88;
import static vista.FrmApus.panel89;
import static vista.FrmApus.panel9;
import static vista.FrmApus.panel90;
import static vista.FrmApus.panel91;
import static vista.FrmApus.panel92;
import static vista.FrmApus.panel93;
import static vista.FrmApus.panel94;
import static vista.FrmApus.panel95;
import static vista.FrmApus.panel96;
import static vista.FrmApus.panel97;
import static vista.FrmApus.panel98;
import static vista.FrmApus.panel99;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import modelo.Apus;
import modelo.FormatoApus;
import vista.FrmApus;
import static vista.FrmApus.i;
import static vista.FrmApus.jLabel2;
import static vista.FrmApus.panel1;
import vistaPanelApus.panelApus;

/**
 *
 * @author Jonathan
 */
public class gestionImportApusBD {

    public gestionImportApusBD() {
        allPaneles();
    }

    private GridBagConstraints c = null;
    private GridBagLayout layout = null;
    private panelApus ap = null;

    public void importarDtos(List<Apus> aux) {
        Gson gson = new Gson();
        Type tipoObjeto = new TypeToken<List<FormatoApus>>() {
        }.getType();
        ArrayList<FormatoApus> dto = gson.fromJson(convertString(aux), tipoObjeto);
        //System.out.println("nJSON A JAVA");
        for (int ii = 0; ii < dto.size(); ii++) {
            jLabel2.setText("Cantidad de Apus: " + (ii + 1));
            layout = new GridBagLayout();
            ap = new panelApus();

            // convert
            FormatoApus Fapus = dto.get(ii);
            //System.out.println(Fapus.getEmpresa());

            // voy al panel
            JPanel pl = listPaneles.get(ii);
            //System.out.println("JPanel "+listPaneles.get(i));
            pl.setLayout(layout);
            c = new GridBagConstraints();
            c.gridx = 0;
            c.gridy = 0;

            llenarPanels(ap, Fapus);

            pl.setVisible(true);
            pl.add(ap, c);
            
            FrmApus.listPanelesAux.add(panel1);
            
            //gestionApusPaneles.listPaneles.add(pl);
            //gestionApusPaneles ionPApus = new gestionApusPaneles();
            //FrmApus.addAPUS(ap, ionPApus, acum);
            FrmApus.i ++;
        }
        
        
    }

    private String convertString(List<Apus> aux) {
        String listAux = "";
        for (Apus apus : aux) {
            listAux = apus.getDatosApus();
        }
        return listAux;
    }

    /// paneles
    public static List<JPanel> listPaneles = new ArrayList<>();
    
    
    public void allPaneles() {
        listPaneles.add(panel1);
        listPaneles.add(panel2);
        listPaneles.add(panel3);
        listPaneles.add(panel4);
        listPaneles.add(panel5);
        listPaneles.add(panel6);
        listPaneles.add(panel7);
        listPaneles.add(panel8);
        listPaneles.add(panel9);
        listPaneles.add(panel10);

        listPaneles.add(panel11);
        listPaneles.add(panel12);
        listPaneles.add(panel13);
        listPaneles.add(panel14);
        listPaneles.add(panel15);
        listPaneles.add(panel16);
        listPaneles.add(panel17);
        listPaneles.add(panel18);
        listPaneles.add(panel19);
        listPaneles.add(panel20);

        listPaneles.add(panel21);
        listPaneles.add(panel22);
        listPaneles.add(panel23);
        listPaneles.add(panel24);
        listPaneles.add(panel25);
        listPaneles.add(panel26);
        listPaneles.add(panel27);
        listPaneles.add(panel28);
        listPaneles.add(panel29);
        listPaneles.add(panel30);

        listPaneles.add(panel31);
        listPaneles.add(panel32);
        listPaneles.add(panel33);
        listPaneles.add(panel34);
        listPaneles.add(panel35);
        listPaneles.add(panel36);
        listPaneles.add(panel37);
        listPaneles.add(panel38);
        listPaneles.add(panel39);
        listPaneles.add(panel40);

        listPaneles.add(panel41);
        listPaneles.add(panel42);
        listPaneles.add(panel43);
        listPaneles.add(panel44);
        listPaneles.add(panel45);
        listPaneles.add(panel46);
        listPaneles.add(panel47);
        listPaneles.add(panel48);
        listPaneles.add(panel49);
        listPaneles.add(panel50);

        listPaneles.add(panel51);
        listPaneles.add(panel52);
        listPaneles.add(panel53);
        listPaneles.add(panel54);
        listPaneles.add(panel55);
        listPaneles.add(panel56);
        listPaneles.add(panel57);
        listPaneles.add(panel58);
        listPaneles.add(panel59);
        listPaneles.add(panel60);

        listPaneles.add(panel61);
        listPaneles.add(panel62);
        listPaneles.add(panel63);
        listPaneles.add(panel64);
        listPaneles.add(panel65);
        listPaneles.add(panel66);
        listPaneles.add(panel67);
        listPaneles.add(panel68);
        listPaneles.add(panel69);
        listPaneles.add(panel70);

        listPaneles.add(panel71);
        listPaneles.add(panel72);
        listPaneles.add(panel73);
        listPaneles.add(panel74);
        listPaneles.add(panel75);
        listPaneles.add(panel76);
        listPaneles.add(panel77);
        listPaneles.add(panel78);
        listPaneles.add(panel79);
        listPaneles.add(panel80);

        listPaneles.add(panel81);
        listPaneles.add(panel82);
        listPaneles.add(panel83);
        listPaneles.add(panel84);
        listPaneles.add(panel85);
        listPaneles.add(panel86);
        listPaneles.add(panel87);
        listPaneles.add(panel88);
        listPaneles.add(panel89);
        listPaneles.add(panel90);

        listPaneles.add(panel91);
        listPaneles.add(panel92);
        listPaneles.add(panel93);
        listPaneles.add(panel94);
        listPaneles.add(panel95);
        listPaneles.add(panel96);
        listPaneles.add(panel97);
        listPaneles.add(panel98);
        listPaneles.add(panel99);
        listPaneles.add(panel100);

        ///////////////////////////////////////////////////
        listPaneles.add(panel101);
        listPaneles.add(panel102);
        listPaneles.add(panel103);
        listPaneles.add(panel104);
        listPaneles.add(panel105);
        listPaneles.add(panel106);
        listPaneles.add(panel107);
        listPaneles.add(panel108);
        listPaneles.add(panel109);
        listPaneles.add(panel110);

        listPaneles.add(panel111);
        listPaneles.add(panel112);
        listPaneles.add(panel113);
        listPaneles.add(panel114);
        listPaneles.add(panel115);
        listPaneles.add(panel116);
        listPaneles.add(panel117);
        listPaneles.add(panel118);
        listPaneles.add(panel119);
        listPaneles.add(panel120);

        listPaneles.add(panel121);
        listPaneles.add(panel122);
        listPaneles.add(panel123);
        listPaneles.add(panel124);
        listPaneles.add(panel125);
        listPaneles.add(panel126);
        listPaneles.add(panel127);
        listPaneles.add(panel128);
        listPaneles.add(panel129);
        listPaneles.add(panel130);

        listPaneles.add(panel131);
        listPaneles.add(panel132);
        listPaneles.add(panel133);
        listPaneles.add(panel134);
        listPaneles.add(panel135);
        listPaneles.add(panel136);
        listPaneles.add(panel137);
        listPaneles.add(panel138);
        listPaneles.add(panel139);
        listPaneles.add(panel140);

        listPaneles.add(panel141);
        listPaneles.add(panel142);
        listPaneles.add(panel143);
        listPaneles.add(panel144);
        listPaneles.add(panel145);
        listPaneles.add(panel146);
        listPaneles.add(panel147);
        listPaneles.add(panel148);
        listPaneles.add(panel149);
        listPaneles.add(panel150);

        listPaneles.add(panel151);
        listPaneles.add(panel152);
        listPaneles.add(panel153);
        listPaneles.add(panel154);
        listPaneles.add(panel155);
        listPaneles.add(panel156);
        listPaneles.add(panel157);
        listPaneles.add(panel158);
        listPaneles.add(panel159);
        listPaneles.add(panel160);

        listPaneles.add(panel161);
        listPaneles.add(panel162);
        listPaneles.add(panel163);
        listPaneles.add(panel164);
        listPaneles.add(panel165);
        listPaneles.add(panel166);
        listPaneles.add(panel167);
        listPaneles.add(panel168);
        listPaneles.add(panel169);
        listPaneles.add(panel170);

        listPaneles.add(panel171);
        listPaneles.add(panel172);
        listPaneles.add(panel173);
        listPaneles.add(panel174);
        listPaneles.add(panel175);
        listPaneles.add(panel176);
        listPaneles.add(panel177);
        listPaneles.add(panel178);
        listPaneles.add(panel179);
        listPaneles.add(panel180);

        listPaneles.add(panel181);
        listPaneles.add(panel182);
        listPaneles.add(panel183);
        listPaneles.add(panel184);
        listPaneles.add(panel185);
        listPaneles.add(panel186);
        listPaneles.add(panel187);
        listPaneles.add(panel188);
        listPaneles.add(panel189);
        listPaneles.add(panel190);

        listPaneles.add(panel191);
        listPaneles.add(panel192);
        listPaneles.add(panel193);
        listPaneles.add(panel194);
        listPaneles.add(panel195);
        listPaneles.add(panel196);
        listPaneles.add(panel197);
        listPaneles.add(panel198);
        listPaneles.add(panel199);
        listPaneles.add(panel200);

    }

    private void llenarPanels(JPanel jp, FormatoApus Fapus) {
        int position = 0;
        for (int y = 0; y < jp.getComponentCount(); y++) {
            if (jp.getComponent(y) instanceof JTextField) {
                JTextField textField = (JTextField) jp.getComponent(y);
                switch (position) {
                    case 0:
                        textField.setText(Fapus.getEmpresa());
                        break;
                    case 1:
                        textField.setText(Fapus.getProyecto());
                        break;
                    case 2:
                        textField.setText(Fapus.getAnalisis());
                        break;
                    case 3:
                        textField.setText(Fapus.getRubro());
                        break;
                    case 4:
                        textField.setText(Fapus.getUnidad());
                        break;
                    case 5:
                        textField.setText(Fapus.getDetalle());
                        break;
                    case 9:
                        textField.setText(Fapus.getTxtSubtEquipo());
                        break;
                    case 12:
                        textField.setText(Fapus.getTxtSubtManObra());
                        break;
                    case 15:
                        textField.setText(Fapus.getTxtSubtMateriales());
                        break;
                    case 17:
                        textField.setText(Fapus.getTxtSubtTransport());
                        break;
                    case 18:
                        textField.setText(Fapus.getCostDirecto());
                        break;
                    case 19:
                        textField.setText(Fapus.getnIngrUtil());
                        break;
                    case 20:
                        textField.setText(Fapus.getrIngrUtil());
                        break;
                    case 21:
                        textField.setText(Fapus.getnOthUtil());
                        break;
                    case 22:
                        textField.setText(Fapus.getrOthUtil());
                        break;
                    case 23:
                        textField.setText(Fapus.getCostTotRubro());
                        break;
                    case 24:
                        textField.setText(Fapus.getValorOfert());
                        break;
                    default:
                        break;
                }
                position++;
                // }
            }

            // jtable datos
            if (jp.getComponent(y) instanceof JScrollPane) {
                JScrollPane Scrolllaux = (JScrollPane) jp.getComponent(y);
                //System.out.println("JScrollPane encontr n " + Scrolllaux.getComponentCount());
                int sizeScroll = Scrolllaux.getComponentCount();
                for (int w = 0; w < sizeScroll; ++w) {
                    //  System.out.println("table dentro encontr");
                    // encontre javax.swing.JViewport
                    if (Scrolllaux.getComponent(w) instanceof JViewport) {
                        JViewport vp = (JViewport) Scrolllaux.getComponent(w);
                        int sizeViewport = vp.getComponentCount();
                        //System.out.println("vieportLL " + sizeViewport);
                        if (vp.getComponent(0) instanceof JTable) {
                            for (int cd = 0; cd < sizeViewport; ++cd) {
                                //DefaultTableModel modelo = (DefaultTableModel) tableE.getModel();
                                JTable table = (JTable) vp.getComponent(cd);
                                int sizeColumnTable = table.getColumnCount();
                                //System.out.println("coolum " + sizeColumnTable);
                                //System.out.println("position TBL "+position);
                                if (sizeColumnTable == 7) {
                                    //System.out.println("table encontr");
                                    //System.out.println("position table  " + (position));
                                    if (position == 7) {
                                        List<List<String>> tbl = Fapus.getTablaEquipo();
                                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                                        for (List<String> list : tbl) {
                                            //Sección 2
                                            Object[] fila = new Object[7];
                                            //Sección 3
                                            fila[0] = list.get(0);
                                            fila[1] = list.get(1);
                                            fila[2] = list.get(2);
                                            fila[3] = list.get(3);
                                            fila[4] = list.get(4);
                                            fila[5] = list.get(5);
                                            fila[6] = list.get(6);
                                            //Sección 4
                                            modelo.addRow(fila);
                                        }
                                        //Sección 5
                                        table.setModel(modelo);

                                    } else if (position == 10) { // new 9
                                        List<List<String>> tbl = Fapus.getTablaManObra();
                                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                                        for (List<String> list : tbl) {
                                            //Sección 2
                                            Object[] fila = new Object[7];
                                            //Sección 3
                                            fila[0] = list.get(0);
                                            fila[1] = list.get(1);
                                            fila[2] = list.get(2);
                                            fila[3] = list.get(3);
                                            fila[4] = list.get(4);
                                            fila[5] = list.get(5);
                                            fila[6] = list.get(6);
                                            //Sección 4
                                            modelo.addRow(fila);
                                        }
                                        //Sección 5
                                        table.setModel(modelo);
                                    }else if (position == 16) { // new 9
                                        List<List<String>> tbl = Fapus.getTablaTransport();
                                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                                        for (List<String> list : tbl) {
                                            //Sección 2
                                            Object[] fila = new Object[6];
                                            //Sección 3
                                            fila[0] = list.get(0);
                                            fila[1] = list.get(1);
                                            fila[2] = list.get(2);
                                            fila[3] = list.get(3);
                                            fila[4] = list.get(4);
                                            fila[5] = list.get(5);
                                            //Sección 4
                                            modelo.addRow(fila);
                                        }
                                        //Sección 5
                                        table.setModel(modelo);
                                    }
                                    position++;
                                } else {
                                    //System.out.println("position table 5col  " + (position));
                                    if (position == 13) { // new 11
                                        List<List<String>> tbl = Fapus.getTablaMateriales();
                                        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
                                        for (List<String> list : tbl) {
                                            //Sección 2
                                            Object[] fila = new Object[6];
                                            //Sección 3
                                            fila[0] = list.get(0);
                                            fila[1] = list.get(1);
                                            fila[2] = list.get(2);
                                            fila[3] = list.get(3);
                                            fila[4] = list.get(4);
                                            fila[5] = list.get(5);
                                            //Sección 4
                                            modelo.addRow(fila);
                                        }
                                        //Sección 5
                                        table.setModel(modelo);
                                    } 
                                    position++;
                                }
                            }
                        }
                    }
                }// fin jtable
            }// fin buscamos jtable
        }
    }

}
