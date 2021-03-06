package com.loveboyuan.smarttrader;

import android.util.EventLogTags;

/**
 * Created by boyuangu on 2015-10-16.
 */
public class Item {
    //final int id;
    private String name;


    private String category;
    private int quantity;
    private String quality;
    private boolean isPrivate;
    private String description;
    private String photoPath;




    public Item(String name, String category, int quantity, String quality, boolean isPrivate, String description, String photoPath){
      //  id = name;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.quality = quality;
        this.isPrivate = isPrivate;
        this.description = description;
        this.photoPath = photoPath;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public void setIsPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getCategory() {
        return category;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return name;


    }


}
