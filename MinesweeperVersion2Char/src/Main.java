import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //initialization
        Scanner scanner = new Scanner (System.in);
        System.out.print ( "How many mines do you want on the field?" );
        int nrOfMines = scanner.nextInt(); //waiting for response from the user with scanner int

        char[][] matrix = new char [9][9]; //initialization of the matrix / array

        //filling array / matrix with dots
        for (char [] value : matrix) {
            Arrays.fill(value,'.'); //with Array method (or 2 fors): placing for each value a dot
        }

        //generating mines
        Random random = new Random(); //declare the random object
        int count = 0; //declaring how many mines already generated
        while (count < nrOfMines) {  //nrOfMines: offered by the user
            int i = random.nextInt(9); // the random limit of nrs is 9
            int j = random.nextInt(9); //then will be generated 2 random nrs from 0 to 9
            if (matrix [i][j] == '.') {  // (/ != 'X') to not put twice a 'X' on the same place, for ex.
                matrix [i][j] = 'X'; //verifying if on i and j, is already '.' or 'X'(a mine)
                count ++; //increment in a loop till the max nr wanted by user (nrOfMines)
            }
        }
        //display the game / result in the console
        for (char[] chars : matrix) {
            for (char aChar : chars) { // 2 for loops
                System.out.print(aChar); //display just one char for each
            }
            System.out.println();
        }
    }
}
