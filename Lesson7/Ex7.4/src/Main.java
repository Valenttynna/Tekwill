import java.util.Scanner;
/*program that takes a date string formatted as YYYY-MM-DD as input,
then converts and outputs it as MM/DD/YYYY.
For instance, the input 2007-07-21 will result in the following output 07/21/2007.
Sample Input 1: 2012-09-28 Sample Output 1: 09/28/2012 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String unformattedDate = sc.nextLine();

        String[] dateArray = unformattedDate.split("-");
        String formattedDate = dateArray[1] + "/" + dateArray[2] + "/" + dateArray[0];
        System.out.println(formattedDate);
    }
}
