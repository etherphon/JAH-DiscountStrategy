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
public class Customer {
    
    private String customerId;
    private String customerName;
    public static final int CID_MIN = 3;
    public static final int CID_MAX = 9;
    public static final String SPACE = " ";
    public static final int SPC_INDX = -1;
    public static final int NAME_MIN = 1;
    public static final int NAME_MAX = 32;
    

    public Customer(String customerId, String customerName) throws IllegalArgumentException {
        setCustomerId(customerId);
        setCustomerName(customerName);
    }

    public final String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String customerId) throws IllegalArgumentException {
       
        if (customerId == null || customerId.isEmpty() || customerId.length() < CID_MIN || customerId.length() > CID_MAX) {
            throw new CustomerIdException();
        }
        this.customerId = customerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String customerName) throws IllegalArgumentException {
       
        if (customerName == null || customerName.isEmpty() ||
                customerName.length() < NAME_MIN || customerName.length() > NAME_MAX ||
                customerName.indexOf(SPACE) == SPC_INDX) {
            throw new CustomerNameException();
        }
        this.customerName = customerName;
    }
    
    
    
}
