import java.util.Random;

public class Main {
    public static void main(String[] args) {

        String[][] field = new String[9][9];
        //write minefield
        for (int row = 0; row < field.length; row++) {
            for (int col = 0; col < field[row].length; col++) {

                Random rand = new Random();
                if (rand.nextInt( 2 ) == 0) {
                    field[row][col] = "*";
                } else {
                    field[row][col] = "X";
                }
            }
        }
        //print minefield
        for (String[] strings : field) {
            for (String string : strings) {
                System.out.print( string + "\t" );
            }
            System.out.println();
        }
    }
}
