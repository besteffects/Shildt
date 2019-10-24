public class TernaryOperator {
    public static void main(String[] args) {
        ternaryOperator1();
        ternaryOperator2();
    }

    public static void ternaryOperator1() {
        int result;
        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0; //this prevents division by zero
            // same as: if(i!=0) {result=100/i} else{result=0}
            if (i != 0) {
                System.out.println("100 / " + i + " is " + result);
            }
        }
    }

    public static void ternaryOperator2() {
        for (int i = -5; i < 6; i++) {
            if (i != 0 ? true : false) {
                System.out.println("100 / " + i + " is " + 100 / i);
            }
        }
    }
}

