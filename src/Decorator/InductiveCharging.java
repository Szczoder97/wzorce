package Decorator;

public class InductiveCharging extends CarAccesoriesDecorator {
    private Car car;

    public InductiveCharging(Car car) {
        this.car = car;
    }

    @Override
    public String name() {
        return car.name() + " with inductive phone charging function";
    }

    @Override
    public double price() {
        return car.price() + 500F;
    }

    @Override
    public String description() {
        return car.description() + " Charge your phone without wires!";
    }
}
