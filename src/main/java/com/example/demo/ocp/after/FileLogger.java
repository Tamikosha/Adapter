package com.example.demo.ocp.after;

import org.springframework.stereotype.Component;

@Component
public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File log: " + message);
    }
}
