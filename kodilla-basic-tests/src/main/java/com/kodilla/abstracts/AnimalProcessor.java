package com.kodilla.abstracts;

public class AnimalProcessor {
    public void process(Animal animal){
        System.out.println("Animal has " + animal.name + " for name.");
        System.out.println("I am " + animal.getClass());

    }
}
