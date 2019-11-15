package IO.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
This variation wraps the code that opens and
accesses the file within a single try block.
 */
class Showfile1 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null; // Here, fin is initialized to null

        //First, confirm that a file name has been specified
        if (args.length != 1) {
            System.out.println("Usage: Showfile1 filename");
            return;
        }

        //The following code opens a file. Read characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("File not found");
        } catch (IOException exc) {
            System.out.println("An I/O Error occured");
        } finally {
            //Close file in all cases
            try {
                if (fin != null) {
                    fin.close();
                }
            } catch (IOException exc) {
                System.out.println("Error closing file");
            }
        }
    }
}
