package mediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User john = new ChatUser(chatRoom, "John");
        User jane = new ChatUser(chatRoom, "Jane");
        User bob = new ChatUser(chatRoom, "Bob");

        chatRoom.addUser(john);
        chatRoom.addUser(jane);
        chatRoom.addUser(bob);

        john.sendMessage("Hello, everyone!");
        jane.sendMessage("Hi, John!");
    }
}

