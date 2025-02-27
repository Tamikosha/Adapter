package com.example.demo.lcp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationManager {
    private final List<NotificationService> services;

    @Autowired
    public NotificationManager(List<NotificationService> services) {
        this.services = services;
    }

    public void notifyUsers(String message) {
        for (NotificationService service : services) {
            service.sendNotification(message);
        }
    }
}