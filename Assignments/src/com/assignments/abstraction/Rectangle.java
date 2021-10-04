package com.assignments.abstraction;

public class Rectangle extends Shapes {
    private final double length;
    private final double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public double area() {
        return length * breath;
    }

    public double perimeter() {
        return 2 * (length + breath);
    }
}
