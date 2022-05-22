import java.util.Scanner;
/* program that computes initials from full name and displays them
* Sample input: Lionel Messi
* Sample output: LM     */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();

        String[] strArray = fullName.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String name : strArray) {
            sb.append(name.charAt(0));
        }

        System.out.println(sb.toString());
    }
}
