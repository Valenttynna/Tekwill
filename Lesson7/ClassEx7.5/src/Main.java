import java.util.Scanner;

/* program that will get a String name, an int nrOfPizzas
and a double price. and will print the receipt:
Restaurant Java
Thank you {name} for visiting our restaurant.
You’ve ordered {nrOfPizzas} pizzas.
With the total price of: {price}.
Price with 20% discount: {price with discount}.
    */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int nrOfPizzas = sc.nextInt();
        double price = sc.nextDouble();
        double discountedPrice = price * 0.8;

        String receipt = """
                Restaurant Java
                Thank you %s for visiting our restaurant.
                You’ve ordered %d pizzas.
                With the total price of: %.2f.
                Price with 20%% discount: %.2f.
                """.formatted(name, nrOfPizzas, price, discountedPrice);


        String template = """
                Restaurant Java
                Thank you %s for visiting our restaurant.
                You’ve ordered %d pizzas.
                With the total price of: %.2f.
                Price with 20%% discount: %.2f.
                """;
        String receipt2 = String.format(template, name, nrOfPizzas, price, discountedPrice);


        System.out.println(receipt);
        System.out.println(receipt2);
    }
}
