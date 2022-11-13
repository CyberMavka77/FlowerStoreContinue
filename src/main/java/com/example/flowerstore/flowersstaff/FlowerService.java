package com.example.flowerstore.flowersstaff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    private FlowerRepository flowerRepository;
    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void addFlower(@RequestBody Flower flower) {
        flowerRepository.save(flower);
    }
}
