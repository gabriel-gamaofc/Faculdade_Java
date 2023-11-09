/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Media {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        Calc x = new Calc();
        System.out.println("Digite a nota 1: ");
        x.setNota_1(ler.nextDouble());
        System.out.println("Digite a nota 2: ");
        x.setNota_2(ler.nextDouble());
        System.out.println("Nota 1: " + x.getNota_1());
        System.out.println("Nota 2: " + x.getNota_2());
        System.out.println("Media: " + x.getResult());

    }

}
