import java.util.ArrayList;

public class BankAccount {
    double balance;
    String currency;
    ArrayList<Object> history;

    BankAccount(String currency) {
        balance = 0;
        this.currency = currency;
        history = new ArrayList<>();
    }

}
