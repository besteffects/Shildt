package exceptions;

// Use of throws
class ThrowsDemo {
    static char prompt(String str) throws java.io.IOException { //throws
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            ch = prompt("Enter a letter"); // since prompt() might throw an exception, a call to it must be enclosed within a try block
        } catch (java.io.IOException exc) {
            System.out.println("I/O exception occured");
            ch = 'X';
        }
        System.out.println("You pressed " + ch);
    }
}

