import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int y = scanner.nextInt();
        boolean result = (i!=j && i!=y && y!=j);
        System.out.println( "result = " + result );
    }
}
