import java.util.Optional;
//In the main method, create an instance of the Account class and pass it to the
//process method by calling process(account). This method is already defined.
public class Main {

    public static void main(String[] args) {

// 1. create an instance of Account here
        User user = new User("demo-user", "Alexander", "Schmidt");
        Account acc = new Account("123456", 1000, user);

        process(acc);
    }
// 2. pass it into process method
//Note that the owner is an instance of the User class.
    public static void process(Account account) {
        try {
            final Optional<User> owner = Optional.ofNullable(account.getOwner());

            System.out.println(account.getCode());
            System.out.println(account.getBalance());

            owner.ifPresent(o -> {
                System.out.println(o.getLogin());
                System.out.println(o.getFirstName());
                System.out.println(o.getLastName());
            });

        } catch (Exception e) {
            System.out.println("Something wrong...");
        }
    }
}
