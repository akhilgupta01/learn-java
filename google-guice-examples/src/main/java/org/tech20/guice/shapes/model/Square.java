package org.tech20.guice.shapes.model;

public class Square implements Shape{
    private double sideLength;

    public Square(){
        this(1);
    }
    public Square(double sideLength){
        this.sideLength = sideLength;
    }

    public double area(){
        return sideLength * sideLength;
    }
}
