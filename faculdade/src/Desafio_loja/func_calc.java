/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desafio_loja;

/**
 *
 * @author Gabriel
 */
public class func_calc extends Administrador {
    private double hor_extra,sal_base;

    /**
     * @return the hor_extra
     */
    public double getHor_extra() {
        return hor_extra;
    }

    /**
     * @param hor_extra the hor_extra to set
     */
    public void setHor_extra(double hor_extra) {
        this.hor_extra = hor_extra;
    }

    /**
     * @return the sal_base
     */
    public double getSal_base() {
        return sal_base;
    }

    /**
     * @param sal_base the sal_base to set
     */
    public void setSal_base(double sal_base) {
        this.sal_base = sal_base+(getHor_extra()*(0.01*sal_base));
    }
}
