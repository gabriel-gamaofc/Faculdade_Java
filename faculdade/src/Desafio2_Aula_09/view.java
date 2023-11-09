/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio2_Aula_09;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class view {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Calc x = new Calc();
        System.out.println("Diga o valor de custo de fabrica: ");
        x.setCusto_fabrica(ler.nextDouble());
        System.out.println("Diga o valor de Imposto de distribuidor: ");
        x.setImposto_distribudor(ler.nextDouble());
        System.out.println("Diga o valor de Imposto de renda: ");
        x.setImposto_renda(ler.nextDouble());
      
        System.out.println("Custo final : R$ "+x.getCusto_final());
    }
}
