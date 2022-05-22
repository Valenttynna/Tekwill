import java.util.Scanner;
/*program that reads an array of ints and outputs the length of the longest
sequence in strictly ascending order. Elements of the sequence must go one after
another. A single number is assumed to be an ordered sequence with the length = 1.
Input data format:
The first line contains the size of an array.
The second line contains elements of the array separated by spaces.
Example:
The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence
in ascending order is 5. It includes the following elements: 1 2 3 5 7. */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();  //size of an array

        int[] arr = new int[arrSize]; //elements of the array
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        int maxSeq = 1;
        int tempSeq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {              // if nextElement > previousElement
                tempSeq++;                          // increase tempSeq
                if (maxSeq < tempSeq) {             // if maxSeq < tempSeq
                    maxSeq++;                       // increase maxSeq
                }
            } else if (arr[i] <= arr[i - 1]) {      // else if  nextElement <= previousElement
                tempSeq = 1;
            }
        }
        System.out.println(maxSeq);
    }
}