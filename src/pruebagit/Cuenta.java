/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

/**
 *
 * @author RNS
 */
public class Cuenta {
   private int numDeCuenta, pin;
   private double balanceDisponible,balanceTotal;
   
  public boolean validatePIN(){
      boolean valid=false;
      return valid;
  }

    public Cuenta(int numDeCuenta, int pin, double balanceDisponible, double balanceTotal) {
        this.numDeCuenta = numDeCuenta;
        this.pin = pin;
        this.balanceDisponible = balanceDisponible;
        this.balanceTotal = balanceTotal;
    }
  
    public double getSaldoDisponible(){
        double saldoDispon=1;
        
        return saldoDispon;
    }
    
    public double getSaldoTotal(){
        double saldoTotal=0;
        
        return saldoTotal;
    }
    
    public void credit(){ //no se que haga la clase credit
        
    }
    
    public void debit(){//tampoco se que haga la clase de debit
        
    }
   
    
}
