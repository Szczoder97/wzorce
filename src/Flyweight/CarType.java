package Flyweight;

public class CarType {
    private String name;
    private double maxSpeed;

    public CarType(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
