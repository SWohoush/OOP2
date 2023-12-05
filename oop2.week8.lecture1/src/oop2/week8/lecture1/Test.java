package oop2.week8.lecture1;

public class Test {

    public static void main(String[] args) {
        C c = new D();
        B b = new B();
        b.setC(c);
        b.process("????");
    }

}
