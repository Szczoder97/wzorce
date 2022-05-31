package com.company;

import Adapter.Data;
import Adapter.DataParser;
import Adapter.PersonalDataCollector;
import Builder.builders.BillBuilder;
import Builder.builders.VehicleBuilder;
import Builder.director.Director;
import Factory.AttachmentItemProducer;
import Factory.DocumentItemProducer;
import Flyweight.Map;
import Observer.AlienFapnage;
import Observer.MoonStation;
import Observer.NASAFanpage;
import Prototype.Bike;
import Prototype.Car;
import Prototype.Vehicle;
import Singleton.ChatMember;
import Singleton.GlobalChatRoom;
import Strategy.*;
import Decorator.*;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // 1. Strategy Pattern
        System.out.println("1.=========================================================================================");
        var TheBestBank = new Bank(new NiceDeposit(), new NiceLoan());
        var BankForDeposit = new Bank(new NiceDeposit(), new BadLoan());
        var GreedyBank = new Bank(new BadDeposit(), new BadLoan());
        TheBestBank.displayBehaviors();
        BankForDeposit.displayBehaviors();
        GreedyBank.displayBehaviors();

        // 2. Observer Pattern
        System.out.println("2.=========================================================================================");
        var moonStation = new MoonStation();
        var nasaFanpage = new NASAFanpage(moonStation);
        var alienFanpage = new AlienFapnage(moonStation);
        moonStation.add(nasaFanpage);
        moonStation.add(alienFanpage);
        moonStation.notifyObservers();

        // 3. Singleton Pattern
        System.out.println("3.=========================================================================================");
        var chatMember1 = new ChatMember("First", GlobalChatRoom.getChatRoom());
        chatMember1.sendMessage("hello!");
        var chatMember2 = new ChatMember("Second", GlobalChatRoom.getChatRoom());
        // this should print hello from chatMember1
        chatMember2.readMessages();

        // 4. Adapter Pattern
        System.out.println("4.=========================================================================================");
        var dataCollector = new PersonalDataCollector(new DataParser(new Data()));
        //dataCollector.collect(dataCollector.dataParser.request());

        // 5. Decorator Pattern
        System.out.println("5.=========================================================================================");
        var poloCarPoor = new PoloCar();
        var poloCarWithSoundSystem = new BeatsSoundSystem(new PoloCar());
        var poloCarFull = new InductiveCharging(poloCarWithSoundSystem);

        for (var car : List.of(poloCarPoor, poloCarWithSoundSystem, poloCarFull)) {
            System.out.println("name: " + car.name());
            System.out.println("description: " + car.description());
            System.out.println(String.format(Locale.FRANCE, "price: %,.2f zł", car.price()));
            System.out.println();
        }

        // 6. Builder Pattern
        System.out.println("6.=========================================================================================");
        Director director = new Director();

        var garbageTruckBuilder = new VehicleBuilder();
        director.constructGarbageTruck(garbageTruckBuilder);
        var garbageTruck = garbageTruckBuilder.getResult();
        System.out.println("Vehicle type: " + garbageTruck.getType());

        var garbageTruckBillBuilder = new BillBuilder();
        director.constructGarbageTruck(garbageTruckBillBuilder);
        var garbageTruckBill = garbageTruckBillBuilder.getResult();
        System.out.println(garbageTruckBill.toString());

        var roadSweeperBuilder = new VehicleBuilder();
        director.constructRoadsweeper(roadSweeperBuilder);
        var roadSweeper = roadSweeperBuilder.getResult();
        System.out.println("Vehicle type: " + roadSweeper.getType());

        var roadSweeperBillBuilder = new BillBuilder();
        director.constructGarbageTruck(roadSweeperBillBuilder);
        var roadSweeperBill = roadSweeperBillBuilder.getResult();
        System.out.println(roadSweeperBill.toString());

        // 7. Factory Pattern
        System.out.println("7.=========================================================================================");
        var documentItemProducer = new DocumentItemProducer();
        var document = documentItemProducer.createItem();
        System.out.println(document.toString());

        var attachmentItemProducer = new AttachmentItemProducer();
        var attachment = attachmentItemProducer.createItem();
        System.out.print(attachment.toString());

        // 8. Flyweight Pattern
        System.out.println("8.=========================================================================================");
        var map = new Map();
        map.addCar(21.00, 37.00, 43.0, "Star 660", 100);
        map.addCar(54.445, 18.556, 23.5, "Daewoo Tico", 240);
        map.addCar(55.232, 17.40, 43.0, "Daewoo Tico", 240);
        System.out.print(map.toString());

        // 9. Prototype Pattern
        System.out.println("9.=========================================================================================");
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> vehiclesCopy = new ArrayList<>();

        Car car = new Car("Fiat 500", 10000, 34.2);
        vehicles.add(car);

        Car anotherCar = (Car) car.clone();
        vehicles.add(anotherCar);

        Bike bike = new Bike("Wigry 3", 100, 24);
        vehicles.add(bike);

        for (Vehicle vehicle : vehicles) {
            vehiclesCopy.add(vehicle.clone());
        }

        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i) != vehiclesCopy.get(i) && vehicles.get(i).equals(vehiclesCopy.get(i)))
                System.out.println(vehicles.get(i).getName() + ": Vehicles are identical but different objects");
        }
    }
}
