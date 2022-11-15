package com.example.flowerstore.flowersstaff;

public class Main {
    public static void main(String[] args) {
        Item flower = new Flower(1, 100, "blue", 100);
        flower = new ItemDiscount(flower);
        System.out.println(flower.getPrice());

    }
}
