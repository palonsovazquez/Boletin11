/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar tiempoInicio = Calendar.getInstance(), tiempoFin ;
        long tiempo ;
        
       String text = JOptionPane.showInputDialog(" Escriba esta frase\n \" A documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática .\"");
       tiempoFin = Calendar.getInstance();
       tiempo = tiempoFin.getTimeInMillis() - tiempoInicio.getTimeInMillis();
       
       
       
       
       JOptionPane.showConfirmDialog(null,("has tardado = "+ tiempo/1000+ " segundos"),"titulo",JOptionPane.OK_OPTION);
       
    }
    
}
