/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import util.conexion;

/**
 * @author personal1
 */
public class loginController {
    //                                                1 si; 2 no o default
    // id, nombres, apellidos, username, contrasenia, responsable
    //character var                          text     interger 

    private conexion cn = null;

    public String[] validar_ingreso(String usuario, String clave) {
        String[] resultado = new String[3];
        String SSQL = "SELECT * FROM usuarios WHERE username= '" + usuario + "' AND contrasenia= '" + clave + "'";
        try {
            cn = new conexion();
            Statement stm = cn.conn().createStatement();
            ResultSet rs = stm.executeQuery(SSQL);

            if (rs.next()) {
                resultado[0] = "1";
                resultado[1] = rs.getString(2);
                resultado[2] = rs.getString(3);
            } else {
                resultado[0] = "2";
                resultado[1] = rs.getString(2);
                resultado[2] = rs.getString(3);
            }

            rs.close();
            stm.close();
            cn.close();

        } catch (Exception ex) {
            ex.getMessage();
        }
        return resultado;
    }

}