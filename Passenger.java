import java.util.ArrayList;
import java.util.List;

public class Passenger extends UserAccount {
    private List<String> messages;
    private boolean hasNewMessages;
    private String name;

    @Override
    public String toString() {
        return super.toString() + "Name: " + name + "\n" + "Account Type: Passenger";
    }

    public Passenger(String name, String email, String password) {
        super(email, password);

        this.messages = new ArrayList<>();
        this.hasNewMessages = false;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Method to send a message
    public void sendMessage(String message) {
        // This method would typically interact with a messaging system.
        // For simplicity, we're just printing out the message.
        System.out.println("Sending message: " + message);
        // Add logic to send message
    }

    // Method to receive a message
    public void receiveMessage(String message) {
        messages.add(message);
        hasNewMessages = true;
        System.out.println("New message received: " + message);
        // Add logic to handle the received message
    }

    // Method to notify the passenger about new messages
    public void notifyNewMessage() {
        if (hasNewMessages) {
            System.out.println("You have new messages.");
            // Additional logic to notify the passenger
            // After notifying, we can reset the new message flag
            hasNewMessages = false;
        }
    }

    // Method to read messages
    public void readMessages() {
        if (messages.isEmpty()) {
            System.out.println("No messages.");
        } else {
            System.out.println("Reading messages:");
            for (String message : messages) {
                System.out.println(message);
            }
        }
    }
}
