package oop2.week4.lecture2;

import java.util.Random;

public class StreamTest {

    public static void main(String args[]) {
        int count = new Random()
                .ints(1, 1000)
                .limit(10_000)
                .distinct()
                .sorted()
                .map(v -> v)
                .filter(v -> v % 5 == 0)
                .sum();

    }

}

