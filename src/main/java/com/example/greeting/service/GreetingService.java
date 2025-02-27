package com.example.greeting.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreetingMessage(){
        return "Hello from BridgeLabz";
    }
}
