import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Write a program that will classify the army corresponding to the following rules:
//        less than 1: no army
//        from 1 to 19: pack
//        from 20 to 249: throng
//        from 250 to 999: zounds
//        1000 and more: legion
//The program should read the number of units and output the corresponding category.
        Scanner sc = new Scanner( System.in );
        int number = sc.nextInt();
        String text;

        if (number < 1) {
            text = "no army";
        } else if (number <= 19) {
            text = "pack";
        } else if (number <= 249) {
            text = "throng";
        } else if (number <= 999) {
            text = "zounds";
        } else {
            text = "legion";
        }
    }
}