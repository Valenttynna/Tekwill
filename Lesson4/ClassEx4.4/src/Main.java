import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        System.out.println("Print here a sample output:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean r1 = a+b ==20;
        boolean r2 = a+c ==20;
        boolean r3 = b+c ==20;


        boolean result = r1 || r2 || r3;
        System.out.println(result);
        System.out.println(a+b ==20 || a+c==20 || b+c==20);

    }
}
