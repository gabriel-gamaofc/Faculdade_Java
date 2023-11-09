/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_06;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class Exibir {

    public static void main(String[] args) {
        Matematica x = new Matematica();

        JOptionPane.showMessageDialog(null, "Bem vindo ao programa matemático");
        String Nota_1 = JOptionPane.showInputDialog(null, "Qual a nota 1: ");
        x.nota_1 = Double.parseDouble(Nota_1);
        String Nota_2 = JOptionPane.showInputDialog(null, "Qual a nota 2: ");
        x.nota_2 = Double.parseDouble(Nota_2);
        String Base = JOptionPane.showInputDialog(null, "Qual a base: ");
        x.base = Double.parseDouble(Base);
        String Altura = JOptionPane.showInputDialog(null, "Qual a altura: ");
        x.altura = Double.parseDouble(Altura);
        int dec = 0;
        while (dec == 1 || dec == 0) {
            
            String escolha = JOptionPane.showInputDialog(null, "1-Tirar a media dos alunos" + "\n"
                    + "2- Calcula a area do quadrado" + "\n"
                    + "3- Calcular a area do retangulo" + "\n"
                    + "Sua decisão foi: ");

            int esc = Integer.parseInt(escolha);
            
            if (esc == 1) {
                x.media_aluno();
                JOptionPane.showMessageDialog(null, "\n" + "A media do aluno foi: " + x.media);
                if (x.media >= 7) {
                    JOptionPane.showMessageDialog(null, "\n" + "Aprovado, parábens");
                } else {
                    JOptionPane.showMessageDialog(null, "\n" + "Reprovado, tente novamente");
                }
            }
            if (esc == 2) {
                x.quadrado();
                JOptionPane.showMessageDialog(null, "\n" + "A area do quadrado é: " + x.result);
            }
            if (esc == 3) {
                x.retangulo();
                JOptionPane.showMessageDialog(null, "\n" + "A area do retangulo é: " + x.result);
            }
            
            if(esc>3){
                JOptionPane.showMessageDialog(null, "\n" + "Opção invalida" );
                
            }
            
            
            String decisao = JOptionPane.showInputDialog("\n" + "O que deseja fazer agora: " + "\n" + "1-Decidir qual conta fazer" + "\n" + "2-Sair" + "\n" + "Voce escolhe a opção: ");
            dec = Integer.parseInt(decisao);

        }
        JOptionPane.showMessageDialog(null, "Você finalizou o programa");
        
    }

}
