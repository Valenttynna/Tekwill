import java.util.Scanner;
/* Ex7.2 Program that reads a string and 2 int nrs.
these 2 nrs are representing a range that includes them both.
print the substring  enclosed in this range. intput:
Java
0 2
output: Jav */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int rangeStart = sc.nextInt();
        int rangeEnd = sc.nextInt();

        System.out.println(str.substring(rangeStart,rangeEnd +1));
    }
}
