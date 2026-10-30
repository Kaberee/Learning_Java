interface Vehicle {
    void start();  // Abstract method
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Car is starting...
        myCar.stop();  // Car is stopping...

        Bike myBike = new Bike();
        myBike.start(); // Bike is starting...
        myBike.stop();  // Bike is stopping...
    }
}