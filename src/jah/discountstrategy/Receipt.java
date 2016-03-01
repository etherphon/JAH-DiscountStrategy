/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jah.discountstrategy;

import java.text.DecimalFormat;

/**
 *
 * @author jhedding
 */
public class Receipt {
    
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
    private StoreStrategy store;

    public Receipt(String custId, DatabaseStrategy db, StoreStrategy st) {
        // needs validation
       setDb(db);
       setCustomer(db.findCustomerById(custId));
       lineItems = new LineItem[0];
       this.setStore(st);
       
    }
    
    public final void addItemToReceipt(String prodId, int qty) {
        // needs validation
        LineItem item = new LineItem(db, prodId, qty);
        
        addItemToArray(lineItems, item);
    }
    
    private void  addItemToArray(LineItem[] origArray, LineItem item) {
        LineItem[] tempArray = new LineItem[origArray.length + 1];
        
        System.arraycopy(origArray, 0, tempArray, 0, origArray.length);
        tempArray[tempArray.length - 1] = item;
        origArray = tempArray;
        lineItems = origArray;
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
    
    public StoreStrategy getStore() {
        return store;
    }

    public void setStore(StoreStrategy store) {
        // needs validation
        this.store = store;
    }
   
    public final String getReceiptItems() {
       String receipt = store.getStoreName() + "\n" + store.getStoreInfo() + "\n";
       
       receipt += "Item No.\tItem Name\t\tQuantity\tPrice\tDiscount\tSubtotal\n"
                      + "--------\t---------\t\t--------\t-----\t--------\t--------\n";
       double receiptTotal = 0;
       DecimalFormat df = new DecimalFormat("$###,###.##");
       
       for (LineItem li : lineItems) {
           receipt += li.getLiProduct().getProductId() + "\t\t";
           receipt += li.getLiProduct().getProductName() + "\t\t\t";
           receipt += li.getQty() + "\t";
           receipt += df.format(li.getLiProduct().getUnitCost()) + "\t";
           receipt += df.format(li.getLineDiscount()) + "\t\t";
           receiptTotal += li.getLineItemTotal();
           receipt += df.format(li.getLineItemTotal()) + "\n";
       }
       
       receipt += "--------\t---------\t\t--------\t-----\t--------\t--------\n";
       receipt += "\t\t\t\t\t\t\t\tTotal: " + "\t\t" + df.format(receiptTotal);
       
       return receipt;
   }
    
}
