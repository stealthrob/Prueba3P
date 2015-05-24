/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebagit;

import javax.swing.JOptionPane;

/**
 *
 * @author Mariam
 */
public class Leer {
    public static int leerEntero(String cad) {
        int n = 0;
        boolean band;
        do {
            try {
                n = Integer.parseInt(JOptionPane.showInputDialog(cad));
                band = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo números enteros");
                band = false;
            }
        } while (band == false);

        return n;
    }

    
    public static float leerFlotante(String cad) {
        float n = 0;
        boolean band;
        do {
            try {
                n = Float.parseFloat(JOptionPane.showInputDialog(cad));
                band = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo números enteros");
                band = false;
            }
        } while (band == false);

        return n;
    }

    public static byte leerByte(String cad) {
        byte n = 0;
        boolean band;
        do {
            try {
                n = Byte.parseByte(JOptionPane.showInputDialog(cad));
                band = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo números enteros");
                band = false;
            }
        } while (band == false);

        return n;
    }
    
    public static short leerShort(String cad) {
        short n = 0;
        boolean band;
        do {
            try {
                n = Short.parseShort(JOptionPane.showInputDialog(cad));
                band = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Solo números short");
                band = false;
            }
        } while (band == false);

        return n;
    }

    public static String leerCadena(String cad) {
        String n = JOptionPane.showInputDialog(cad);
        return n;
    }
    
    public static void MostrarMensaje(String cad) {
        JOptionPane.showMessageDialog(null, cad);        
    }
    
}
