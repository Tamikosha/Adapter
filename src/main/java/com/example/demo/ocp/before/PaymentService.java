package com.example.demo.ocp.before;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void processPayment(String provider, double amount) {
        if ("paypal".equals(provider)) {
            System.out.println("Processing PayPal payment: $" + amount);
        } else if ("stripe".equals(provider)) {
            System.out.println("Processing Stripe payment: $" + amount);
        }
    }
}
