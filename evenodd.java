import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        System.out.println("Taking input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int a =sc.nextInt();
        if(a%2==0){
            System.out.println("even number");
        }    
        else{
            System.out.println("odd number");
        }
    }
}
