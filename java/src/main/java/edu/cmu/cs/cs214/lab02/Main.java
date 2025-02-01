package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3); //  Rectangle-ийг Shape интерфэйсээр авдаг болсон
        Renderer renderer = new Renderer(rectangle);
        renderer.draw(); //  Дүрсийн нэрийг автоматаар хэвлэнэ

        Shape circle = new Circle(5); //  Одоо Renderer нь зөвхөн Rectangle биш, бүх Shape-ийг дэмжинэ
        new Renderer(circle).draw();

        Shape square = new Square(4);
        new Renderer(square).draw();
    }
}
