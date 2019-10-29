public class Overload {
    public static void main(String[] args) {
        byte b = 99;
        short s = 10;
        float f = 11.5F;

        ovlDemo();
        ovlDemo(2);
        ovlDemo(4, 6);
        ovlDemo(1.1, 2.32);
        f(10);
        f(10.1);
        f(b); // calls to f(int) type conversion
        f(s);// calls to f(int) type conversion
        f(f);// calls to f(double) type conversion

    }

    static void ovlDemo() {
        System.out.println("No parameters");
    }

    static void ovlDemo(int a) {
        System.out.println("One parameter: " + a);
    }

    static int ovlDemo(int a, int b) {
        int result = a + b;
        System.out.println("Two parameters: " + a + " " + b);
        System.out.println("Result with int " + result);
        return result;
    }

    static double ovlDemo(double a, double b) {
        double result = a + b;
        System.out.println("Two double parameters: " + a + " " + b);
        System.out.println("Result with double: " + result);
        return a + b;
    }

    //Automatic type conversions can affect overloaded method resolution.
    static void f(int x) {
        System.out.println("Inside f(int): " + x);
    }

    static void f(double x) {
        System.out.println("Inside f(double): " + x);
    }

}
