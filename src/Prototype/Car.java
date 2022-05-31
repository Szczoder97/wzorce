package Prototype;

public class Car extends Vehicle {
    public double fuel;

    public Car(String name, int cost, double fuel) {
        super(name, cost);
        this.fuel = fuel;
    }

    public Car(Car target){
        super(target);
        if(target != null) {
            this.fuel = target.fuel;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Car) || !super.equals(object2)) return false;
        Car vehicle2 = (Car) object2;
        return vehicle2.fuel == fuel;
    }
}
