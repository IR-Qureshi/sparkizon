package com.example.dellpc.sparkizon;

/**
 * Created by dell pc on 01-May-17.
 */

public class ClassStore {
    String storeName;
    String storeDes;
    String storeDiscount;
    String deliveryTime;
    int  imageDrawable;

    public ClassStore(){

    }
    public ClassStore(String storeName,String storeDes,String storeDiscount, String deliveryTime, int imageDrawable){
        this.deliveryTime = deliveryTime;
        this.storeDes = storeDes;
        this.storeDiscount = storeDiscount;
        this.deliveryTime = deliveryTime;
        this.storeName = storeName;
        this.imageDrawable = imageDrawable;

    }
    public String getDeliveryTime() {
        return deliveryTime;
    }

    public String getStoreDes() {
        return storeDes;
    }

    public String getStoreDiscount() {
        return storeDiscount;
    }

    public String getStoreName() {
        return storeName;
    }

    public int getImageDrawable() {
        return imageDrawable;
    }
}
