import java.util.Scanner;

public class factorialno {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1, fact =1;
        while(i<=n){
            fact=fact*i;
            i++;
            System.out.println(fact);
        }    
    }
}