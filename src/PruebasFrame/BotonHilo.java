/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasFrame;

//import PruebasFrame.CajeroPrincipal;
//import java.util.logging.Level;
//import PruebasFrame.CajeroPrincipal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Mariam
 */
public class BotonHilo extends Thread {

    private JButton btnDepositar;
    private JButton btnAceptar;

    public BotonHilo(JButton btnDepositar) {
        this.btnDepositar = btnDepositar;
    }

    public void run() {
        btnDepositar.setEnabled(true);
        for (int i = 0; i < 5; i++) {
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BotonHilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        btnDepositar.setEnabled(false);
        CajeroPrincipal.btnAceptar.setEnabled(true);
           
        
    }

}
