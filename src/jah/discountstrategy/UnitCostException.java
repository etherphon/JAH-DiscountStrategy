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
public class UnitCostException extends IllegalArgumentException {
    
    public static final String ERR_MSG = "Unit cost does not meet guidelines.";

    public UnitCostException() {
        super(ERR_MSG);
    }
   
    public UnitCostException(String s) {
        super(ERR_MSG);
    }

    public UnitCostException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public UnitCostException(Throwable cause) {
        super(cause);
    }
    
    
    
    
    
}
