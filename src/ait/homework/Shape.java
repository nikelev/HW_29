package ait.homework;

public abstract class Shape {
    double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }

    protected abstract double calcArea();

    protected abstract double  calcPerimeter();

}
