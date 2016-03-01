/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jah.discountstrategy;

/**
 *
 * @author jhedding
 */
public class FlatAmountDiscount implements DiscountStrategy {

    private double discountRate;

    public FlatAmountDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }
     
    @Override
    public final double getDiscountAmount(int qty, double unitCost) {
        /**
         * Caution: qty and unitCost parameters are not validated
         */
        // needs validation
        return discountRate;
    }

    public final double getDiscountRate() {
        return discountRate;
    }

    public final void setDiscountRate(double discountRate) {
        /**
         * Caution: discountRate parameter is not validated
         */
        // needs validation
        this.discountRate = discountRate;
    }
    
  
}
