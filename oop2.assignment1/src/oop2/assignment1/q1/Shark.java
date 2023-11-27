package oop2.assignment1.q1;

public class Shark extends Fish {

    public Shark(String name, String scaleColor) {
        super(name, scaleColor);
    }

    public Shark() {
    }

    public void swim() {
        System.out.println("Shark swimming in the deep,");
    }
}
