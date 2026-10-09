class MessageService {

    // Sending normal message
    public void sendMessage(String text) {
        System.out.println("Text message: " + text);
    }

    // Sending message with receiver
    public void sendMessage(String text, String receiver) {
        System.out.println("Message to " + receiver + ": " + text);
    }

    // Sending multiple messages
    public void sendMessage(String text, int count) {
        System.out.println("Sending message " + count + " times: " + text);
    }
}

public class CompiletimePolymorphism {
    public static void main(String[] args) {

        MessageService ms = new MessageService();

        ms.sendMessage("Hello");

        ms.sendMessage("Meeting at 5 PM", "Rahul");

        ms.sendMessage("Welcome", 3);
    }
}