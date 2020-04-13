package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows win3 = new Windows(1998);
        Linux redhat = new Linux(1988);

        System.out.println( win3.editionYear);
        System.out.println( redhat.editionYear);
        win3.turnOn();
        redhat.turnOff();
    }
}
