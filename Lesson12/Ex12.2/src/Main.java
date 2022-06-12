public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("0000 0000 0000 0000", 12L);

        CheckingAccount checkingAccount = new CheckingAccount(bankAccount.number, bankAccount.balance, 12.65);

        SavingAccount savingAccount = new SavingAccount(bankAccount.number, bankAccount.balance, 3.65);


    }
}