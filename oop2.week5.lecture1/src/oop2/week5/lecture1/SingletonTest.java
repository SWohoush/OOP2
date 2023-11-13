package oop2.week5.lecture1;

public class SingletonTest {

    private static SingletonTest instance;

    private SingletonTest() {
        System.out.println("construction");
    }

    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }

    public void hello() {
        System.out.println("hey");
    }

}
