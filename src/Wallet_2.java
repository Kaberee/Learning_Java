class Wallet{
    private int balance;
    private final int id;
    private static int count=1;
  private String lastWithdraw;
    Wallet(){
        this(0);
    }

    Wallet(int balance){
       this.balance=balance; //this constructor is called from the above wallet constructor with balance 0
       id=count;
       count++;

    }
    void deposit(int amount){
 balance+=amount;
System.out.println("Balance after depositing is:"+balance);
    }
    void withdraw(int amount){
        if(balance<amount){
            System.out.println("Insufficient balance");
        }
        else{
            balance-=amount;
            System.out.println("Balance after withdrawing is:"+balance);
        }
    }
    void display(){
        System.out.println("Wallet id is:"+id);
    }
    void withdraw(int amount, String mode){
        balance-=amount;
        this.lastWithdraw=mode;
        System.out.println("Last withdrawal mode was"+" "+ mode+" "+"and balance is"+" "+balance);
    }
    static void addBonus(Wallet w, int amount){
        w.balance+=amount;
        System.out.println("Balance after bonus is:"+w.balance);
    }
    static void swap(Wallet wa, Wallet wb){
        Wallet temp = wa;
        wa = wb;  //Swapping by reference is not possible in java
        wb = temp;

    }

    int getBalance(){
        return balance;
    }
}

public class Wallet_2{

    public static void main(String[]args){

Wallet w1=new Wallet();
Wallet w2=new Wallet(5000);
Wallet w3=new Wallet();
w1.deposit(1000);
w1.withdraw(200);
w2.deposit(500);
w2.withdraw(50, "ONLINE");
w1.withdraw(20, "ATM");
Wallet.addBonus(w1, 300);


w1.display();
w2.display();
w3.display();

Wallet.swap(w1,w2);

System.out.println("Balance after swapping is:"+" "+ w1.getBalance());  //Balance will stay the same after "swappping"

System.out.println("Balance after swapping is:"+" "+ w2.getBalance());


    }


}
