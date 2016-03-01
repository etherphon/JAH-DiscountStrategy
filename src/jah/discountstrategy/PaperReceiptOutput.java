/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jah.discountstrategy;

/**
 *
 * @author etherdesign
 */
public class PaperReceiptOutput implements OutputStrategy {
    
    private Receipt sale;
    
    @Override
    public final void outputReceipt(Receipt r) {
        // needs validation
        System.out.println("Customer: " + r.getCustomer().getCustomerName() + "\n");
        System.out.println("Customer No.: " + r.getCustomer().getCustomerId() + "\n");
        System.out.println(r.getReceiptItems());
    }
    
}
