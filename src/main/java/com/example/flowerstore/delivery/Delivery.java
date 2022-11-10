package com.example.flowerstore.delivery;

import com.example.flowerstore.flowersstaff.Item;

import java.util.List;

public interface Delivery {
    boolean deliver(List<Item> items);
}
