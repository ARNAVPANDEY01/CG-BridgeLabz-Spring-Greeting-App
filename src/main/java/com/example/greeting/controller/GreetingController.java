package com.example.greeting.controller;

import com.example.greeting.DTO.Greeting;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hello")
public class GreetingController {

    @GetMapping
    public Greeting getGreeting (){
        return new Greeting("Hello from BridzeLabz");
    }

    @PostMapping("/greet")
    public Greeting postGreeting(@RequestBody Greeting greeting){
        return new Greeting("Hello " + " " + greeting.getMessage() + " " +  "from BridzeLabz");
    }

    @PutMapping("/updation")
    public Greeting updateGreeting(@RequestBody Greeting greeting){
        return new Greeting("message updated:" + greeting.getMessage());
    }

    @DeleteMapping
    public Greeting deletegreeting(){
        return new Greeting("delete update successfully");
    }

}





















