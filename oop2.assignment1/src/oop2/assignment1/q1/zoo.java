package oop2.assignment1.q1;

public class zoo {

    public static void performActivity(Animal animal) {
        if (animal instanceof Bird) {
            if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            } else if (animal instanceof Penguin) {
                ((Penguin) animal).fly();
            }
        } else if (animal instanceof Fish) {
            if (animal instanceof Shark) {
                ((Shark) animal).swim();
            } else if (animal instanceof GoldFish) {
                ((GoldFish) animal).swim();
            }
        } else {
            animal.makeSound();
        }
    }

}
