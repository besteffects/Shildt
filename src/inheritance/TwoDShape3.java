package inheritance;

//Add constructor to TwoDshape (using super)
class TwoDShape3 {
    private double width;
    private double height;

    //Parametrized constructor.
    TwoDShape3(double w, double h){
        width=w;
        height=h;
    }

    //Accessor methods for width and height.
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width=w;
    }
    void setHeight(double h){
        height=h;
    }

    void showDim(){
        System.out.println("Width and height are " + width + " and " + height);
    }

}

// A subclass of TwoDShapes for triangles.
class Triangle3 extends TwoDShape3{
    private String style;
    Triangle3(String s, double w, double h){
        super(w,h); // call superclass constructor
        style=s;
    }

    double area(){
        return getWidth()*getHeight()/2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}

class Shapes4{
    public static void main(String[] args) {
        Triangle3 t1 = new Triangle3("filled", 4.0, 4.0);
        Triangle3 t2 = new Triangle3("outlined", 8.0, 12.0);
        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " +t2.area());
    }
}
