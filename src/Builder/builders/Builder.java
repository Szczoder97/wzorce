package Builder.builders;

import Builder.vehicles.Vehicle;
import Builder.vehicles.VehicleType;
import Builder.component.*;

public interface Builder {
    void VehicleType(VehicleType type);
    void setEngine(String name, double price);
    void setCargoBox(String name, double price);
    void setCamera(String name, double price);
}
