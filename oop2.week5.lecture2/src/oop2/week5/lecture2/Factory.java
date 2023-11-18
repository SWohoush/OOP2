package oop2.week5.lecture2;


public class Factory {

    public A create(int num) {
        if (num == 1) {
            return new B();
        } else if (num == 2) {
            return new C();

        }
        return null;
    }
}
