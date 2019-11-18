package IO.typeWrappers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
The program demonstrates ParseInt() and ParseDouble(). It averages a list of
numbers entered by the user. It first asks the user for the number of values
to be averaged. It then reads that number using readLine() and uses ParseInt to
convert the string into an integer. Next, it inputs values, using
parseDouble() to convert the strings into their double equivalents.
 */
public class AvgNums {
    public static void main(String[] args) throws IOException {
        //Create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;
        System.out.print("How many numbers will you enter: ");
        str = br.readLine();

        try {
            n = Integer.parseInt(str); // convert string to int
        } catch (NumberFormatException exc) {
            System.out.println("Invalid format");
            n = 0;
        }

        System.out.println("Enter " + n + " values ");

        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc) {
                System.out.println("Invalid format");
                t = 0.0;
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is: " + avg);
    }
}
