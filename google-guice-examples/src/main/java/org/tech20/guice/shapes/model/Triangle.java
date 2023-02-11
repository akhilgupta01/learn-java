package org.tech20.guice.shapes.model;

public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(){
        this(1,1);
    }

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height * 0.5;
    }
}
