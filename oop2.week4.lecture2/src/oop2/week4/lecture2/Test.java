package oop2.week4.lecture2;

public class Test {

    public static void main(String args[]) {
        Student std1 = new Student();
        std1.setId(12345678);
        
        Student std2 = new Student(123, "s", 4, "gg@");
        
        Student std3 = new Student();
        std3.withId(3456).withName("welp").withGpa(3.99).withEmail("t@w");

    }
}
