public class Overload {
    public static void main(String[] args) {
        ovlDemo();
        ovlDemo(2);
        ovlDemo(4,6);
        ovlDemo(1.1,2.32);

    }

   static void ovlDemo(){
        System.out.println("No parameters");
    }

    static void ovlDemo(int a){
        System.out.println("One parameter: " +a);
    }

    static int ovlDemo(int a, int b){
        int result=a+b;
        System.out.println("Two parameters: " + a + " " + b);
        System.out.println("Result with int " + result);
        return result;
    }

    static double ovlDemo(double a, double b){
        double result=a+b;
        System.out.println("Two double parameters: " + a + " "+ b);
        System.out.println("Result with double: " + result);
        return a+b;
    }
}
