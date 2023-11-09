/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_aula_09;

import java.util.Scanner;

/**45
 * 28
 *
 * @author Gabriel
 */
public class View {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Calcul x = new Calcul();
        System.out.println("Diga o valor do custo de fabrica");
        x.setCf(ler.nextDouble());
        System.out.println("O valor final é:R$ "+x.getCf());
    }

}
