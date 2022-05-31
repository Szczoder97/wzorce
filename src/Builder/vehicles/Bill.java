package Builder.vehicles;

import Builder.component.*;

import java.util.List;
import java.util.Locale;

public class Bill {
    private final VehicleType type;
    private final Component engine;
    private final Component box;
    private final Component camera;

    public Bill(VehicleType type, Component engine, Component box, Component camera) {
        this.type = type;
        this.engine = engine;
        this.box = box;
        this.camera = camera;
    }

    @Override
    public String toString() {
        String bill = "Vehicle cost: \n";
        double cost = 0;
        for (var component : List.of(engine, box, camera))
            if(component != null){
                cost += component.getPrice();
                bill += String.format(Locale.FRANCE, "%s: %s\t %,.2f zł\n", component.getType(), component.getName(), component.getPrice());
            }
        bill += String.format(Locale.FRANCE, "---------\nTotal cost:\t%,.2f zł\n--------------------------", cost);
        return bill;
    }
}
