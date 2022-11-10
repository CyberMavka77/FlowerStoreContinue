package com.example.flowerstore;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(double price) {
        return true;
    }
}
