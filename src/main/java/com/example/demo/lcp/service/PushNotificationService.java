package com.example.demo.lcp.service;

public class PushNotificationService extends NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
