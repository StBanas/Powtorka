package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4, 5);
        car.TurnOnLights();
        Convertible convertible = new Convertible(4, 2);

        System.out.println(car.getSeats());
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
        car.displayNumberOfSeats();
    }
}
