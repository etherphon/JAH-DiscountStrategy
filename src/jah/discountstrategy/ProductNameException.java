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
public class ProductNameException extends IllegalArgumentException {
    
    public static final String ERR_MSG = "That is not a valid product name.";

    public ProductNameException() {
        super(ERR_MSG);
    }

    public ProductNameException(String s) {
        super(ERR_MSG);
    }

    public ProductNameException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public ProductNameException(Throwable cause) {
        super(cause);
    }
    
    
    
}
