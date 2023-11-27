package oop2.assignment1.q1;

public class Test {

    public static void main(String[] args) {
        Animal gold = new GoldFish("fishy", "golden");
        zoo.performActivity(gold);

        Animal shark = new Shark();
        zoo.performActivity(shark);

        Animal eagle = new Eagle();
        zoo.performActivity(eagle);

        Animal penguin = new Penguin("gilbert", "navy blue");
        zoo.performActivity(penguin);

        GoldFish pet = new GoldFish();
        zoo.performActivity(pet);

        Bird bird = (Bird) eagle;
        bird.setName("blud");

        Fish fish = (Fish) shark;
        fish.setScaleColor("grey");

    }

}
