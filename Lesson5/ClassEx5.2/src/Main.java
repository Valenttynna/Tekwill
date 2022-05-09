import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /* Condition: Write a program, which reads the number of the shape
(1 - square, 2 - circle, 3 - triangle, 4 - rhombus) and prints
the text "You have chosen a square" (or circle, or triangle,
or rhombus, depending on the number).If it is a number that
doesn't correspond to any of the listed shapes, the program
should output: "There is no such shape!".
    */
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
//        String st = switch (i) {
//            case 1 -> "You have chosen a square";
//            case 2 -> "You have chosen a circle";
//            case 3 -> "You have chosen a triangle";
//            case 4 -> "You have chosen a rhombus";
//            default -> "There is no such shape!";
//        };
//        System.out.println(st);
        String st;
        switch (i) {
            case 1:
                st = "You have chosen a square";
                break;
            case 2:
                st = "You have chosen a circle";
                break;
            case 3:
                st = "You have chosen a triangle";
                break;
            case 4:
                st = "You have chosen a rhombus";
                break;
            default:
                st = "There is no such shape!";
                break;
        }
        System.out.println(st);
    }
}
