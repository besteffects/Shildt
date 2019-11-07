package inheritance.abstractClasses;

// Create an abstract class

abstract class TwoDShape7 {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape7() {
        width = height = 0.0;
        name = "none";
    }

    //Parametrized constructor
    TwoDShape7(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Construct object with equal width and height.
    TwoDShape7(double x, String n) {
        width = height = x;
        name = n;
    }

    //Construct an object from an object
    TwoDShape7(TwoDShape7 ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    // Accessor methods for width and height.
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    String getName() {
        return name;
    }

    void showDim() {
        System.out.println("Width and height are: " + width + " and " + height);
    }

    //an area method defined by TwoDShape
    abstract double area();
}

//a subclass for TwoDShape for Triangles.
class Triangle7 extends TwoDShape7 {
    private String style;

    //A default constructor.
    Triangle7() {
        super();
        style = "none";
    }

    //Constructor for Triangle7
    Triangle7(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    //One argument constructor
    Triangle7(double x) {
        super(x, "triangle");// call superclass constructor
        style = "filled";
    }

    //Construct an object from an object
    Triangle7(Triangle7 ob) {
        super(ob); // pass object to TwoDShape7 constructor
        style = ob.style;
    }

    //Override area() for Triangle7
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// A subclass of TwoDShape for rectangles
class Rectangle3 extends TwoDShape7 {
    //A default constructor
    Rectangle3() {
        super();
    }

    //Constructor for Rectangle.
    Rectangle3(double w, double h) {
        super(w, h, "rectangle");
    }

    //Construct a square.
    Rectangle3(double x) {
        super(x, "rectangle"); // call superclass constructor
    }

    // Construct an object from an object
    Rectangle3(Rectangle3 ob) {
        super(ob);//pass object to TwoDShape constructor
    }

    boolean isSquare() {
        if (getWidth() == getHeight()) {
            return true;
        }
        return false;
    }

    //Override area() for Rectangle
    double area() {
        return getWidth() * getHeight();
    }
}

class AbsShape {
    public static void main(String[] args) {
        //superclass reference refers to subclasses objects!

        TwoDShape7 shapes[] = new TwoDShape7[4];
        shapes[0] = new Triangle7("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle3(10);
        shapes[2] = new Rectangle3(10, 4);
        shapes[3] = new Triangle7(7.0);
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }

    }
}


