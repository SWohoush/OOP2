package oop2.assignment1.q2;

public class Test {

    public static void main(String[] args) {
        HouseKey momsCopy = HouseKey.getInstance();
        HouseKey myCopy = HouseKey.getInstance();

        boolean isCopy = momsCopy == myCopy;
        System.out.println(isCopy);

    }
}
