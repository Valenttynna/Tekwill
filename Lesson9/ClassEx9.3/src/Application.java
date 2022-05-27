import java.util.Scanner;
// 3. Create an instance of User class inside main method
// declaring or creating a new Class Application (for ex) inside src folder

public class Application {
    public static void main(String[] args) { // this is main method

// 4. Calling the Constructor (point 2. from User class (User.java) with parameters
        User u = new User("myLogin", "Valentina", "Musteata"); //with parameters
        // User u  /*Adding a variable, so we can call this object */

        System.out.println(u.login); // to print the login (for example) in the console
    }
}
