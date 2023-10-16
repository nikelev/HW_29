package ait.homework;

public class Circle extends Shape{

    public Circle(double side) {
        super(side);
    }

    @Override
    protected double calcArea() {
        double res;
        res=Math.PI*(side*side);
        return res;
    }

    @Override
    protected double calcPerimeter() {
        double res;
        res=2*Math.PI*side;
        return res;
    }


}
