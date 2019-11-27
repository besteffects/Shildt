package chapter12.typewrapper.autoboxing;

//Demonstrate autoboxing/unboxing
public class Autobox {
    public static void main(String[] args) {
        Integer iOb = 100; //autobox and int
        int i = iOb; //auto-unbox
        System.out.println(i + " " + iOb);
    }
}
