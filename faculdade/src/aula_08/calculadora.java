/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_08;

/**
 *
 * @author Gabriel
 */
public class calculadora {

    private int saldo, saque, deposito;

    /**
     * @return the saldo
     */
    public int getSaldo() {
          
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        System.out.println(saldo);
        
        this.saldo = saldo;

    }
     
    

    /**
     * @return the saque
     */
    public int getSaque() {

        return saque;
    }

    /**
     * @param saque the saque to set
     */
    public void setSaque(int saque) {

        this.saque = saque;
    }

    /**
     * @return the deposito
     */
    public int getDeposito() {
        return deposito;
    }

    /**
     * @param deposito the deposito to set
     */
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

}
