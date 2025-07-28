public class M {
    int a=1;
    public M(int a)
    {
        System.out.println("this is contructor");
    }
    public void m1()
    {
        System.out.println("This m1 method is method");
    }
    public void m3()
    {
        this.m1();
        this.a=1;
        System.out.println("this is m3 method====="+a);
    }
    
}
class work2 extends M {
    public work2() {
        super();
    }

}

