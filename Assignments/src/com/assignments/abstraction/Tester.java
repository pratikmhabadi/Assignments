package com.assignments.abstraction;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 for Rectangle | 2 for Square | 3 for Circle | 4 for Triangle");
        System.out.println("Select Shape you want : ");
        int shapeOperation = sc.nextInt();// input for selecting shapes

        System.out.println("1 for Area | 2 for Perimeter");
        System.out.println("Select your operation : ");
        int operation = sc.nextInt(); // input for operation


        if (operation == 1) {
            //switch for area
            switch (shapeOperation) {
                case 1://rectangle
                    //input for rectangle
                    System.out.println("------You Selected Area of Rectangle-----");
                    System.out.println("Enter the Length of Rectangle :");
                    double length = sc.nextDouble(); // length input
                    System.out.println("Enter the Breath of Rectangle :");
                    double breath = sc.nextDouble(); // breath input

                    Shapes rectangle = new Rectangle(length, breath);
                    double rectangleArea = rectangle.area();
                    System.out.format("Area of Rectangle is :%.2f" , rectangleArea);
                    break;

                case 2://square
                    //input for square
                    System.out.println("------You Selected Area of Square-----");
                    System.out.println("Enter the Side of Square :");
                    double side = sc.nextDouble();

                    Shapes square = new Square(side);
                    double squareArea = square.area();
                    System.out.format("Area of Square is :%.2f" , squareArea);
                    break;

                case 3://circle
                    //input for circle
                    System.out.println("------You Selected Area of Circle-----");
                    System.out.println("Enter the radius of circle");
                    double radius = sc.nextDouble();

                    Shapes circle = new Circle(radius);
                    double circleArea = circle.area();
                    System.out.format("Area of circle is :%.2f" , circleArea);
                    break;

                case 4://triangle
                    //input for triangle
                    System.out.println("------You Selected Area of Triangle-----");
                    System.out.println("Enter the Base of Triangle");
                    double base = sc.nextDouble();//input for base
                    System.out.println("Enter the Height of Triangle");
                    double height = sc.nextDouble();//input for height

                    Shapes triangle = new Triangle(base, height);
                    double triangleArea = triangle.area();
                    System.out.format("Area of Triangle is : %.2f" , triangleArea);
                    break;

                default://for invalid input
                    System.out.println("INVALID INPUT");
                    break;
            }

        } else if (operation == 2) {
            //switch for perimeter
            switch (shapeOperation) {
                case 1: //rectangle
                    //input for rectangle
                    System.out.println("------You Selected Perimeter of Rectangle-----");
                    System.out.println("Enter Length of Rectangle :");
                    double length = sc.nextDouble(); // length input
                    System.out.println("Enter Breath of Rectangle :");
                    double breath = sc.nextDouble(); // breath input

                    Shapes rectangle = new Rectangle(length, breath);
                    double rectanglePerimeter = rectangle.perimeter();
                    System.out.format("Perimeter of Rectangle is :%.2f" , rectanglePerimeter);
                    break;

                case 2://square
                    //input for square
                    System.out.println("------You Selected Perimeter of Square-----");
                    System.out.println("Enter the Side of Square :");
                    double side = sc.nextDouble();

                    Shapes square = new Square(side);
                    double squarePerimeter = square.perimeter();
                    System.out.format("Perimeter of Square is :%.2f" , squarePerimeter);
                    break;

                case 3://circle
                    //input for circle
                    System.out.println("------You Selected Perimeter of Circle-----");
                    System.out.println("Enter the radius of circle");
                    double radius = sc.nextDouble();

                    Shapes circle = new Circle(radius);
                    double circlePerimeter = circle.perimeter();
                    System.out.format("Perimeter of circle is :%.2f" , circlePerimeter);
                    break;
                case 4://triangle
                    //input for triangle
                    System.out.println("------You Selected Perimeter of Triangle-----");
                    System.out.println("Enter the Side A of Triangle");
                    double sideA = sc.nextDouble();//input for base
                    System.out.println("Enter the Side B of Triangle");
                    double sideB = sc.nextDouble();//input for height
                    System.out.println("Enter the Side C of Triangle");
                    double sideC = sc.nextDouble();//input for height

                    Shapes triangle = new Triangle(sideA, sideB, sideC);
                    double trianglePerimeter = triangle.perimeter();
                    System.out.format("Perimeter of Triangle is : %.2f" , trianglePerimeter);
                    break;
                default://for invalid input
                    System.out.println("INVALID INPUT");
                    break;
            }
        } else {
            //if invalid input
            System.out.println("INVALID INPUT");
        }
    }
}
