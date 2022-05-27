//Write a method that has an int argument and computes the sum of all numbers from
//        1 to n. Try to make it using recursion.
//        Sample Input 1: 10 Sample Output 1: 55

// use RECURSIVE method instead of FOR LOOP as usually
// apelam metoda recursive doar cu ceva schimbat deja
import java.util.Scanner;
public class Main {
    public static long sum(int s) { //suma tuturor nr pina la 10 -> (10+(9+8+7+..+1)

        if (s == 1) { // if - to stop the loop
            return s;
        }
        return s + sum(s - 1); //suma + suma tuturor nr invers de la 10 la 1 -> (10+(9+8+7+..+1)
    }
    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = sum(scanner.nextInt());
        System.out.println(sum);
    }
}
