package oop2.assignment1.q1;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
    }

    public Penguin() {
    }

    public void fly() {
        System.out.println("Penguin cannot fly.");
    }
}
