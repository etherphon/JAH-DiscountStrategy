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
public class Receipt {
    
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems = new LineItem[6];

    
    public Receipt(String custId, DatabaseStrategy db) {
        // needs validation
       setDb(db);
       setCustomer(db.findCustomerById(custId));
    }
    
    public final DatabaseStrategy getDb() {
        return db;
    }

    public final void setDb(DatabaseStrategy db) {
        // needs validation
        this.db = db;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        // needs validation
        this.customer = customer;
    }
    
    public final LineItem[] getLineItems() {
        return lineItems;
    }

    public final void setLineItems(LineItem[] lineItems) {
        // needs validation
        this.lineItems = lineItems;
    }
    
}
