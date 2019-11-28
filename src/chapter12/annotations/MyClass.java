package chapter12.annotations;

//An example that uses @Deprecated
@Deprecated
class MyClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    //Deprecate a method within a class
    @Deprecated
    String getMsg() {
        return msg;
    }
}

class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");
        System.out.println(myObj.getMsg());
    }
}
