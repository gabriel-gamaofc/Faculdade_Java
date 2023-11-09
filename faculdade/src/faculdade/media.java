/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Gabriel
 */
public class media {

    public double nota1, nota2, media;

    public double calmedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }

    public double validacao() {
        if (media >= 7 && media <= 10) {
            System.out.println("Aprovado ");
            for(int i =0;i<3;i++){
            System.out.println("Paraabens");
        }
        } else {
            if (media >= 4 && media < 7) {
                System.out.println("Recuperação ");

            } else {
                System.out.println("Reprovado ");
            }
        }
        return media;
    }

    public void result() {
        calmedia();
        System.out.println("Sua media é igual a " + media);

    }

}
