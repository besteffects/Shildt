public class TernaryOperator {
    public static void main(String[] args) {
        int result;
        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0; //this prevents division by zero
            // same as: if(i!=0) {result=100/i} else{result=0}
            if (i != 0) {
                System.out.println("100 / " + i + " is " + result);
            }
        }
    }
}
