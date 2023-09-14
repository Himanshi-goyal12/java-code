import java.util.*;
public class count_digits {
    public static void main(String[] args) {
        int count=0;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println(count);

    }
}
