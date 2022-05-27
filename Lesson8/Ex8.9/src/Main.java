/*Given a recursive method which should print an input string in the reverse order.
Now the method prints the string in the same order. Fix the method.
After your fix, the method must be recursive.
Sample Input 1: ousyn
Sample Output 1: nysuo   */
import java.util.Scanner;
public class Main {
    public static int methodCallCount = 0; // this is to understand what happens

    /* Fix this method */
    public static void printReverseCharByChar(String s) {

            methodCallCount++; // this is to understand what happens
            // System.out.println("Called of the method " + methodCallCount + "th time, with string " + s); // when displaying the method - we call also the param

        if (s.length() > 0) { //check if the string length is > 0. if it is =< 0 then its doing nothing. here is looping till achieve the condition.
            int last = s.length() - 1; // find the position of the last character

// Concluzia exercitiului: aceste 2 rinduri care urmeaza de schimbat cu locul:
//            System.out.print(s.charAt(last)); // prints just the last char
//            printReverseCharByChar(s.substring(0, last)); // prints the substring created without the las char / element

// aici aceiasi metoda mai descriptiva (pe 3 linii de cod)
            String substring = s.substring( 0, last ); // create a substring from first to last (last is exclusive)
            System.out.print(s.charAt(last)); // when the string finished it will print the last element from position
            printReverseCharByChar(substring); // this substring will be sent to printReverseCharByChar - consequently in loop till the string is empty (zero)
//deoarece apelam metoda inainte ca sa afiseze caracterul, el va astepta ca toate metodele sa se indeplineasca si apoi va printa
// intii apeleaza metoda apoi afiseaza...
//el asteapta sa finiseze ultima metoda si apoi trece la a doua de jos
        }
    }
    // this main method receive a string. and will call the method: printReverseCharByChar
    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        printReverseCharByChar(scanner.nextLine());
    }
}
