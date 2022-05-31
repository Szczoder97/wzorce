package Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private List<Car> cars = new ArrayList<>();

    public void addCar(double x, double y, double fuel, String name, int maxSpeed) {
        CarType type = CarFactory.getCarType(name, maxSpeed);
        Car car = new Car(x, y, fuel, type);
        cars.add(car);
    }

    @Override
    public String toString() {
        String result = "List of cars:\n";
        for (Car car : cars)
            result += car.toString();
        return result;
    }
}
