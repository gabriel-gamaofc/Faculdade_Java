/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio2_Aula_09;

/**
 *
 * @author Gabriel
 */
public class Calc {

    private double custo_fabrica, Imposto_distribudor, imposto_renda, Custo_final;

    /**
     * @return the custo_fabrica
     */
    public double getCusto_fabrica() {
        return custo_fabrica;
    }

    /**
     * @param custo_fabrica the custo_fabrica to set
     */
    public void setCusto_fabrica(double custo_fabrica) {
        this.custo_fabrica = custo_fabrica;
    }

    /**
     * @return the Imposto_distribudor
     */
    public double getImposto_distribudor() {
        return Imposto_distribudor;
    }

    /**
     * @param Imposto_distribudor the Imposto_distribudor to set
     */
    public void setImposto_distribudor(double Imposto_distribudor) {
        this.Imposto_distribudor = Imposto_distribudor;
    }

    /**
     * @return the imposto_renda
     */
    public double getImposto_renda() {
        return imposto_renda;
    }

    /**
     * @param imposto_renda the imposto_renda to set
     */
    public void setImposto_renda(double imposto_renda) {
        this.imposto_renda = imposto_renda;
    }

    /**
     * @return the Custo_final
     */
    public double getCusto_final() {
        Custo_final = (getCusto_fabrica() * getImposto_distribudor() + getCusto_fabrica()) + (getCusto_fabrica() * getImposto_renda() + getCusto_fabrica());

        return Custo_final;
    }

    /**
     * @param Custo_final the Custo_final to set
     */
    public void setCusto_final(double Custo_final) {
       // Custo_final = (getCusto_fabrica() * getImposto_distribudor() + getCusto_fabrica()) + (getCusto_fabrica() * getImposto_renda() + getCusto_fabrica());
        this.Custo_final = Custo_final;
    }

}
