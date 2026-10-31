class InsufficientBalanceException extends Exception {  //custom exception
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccounts {
    double balance;

    BankAccounts(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        balance -= amount;
        System.out.println("Remaining balance: " + balance);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        BankAccounts account = new BankAccounts(5000);

        try {
            account.withdraw(6000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}