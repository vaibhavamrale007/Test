
import java.util.Scanner;

public class LoginPage {

    public static void main(String[] args) {
        String correctUsername = "vaibhav";
        String correctPassword = "1234";
        Scanner sc = new Scanner(System.in);

        System.err.print("Enter Username:");
        String username = sc.nextLine();
        System.err.println("Enter Password:");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.err.println("Login Successful! Welcome," + username + ".");
        } else {
            System.err.println("Invalid Username or Password.");
        }
        sc.close();
    }
}
