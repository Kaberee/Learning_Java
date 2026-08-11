import java.util.Scanner;
public class Wallet_1{
    static void deposit(int balance, int amount1){
        int deposited=balance+amount1;
        System.out.println("Balance after depositing:"+deposited);
    }
    static void withdraw(int balance, int amount2){
        int withdrawn=balance-amount2;
        System.out.println("Balance after withdrawal:"+withdrawn);
    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance_1=sc.nextInt();
        int balance_2=sc.nextInt();
        Wallet_1.withdraw(balance_1,1000);
        Wallet_1.withdraw(balance_2, 1000);
      Wallet_1.deposit(balance_1,2000);
        Wallet_1.deposit(balance_2, 2000);
    }
}