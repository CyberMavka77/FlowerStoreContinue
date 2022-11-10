package com.example.flowerstore.delivery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/delivery")
public class DeliveryController {

    @GetMapping
    public List<String> getDeliveryOptions(){
        return List.of(DHLDeliveryStrategy.class.getName(),
                PostDeliveryStrategy.class.getName());
    }

}
