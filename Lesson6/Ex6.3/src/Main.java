import java.util.Scanner;
/* Write a program that reads an array of ints
and an integer number n. The program must sum all
the array elements greater than n. Input data format:
The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
The third line contains the number n.
Output data format: Only a single number represents the sum. */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt(); //size of an array
        int[] arr = new int[arraySize]; //elements of the array separated by spaces

        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }
        int n = sc.nextInt(); //the number n
        int sum = 0;
        for (int value : arr) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);//Sum all the array elements greater than n. Only a single number represents the sum
    }
}
