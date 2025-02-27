package com.example.greeting.controller;

import com.example.greeting.DTO.DTOUser;
import com.example.greeting.service.GreetingService;
import org.springframework.web.bind.annotation.*;

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

    //UC-3
    @GetMapping("/name")
    public String getCustomGreetingMessage(@RequestParam(required = false) String firstName, @RequestParam(required = false) String lastName){
        return greetingService.customerGreetingMessage(firstName,lastName);
    }

    @PostMapping("/post")
    public String getCustomGreetingMessageWithPost(@RequestBody DTOUser user){
        return greetingService.customerGreetingMessage(user.getFirstName(), user.getLastName());
    }

}
