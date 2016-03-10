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
public class Product {
    
    private String productId;
    private String productName;
    private double unitCost;
    private DiscountStrategy discount;
    public static final int PID_MIN = 3;
    public static final int PID_MAX = 6;
    public static final double UC_MIN = 0.01;
    
    public Product(String productId, String productName, double unitCost, DiscountStrategy discount) throws IllegalArgumentException {
        setProductId(productId);
        setProductName(productName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final String getProductId() {
        return productId;
    }

    /*
    *  This method sets the product id, validation is done to make sure the given id
    *  is not null, is not an empty value, and is more than the minumum and less than the
    *  maximum values as provided in the static constants PID_MIN and PID_MAX.
    */
    public final void setProductId(String productId) throws IllegalArgumentException {
        if (productId == null || productId.isEmpty() || productId.length() < PID_MIN || productId.length() < PID_MAX ) {
            throw new ProductIdException();
        }
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    /*
    *  Setter for product name, validation is only done to make sure that the given
    *  value isn't null or empty.
    */
    public final void setProductName(String productName) throws IllegalArgumentException {
        if (productName == null || productName.isEmpty()) {
            throw new ProductNameException();
        }
          // needs validation
        this.productName = productName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    /*
    *  Setter for product unit cost just makes sure that the provided cost is not
    *  under the minimum value, the constant UC_MIN.
    */
    public final void setUnitCost(double unitCost) throws IllegalArgumentException {
        if (unitCost < UC_MIN) {
            throw new UnitCostException();
        }
          // needs validation
        this.unitCost = unitCost;
    }

    public final DiscountStrategy getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountStrategy discount) {
          // needs validation
        this.discount = discount;
    }
    
    public final Double getPriceWithDiscount(int qty) {
        // needs validation
        Double price = (unitCost * qty) - discount.getDiscountAmount(qty, unitCost);
        return price;
        
    }
    
}
