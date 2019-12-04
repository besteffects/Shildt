package chapter13.generics.methods;

//Demonstrate a single generic method
class GenericMethodDemo {

    //Determine if the content of two arrays is the same.
    static <T extends Comparable<T>, V extends T> boolean
    arraysEqual(T[] x, V[] y) { //A generic method

        //If array lengths differ, then the arrays differ.
        if (x.length != y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (!x[i].equals(y[i])) return false; // arrays differ
        }
        return true; //contents of arrays are equivalent
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        Integer nums2[] = {1, 2, 3, 4, 5};
        Integer nums3[] = {1, 2, 7, 4, 5};
        Integer nums4[] = {1, 2, 7, 4, 5, 6};

        // The type arguments for T and V are implicitly determined when the method is called

        if (arraysEqual(nums, nums)) {
            System.out.println("nums equal nums");
        }
        if (arraysEqual(nums, nums2)) {
            System.out.println("nums equals nums2");
        }
        if (arraysEqual(nums, nums3)) {
            System.out.println("nums equals nums3");
        }
        if (arraysEqual(nums, nums4)) {
            System.out.println("nums equals nums4");
        }

        //This wont compile because nums and dvals are not of the same tyoe:
        //Double dvals[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        //if (arraysEqual(nums, dvals)) {
        //    System.out.println("nums equals dvals");}
    }
}
