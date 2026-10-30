interface Vehicle1{
    void start();
    void stop();

    default void fuelEfficiency(){
        System.out.println("Calculate based on default method");
    }
    static void fuelWeight(){
        System.out.println("Calculating weight");
    }
}

interface Chargeable{
    default void fuelEfficiency(){
        System.out.println("Default method to calculate fuel efficiency");
    }
}

class Toyota implements Vehicle1, Chargeable{
 public void start(){
     System.out.println("Car starts");
 }
 public void stop(){
     System.out.println("Car stops");
 }
 public void fuelEfficiency(){
        Vehicle1.super.fuelEfficiency();
    }
}

class Biker extends Car implements Vehicle1, Chargeable{
    public void start(){
        System.out.println("Bike starts");
    }
    public void stop(){
        System.out.println("Bike stops");
    }
    public void fuelEfficiency(){
        Vehicle1.super.fuelEfficiency();
    }
}


public class Defaultstatic_interface{
    public static void main(String [] args){
Toyota c=new Toyota();
c.start();
c.stop();
c.fuelEfficiency();

Vehicle1 b=new Biker();
b.start();
b.stop();
b.fuelEfficiency();

Vehicle1.fuelWeight();
    }
}

