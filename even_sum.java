import java.util.*;
public class even_sum{
    public static void main(String[] args){
         int i = 2;
        int sum =0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i=i+2;
        }
        System.out.println(sum);
    }
}
