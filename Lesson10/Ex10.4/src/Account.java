//You are given a class named Account. It has three fields: a long field balance, a
//        string field ownerName, and a boolean flag locked. Write getters and setters for all
//        fields.
//class Account {
//    private long balance;
//    private String ownerName;
//    private boolean locked;
//}
public class Account {
    private long balance;
    private String ownerName;
    private boolean locked;

    public long getBalance() {
        return balance;
    }

    public boolean isLocked() {
        return locked;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setBalance(long value) {
        balance = value;
    }

    public void setOwnerName(String value) {
        ownerName = value;
    }

    public void setLocked(boolean value) {
        locked = value;

    }
}
