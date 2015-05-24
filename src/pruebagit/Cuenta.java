/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagit;

import java.io.Serializable;

/**
 *
 * @author RNS
 */
public class Cuenta implements Serializable{
   private int numDeCuenta, pin;
   private double balanceDisponible,balanceTotal;
   private String nombre;
   
  public boolean validatePIN(){
      boolean valid=false;
      return valid;
  }

    public Cuenta(int numDeCuenta, String nombre, int pin, double balanceDisponible, double balanceTotal) {
        this.nombre=nombre;
        this.numDeCuenta = numDeCuenta;
        this.pin = pin;
        this.balanceDisponible = balanceDisponible;
        this.balanceTotal = balanceTotal;
    }

    public int getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(int numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalanceDisponible() {
        return balanceDisponible;
    }

    public void setBalanceDisponible(double balanceDisponible) {
        this.balanceDisponible = balanceDisponible;
    }

    public double getBalanceTotal() {
        return balanceTotal;
    }

    public void setBalanceTotal(double balanceTotal) {
        this.balanceTotal = balanceTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public double getSaldoDisponible(){
        double saldoDispon=1;
        
        return saldoDispon;
    }

    public int getNumDeCuenta() {
        return numDeCuenta;
    }

    public void setNumDeCuenta(int numDeCuenta) {
        this.numDeCuenta = numDeCuenta;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalanceDisponible() {
        return balanceDisponible;
    }

    public void setBalanceDisponible(double balanceDisponible) {
        this.balanceDisponible = balanceDisponible;
    }

    public double getBalanceTotal() {
        return balanceTotal;
    }

    public void setBalanceTotal(double balanceTotal) {
        this.balanceTotal = balanceTotal;
    }
    
   
    
    
    
    public void credit(){ //no se que haga la clase credit
        
    }
    
    public void debit(){//tampoco se que haga la clase de debit
        
    }
   
    
}
