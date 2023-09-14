import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int t=n,arm=0,r;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(arm==t){
            System.out.println("armstrong no");
        }
        else{
            System.out.println("not armstrong no");
        }

    }
}
