package inheritance;

// with default constructors and constructors that take one argument(super)
class TwoDShape4 {
    private double width;
    private double height;

    //a default constructor.
    TwoDShape4(){
        width=height=0.0;
    }
    //Parametrised constructor.
    TwoDShape4(double w, double h){
        width=w;
        height=h;
    }

    //Construct object with equal width and height.
    TwoDShape4(double x){
        width=height=x;
    }

    // Accessor methods for width and height.
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width =w;
    }

    void setHeight(double h){
        height =h;
    }

    void showDim(){
        System.out.println("Width and height are: " + width + " and " + height);
    }
}

// A subclass for TwoDshape4 for triangles.
class Triangle4 extends TwoDShape4{
    private String style;

    // a default constructor.
    Triangle4(){
        super(); // use super() to call various forms of the TwoDShape4 constructor
        style="none";
    }

    //Constructor
    Triangle4(String s, double w, double h){
        super(w,h); // superclass constructor. Use super() to call various forms of the TwoDShape4 constructor
        style=s;
    }

    //One argument constructor
    Triangle4(double x){
        super(x);
        style="filled";
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shape5{
    public static void main(String[] args) {
        //creating 3 objects using constructors with different arguments
        Triangle4 t1 = new Triangle4();
        Triangle4 t2 = new Triangle4("outlined", 8.0, 12.0);
        Triangle4 t3 = new Triangle4(4.0);
        t1=t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is: " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is: " + t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is: " +t3.area());

        System.out.println();
    }
}