package Builder.director;

import Builder.builders.Builder;
import Builder.vehicles.VehicleType;
import Builder.component.*;

public class Director {
    public void constructGarbageTruck(Builder builder){
        builder.VehicleType(VehicleType.GARBAGE_TRUCK);
        builder.setEngine("TDI 1.9",10000);
        builder.setCargoBox("DELTA 2301",200000);
        builder.setCamera("Canon",200);
    }
    public void constructRoadsweeper(Builder builder){
        builder.VehicleType(VehicleType.SWEPPER_TRUCK);
        builder.setEngine("Ecoboost 1.0",8000);
        builder.setCargoBox("VIAJET",15000);
    }
}
