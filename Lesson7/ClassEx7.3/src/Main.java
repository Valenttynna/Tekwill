import java.util.Scanner;
/* in the given string find the longest word and output it.
Input data: given a string in a single line. words in the string are separated by a single space.
output data: output the longest word. if there are several such words, you should output the one, which occurs earlier.
Simple input: one two three four five six
Simple output:  three     */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");

        String longestWord = strArray[0];
        for (String word : strArray) {
            if (longestWord.length() < word.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
    }
}
