package com.example.payment.PaymentService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${eureka.instance.instanceId}")
    private String instanceId;

    @GetMapping("pay/msg")
    public String payment() {
        return "Payment-Service instanceId:" + instanceId;
    }
}
