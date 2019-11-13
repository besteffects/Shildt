package exceptions;

//manually throw an exception
class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw. ");
            throw new ArithmeticException(); //throw an exception
        } catch (ArithmeticException exc) {
            // catch the exception
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block");
    }
}
