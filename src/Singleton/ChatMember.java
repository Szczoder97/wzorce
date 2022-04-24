package Singleton;

public class ChatMember {
    private String name;
    private GlobalChatRoom chatRoom;

    public ChatMember(String name, GlobalChatRoom chatRoom) {
        this.name = name;
        this.chatRoom = chatRoom;
    }

    public String getName() {
        return this.name;
    }

    public void sendMessage(String message) {
        this.chatRoom.send(this.name + ": " + message);
    }

    public void readMessages() {
        this.chatRoom.updateChat();
    }

}
