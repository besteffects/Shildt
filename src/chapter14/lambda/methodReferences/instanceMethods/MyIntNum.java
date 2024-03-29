package chapter14.lambda.methodReferences.instanceMethods;
//Use a method reference to an instance method
//A functional interface for numeric predicates that operate on integer values.

import java.util.function.IntPredicate;

//objRef::methodName
//If you want to use with any object of the class use:
// ClassName::instanceMethodName

interface isPredicate {
    boolean test(int n);
}

//This class stores an int value and defines the instance method isFactor(), which returns true if its argument is a factor of the stored value.
class MyIntNum {
    private int v;

    MyIntNum(int x) {
        v = x;
    }

    int getNum() {
        return v;
    }

    //Return true if n is a factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        //Here, a method reference to isFactor on myNum is created
        IntPredicate ip = myNum::isFactor;

        //Here, it is used to call isFactor() via test().
        result = ip.test(3);
        if (result) System.out.println("3 is factor of " + myNum.getNum());

        //This time, a method reference to isFactor on myNum2 is created. and used to call isFactor() via test().
        ip = myNum2::isFactor;  //a method reference to an instance method
        result = ip.test(3);
        if (!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
