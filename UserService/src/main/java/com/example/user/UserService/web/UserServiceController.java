package com.example.user.UserService.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/User")
public class UserServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/go")
    public String method() {
        String url = "http://payment-service/payment/message";
        String result = restTemplate.getForObject(url, String.class) + "& user service";
        return result;
    }

    @GetMapping("user/doit")
    public String user() {
        return "User-Service";
    }

    public String fallback(Throwable t) {
        return "User-Service fallback method...";
    }
}
