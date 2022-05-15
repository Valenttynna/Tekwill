import java.util.Arrays;
/* Create an array pf longs named longNumbers with 3 elements
 10_000_000_001L, 10_000_000_002L, 10_000_000_003L.
 then output the array */
public class Main {
    public static void main(String[] args) {
        // long[] longNumbers = {10_000_000_001L, 10_000_000_002L, 10_000_000_003L};
        long[] longNumbers = new long[3];
        longNumbers[0] = 10_000_000_001L;
        longNumbers[1] = 10_000_000_002L;
        longNumbers[2] = 10_000_000_003L;
        System.out.println(Arrays.toString(longNumbers));
    }
}
