package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double height; // ⚡ Өмнө public байсан, private болгосон (нууцлах)
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() { // ⚡ Shape интерфэйсийн getArea()-г хэрэгжүүлсэн
        return height * width;
    }

    public double getHeight() { return height; } // ⚡ getHeight() нэмсэн
    public double getWidth() { return width; } // ⚡ getWidth() нэмсэн
}
