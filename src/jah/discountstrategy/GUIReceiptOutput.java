/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jah.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author etherdesign
 */
public class GUIReceiptOutput implements OutputStrategy {
 
    @Override
    public final void outputReceipt(Receipt r) {
        /**
         * Caution: r parameter is not validated
         * Receipt object is passed, method called to return string
         * to output with joptionpane
         */
        // needs validation
        JOptionPane.showMessageDialog(null, r.getReceiptItems());
    }
    
}
