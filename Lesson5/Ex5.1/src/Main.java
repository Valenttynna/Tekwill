import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// You are given three numbers: A, B and H.
// According to recommendations, one should sleep at
// least A hours per day, but no more than B hours.
// H is how many hours Ann sleeps.
//  Task:If Ann sleeps less than A hours, print"Deficiency".
//  If she sleeps more than B hours, print "Excess".
//  If her sleep fits the recommendations, print "Normal".
//  Input format: three numbers A, B, H,
//  where A is always less than or equal to B.

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int H = sc.nextInt();

        if (H < A) {
            System.out.println("Deficiency");
        } else if (H <= B) {
            System.out.println("Normal");
        } else {
            System.out.println("Excess");
        }
    }
}
