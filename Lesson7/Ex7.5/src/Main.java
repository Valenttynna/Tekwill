import java.util.Scanner;
/*program that finds the frequency of occurrences of a substring in a given
string. Substrings cannot overlap: for example, the string ababa contains only one
substring aba.
Input data format: The first input line contains a string, the second one contains a
substring.
Sample Input 1: Sample Output 1: 1
hello there
the
Sample Input 2: Sample Output 2: 3
hello yellow jello
ll
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String substring = sc.nextLine();

        int count = 0;
        String[] s = string.split(" ", 5);

        for (String temp : s) {
            if (temp.contains(substring)) {
                count++;
            }
        }
        System.out.println( count);
    }
}
