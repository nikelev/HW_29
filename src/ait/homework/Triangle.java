package ait.homework;

public class Triangle extends Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    protected double calcArea() {
        double res;
        res=(side*side*Math.sqrt(3))/4;

        return res;
    }

    @Override
    protected double calcPerimeter() {
        double res;
        res=3*side;

        return res;
    }
}
