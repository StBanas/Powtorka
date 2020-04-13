package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 12;
        int b = 13;
        int suma = calculator.add(a,b);
        boolean correct = ResultChecker.assertEquals(25,suma);
        System.out.println(correct);
    }
}
