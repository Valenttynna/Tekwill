import java.util.Scanner;
/* Write a program: calculates the sum of elements of array of ints.
Input data format: the first line contains the size of an array.
the second line contains elements of the array separated by spaces.
output: the sum of the input array elements */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt(); //size of an array
        int[] arr = new int[arraySize]; //elements of the array separated by spaces

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        System.out.println(sum);//the sum of the input array elements
    }
}
