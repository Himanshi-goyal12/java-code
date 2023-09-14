public class Test2 {
    int a,b;
    Test2(int x ,int y)
    {
        a=x;
        b=y;
    }
    Test2(Test2 t1)
    {
        a=t1.a;
        b=t1.b;
    }
    void display()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Test2 t =new Test2(5,10);
        Test2 t3 = new Test2( t);
        t.display();
        t3.display();
    }
}
