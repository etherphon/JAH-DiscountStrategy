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
public class Register {
    
    private Receipt receipt;
    // change to store object
    private StoreStrategy store;
    private DatabaseStrategy db;
    private OutputStrategy op;
    
    public final void startNewSale(String custId, DatabaseStrategy db, StoreStrategy st) {
        // needs validation
        receipt = new Receipt(custId, db, st);  
    }
    
    public final void endSale() {
        // add code here, output receipt
        // need output objects
    }
    
    public final void addItemToSale(String prodId, int qty) {
        receipt.addItemToReceipt(prodId, qty);
    }

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        // needs validation
        this.receipt = receipt;
    }

    public StoreStrategy getStore() {
        return store;
    }

    public void setStore(StoreStrategy store) {
        // needs validation
        this.store = store;
    }

    
    public final void outputReceipt(OutputStrategy op) {
        op.outputReceipt(receipt);
    }
    
    
}
