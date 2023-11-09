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
public class Funcionario {
     public static void main(String args[]) {
         Vendedor_calc x = new Vendedor_calc();
         Scanner Gerente = new Scanner(System.in); 
         System.out.println("Qual seu nome?");
         String Nome =Gerente.next();
         System.out.println("Qual seu rg?");
         int rg = Gerente.nextInt();
         System.out.println(Nome+","+"de rg:"+rg+"\n"+"Escolha uma opção: "+"\n"+"1-Vendedor"+"\n"+"2-Administrador");
         int escolha = Gerente.nextInt();
         if (escolha==1){
             Vendedor a = new Vendedor();
             
             a.vendas();
         }
         if(escolha==2){
             Administrador b = new Administrador();
             
             b.adm();
         }
         
         
     }
}
