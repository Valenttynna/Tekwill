// 1. Create a class named User from inside the src folder
class User {
// declaring 3 string fields
    String login;
    String firstName;
    String lastName;

// 2. creating a Constructor with 3 parameters to initialize these fields
    public User(String log, String fN, String lN) {
        //initialize it with this.
        this.login = log;
        this.firstName = fN;
        this.lastName = lN;
    }
}