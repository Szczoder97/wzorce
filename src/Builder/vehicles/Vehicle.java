package Builder.vehicles;

import Builder.component.*;

public class Vehicle {
    private final VehicleType type;
    private final Component engine;
    private final Component box;
    private final Component camera;

    public Vehicle(VehicleType type, Component engine, Component box, Component camera) {
        this.type = type;
        this.engine = engine;
        this.box = box;
        this.camera = camera;
    }

    public VehicleType getType() {
        return type;
    }

    public Component getEngine() {
        return engine;
    }

    public Component getBox() {
        return box;
    }

    public Component getCamera() {
        return camera;
    }
}
