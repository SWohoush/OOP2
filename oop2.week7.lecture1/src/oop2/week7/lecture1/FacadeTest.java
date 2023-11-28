package oop2.week7.lecture1;

public class FacadeTest {

    public static void main(String[] args) {
        Facade facade1 = new Facade();
        facade1.operate();

        Facade facade2 = new Facade(new Subsystem1());
        facade2.doOperation();

        Facade facade3 = new Facade(new Subsystem2());
        facade3.doOperation();

    }
}
