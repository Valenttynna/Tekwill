import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        System.out.println("Print the value for x");
        double x = scanner.nextDouble();
        System.out.println("function" + x * x * x + x * x + 1);

    }
}
