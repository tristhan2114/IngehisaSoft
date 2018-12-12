/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingehisasoft;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import vista.home;

/**
 *
 * @author personal
 */
public class IngehisaSoft {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new home().setVisible(true);
        
        
        /*
        double n1 = 12.257767;
        double n2 = 12.236555;
        String squema[] = {"#.###","#.####"};
        DecimalFormat df = new DecimalFormat(squema[0]);
        df.setRoundingMode(RoundingMode.CEILING);
         double cost = (double) Math.round((3256.3236566) * 100d) / 100d; // original 2 decimales
         System.out.println("R.MathRound "+cost);
        //double cost = (double) Math.round((n1 * n2) * 100d) / 100d; // solo 2 decimales
        //double cost = n1 * n2;
        for (Number n : Arrays.asList(12,3256.3236566)){
            Double d = n.doubleValue();
            System.out.println("R.For "+df.format(d));
        }*/
        //System.out.println("R. "+df.format(cost));
        //System.out.println("parseDou "+Double.parseDouble(df.format(cost)));
    }
    
}
