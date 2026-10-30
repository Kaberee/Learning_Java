
import java.util.Scanner;
class Wallet3{
    private int balance;
    private final int id;
    private String lastTransaction ;
    static int count=1;

    Wallet3(){
        this(0);
    }
    Wallet3(int balance){
        this.balance=balance;
        id=count++;
    }
    void deposit(int amount){
balance+=amount;
    }
    void deposit(int amount, int bonus){
 balance+=amount+bonus;
        System.out.println("Balance after getting a bonus is: "+balance);
    }
    static void addBonus(Wallet3 w, int amount) {
        w.balance += amount;
        System.out.println("Balance after added amount is: " + w.balance);
    }

    static void swap(Wallet3 w1, Wallet3 w2) {
        int temp = w1.balance;
        w1.balance = w2.balance;
        w2.balance = temp;
    }


    class Transaction {
        void withdraw(int amount) {
            if (balance < amount) {
                System.out.println("Insufficient balance");
            } else {
                balance -= amount;
            }
        }

        void showWallet() {
            System.out.println("The wallet's ID is " + id + "and its balance is " +balance);
        }


        int getBalance() {
            return balance;
        }

        void display(){
            System.out.println("Balance of wallet is: "+balance);
        }
    }

}

public class Practice_problem1{
    public static void main(String[]args){
Wallet3 w1=new Wallet3();
Wallet3 w2=new Wallet3(5000);
Wallet3.Transaction t1=w1.new Transaction();
Wallet3.Transaction t2=w2.new Transaction();
w1.deposit(1000);
w2.deposit(500, 100);
t1.withdraw(200);
Wallet3.addBonus(w1, 300);
t1.display();
t2.display();
Wallet3.swap(w1,w2);
System.out.println("Balance after swapping is: "+ t1.getBalance()+" "+t2.getBalance());

    }
}
