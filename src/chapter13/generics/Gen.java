package chapter13.generics;
//A simple generic class.
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen is created.

class Gen <T> {
    T ob; //declare an object of type T

    //Pass the constructor a reference to
    //an object of type T.
    Gen(T o){
        ob=o;
    }

    //Return ob
    T getOb(){
        return ob;
    }

    //Show type of T.
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

//Demonstrate the generic class.
class GenDemo{
    public static void main(String[] args) {
        //Create a Gen reference to Integers.
        Gen<Integer> iOb; // Create a reference to an object type Gen<Integer>

        //Create a Gen<Integer> object and assign its reference to iOb. Notice the use of autoboxing
        //to encapsulate the value 88 within an Integer object.
        iOb=new Gen<Integer>(88);

        //Show the type of data used by iOb.
        iOb.showType();
    }
}
