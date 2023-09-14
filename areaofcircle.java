import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println(area);
    }
    
}
