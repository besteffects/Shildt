package chapter14.lambda;
//Demonstrate two simple lambda expressions

// A functional interface.

interface MyValue {
    double getValue();
}

//Another functional interface.
interface MyParamValue {
    double getValue(double v);
}

class LambdaDemo {
    public static void main(String[] args) {
        MyValue myVal; //declare an interface reference

        /*
        Here, the lambda expression is simply a constant expression.
        When it is assigned to myVal, a class instance is constructed in which the lambda expression implements
        the getValue() method in MyValue.*/
        myVal = () -> 98.6; //a simple lambda expression

        /*
        Now, create a parametrized lambda expression and assign it to a MyParamValue reference. This lambda expression
        returns the reciprocal of its argument.*/
        MyParamValue myPVal = (n) -> 1.0 / n; // a lambda expression that has a parameter

        //Call getValue(v) through the myPval reference
        System.out.println("Reciprocal of 4 is " + myPVal.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPVal.getValue(8.0));

        // A lambda expression must be compatible with the method defined by the functional interface. Therefore,
        //these won't work:
        // myVal =()->"three"; //Error! String not compatible with double!
        // myPVal=()->Math.random(); //Error! Parameter required!
    }
}