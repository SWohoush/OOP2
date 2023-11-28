package oop2.week7.lecture1;

public class Subsystem1 implements Strategy {

    public void operation1() {
        System.out.println("Subsystem1:operation1");
    }

    public void doOperation() {
        operation1();
    }
}
