package com.example.demo.lcpp;

public class AnimalShelter {
    void accept(Animal animal) {
        System.out.println("It's an animal");
    }
    Animal get() throws Exception{
        return new Animal();
    }
}
