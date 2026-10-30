class Wallets{
  int balance;
    static{
      int balance=1000;
        System.out.println(balance);
    }
    {
        balance=500;
        System.out.println(balance);
    }
    Wallets(int balance){
        this.balance=balance;
    }
}

public class IB{
    public static void main(String [] args){
        Wallets w1=new Wallets(200);
        System.out.println(w1.balance);

    }
}