package LabPracticeiv;

abstract class Shapes{
    abstract double getArea();
    abstract double getPerimeter();
}

class Circles extends Shapes {
     double radius;

    Circles(double radius) {
        this.radius = radius;
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shapes {
     double length;
     double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double getArea() {
        return length * width;
    }
    double getPerimeter() {
        return 2 * (length + width);
    }
}
class Triangles extends Shapes {
     double side1;
     double side2;
     double side3;
     double base;
     double height;

    Triangles(double side1, double side2, double side3, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    double getArea() {
        return 0.5 * base * height;
    }

    double getPerimeter() {
        return side1 + side2 + side3;
    }
}

public class MyClass5 {
    public static void main(String[] args) {
        Shapes circle = new Circles(5);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        Shapes rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Shapes triangle = new Triangles(3, 4, 5, 4, 6);
        System.out.println("Triangle Area: " + triangle.getArea());
        System.out.println("Triangle Perimeter: " + triangle.getPerimeter());
    }
}
