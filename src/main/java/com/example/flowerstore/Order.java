package com.example.flowerstore;

import com.example.flowerstore.delivery.Delivery;
import com.example.flowerstore.flowersstaff.Item;
import com.example.flowerstore.payments.Payment;

import java.util.LinkedList;

public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Delivery getDelivery() {
        return delivery;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void addItem(Item it){
        this.items.add(it);
    }

    public void deleteItem(int ind){
        this.items.remove(ind);
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (int i = 0; i < this.items.size(); i++){
            totalPrice = totalPrice + this.items.get(i).getPrice();
        }
        return totalPrice;
    }
}
