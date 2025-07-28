public class LogicalOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println((a > b) || (a++ < c));
        System.out.println("The value of a is:" + b);

        System.out.println((a < b) || (a++ < c));
        System.out.println("The value of a is:" + a);
    }

}