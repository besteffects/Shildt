package staticMod;

// Use a static variable
class StaticDemo {
    static int y; // a static variable
    int x; // a normal instance variable

    // Return the sum of the instance variable x and the static variable y.
    int sum() {
        return x + y;
    }
}

class SDemo {
    public static void main(String[] args) {
        StaticDemo ob1 = new StaticDemo();
        StaticDemo ob2 = new StaticDemo();

        //Each object has its own copy of an instance variable.

        ob1.x = 10;
        ob2.x = 20;

        System.out.println("Of course, ob1.x and ab2.x " + "are independent.");
        System.out.println("ob1.x: " + ob1.x
                + "\n" + "ob2.x: " + ob2.x);
        System.out.println();

//Each object shares one copy of a static variable.
        System.out.println("The static variable is shared.");
        StaticDemo.y = 19;
        System.out.println("Set staticDemo.y to 19.");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();

        StaticDemo.y = 100;
        System.out.println("Change staticMod.StaticDemo.y to 100");

        System.out.println("ob1.sum(): " + ob1.sum());
        System.out.println("ob2.sum(): " + ob2.sum());
        System.out.println();
    }
}
