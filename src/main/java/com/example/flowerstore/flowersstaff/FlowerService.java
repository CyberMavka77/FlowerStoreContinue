package com.example.flowerstore.flowersstaff;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    public List<Flower> getFlowers() {
        return List.of(new Flower(12,
                FlowerColor.RED,
                100));
    }
}
