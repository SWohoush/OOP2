package oop2.week7.lecture1;

public class Facade {

    private Strategy strategy;

    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void operate() {
        System.out.println("Facade is coordinating the subsystems");
        subsystem1.operation1();
        subsystem2.operation2();
    }

    public Facade(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doOperation() {
        strategy.doOperation();
    }
}
