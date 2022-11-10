package com.example.flowerstore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
    @GetMapping
    public List<String> getPaymentOptions(){
        return List.of(PayPalPayment.class.getName(),
                CreditCardPayment.class.getName());
    }
}
