import java.util.Scanner;
/*program that reads two lines and compares them without whitespaces.
The program should print true if both lines are equal, otherwise – false.
Sample Input 1: Sample Output 1: true
string
str ing
Sample Input 2: Sample Output 2: false
string
my string */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        st1 = st1.replace(" ", "").trim();
        st2 = st2.replace(" ", "").trim();

        System.out.println(st1.equals(st2));
    }
}
