package oop2.assignment1.q1;

public class Fish extends Animal {

    private String name;
    private String scaleColor;

    public Fish(String name, String scaleColor) {
        setName(name);
        setScaleColor(scaleColor);
    }

    public Fish() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScaleColor() {
        return scaleColor;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public void swim() {
        System.out.println("Fish swimming.");
    }

}
