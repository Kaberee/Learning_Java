class Book{
    private String title;
    private double price;
    private final int bookId;
    private static int count = 101;
    private String lastAction;

    Book(){
        this("Unknown", 0);
    }
    Book(String t, double p){
        this.title=t;
        this.price=p;
        bookId=count++;
    }

    void updatePrice(double amount){
        price+=amount;
        System.out.println("Updated price is: "+price);
    }

    void discount(double amount){
        if(amount<price){
            price-=amount;
            System.out.println("Price after discount is: "+price);
        }
        else{
            System.out.println("Giving a discount won't be possible");
        }

    }

    void discount(double amount, String method){
price-=amount;
this.lastAction=method;
    }

    void display(){
        System.out.println("The bookId and title of the book are: "+bookId+" "+title);
    }

    double getPrice(){
        return price;
    }

    static void addBonus(Book b, double amount){
        b.price+=amount;
        System.out.println("Price after added bonus is: "+b.price);
    }

    static void swap(Book a, Book b){
        double temp=a.price;
a.price=b.price;
b.price=temp;

    }

}

public class LibraryManagement{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", 1200);
        Book b3 = new Book("Data Structures", 1500);
        b1.updatePrice(500);
        b1.discount(100);

        b2.updatePrice(300);
        b2.discount(200, "STUDENT");

        b3.discount(300);

        Book.addBonus(b1, 250);

        b1.display();
        b2.display();
        b3.display();

        Book.swap(b1, b2);


        System.out.println(b1.getPrice());
        System.out.println(b2.getPrice());
        System.out.println(b3.getPrice());
    }
}