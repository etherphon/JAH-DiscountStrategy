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
public interface DiscountStrategy {
    
    public abstract double getDiscountAmount(int qty, double unitCost);
    
    
}
