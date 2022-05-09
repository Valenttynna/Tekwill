import java.util.Scanner;

public class Main {
    /*Condition: Write a program that reads
an integer number and prints YES if it is positive.
Otherwise, the program should print NO.
 (use the ternary operator).
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Insert a number: " );
        int number = scanner.nextInt();

        String result = number > 0 ? "Yes" : "No";
        System.out.println( result );
    }
}
