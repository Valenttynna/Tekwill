import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
//        Cake cake = new Cake();
//        Pie pie = new Pie();
//        Tart tart = new Tart();
//
//        Box<Cake> cakeBox = new Box<>();
//        cakeBox.put(cake);
//        Cake c = cakeBox.get();
//
//        Box<Pie> pieBox = new Box<>();
//        pieBox.put(pie);
//        Pie p = pieBox.get();
//
//        Box<Tart> tartBox = new Box<>();
//        tartBox.put(tart);

        Predicate<String> check = name -> name.startsWith("star");

        System.out.println(check.test("Start"));
        System.out.println(check.test("start"));
        System.out.println(check.test("Valentina"));
    }
}