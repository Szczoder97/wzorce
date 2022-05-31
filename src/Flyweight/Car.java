package Flyweight;

public class Car {
    private double x;
    private double y;
    private double fuel;
    private CarType type;

    public Car(double x, double y, double fuel, CarType type) {
        this.x = x;
        this.y = y;
        this.fuel = fuel;
        this.type = type;
    }

    @Override
    public String toString() {
        return  "x = " + x +
                "\ny = " + y +
                "\nfuel = " + fuel +
                "l\ntype = " + type.toString() +
                "\n------------\n";
    }
}
