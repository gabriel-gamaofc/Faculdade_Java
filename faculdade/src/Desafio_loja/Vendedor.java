package Desafio_loja;

import java.util.Scanner;

public class Vendedor extends Funcionario {

    public void vendas() {
        Vendedor_calc x = new Vendedor_calc();
        Scanner vendedor = new Scanner(System.in);

        System.out.println("Qual o total de vendas?");
        x.setTotal_venda(vendedor.nextDouble());

        System.out.println("Qual seu salário base?");
        x.setSal_fixo(vendedor.nextDouble());
        
        System.out.println("Salário total é R$"+x.getSal_fixo());

    }

   

}
