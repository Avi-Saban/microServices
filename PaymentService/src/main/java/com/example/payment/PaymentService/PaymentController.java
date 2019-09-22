package com.example.payment.PaymentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @GetMapping("pay/msg")
    public String payment() {
        return "Payment-Service";
    }
}
