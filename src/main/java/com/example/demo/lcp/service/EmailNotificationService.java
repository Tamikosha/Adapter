package com.example.demo.lcp.service;

public class EmailNotificationService extends NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email: " + message);
    }
}
