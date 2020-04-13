package com.kodilla.abstracts.homework;


public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.getDimension1();
        rectangle.getDimension2();
        Square square = new Square();
        square.getDimension1();


        System.out.println(rectangle.area());
        System.out.println(rectangle.perimiter());

        System.out.println(square.area());
        System.out.println(square.perimiter());
    }
}
