package Singleton;

import java.util.ArrayList;
import java.util.List;

public class GlobalChatRoom {
    private static GlobalChatRoom instance;

    private List<String> messages = new ArrayList<String>();

    private GlobalChatRoom() {}

    public static GlobalChatRoom getChatRoom() {
        if (instance == null) {
            instance = new GlobalChatRoom();
        }
        return instance;
    }

    public void send(String message) {
        messages.add(message);
    }

    public void updateChat(){
        for (var message : messages) {
            System.out.println(message);
        }
    }
}
