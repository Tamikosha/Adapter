package com.example.demo.lcpp;

public class App {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new CatSShelter();
        animalShelter.accept(new Cat());
    }
}
