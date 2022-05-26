import java.util.Scanner;
/*Given the method named extractInt that takes a double value and returns an
integer value. Write a body of the method. It should return only the integer part of the
given value.*/
public class Main {

    //write your code here
    public static int extractInt(double d) {
        return (int) d;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}
