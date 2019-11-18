package IO.bytes;
//Demonstrate PrintWriterDemo (handles console output)
//Should be used instead sout for internationalization

import java.io.PrintWriter;

class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true); // create a PrintWriter linked to System.out
        int i = 10;
        double d = 123.65;
        pw.println("Using a PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + "+" + d + " is " + (i + d));
    }
}
