package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double sideLen; // ⚡ sideLen-ийг private болгосон

    public Square(double sideLen) {
        this.sideLen = sideLen;
    }

    @Override
    public double getArea() { // ⚡ Shape интерфэйсийн getArea()-г хэрэгжүүлсэн
        return sideLen * sideLen;
    }

    public double getSideLen() { return sideLen; } // ⚡ getSideLen() нэмсэн
}
