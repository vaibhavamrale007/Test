public class Alpha {
    public static void main(String[] args) {
        String input = "java98357";

        if (input.matches("[a-zA-Z0-9]+")) {
            System.out.println("this is the alphanumric.");
        } else {
            System.out.println("this is not alphanumric.");

        }
    }
}