import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*Condition: Print the sum of all integers from a to b
 including both. Integer a is always lower the b(a<b).
 */
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;

        for(int i = a;i <= b; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
