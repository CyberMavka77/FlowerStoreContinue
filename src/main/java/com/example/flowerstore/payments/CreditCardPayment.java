package com.example.flowerstore.payments;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(double price) {
        return true;
    }
}
