import java.util.Scanner;

/**
 * Created by H on 28/09/2022.
 */
public class h2_3 {
    public static void main(String[] args) {
        double width,height,area;
        Scanner a =new Scanner(System.in);
        Scanner b =new Scanner(System.in);
        System.out.println("enter width and height");
        width=a.nextDouble();
        height=b.nextDouble();
        area=(width*height)*2;
        System.out.println(area);
    }
}
