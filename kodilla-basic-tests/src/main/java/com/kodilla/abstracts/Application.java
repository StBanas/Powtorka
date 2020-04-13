package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {

       Dog dog = new Dog();
          dog.name = "Azor";

        System.out.println(dog.name);



//        Duck donald = new Duck(2);
//        Dog dog = new Dog(2);
//        Cat cat = new Cat(3);
//
        AnimalProcessor done = new AnimalProcessor();
        done.process(dog);
//
//        processor.process(cat);
//        processor.process(donald);
//
//
//
    }
}
