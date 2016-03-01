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
public class KohlsStore implements StoreStrategy {
    
    private String storeName = "Kohls";
    private String storeInfo = "123 Main St.\nNew Berlin, WI\n53151";
    
    public KohlsStore() {
        
    }

    public KohlsStore(String storeName, String storeInfo) {
        this.setStoreName(storeName);
        this.setStoreInfo(storeInfo);
    }

    public void setStoreName(String storeName) {
        /**
         * Caution: storeName parameter is not validated
         */
        // needs validation
        this.storeName = storeName;
    }

    public void setStoreInfo(String storeInfo) {
        /**
         * Caution: storeInfo parameter is not validated
         */
        // needs validation
        this.storeInfo = storeInfo;
    }
    
    @Override
    public final String getStoreName() {
        return storeName;
    }
    
    @Override
    public final String getStoreInfo() {
        return storeInfo;
    }
    
}
