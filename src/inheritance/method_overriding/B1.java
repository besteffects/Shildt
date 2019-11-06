package inheritance.method_overriding;

class B1 extends A {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show(); //show is defined by superclass A
        System.out.println("k: " + k);
    }

}
