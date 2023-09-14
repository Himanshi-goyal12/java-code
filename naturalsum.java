import java.util.*;
public class naturalsum {
    public static void main(String[] args) {
        int i = 1;
        int sum =0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            System.out.println(i);
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
        
}
