package oop2.assignment1.q1;

public class Bird extends Animal {

    private String name;
    private String color;

    public Bird(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Bird() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void fly() {
        System.out.println("Bird flying.");
    }
}
