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
public class FakeDatabase implements DatabaseStrategy {
    
    private Customer[] customers = {
        new Customer("100", "Bob James"),
        new Customer("200", "Sally Smith"),
        new Customer("300", "Peter Piper")
    };
    
    private Product[] products = {
        new Product("11", "Brewers Hat", 29.95, new PercentOffDiscount(.10)),
        new Product("22", "Women's Blouse", 49.95, new FlatAmountDiscount(5.00)),
        new Product("33", "Men's Black Belt", 39.95, new NoDiscount())
    };
    
    public FakeDatabase() {
    
    }
    
    /*
    *  Method finds product by ID in the fake database, uses same validation method
    *  as exists in the Product class until a Validator plugin can be written.
    *  References are made to static values written in the Product class.
    */
    @Override
    public final Product findProductById(String prodId) {
        // needs validation
        /**
         * Caution: prodId parameter is not validated
         */
        Product product = null;
        
        for (Product p : products) {
            if (p.getProductId().equals(prodId)) {
                product = p;
                break;
            }
        }
        return product;
    }
    
    /*  
    *  Method finds customer by ID in the fake database, name valudation is done in the same
    *  way as the Customer class, method refernces static final values in the customer class
    *  for minimum and maximum ID lengths.
    */
    @Override
    public final Customer findCustomerById(String custId) throws IllegalArgumentException {
        
        Customer cf = null;
        
        if (custId == null || custId.isEmpty() || custId.length() < Customer.CID_MIN || custId.length() > Customer.CID_MAX) {
            throw new CustomerIdException();
        }
        
        for (Customer c : customers) {
            if (c.getCustomerId().equals(custId)) {
                cf = c;
                break;
            }
        }
        return cf;
    }
}
