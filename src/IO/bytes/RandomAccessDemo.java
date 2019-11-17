package IO.bytes;

import java.io.IOException;
import java.io.RandomAccessFile;

//Demonstrate random access files
//It writes doubles to a file and then reads them back in nonsequential order
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[] = {19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        //Open and use a random access file.
        try (RandomAccessFile ref = new RandomAccessFile("random.dat", "rw"))// Open random-access file
        {
            //Write values to the file
            for (int i = 0; i < data.length; i++) {
                ref.writeDouble(data[i]);
            }

            //Now, read back specific values
            ref.seek(0); //seek for the first double
            d = ref.readDouble();
            System.out.println("First value is " + d);

            ref.seek(8); //seek to second double
            d = ref.readDouble();
            System.out.println("Second value is " + d);

            ref.seek(8 * 3); //seek to fourth double
            d = ref.readDouble();
            System.out.println("Forth value is " + d);

            System.out.println();

            //Now, read every other value.
            System.out.print("Here is every other value: ");
            for (int i = 0; i < data.length; i += 2) {
                ref.seek(8 * i); //seek to ith double
                d = ref.readDouble();
                System.out.println(d + "");
            }
        } catch (IOException exc) {
            System.out.println("I/O Error " + exc);
        }
    }
}
