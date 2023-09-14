import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a;
        for(int i=1;i<=10;i++){
            a=n*i;
            System.out.println("table of number="+a);
        }
    }
}
