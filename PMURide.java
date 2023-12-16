import java.util.ArrayList;
import java.util.List;

public class PMURide {
    private static UserAccount currentUser = null;
    private static List<UserAccount> userAccountsData = new ArrayList<>();

    public static void main(String[] args) {
        // Your existing main method code...
    }

    public static void changePassword(String newPassword) {
        if (currentUser == null) {
            System.out.println("No user is currently logged in.");
        } else {
            currentUser.setPassword(newPassword);
            System.out.println("Password changed successfully for " + currentUser.getEmail());
        }
    }

    public static void printWelcomeMessage() {
        int header = 29;

        for (int i = 0; i <= header; i++) {
            if (header/2 == i) {
                System.out.print("Welcome To PMU Ride");
            }
            System.out.print('*');
        }
        System.out.println(); // Print a new line for formatting
    }
}
