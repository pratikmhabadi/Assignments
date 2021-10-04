package com.assignments.abstraction;

public class Square extends Shapes {
    private final double side;

    public Square(double radius) {
        this.side = radius;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return 4 * side;
    }
}
