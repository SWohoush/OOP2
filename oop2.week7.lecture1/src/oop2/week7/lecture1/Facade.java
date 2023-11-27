package oop2.week7.lecture1;

public class Facade {

    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void operate() {
        System.out.println("Facade is coordinating thee subsystems");
        subsystem1.operation1();
        subsystem1.operation1();
    }

}
