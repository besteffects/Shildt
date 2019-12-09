package chapter14.lambda.throwingExceptions;

import java.io.IOException;
import java.io.Reader;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {
    public static void main(String[] args) {
        //this block lambda could throw an IOException.
        //Thus, IOException must be specified in a throws
        //clause of ioAction() in MYIOAction.
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read(); //could throw IOException
            //...
            return true;
        };
    }
}
