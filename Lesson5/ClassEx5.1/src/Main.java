import java.util.Scanner;

public class Main {
    /*Condition: Write a program that reads
    an integer number and prints YES if it is positive.
    Otherwise, the program should print NO.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
