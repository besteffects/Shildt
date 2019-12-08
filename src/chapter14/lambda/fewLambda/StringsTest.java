package chapter14.lambda.fewLambda;

//A functional interface that tests two strings.
interface StringsTest {
    boolean test(String aStr, String bStr);
}

class LambdaDemo3 {
    public static void main(String[] args) {
        //This lambda expression determines if one string is a part of another.
        StringsTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "This is test";

        System.out.println("Testing string: " + str);

        if (isIn.test(str, "is a")) {
            System.out.println("'is a' found.");
        } else {
            System.out.println("'is a' not found");
        }

        if (isIn.test(str, "xyz")) {
            System.out.println("'xyz' Found");
        } else {
            System.out.println("'xyz' not found");
        }
    }
}
