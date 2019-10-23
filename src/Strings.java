public class Strings {
    public static void main(String[] args) {
        String orgstr = "Java makes the web move.";

        //Construct a substring
        String substr= orgstr.substring(5,18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}