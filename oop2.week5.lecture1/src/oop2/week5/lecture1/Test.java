package oop2.week5.lecture1;

public class Test {

    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            SingletonTest p = SingletonTest.getInstance();
            p.hello();
        }

    }

}
