package oop2.week7.lecture1;

public class Subsystem2 implements Strategy {

    public void operation2() {
        System.out.println("Subsystem2:operation2");
    }

    public void doOperation() {
        operation2();
    }
}
