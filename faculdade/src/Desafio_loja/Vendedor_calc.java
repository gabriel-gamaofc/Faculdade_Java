/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_loja;

/**
 *
 * @author Gabriel
 */
public class Vendedor_calc extends Vendedor {
    private double sal_fixo,total_venda;

    /**
     * @return the sal_fixo
     */
    public double getSal_fixo() {
        
        return sal_fixo;
    }

    /**
     * @param sal_fixo the sal_fixo to set
     */
    public void setSal_fixo(double sal_fixo) {
        
        this.sal_fixo = sal_fixo+ ((getTotal_venda() * 100) * 0.05);
    }

    /**
     * @return the total_venda
     */
    public double getTotal_venda() {
        //System.out.println(total_venda);
        return total_venda;
    }

    /**
     * @param total_venda the total_venda to set
     */
    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }
    
}
