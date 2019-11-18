package IO.chars;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
The program creates a simple-disk-to-screen utility that reads a text file called
"test.txt" and displays its contents on the screen. Thus, it is the complement of the key-to-disk
utility (FileWriter)
 */
public class DtoS_FileReader {
    public static void main(String[] args) {
        String s;

        //Create and use a FileReader wrapped in a BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) { //Create a FileReader
            while ((s = br.readLine()) != null) { //read lines from the file and display them on the screen
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
