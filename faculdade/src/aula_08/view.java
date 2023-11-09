/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_08;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class view {

    public void captador() {
        String vi = "Seu saldo: ";
        calculadora x = new calculadora();
        JOptionPane.showInputDialog(vi, "R$ 500,00");
        int sal = 500;
        x.setSaldo(sal);
        String saq = JOptionPane.showInputDialog(null, "Qual o valor do saque:");
        int saqf = Integer.parseInt(saq);
        x.setSaque(saqf);
        String dep = JOptionPane.showInputDialog(null, "Qual o valor do deposito:");
        int depf = Integer.parseInt(dep);
        x.setDeposito(depf);

    }
    
    public void retorno(){
        calculadora x = new calculadora();
        JOptionPane.showMessageDialog(null, "Seu saldo está em: "+x.getSaldo());
    }

    public static void main(String[] args) {
        view x = new view();
        x.captador();
        x.retorno();
    }
}
