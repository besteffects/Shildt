package inheritance.final_mod;

//final prevents overriding and inheritance
class A {
    final void meth() {
        System.out.println("This is final method");
    }
}

class B extends A {
    //void meth(){
    //  System.out.println("Illegal");
    // }
}
