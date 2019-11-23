package this_keyword;

public class Pwr1 {
    double b;
    int e;
    double val;

    Pwr1(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.val = 1;
        if (exp == 0) return;
        for (; exp > 0; exp--) {
            this.val = this.val * base;
        }
    }

    double get_pwr() {
        return this.val;
    }
}

class DemoPwr1 {
    public static void main(String[] args) {
        Pwr1 x = new Pwr1(4.0, 2);
        Pwr1 y = new Pwr1(2.5, 1);
        Pwr1 z = new Pwr1(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.get_pwr());
        System.out.println(y.b + " raised to the " + y.e + " power is " + y.get_pwr());
        System.out.println(z.b + " raised to the " + z.e + " power is " + z.get_pwr());
    }
}
