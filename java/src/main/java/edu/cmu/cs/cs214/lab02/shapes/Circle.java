package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double radius; // ⚡ radius-ийг private болгосон (Өмнө public байсан)

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() { // ⚡ Shape интерфэйсийн getArea()-г хэрэгжүүлсэн
        return Math.PI * radius * radius;
    }

    public double getRadius() { return radius; } // ⚡ getRadius() нэмсэн
}
