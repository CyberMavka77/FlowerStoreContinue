package com.example.flowerstore;

public abstract class Item {
    protected String description;
    protected double price;

    public String getDescription(){
        return this.description;
    }

    public double getPrice(){
        return this.price;
    }



}
