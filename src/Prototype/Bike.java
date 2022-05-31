package Prototype;

public class Bike extends Vehicle {
    public int wheelSize;

    public Bike(String name, int cost, int wheelSize) {
        super(name, cost);
        this.wheelSize = wheelSize;
    }

    public Bike(Bike target){
        super(target);
        if(target != null) {
            this.wheelSize = target.wheelSize;
        }
    }

    @Override
    public Bike clone() {
        return new Bike(this);
    }

    @Override
    public boolean equals(Object object2) {
        if(!(object2 instanceof Bike) || !super.equals(object2)) return false;
        Bike vehicle2 = (Bike) object2;
        return vehicle2.wheelSize == wheelSize;
    }
}
