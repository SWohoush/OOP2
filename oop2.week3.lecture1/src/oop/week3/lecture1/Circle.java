package oop.week3.lecture1;

public class Circle {
    int radius;
    
    public double getRound(){
        double round=2*Math.PI*radius;
        return round;
    }
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
    
}
