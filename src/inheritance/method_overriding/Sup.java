package inheritance.method_overriding;

//Demonstrate dynamic method dispatch
class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who() in Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() is Sub2");
    }
}

class DynDispDemo {
    public static void main(String[] args) {
        Sup superbOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;
        // in Each case, the version of who() to call is determined at a runtime by the type of object being referred to
        supRef = superbOb;
        supRef.who();//

        supRef = subOb1;
        supRef.who();

        supRef = subOb2;
        supRef.who();
    }
}
