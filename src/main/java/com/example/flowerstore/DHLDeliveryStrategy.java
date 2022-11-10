package com.example.flowerstore;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items) {
        return true;
    }
}
