package ait.homework;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] array=new Shape[4] ;
        array[0]=new  Circle(2);
        array[1]=new Circle(3);
        array[2]=new Triangle(4);
        array[3]=new Square(5);
        double sumArea=sumArea(array);
        System.out.println("The amount Area is: "+sumArea);
        double sumPerimetr=sumPerimetr(array);
        System.out.println("The amount Perimetr is: "+sumPerimetr);
        double sumCircleArea=sumCircleArea(array);
        System.out.println("The amount CircleArea is: "+sumCircleArea);


    }
    public static double sumArea(Shape[]arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].calcArea();
        }return sum;
    }

    public static double sumPerimetr(Shape[]arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].calcPerimeter();
        }return sum;
    }
    public static double sumCircleArea(Shape[]arr){
        double sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]instanceof Circle  ){
                sum+=((Circle)arr[i]).calcArea();
            }
        }return sum;

    }
}
