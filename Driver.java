public class Driver extends UserAccount {
    private String name;
    private float rating;

    public Driver(String name, String email, String password) {
        super(email, password); // Call to UserAccount constructor
        this.name = name;
        this.rating = 0.0f;
    }

    @Override
    public String toString() {
        return super.toString() + "Name: " + name + "\n" + "Current Rating: " + rating + "\n" + "Account Type: Driver";
    }

    // View available drivers - placeholder for actual implementation
    public void viewAvailableDrivers() {
        System.out.println("Displaying available drivers...");
        // Add logic to display available drivers
    }

    // View a specific driver's profile
    public void viewDriverProfile(String driverId) {
        System.out.println("Viewing profile of driver with ID: " + driverId);
        // Add logic to display a specific driver's profile
    }

    // Send a message - assuming this is a message to passengers or the system

    public void sendMessage(String message) {
        System.out.println("Driver sending message: " + message);
        //logic for sending a message
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
