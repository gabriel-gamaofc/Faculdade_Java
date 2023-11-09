/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_loja;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Administrador extends Funcionario {

    public void adm() {
        func_calc x = new func_calc();
        Scanner administrador = new Scanner(System.in);

        System.out.println("Qual o total de Horas extras?");
        x.setHor_extra(administrador.nextDouble());

        System.out.println("Qual seu salário base?");
        x.setSal_base(administrador.nextDouble());

        System.out.println("O salário total é R$" + x.getSal_base());

    }

}
