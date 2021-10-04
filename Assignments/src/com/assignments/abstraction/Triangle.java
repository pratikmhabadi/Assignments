package com.assignments.abstraction;

public class Triangle extends Shapes {
    private final double one;
    private final double two;
    private double three;

    public Triangle(double one, double two, double three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    public Triangle(double one, double two) {
        this.one = one;
        this.two = two;
    }

    @Override
    public double area() {
        return (one * two) / 2;
    }

    @Override
    public double perimeter() {
        return one + two + three;
    }
}
