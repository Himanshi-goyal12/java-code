import java.util.Scanner;
public class naturalno {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.println(i);
            i++;
        }

    }

}