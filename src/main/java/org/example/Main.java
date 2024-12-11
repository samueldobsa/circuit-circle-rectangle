package org.example;

public class Main {

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }

    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public static int calculateRectanglePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        double radius = 5.0;
        System.out.println("Circle Area: " + calculateCircleArea(radius));
        System.out.println("Circle Circumference: " + calculateCircleCircumference(radius));

        int width = 4;
        int height = 6;
        System.out.println("Rectangle Area (int): " + calculateRectangleArea(width, height));
        System.out.println("Rectangle Perimeter (int): " + calculateRectanglePerimeter(width, height));

        double widthDouble = 4.5;
        double heightDouble = 6.5;
        System.out.println("Rectangle Area (double): " + calculateRectangleArea(widthDouble, heightDouble));
        System.out.println("Rectangle Perimeter (double): " + calculateRectanglePerimeter(widthDouble, heightDouble));

        int n = 10;
        System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
    }
}
