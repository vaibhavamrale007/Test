
public class Reverse {
    public static void main(String[] args) {

        String name = "Rohit";
        String reverseName = " ";

        for (int i = 0; i <= 5; i++) {
            reverseName = name.charAt(i) + reverseName;

        }
        System.out.println(reverseName);

    }

}
