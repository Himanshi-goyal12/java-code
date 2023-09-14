import java.util.Scanner;

public class naturalno2 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1; 
        i=n;
        do{
            System.out.println(i);
            i--;
        } while(i>=1);

    }
    
}
