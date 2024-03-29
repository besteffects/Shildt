package chapter12.enumeration.constructor;

//Use of enum constructor, instance variable and method.
enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22); //Notice the initialization values.

    private int speed; //typical speed of each transport. Add an instance variable

    //Constructor
    Transport(int s) {
        speed = s; //Add a constructor
    }

    int getSpeed() {
        return speed; // Add a method
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Transport tp;

        //Display speed of an airplane
        System.out.println("Typical speed for an airplane is " + Transport.AIRPLANE.getSpeed() + " miles per hour.\n");

        //Display all Transports and speeds.
        System.out.println("All Transport speed: ");
        for (Transport t : Transport.values()) {
            System.out.println(t + " Typical speed is " +
                    t.getSpeed() +
                    "miles per hour");
        }
    }
}
