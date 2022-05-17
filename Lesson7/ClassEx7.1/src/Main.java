import java.util.Scanner;

public class Main {
 /* Ex7.1 Create 2 string a and b, using the literal,and another two
 (c and d) using the keyword new. compare the strings a and b, a and c,
  c with d using == and using equals method, and output the results. */
 public static void main(String[] args) {

     String a = "Java";
     String b = "Java";
     String c = new String("Java");
     String d = new String("Java");

     System.out.println(a==b); //true
     System.out.println(a==c); //false
     System.out.println(c==d); //false

     System.out.println(a.equals(b)); //true
     System.out.println(a.equals(c)); //true
     System.out.println(c.equals(d)); //true
 }
}
