//Read an array of bytes from the keyboard (reading console input)
package IO.bytes;

import java.io.IOException;

class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Enter some characters");
        System.in.read(data); //Enter an array of bytes from the keyboard
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println((char) data[i]);
        }
    }
}
