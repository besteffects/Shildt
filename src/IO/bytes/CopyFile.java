package IO.bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Copy a text file
To use this program, specify the name
of the source file and the destination file.
For example, to copy a file called first.txt to second.txt, use the
following command line.
  java IO.bytes.CopyFile first.txt second.txt. The program must be run from the folder with compiled class.
    files must be put into the main directory
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        //First, make sure that both files has been specified.
        if (args.length != 2) {
            System.out.println("Usage: CopyFile from to (Overrride text)");
            return;
        }
        // Copy a file
        try {
            //Attempt to open the files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error " + exc);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error cloning input file");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error closing output file");
            }
        }
    }
}
