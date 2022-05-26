
/*Implement a method print(String arg).
the method outputs the name and its argument (in " ", cause it's a string).
the output format for the string argument "test": print("test")
Overload this method by writing a new method with the same name and
two arguments: a string and an integer.
The new method should print the name and both parameters, like:
print("test", 4)
Sample input: test  4   Sample output: print("test")   print("test", 4)
*/
public class Main {

    public static void print(int a) {
        System.out.println( "int arg: " + a );

    }

    public static void main(String[] args) {
        print((int)a);
    }

}
    public static void print(String strArg) {
        System.out.println("print (\"" + strArg + "\")");

    }
}
