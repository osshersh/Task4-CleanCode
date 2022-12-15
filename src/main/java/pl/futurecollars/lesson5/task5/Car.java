package pl.futurecollars.lesson5.task5;

public class Car extends Vehicle {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
