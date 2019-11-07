package inheritance;
/*
Taking an object of the class as the parameter. This allows class to construct a copy
of an object
 */
class TwoDShape5 {
private double width;
private double height;

// A default constructor
    TwoDShape5(){
        width=height=0.0;
    }

    //Parametrised constructor
    TwoDShape5(double w, double h){
        width=w;
        height=h;
    }

    // Construct an object with equal width and height
    TwoDShape5 (double x){
        width=height=x;
    }

    //Construct an object from an object
    TwoDShape5(TwoDShape5 ob){
        width=ob.width;
        height=ob.height;
    }

    //Accessor methods for width and height.
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width=w;}
    void setHeight(double h){height=h;}

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }
}

// A subclass of twoDShape5 for triangles.
class Triangle5 extends TwoDShape5{
    private String style;

    // a default constructor
    Triangle5(){
        super();
        style="none";
    }

    //Constructor for Triangle.
    Triangle5(String s, double w, double h){
        super(w,h); // call to superclass constructor
        style=s;
    }

    // One argument constructor
    Triangle5(double x){
        super(x); // call to superclass constructor
        style="filled";
    }

    //Construct an object from an object (superclass reference can refer to a subclass object)
    Triangle5(Triangle5 ob){
        super(ob);
        style=ob.style;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shapes7{
    public static void main(String[] args) {
        Triangle5 t1= new Triangle5("outlined", 8.0, 12.0);

        // make a copy of t1
        Triangle5 t2 = new Triangle5(t1);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());
    }
}
