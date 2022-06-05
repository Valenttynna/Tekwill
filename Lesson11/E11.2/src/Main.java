import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        if (val == null) {
            return 0;
        }
        if (val > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (val < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return val.intValue();
    }
}
