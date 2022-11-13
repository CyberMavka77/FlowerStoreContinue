package com.example.flowerstore.flowersstaff;

public abstract class Item {
    protected String description;
    protected double price;
    protected Item item;

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }



}
