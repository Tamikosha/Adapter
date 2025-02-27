package com.example.demo.lcpp;

import java.io.IOException;

public class CatSShelter extends AnimalShelter {
    void accept(Cat cat) {
        System.out.println("It's a cat");
    }
    @Override
    Cat get() throws IOException {
        return new Cat();
    }
}
