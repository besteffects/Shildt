package inheritance;

class Vehicle {
    private int passengers; // number of passengers
    private int fuelcap; // fuel capacity in gallons
    private int mpg; // fuel consumption in miles per gallon

    //This is a constructor for Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    // Return the range
    int range() {
        return mpg * fuelcap;
    }

    // Compute fuel needed for a given distance
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }

    // Accessor methods for instance variables.
    int getPassengers() {
        return passengers;
    }

    void setPassengers(int p) {
        passengers = p;
    }

    int getFuelcap() {
        return fuelcap;
    }

    void setFuelcap(int f) {
        fuelcap = f;
    }

    int getMpg() {
        return mpg;
    }

    void setMpg(int m) {
        mpg = m;
    }
}

//Extend Vehicle to create a Truck specialization.
class Truck extends Vehicle {
    private int cargoCap; // cargo capacity in pounds

    //This is constructor for Truck.
    Truck(int p, int f, int m, int c) {
        //initialize vehicle members using Vehicle's constructor
        super(p, f, m);
        cargoCap = c;
    }

    //Accessor methods for cargocap
    int getCargoCap() {
        return cargoCap;
    }

    void putCargoCap(int c) {
        cargoCap = c;
    }
}

class TruckDemo {
    public static void main(String[] args) {
        // Construct some trucks
        Truck semi = new Truck(2, 200, 7, 44000);
        Truck pickup = new Truck(3, 28, 15, 2000);
        double gallons;
        int dist = 252;

        gallons = semi.fuelneeded(dist);
        System.out.println("Semi can carry " + semi.getCargoCap() + " pounds.");
        System.out.println("To go" + dist + " miles semi needs " + gallons + " galoons of fuel. \n");

        gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup can carry " + pickup.getCargoCap() + " pounds");
        System.out.println("To go " + dist + "miles pickup needs " + gallons + " galoons of fuel.");
    }
}
