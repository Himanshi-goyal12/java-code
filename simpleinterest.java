import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principal");
        int p=sc.nextInt();
        System.out.println("enter the rate");
        int r=sc.nextInt();
        System.out.println("enter the year");
        int t=sc.nextInt();
        float  interest=p*r*t/100;
        System.out.println(interest);

    }
}
