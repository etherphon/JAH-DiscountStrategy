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
    private String store;
    private DatabaseStrategy db;
    private OutputStrategy[] ops;
    private OutputFormatStrategy fmt;
    
    public Register(String s) {
        this.setStore(s);
    }
    
    public final void startNewSale(String custId, DatabaseStrategy db, StoreStrategy st) {
        // needs validation
        receipt = new Receipt(custId, db, st);
    }
    
    public final void endSale() {
        // add code here, output receipt
        // need output objects
        //String data = fmt.format(receipt);
        //for(OutputStrategy out : ops) {
        //    out.output(data);
        //}
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

    
    public final void outputReceipt(OutputStrategy op) {
        op.outputReceipt(receipt);
    }
    
    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        // needs validation
        this.store = store;
    }
}
