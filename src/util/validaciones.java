/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author personal
 */
public class validaciones {
    Character s;
    
    
    public double solomoney(String dato) {
        double aux =0.0;
        try {
            aux = Double.parseDouble(dato);
            return aux;
        } catch (Exception e) {
            e.getMessage();
            return aux;
        }
    }
    
    public int soloNumero(String dato) {
        int aux =0;
        try {
            aux = Integer.parseInt(dato);
            return aux;
        } catch (Exception e) {
            e.getMessage();
            return aux;
        }
        
    }
    
}
