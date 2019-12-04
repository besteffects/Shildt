package chapter13.generics.constructors;
// Use a generic constructor

class Summation {
    private int sum;

    <T extends Number> Summation(T arg) { // A generic constructor
        sum = 0;
        for (int i = 0; i < arg.intValue(); i++) {
            sum += 1;
        }
    }

    int getSum() {
        return sum;
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);
        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}
