package staticMod;

public class Strings {
    public static void main(String args[]) {
        //1. Command line arguments
        //Search for a two-dimensional array for a name from a phone book
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"Jon", "555-1037"},
                {"Rachel", "555-1400"}
        };
        System.out.println("Args length: " + args.length);
        int i;
        if (args.length != 1) {
            System.out.println("Usage: Java Phone <name>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                    break;
                }
            }
            if (i == numbers.length) {
                System.out.println("Name not found.");
            }
        }
        //2.
        substringCreate();

        //3.
        stringSwitch();

    }

    public static void substringCreate() {
        String orgstr = "Java makes the web move.";

        //Construct a substring
        String substr = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

    }

    public static void stringSwitch() {
        String command = "cancel";
        switch (command) {
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Cancelling");
                break;
            case "disconnect":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command Error!");
                break;
        }

    }

}