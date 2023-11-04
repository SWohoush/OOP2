package oop2.week3.lecture2;

import static oop2.week3.lecture2.Util.*;

public class Test {

    public static void main(String args[]) {

        Circle c1 = new Circle(129);
        println(c1.getRound());
        Circle c2 = new Circle();
        c2.setRad(15);
        print(c2.getArea());

    }
}
