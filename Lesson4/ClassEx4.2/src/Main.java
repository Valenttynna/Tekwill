import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is value for n?");
        int n = scanner.nextInt();

        int result = ((n + 1) * n + 2) * n + 3;
        System.out.println(result);
    }

}
