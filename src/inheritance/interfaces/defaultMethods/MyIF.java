package inheritance.interfaces.defaultMethods;

public interface MyIF {
    //This is a "normal" interface method declaration.
    //It does NOT define a default implementation.
    int getUserID();

    //This is a default method. Notice that it provides a default implementation
    default int getAdminID() {
        return 1;
    }
}

class MyIFImp implements MyIF {
    //Only getUserID() defined by MyIF needs to be implemented.
    //getAdminID() can be allowed to default.
    public int getUserID() {
        return 100;
    }
}

class MyIFImp2 implements MyIF {
    //Here, implementations for both getUserID() and getAdminID() are provided
    public int getUserID() {
        return 100;
    }

    public int getAdminID() {
        return 42;
    }
}

//Use the default method
class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        //Can call getUserID(), because it is explicitly implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        //Can also call getAdminID(), because of default implementation
        System.out.println("Administrator ID is " + obj.getAdminID());

        MyIFImp2 obj1 = new MyIFImp2();

        System.out.println("User ID2 is " + obj1.getUserID());
        System.out.println("Administrator ID2 is " + obj1.getAdminID());
    }
}
