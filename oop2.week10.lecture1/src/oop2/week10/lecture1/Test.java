package oop2.week10.lecture1;

public class Test {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.addListener(b);
        a.addListener(new C());
        a.m1();
    }

}
