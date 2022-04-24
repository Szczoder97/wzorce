package com.company;

import Adapter.Data;
import Adapter.DataParser;
import Adapter.PersonalDataCollector;
import Observer.AlienFapnage;
import Observer.MoonStation;
import Observer.NASAFanpage;
import Singleton.ChatMember;
import Singleton.GlobalChatRoom;
import Strategy.*;

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
    }

}
