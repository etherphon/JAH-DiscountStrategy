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
public class ProductIdException extends IllegalArgumentException {
    
    public static final String ERR_MSG = "That is not a valid product ID.";

    public ProductIdException() {
        super(ERR_MSG);
    }

    public ProductIdException(String s) {
        super(ERR_MSG);
    }

    public ProductIdException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public ProductIdException(Throwable cause) {
        super(cause);
    }
    
    
    
}
