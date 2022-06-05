//Implement the method toPrimitive(). It should take a value of Boolean type and
//        return a boolean. If the passed value is null, the result should be false.
//class Primitive {
//    public static boolean toPrimitive(Boolean b) {
//    }
//}
//    Sample Input 1: true Sample Output 1: true
//        Sample Input 2: false Sample Output 2: false
public class Primitive {
    public static boolean toPrimitive(Boolean b) {
        return b != null && b;
    }
}
