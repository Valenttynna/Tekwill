import java.lang.reflect.Array;
import java.util.Arrays;

public class Book {
    String title;
    int yearOfPublishing;
    Array[] authors;

    public Book(String t, int y, String[] a) {
        title = t;
        yearOfPublishing = y;
        authors = java.util.Arrays.copyOf(a, a.length);

    }
}
