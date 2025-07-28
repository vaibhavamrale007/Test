public class Testimmtable {
    public void m1() {
        System.out.println("this is normal method");
    }

    public static void m2() {
        System.out.println("this is static method");
    }

    static {
        System.out.println("static block for testing");
    }

    public static void main(String[] args) {
        Testimmtable t = new Testimmtable();
        t.m1();

        Testimmtable.m2();
    }
}
