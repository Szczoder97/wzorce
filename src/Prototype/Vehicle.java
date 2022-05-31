package Prototype;

import java.awt.*;

public abstract class Vehicle {
    public String name;
    public int cost;

    public Vehicle() {
    }

    public Vehicle(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Vehicle(Vehicle target) {
        if (target != null) {
            this.name = target.name;
            this.cost = target.cost;
        }
    }

    public String getName() {
        return name;
    }

    public abstract Vehicle clone();

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Vehicle)) return false;
        Vehicle vehicle2 = (Vehicle) object2;
        return vehicle2.name == name && vehicle2.cost == cost;
    }
}
