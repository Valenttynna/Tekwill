import java.util.Scanner;

/*Implement a method sumInRange for calculating the sum of numbers in the range from (inclusive, to (exclusive)
* sample input: 1 2  Sample output: 1 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int from = scanner.nextInt();
        int to = scanner.nextInt();

        int sum = sumInRange (from, to);
        System.out.println( "sum = " + sum );
    }

    public static int sumInRange (int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
           sum += i;
        }
        return sum;
    }
}
