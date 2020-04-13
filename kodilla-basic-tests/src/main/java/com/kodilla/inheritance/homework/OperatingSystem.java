package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int editionYear;
    public OperatingSystem(int editionYear) {
        this.editionYear = editionYear;

    }
    public void turnOn(){
        System.out.println("System operacyjny : " + this.editionYear + " turned on" );
    }
    public void turnOff(){
        System.out.println("System operacyjny : " + this.editionYear + " turned off" );
    }
}
