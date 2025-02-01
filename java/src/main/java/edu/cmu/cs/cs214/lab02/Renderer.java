package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape shape; // ⚡ shape хувьсагчийг private болгож өгөгдлийг нууцалсан

    public Renderer(Shape shape) { // ⚡ Rectangle биш, ерөнхий Shape интерфэйсийг хүлээж авдаг болгосон
        this.shape = shape;
    }

    public void draw() {
        String shapeName = shape.getClass().getSimpleName(); // ⚡ Объектын нэрийг автоматаар авдаг болсон
        double area = shape.getArea();
        System.out.println(shapeName + " printed\n" + "Its area is " + area);
    }
}
