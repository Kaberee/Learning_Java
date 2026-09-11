class Computer{
    private String model;
    private int price;
    private final int id;
    private static int count=0;

    Computer(String model, int price){
        this.model=model;
        this.price=price;
        id=count++;
    }
    void display(){
        System.out.println("The ID, model and price of the car is: "+id+" "+model+" "+price);
    }
    class Processor{
private int cores;
Processor(int cores){
    this.cores=cores;
}
void upgrade(int extraCores){
    cores+=extraCores;
    price+=extraCores*1000;
}
void display(){
    System.out.println("The number of cores in the computer and it's price is: "+cores+" "+price);
}
    }
    static class USB{
        private int ports;
        USB(int ports){
            this.ports=ports;
        }
        void addPorts(){
            ports++;
        }
   void display(){
            System.out.println("The number of ports and the total number of computers created are: "+ports+" "+count);
        }

    }
}

public class Practice_problem2{
    public static void main(String[]args){
Computer c1=new Computer("DELL",50000);
Computer c2=new Computer("HP", 60000);
Computer.Processor p1=c1.new Processor(4);
Computer.Processor p2=c2.new Processor(8);
p1.upgrade(2);
p2.upgrade(4);
Computer.USB usb1= new Computer.USB(3);
Computer.USB usb2= new Computer.USB(5);
c1.display();
c2.display();
p1.display();
p2.display();
usb1.addPorts();
usb1.display();
usb2.display();
    }
}
