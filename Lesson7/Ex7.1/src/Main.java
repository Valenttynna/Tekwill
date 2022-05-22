import java.util.Scanner;
/*program that reads a string and replaces all occurrences of the letter 'a'
with the letter 'b'. The program should print out the resulting string.
Sample Input 1: aaa Sample Output 1: bbb
     Sample Input 2: bca Sample Output 2: bcb
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st.replace("a", "b"));
    }
}
