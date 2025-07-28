
public class magic {

    public static void main(String[] args) {
        int n = 1729;
        while (n > 9) {
            int s = 0;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            n = s;
        }
        System.err.println(n == 1 ? "Magic Number " : "Not magic ");
    }
}
