package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{


    public Rectangle() {
        super(1,2);
    }

    @Override
    public int getDimension2() {
        return super.getDimension2();
    }

    @Override
    public int getDimension1() {
        return super.getDimension1();
    }

    public int area() {
        int area = getDimension1() * getDimension2();
        return area;
    }
    public int  perimiter() {
        int perimiter = getDimension1() * 2 + getDimension2() * 2 ;
        return perimiter;

    }
}
