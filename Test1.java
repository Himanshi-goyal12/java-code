public class Test1 {
    int a=5;
    void m1(int b)
    {
        System.out.println(a+b+"m1() method involved");
    }
    static void m2 (int k)
    {
        Test1 t2 = new Test1();
        System.out.println(t2.a+k+"m2 method involved");
        t2.m1(10); 
    }
    public static void main(String[] args) {
        Test1 t= new Test1 ();
        t.m1(6);
        m2(9);
        System.out.println(t.a);
    }
}
