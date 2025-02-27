package com.example.demo.lcp.before;

public class Bird {
    public void fly() {
        System.out.println("This bird is flying");
    }

    public void makeBirdFly(Bird bird) {
        bird.fly();
    }
}
