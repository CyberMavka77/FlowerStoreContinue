package com.example.flowerstore;

public class PayPalPayment implements Payment{

    @Override
    public boolean pay(double price) {
        return true;
    }
}
