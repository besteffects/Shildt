package chapter12.typewrapper.manual;

//Demonstrate manual boxing and unboxing with a type wrapper
public class Wrap {
    public static void main(String[] args) {
        Integer iOb = Integer.valueOf(100); //manually box the value 100
        int i = iOb.intValue(); //manually unbox the value in iOb
        System.out.println(i + " " + iOb);
    }
}
