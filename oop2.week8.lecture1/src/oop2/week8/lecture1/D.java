package oop2.week8.lecture1;

public class D extends C {

    @Override
    public void m1(String s) {
        A a = new A();
        a.m1(s.toCharArray());
    }
}
