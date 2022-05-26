import java.util.Arrays;
import java.util.Scanner;
// Get first and last elements of arrays

public class Main {
        // write a method here
        public static int[] getFirstAndLast(int[] arr) {
            int a = arr.length - 1; //find index of the last element of array

//     return new int[] {arr[0], arr[a]}; // create a new array and give it 2 values. arr[a] - the last element

            int[] newArr = new int[2]; // create a new array with 2 elements
            newArr[0] = arr[0];
            newArr[1] = arr[arr.length -1];
            return newArr;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] result = getFirstAndLast(array);
            Arrays.stream(result).forEach(e -> System.out.print(e + " "));
        }
}

