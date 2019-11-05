package inheritance.multilevel;
//A multilevel hierarchy

class TwoDShape {
    private double width;
    private double height;

    //A default constructor (with no arguments)
    TwoDShape() {
        width = height = 0.0;
    }

    // Parametrized constructor
    TwoDShape(double w, double h) {
        width = w;
        height = h;
    }

    //Construct object with equal width and height.
    TwoDShape(double x) {
        width = height = x;
    }

    //Accessor methods for width and height.
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

    void showDim() {
        System.out.println("Width and height are " + width + " and " + height);
    }
}

//extend TwoDShape.
class Triangle extends TwoDShape {
    private String style;

    // a default constructor
    Triangle() {
        super();
        style = "none";
    }

    Triangle(String s, double w, double h) {
        super(w, h); //call superclass constructor
        style = "filled";
    }

    // One argument constructor.
    Triangle(double x) {
        super(x); // call superclass constructor
        style = "filled";
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

// Extend Triangle.
class ColorTriangle extends Triangle{
    // includes all members of Triangle and TwoDShape
    private String color;
    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color=c;
    }
    String getColor(){
        return color;
    }

    void showColor(){
        System.out.println("Color is " + color);
    }
}

class Shapes6{
    public static void main(String[] args) {
        ColorTriangle t1= new ColorTriangle("Blue", "outlined", 8.0, 12.0);
        ColorTriangle t2 = new ColorTriangle("Red", "filled", 2.0, 2.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        t1.showColor();
        System.out.println("Area is " +t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        t2.showColor();
        System.out.println("Area is " +t2.area());
    }
}
