package oop2.assignment1.q2;

public class HouseKey {

    private static HouseKey instance = new HouseKey();

    private HouseKey() {
    }
    
    public static HouseKey getInstance() {
        return instance;
    }

}
