// import java.util.*;
class Vehicle {
    private int model, regn, speed, fuelCapacity, fuelConsum;

    Vehicle(int model, int regn, int speed, int fuelCapacity, int fuelConsum) {
        this.model = model;
        this.regn = regn;
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
        this.fuelConsum = fuelConsum;
    }

    public int getModel() {
        return model;
    }

    public int getRegn() {
        return regn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getFuelConsum() {
        return fuelConsum;
    }

    int distanceCovered(int time) {
        return speed * time;
    }
    int fuelNeeded(int dist) {
        return (dist / fuelConsum);
    }

    void display() {
        System.out.println("Vehicle Model- " + model + " Registration- " + regn + " Fuel Capacity- " + fuelCapacity
                + " Fuel Consumption- " + fuelConsum);
    }
}

class Truck extends Vehicle {
    private int cargoWeight;

    Truck(int model, int regn, int speed, int fuelCapacity, int fuelConsum, int cargoWeight) {
        super(model, regn, speed, fuelCapacity, fuelConsum);
        this.cargoWeight = cargoWeight;
    }
    
    void display() {
        System.out.println("Vehicle Model- " + getModel() + " Registration- " + getRegn() + " Fuel Capacity- "
                + getFuelCapacity() + " Fuel Consumption- " + getFuelConsum() + " Speed- " + getSpeed()+" Cargo Weight- "+cargoWeight);
    }
}
class Bus extends Vehicle {
    private int noOfPass;
    
    Bus(int model, int regn, int speed, int fuelCapacity, int fuelConsum, int noOfPass) {
        super(model, regn, speed, fuelCapacity, fuelConsum);
        this.noOfPass = noOfPass;
    }
    // public int getNoOfPass() {
    //     return noOfPass;
    // }
    void display() {
        System.out.println("Vehicle Model- " + getModel() + " Registration- " + getRegn() + " Fuel Capacity- "
                + getFuelCapacity() + " Fuel Consumption- " + getFuelConsum() + " Speed- " + getSpeed()+" No. of Passengers- "+noOfPass);
    }
}
public class TransportApp {
    public static void main(String[] args) {

        Truck t = new Truck(2010,1040, 80, 100, 8, 1000);
        t.display();
        int covered = t.distanceCovered(3);
        int need = t.fuelNeeded(240);
        System.out.println("Distance Covered- "+covered);
        System.out.println("Fuel Needed- "+need);
        
        Bus b = new Bus(2020, 5788, 60, 80, 10, 30);
        b.display();
        int covered1 = b.distanceCovered(2);
        int need1 = b.fuelNeeded(120);
        System.out.println("Distance Covered- "+covered1);
        System.out.println("Fuel Needed- "+need1);
    }
}