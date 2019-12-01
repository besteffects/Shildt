package chapter13.generics.boundedTypes;
//In this version of NumericFNS, the type argument for T must be either Number, or a class derived from Number.

class NumericFns<T extends Number> {
    T num;

    //Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    //Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // ...
}

//Demonstrate NumericFNS
class BoundsDemo {
    public static void main(String[] args) {
        NumericFns<Integer> iOb = new NumericFns<Integer>(5); //Integer is OK because it is a subclass by Number
        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());

        System.out.println("Fractional component of iOb is " +
                iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb =
                new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dOb is " +
                dOb.reciprocal());
        System.out.println("Fractional component of dOb is " +
                dOb.fraction());
    }
}