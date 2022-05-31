package Builder.builders;

import Builder.vehicles.*;
import Builder.component.*;

public class VehicleBuilder implements Builder {
    private VehicleType type;
    private Component engine;
    private Component box;
    private Component camera;

    @Override
    public void VehicleType(VehicleType type) {
        this.type = type;
    }

    @Override
    public void setEngine(String name, double price) {
        this.engine = new Component("Engine", name, price);
    }

    @Override
    public void setCargoBox(String name, double price) {
        this.box = new Component("Cargo box", name, price);
    }

    @Override
    public void setCamera(String name, double price) {
        this.camera = new Component("Camera", name, price);
    }

    public Vehicle getResult() {
        return new Vehicle(type, engine, box, camera);
    }
}
