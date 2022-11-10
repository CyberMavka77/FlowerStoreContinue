package com.example.flowerstore;

import java.util.ArrayList;

public class FlowerBucket extends Item {
    private ArrayList<FlowerPack> flowers;
    public FlowerBucket() {
        this.flowers = new ArrayList<FlowerPack>();
    }

    public void add(FlowerPack flower) {
        this.flowers.add(flower);
    }
}
