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
    private String prodId;

    public LineItem(DatabaseStrategy liDb, String prodId, int qty) {
        setLiDb(liDb);
        setLiProduct(liDb.findProductById(prodId));
        setQty(qty);
    }
    
    public String getLineItemData() {
        String data = "";
        
        return data;
    }
    
    public final DatabaseStrategy getLiDb() {
        return liDb;
    }

    public final void setLiDb(DatabaseStrategy liDb) {
        /**
         * Caution: liDb parameter is not validated
         */
        // needs validation
        this.liDb = liDb;
    }

    public final Product getLiProduct() {
        return liProduct;
    }

    public final void setLiProduct(Product liProduct) {
        /**
         * Caution: liProduct parameter is not validated
         */
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
    
    public final Double getSubtotal() {
        
        return liProduct.getUnitCost() * qty;
    }
    
    public final Double getLineDiscount() {
        
        return liProduct.getDiscount().getDiscountAmount(qty, liProduct.getUnitCost());
    }
    
    
    public final Double getLineItemTotal() {
        
        return liProduct.getPriceWithDiscount(qty);
    }
    
}
