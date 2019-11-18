package IO.chars;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Key-to-disk utility that reads lines of text entered at the keyboard
and writes them to a file called "test.txt". Text is read until the user
enters the word "stop". It uses a FileWriter to output to the file.
 */
class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");
        try (FileWriter fw = new FileWriter("test.txt")) { // Create a FileWriter
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n"; //add newline
                fw.write(str); // Write strings to the file
            } while (str.compareTo("stop") != 0);
        } catch (IOException exc) {
            System.out.println("I/O Error:" + exc);
        }
    }
}
