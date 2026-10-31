class BankAccount {
    private String ownerName;
    private double balance;
    private final int accountNumber;
    private static int count = 1000;

    BankAccount() {
        this("Kaberee", 500);
    }

    BankAccount(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
        accountNumber = count++;
    }

    void displayAccount() {
        System.out.println("The account number, balance and owner's name is: " + accountNumber + " " + balance + " " + ownerName);
    }

    static void getTotalAccounts() {
        System.out.println("The total number of accounts created is: " + count);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Balance after adding amount is: " + balance);
    }

    void deposit(double amount, String description) {
        balance += amount;
        System.out.println("New balance is " + balance + " " + "from " + description);
    }

    class Transactions {
        private String transactionType;
        private double amount;

        Transactions(String type, double amount) {
            this.transactionType = type;
            this.amount=amount;
        }
        void execute(String type, double amount){
      if(type.equals("Deposit")){
          balance+=amount;
          System.out.println("Amount was deposited from balance");
}
      if(balance>amount){
          if(type.equals("Withdraw")){
              balance-=amount;
              System.out.println("Amount was withdrawn from balance");
          }
      }
      else{
          System.out.println("Insufficient balance, withdrawal not permitted");
      }
        }
    }
    static class BankCard{
        private String cardType;
        private String expiryDate;

    BankCard(String type, String date) {
        this.cardType = type;
        this.expiryDate = date;
    }
    void displayCard(BankAccount account){

        System.out.println("The card type, expiry date, account owner's name, account number and the total number of accounts are: "+cardType+" "+expiryDate+" "+account.ownerName+" "+account.accountNumber+" "+count);

    }

    }

}
public class NestedStatic{
public static void main(String [] args){
    BankAccount a= new BankAccount("Ayesha", 5000);
    BankAccount b= new BankAccount("Rahim", 8000);
    BankAccount c=new BankAccount();
    a.deposit(1000);
    b.deposit(500, "Salary deposit");
    BankAccount.Transactions a1=a.new Transactions("Withdrawal", 2000);
    a1.execute("Withdraw", 2000);
    BankAccount.Transactions b1=b.new Transactions("Deposit", 3000);
    b1.execute("Deposit", 3000);
    BankAccount.BankCard a2=new BankAccount.BankCard("Credit", "25 January");
    a2.displayCard(a);
    BankAccount.BankCard b2=new BankAccount.BankCard("VISA", "20 February");
    b2.displayCard(b);
}
}