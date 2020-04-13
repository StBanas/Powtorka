package com.kodilla.abstracts.homework;

public class Square extends Shape{


    public Square() {
        super(1,1);
    }

    @Override
    public int getDimension1() {
        return super.getDimension1();
    }

    public int area() {
        int area = getDimension1() * getDimension1();
        return  area;
    }
    public int perimiter() {
        int perimiter = getDimension1() * 4;
        return perimiter;

    }
}
