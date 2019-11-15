package IO.bytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* Display a text file
 To use this program, specify the name
 of the file that you want to see.
 For example, to see a file called TEST.TXT
 use the following command line.

    java IO.bytes.ShowFile test.txt
    test.txt must be put into the main directory
 */
class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        //First, make sure that a file has been specified.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        try {
            fin = new FileInputStream(args[0]); // open a file
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }

        try {
            //read bytes until EOF ia encountered
            do {
                i = fin.read(); //read from the file
                if (i != -1) System.out.print((char) i);
            } while (i != -1); //when i equals -1, the end of the file has been reached
        } catch (IOException exc) {
            System.out.println("Error reading file");
        }

        try {
            fin.close(); //Close the file
        } catch (IOException exc) {
            System.out.println("Error closing file");
        }
    }

}
