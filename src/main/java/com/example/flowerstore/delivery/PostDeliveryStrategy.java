package com.example.flowerstore.delivery;

import com.example.flowerstore.flowersstaff.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public boolean deliver(List<Item> items) {
        return true;
    }
}
