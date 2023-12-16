import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PMURide {
    private static UserAccount currentUser = null;
    private static List<UserAccount> userAccountsData = new ArrayList<>();
    private static final int header = 29;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printWelcomeMessage();

        boolean loopControl = true;
        while (loopControl) {
            printMainMenu();

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    createAccountRequest();
                    break;

                case 2:
                    loginRequest();
                    break;

                case 3:
                    changePasswordRequest();
                    break;

                case 4:
                    loopControl = false;
                    printGoodbyeMessage();
                    break;

                default:
                    System.out.println("Input is invalid try again");
                    break;
            }
        }
    }

    public static void createAccountRequest() {
        boolean isDriver = false;
        System.out.println("Are you a driver? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            isDriver = true;
        }

        System.out.print("\nPlease enter your email address: ");
        String email = scanner.next();

        System.out.print("\nPlease enter your Password: ");
        String password = scanner.next();

        System.out.print("\nPlease enter your name: ");
        String name = scanner.next();

        boolean accountCreated = createAccount(name, email, password, isDriver);
        if (accountCreated) {
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account creation failed. Email already in use.");
        }
    }

    public static boolean createAccount(String name, String email, String password, boolean isDriver) {
        for (UserAccount account : userAccountsData) {
            if (account.getEmail().equalsIgnoreCase(email)) {
                return false; // Email already exists
            }
        }

        UserAccount newAccount;
        if (isDriver) {
            newAccount = new Driver(name, email, password);
        }
        else {
            newAccount = new Passenger(name, email, password);
        }
        userAccountsData.add(newAccount);
        return true;
    }

    public static void loginRequest() {
        System.out.print("\nPlease enter your email address: ");
        String email = scanner.next();

        System.out.print("\nPlease enter your Password: ");
        String password = scanner.next();

        boolean loginState = login(email, password);
        if(loginState) {
            System.out.println("You have been Logged in Successfully\n");
            System.out.println(currentUser);
        }
        else {
            System.out.println("Email or Password is incorrect");
        }
    }

    public static boolean login(String email, String password) {
        for (UserAccount account : userAccountsData) {
            if (account.getEmail().equalsIgnoreCase(email) && account.getPassword().equals(password)) {
                currentUser = account; // Set the current user
                return true;
            }
        }
        return false; // No matching account found
    }

    public static void changePasswordRequest() {
        if (currentUser == null) {
            System.out.print("\nYou are not logged in. Please enter your email address: ");
            String email = scanner.next();
            for (UserAccount account : userAccountsData) {
                if (account.getEmail().equalsIgnoreCase(email)) {
                    currentUser = account; // Set the current user
                }
            }
        }
        if (currentUser == null) {
            System.out.println("No user has been found.");
            return;
        }

        System.out.print("\nPlease enter your new password: ");
        changePassword(scanner.next());
    }
    public static boolean changePassword(String newPassword) {
            currentUser.setPassword(newPassword);
            System.out.println("Password changed successfully for " + currentUser.getEmail());
            return true;
    }

    public static void printWelcomeMessage() {
        for (int i = 0; i <= header; i++) {
            if (header / 2 == i) {
                System.out.print("Welcome To PMU Ride");
            }
            System.out.print('*');
        }
    }

    public static void printMainMenu() {
        System.out.print("\n\n");
        System.out.println("Please choose from the following (Type the number then hit enter):");
        System.out.println("\t1: Create Account");
        System.out.println("\t2: Log in");
        System.out.println("\t3: Reset Password");
        System.out.println("\t4: Exit");
    }
    public static void printGoodbyeMessage() {


            for (int i = 0; i <= header - 5; i++) {
                if ((header - 5)/2  == i) {
                    System.out.print("Thank you For Using PMU Ride");
                }
                System.out.print('*');
            }
        }

    }
