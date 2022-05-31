package Decorator;

public class PoloCar extends Car {
    @Override
    public String name() {
        return "Polo";
    }

    @Override
    public double price() {
        return 79790;
    }

    @Override
    public String description() {
        return "Polo is the car for you.";
    }
}
