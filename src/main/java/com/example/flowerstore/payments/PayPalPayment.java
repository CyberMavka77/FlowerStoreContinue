package com.example.flowerstore.payments;

public class PayPalPayment implements Payment{

    @Override
    public boolean pay(double price) {
        return true;
    }
}
