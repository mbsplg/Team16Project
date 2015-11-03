package com.loveboyuan.smarttrader;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by boyuangu on 2015-10-16.
 */
public class Inventory implements Search{


    // Inventory has items It should be an arraylist of Items
    private ArrayList<Item> inventory = new ArrayList<Item>();
    private ArrayList<MyObserver> observers = new ArrayList<MyObserver>();


    public ArrayList<Item> getInventory() {
        return inventory;
    }
    // Inventory can add an Item (to the "items")
    public void addItem(Item item) {
        inventory.add(item);
        this.notifyAllObservers();
    }

    public void removeItem(Item item){
        inventory.remove(item);

    }

    public ArrayList<Item> searchByCategory(String category){
        ArrayList<Item> results = new ArrayList<Item>();
        int i;
        for(i = 0; i<inventory.size(); i++){
            if (category.equals(inventory.get(i).getCategory())){
                results.add(inventory.get(i));
            }
        }

        return results;
    }

    // searchByName


    // searchByQuality


    // searchByWhatEver

    public void addMyObserver(MyObserver observer){
        observers.add(observer);

    }
    public void notifyAllObservers(){
        for(MyObserver observer: observers){
            observer.update();

        }

    }
}
