public class Ternary {

    public static void main(String[] args) {
        int a = 10;
        int b = 13;
        int c = 15;
        int max = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
        System.out.println("The maximum between the three numbers " + a + ", " + b + ", " + c + " " + "is: " + max);
    }
}