package com.example.greeting.controller;

import com.example.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingServiceController {

    private final GreetingService greetingService;

    public GreetingServiceController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping
    public String getGreeting(){
        return greetingService.getGreetingMessage();
    }

}
