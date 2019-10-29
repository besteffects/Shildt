class OverloadedConstructor {
    int x;

    OverloadedConstructor() {
        System.out.println("Inside OverloadedConstructor(). ");
        x = 0;
    }

    OverloadedConstructor(int i) {
        System.out.println("Inside OverloadedConstructor(int).");
        x = i;
    }

    OverloadedConstructor(double d) {
        System.out.println("OverloadedConstructor(double).");
        x = (int) d;
    }

    OverloadedConstructor(int i, int j) {
        System.out.println("Inside OverloadedConstructor(int, int).");
        x = i * j;
    }
}

class OverloadedConstructorDemo {
    public static void main(String[] args) {
        OverloadedConstructor t1 = new OverloadedConstructor();
        OverloadedConstructor t2 = new OverloadedConstructor(88);
        OverloadedConstructor t3 = new OverloadedConstructor(17.23);
        OverloadedConstructor t4 = new OverloadedConstructor(2, 4);

        System.out.println("t1.x: " + t1.x);
        System.out.println("t2.x: " + t2.x);
        System.out.println("t3.x: " + t3.x);
        System.out.println("t4.x: " + t4.x);
    }
}

