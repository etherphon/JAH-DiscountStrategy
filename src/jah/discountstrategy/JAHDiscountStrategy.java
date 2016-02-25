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
public class JAHDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // add lineitem, add item to sale
        // lineitem array in receipt
        // add product to lineitem
        
        
        // kludge:  do configuration here
        DatabaseStrategy db = new FakeDatabase();
        
        
        // start talking to objects
        Register register = new Register();
        register.startNewSale("100", db);
        
        // test code
        Customer customer = register.getReceipt().getCustomer();
        System.out.println("Customer " + customer.getCustomerName() +
                " found and added to receipt");
        
        // add item to sale
        register.addItemToSale("11", 2);
        register.addItemToSale("22", 1);
        register.addItemToSale("33", 3);
        
        // test added items
        LineItem[] items = register.getReceipt().getLineItems();
        for (LineItem item : items) {
            System.out.println(item.getLiProduct().getProductName());
            System.out.println(item.getSubtotal());
            System.out.println(item.getLineDiscount());
            System.out.println(item.getLineItemTotal());
        }
        
        
    }
    
}
