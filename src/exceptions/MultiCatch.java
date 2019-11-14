package exceptions;

// Use of multi-catch feature. Note code requires at least JDK7
class MultiCatch {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char chrs[] = {'A', 'B', 'C'};
        for (int i = 0; i < 2; i++) {
            try {
                if (i == 0) {
                    result = a / b; //generate an arithmetic exception
                } else {
                    chrs[5] = 'X'; //Generate an ArrayIndexOutOfBounds exception
                    //This catch clause catches both exceptions
                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { //This catch clause catches both exceptions
                System.out.println("Exception caught: " + e);
            }
        }
        System.out.println("After multi-catch.");
    }
}
