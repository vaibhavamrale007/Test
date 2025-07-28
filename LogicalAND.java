public class LogicalAND {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;
        if ((a > b) && (++a < c))
            System.out.println("if block is executed.");
        else
            System.out.println("else block is executed.");
        System.out.println("the value of a is:" + c);

    }

}
