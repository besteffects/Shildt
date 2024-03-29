package chapter12.staticImport;

//Find the solutions to a quadratic equation
class Quadratic {
    public static void main(String[] args) {
        //a,b and c represent the coefficients in the quadratic equation:ax2 + bx + c=0
        double a, b, c, x;

        //Solve 4x2 + x - 3 = 0 for x
        a = 4;
        b = 1;
        c = -3;

        //Find first solution
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        //Find second solution.
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) / (2 * a));
        System.out.println("Second solution: " + x);
    }
}
