/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_09;

/**
 *
 * @author Gabriel
 */
public class Calc {

    private double nota_1, nota_2, result;

    //funções
    public double resultado() {
        result = ((nota_1 + nota_2) / 2);
        return result;
    }

    //metodos
    public void calc() {

        result = ((nota_1 + nota_2) / 2);
    }

    //exemplos para get e set
    //para acessar private get(funçãoa) set(metodo)
    //funções
    /**
     * @return the nota_1
     */
    public double getNota_1() {
        return nota_1;
    }

    /**
     * @param nota_1 the nota_1 to set
     */
    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    /**
     * @return the nota_2
     */
    public double getNota_2() {
        return nota_2;
    }

    /**
     * @param nota_2 the nota_2 to set
     */
    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    /**
     * @return the result
     */
    public double getResult() {
        result = (getNota_1() + getNota_2()) / 2;
        return result;
    }
    //não usou o set result já que ele é fruto do calculo de algo , so usa o set para quando esse é valor a qual o usuário em si for informar algo

    /**
     * @param result the result to set
     */
}
