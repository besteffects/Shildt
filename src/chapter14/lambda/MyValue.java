package chapter14.lambda;
//Demonstrate two simple lambda expressions

// A functional interface.

interface MyValue {
    double getValue();
}

//Another functional interface.
interface MyParamValue{
    double getValue(double v);
}

class LambdaDemo{
    public static void main(String[] args) {
        MyValue myVal; //declare an interface reference
    }
}