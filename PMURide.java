import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PMURide {
    private static UserAccount currentUser = null;
    private static List<UserAccount> userAccountsData = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printWelcomeMessage();

        boolean loopControl = true;
        while (loopControl) {
            loopControl = false;

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                default:
                    System.out.println("Input is invalid try again");
                    loopControl = true;
                    break;
            }
        }
    }

    public static boolean changePasswordRequest() {


    }

    public static boolean changePassword(String newPassword) {
        if (currentUser == null) {
            System.out.println("No user is currently logged in.");
            return false;
        } else {
            currentUser.setPassword(newPassword);
            System.out.println("Password changed successfully for " + currentUser.getEmail());
            return true;
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
        System.out.print("\n\n");
        System.out.println("Please choose from the following (Type the number then hit enter):");
        System.out.println("\t1: Create Account");
        System.out.println("\t2: Log in");
        System.out.println("\t3: Reset Password");

        }

    }
