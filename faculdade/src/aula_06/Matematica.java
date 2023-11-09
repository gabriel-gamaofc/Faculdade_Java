/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_06;

/**
 *
 * @author Gabriel
 */
public class Matematica {
    //Atributo (Modificador de acesso, tipo, nome)
    public double base, altura,nota_1,nota_2,media, result;
    //Metódo && Função
    public double  retangulo(){
        result= base*altura;
        return result;
    }
    public double quadrado(){
        result=Math.pow(base, 2);
        return result;
    }
    
    public double media_aluno(){
        media=(nota_1+nota_2)/2;
        return media;
    }
    
    
}
