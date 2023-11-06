package oop2.week4.lecture1;

public class A implements Speak {

    public void m1() {
        System.out.println("hello from A");
    }

    @Override
    public void hello() {
        System.out.println("hello from A again");
    }
}
