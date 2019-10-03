package com.example.user.UserService.web.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private PaymentFeignClient paymentFeignClient;

    @GetMapping("feign")
    public String handle(){
        return paymentFeignClient.pay() + " & user-service";
    }
}
