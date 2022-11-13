package com.example.flowerstore.flowersstaff;

public class ItemDiscount extends Item{
    public ItemDiscount(Item item){
        this.item = item;
    }

    @Override
    public double getPrice(){
        return item.getPrice() * 0.2;
    }
}
