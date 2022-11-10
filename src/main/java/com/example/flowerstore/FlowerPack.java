package com.example.flowerstore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlowerPack extends Item{
    private Flower flower;
    private int amount;

    public double getPrice() {
        return flower.getPrice() * amount;
    }
}