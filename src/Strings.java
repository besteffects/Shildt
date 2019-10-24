public class Strings {
    public static void main(String[] args) {
        substringCreate();
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