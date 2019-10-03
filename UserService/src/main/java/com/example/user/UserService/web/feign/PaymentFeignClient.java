package com.example.user.UserService.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("payment-service")
public interface PaymentFeignClient {

    @GetMapping("payment/message")
    String pay();
}
