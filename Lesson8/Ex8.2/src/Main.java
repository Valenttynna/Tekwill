import java.util.Scanner;
/*Implement a method that checks whether a given English letter is a vowel or not.
The input may be in any case. Vowel: A, E, I, O, U.
Examples:
1. isVowel('a') should be true
2. isVowel('A') should be true
3. isVowel('b') should be false*/
import java.util.Scanner;
public class Main {
    public static boolean isVowel(char ch) {
//write your code here
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char v: vowels) {
            if (v == ch) {
                return true;
            }
        }
        return false;
    }

//    public static boolean isVowel(char ch) {
//        return "aeiouAEIOU".contains("" + ch);
//    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}