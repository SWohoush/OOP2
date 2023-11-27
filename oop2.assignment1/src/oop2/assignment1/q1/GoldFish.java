package oop2.assignment1.q1;

public class GoldFish extends Fish {

    public GoldFish(String name, String scaleColor) {
        super(name, scaleColor);
    }

    public GoldFish() {
    }

    public void swim() {
        System.out.println("Goldfish swimming in a bowl.");
    }

}
