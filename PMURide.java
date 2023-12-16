import java.util.ArrayList;
import java.util.List;

public class PMURide {
    public static void main(String[] args) {
        UserAccount currentUser = null;

        List<UserAccount> userAccountsData = new ArrayList<UserAccount>();



    }

    public static void printWelcomeMessage() {
        int header = 29;

        for (int i = 0; i <= header; i++) {
            if (header/2 == i) {
                System.out.print("Welcome To PMU Ride");
            }
            System.out.print('*');
           }
        }
    }
