package oop2.week3.lecture2;

import javax.swing.JOptionPane;

public class Util {

    public static <T> void println(T msg) {
        System.out.println(msg);
    }

    public static <T> void print(T msg) {
        System.out.print(msg);
    }

    public static void println(int msg) {
        System.out.println(msg);
    }

    public static void print(int msg) {
        System.out.print(msg);
    }

    public static void println(double msg) {
        System.out.println(msg);
    }

    public static void print(double msg) {
        System.out.print(msg);
    }

    public static int readNumber(String msg) {
        String str = JOptionPane.showInputDialog(msg);
        int number = Integer.parseInt(str);
        return number;
    }

    public static int readNumber() {
        return readNumber("Please input a number");
    }

}
