package com.example.demo.ocp.before;

import org.springframework.stereotype.Service;

@Service
public class LoggerService {
    public void log(String message) {
        System.out.println("Logging to console: " + message);
    }




}