public class Arguments {
    public static void main(String[] args) {
        Arguments ob = new Arguments();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b);
        ob.noChange(a, b);
        System.out.println("a and b after call: " + a + " " + b);

        ObjectReference ob1 = new ObjectReference(15, 20);
        System.out.println("ob1.c and ob1.d before call: " + ob1.c + " " + ob1.d);
        ob1.change(ob1);
        System.out.println("ob1.c and ob1.d before call: " + ob1.c + " " + ob1.d);

    }

    // this method causes no change to the arguments used in the call
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }

    static class ObjectReference {
        int c, d;

        ObjectReference(int i, int j) {
            c = i;
            d = j;
        }

        //Pass an object. Now ob.c and ob.d in object used in the call will be changed
        void change(ObjectReference ob) {
            ob.c = ob.c + ob.d;
            ob.d = -ob.d;
        }
    }


}
