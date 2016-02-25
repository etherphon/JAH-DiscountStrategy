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
public class LineItem {
    
    private DatabaseStrategy liDb;
    private Product liProduct;
    private int qty;
    String prodId;

    public LineItem(DatabaseStrategy liDb, String prodId, int qty) {
        setLiDb(liDb);
        liProduct = liDb.findProductById(prodId);
        setQty(qty);
    }

    public final DatabaseStrategy getLiDb() {
        return liDb;
    }

    public final void setLiDb(DatabaseStrategy liDb) {
        // needs validation
        this.liDb = liDb;
    }

    public final Product getLiProduct() {
        return liProduct;
    }

    public final void setLiProduct(Product liProduct) {
        // needs validation
        this.liProduct = liProduct;
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
        // needs validation
        this.qty = qty;
    }
    
    
    
}
