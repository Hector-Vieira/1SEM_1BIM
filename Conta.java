/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExBanco.model;

/**
 *
 * @author hector80605
 */
public abstract class Conta {
    protected double saldo;
    
    public void depositar (double valor){
    saldo+= valor;
    }
    
    public double getSaldo(){
    return saldo;
    }
}
