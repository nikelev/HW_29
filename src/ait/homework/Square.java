package ait.homework;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    @Override
    protected double calcArea() {
        double res;
        res=side*side;

        return res;
    }

    @Override
    protected double calcPerimeter() {
        double res;
        res=side*4;

        return res;
    }
}
