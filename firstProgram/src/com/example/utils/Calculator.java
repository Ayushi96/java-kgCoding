package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Square;

public class Calculator {

    public static double calculateArea(double r){
        return Math.PI * r * r;
    }

    public static double calculateArea(double l, double w){
        return l * w;
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
        double circleArea = calculateArea(c1.getRadius());
        System.out.println("Area of circle is " + circleArea);
        Square sq = new Square(10, 5.5);
        double squareArea = calculateArea(sq.getLength(), sq.getWidth());
        System.out.println("Area of square is "+ squareArea);

    }
}
