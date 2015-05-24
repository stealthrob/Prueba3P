/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebagit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Mariam
 */
public class Archivos {
    public  void EscribirArchivo(ArrayList <Cuenta> cuentas){
     try {
                       FileOutputStream fo = new FileOutputStream("cuentas.dat");
                       ObjectOutputStream oo = new ObjectOutputStream(fo);
                       oo.writeObject(cuentas);
                       oo.flush();
                       oo.close();
                       System.out.println("Vector almacenado en archivo");
                    } catch (IOException exception) {
                        System.out.println("Error -- " + exception.toString());
                    }
        
    }
            
  
    public  ArrayList<Cuenta> LeerArchivo(){
        ArrayList <Cuenta> c = new ArrayList();
        try {
                          FileInputStream fi = new FileInputStream("cuentas.dat");
                          ObjectInputStream oi = new ObjectInputStream(fi);
                          c = (ArrayList) oi.readObject();         
                          oi.close();
                     } catch (Exception exception) {
                          System.out.println("Error -- " + exception.toString());
                              System.out.println("Error no se ha creado el archivo ");
                            c = new ArrayList<Cuenta> ();
                     }
        return c;
        
}
}

