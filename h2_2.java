import java.util.Scanner;

/**
 * Created by H on 28/09/2022.
 */
public class h2_2 {
    public static void main(String[] args) {
        int r;
        double pi=3.14,area;
        Scanner s =new Scanner(System.in);
        System.out.println("enter radius of circle:");
        r=s.nextInt();
        area=pi*r*r;
        System.out.println("area of circle = "+area);
    }
}
