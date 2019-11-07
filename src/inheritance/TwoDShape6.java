package inheritance;
// Applying method overriding

class TwoDShape6 {
    private double width;
    private double height;
    private String name;

    // A default constructor
    TwoDShape6() {
        width = height = 0.0;
        name = "none";
    }

    //Parametrized constructor
    TwoDShape6(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    //Construct object with equal width and height.
    TwoDShape6(double x, String n) {
        width = height = x;
        name = n;
    }

    //Construct an object from an object
    TwoDShape6(TwoDShape6 ob) {
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
        System.out.println("Width and height are: " + width + height);
    }

    //an area method defined by TwoDShape
    double area() {
        System.out.println("area() must be overriden");
        return 0.0;
    }
}

//a subclass for TwoDShape for Triangles.
class Triangle6 extends TwoDShape6 {
    private String style;

    //A default constructor.
    Triangle6() {
        super();
        style = "none";
    }

    //Constructor for Triangle6
    Triangle6(String s, double w, double h) {
        super(w, h, "triangle");
        style = s;
    }

    //One argument constructor
    Triangle6(double x) {
        super(x, "triangle");// call superclass constructor
        style = "filled";
    }

    //Construct an object from an object
    Triangle6(Triangle6 ob) {
        super(ob); // pass object to TwoDShape6 constructor
        style = ob.style;
    }

    //Override area() for Triangle6
    double area() {
        return getWidth() * getHeight() / 2;
    }

    void showStyle() {
        System.out.println("Triangle is " + style);
    }
}

// A subclass of TwoDShape for rectangles
class Rectangle2 extends TwoDShape6 {
    //A default constructor
    Rectangle2() {
        super();
    }

    //Construct a square.
    Rectangle2(double x) {
        super(x, "rectangle"); // call superclass constructor
    }

    // Construct an object from an object
    Rectangle2(Rectangle2 ob) {
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

class DynShapes {
    public static void main(String[] args) {
        TwoDShape6 shapes[] = new TwoDShape6[5];
        shapes[0] = new Triangle6("outlined", 8.0,12.0);
        shapes[1]= new Rectangle2(10);
        shapes[2]= new Rectangle2(10.4);
        shapes[3]= new Triangle6(7.0);
        shapes[4] = new TwoDShape6(10,20, "generic");

        for (int i=0; i<shapes.length;i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " +shapes[i].area());
            System.out.println();
        }

    }
}

