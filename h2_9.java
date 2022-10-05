import java.util.Scanner;
import java.math.*;
/**
 * Created by H on 28/09/2022.
 */
public class h2_9 {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        Scanner b =new Scanner(System.in);
        System.out.println("enter tow numbers");
        int s,x,sum,max,min,product,distance,difference;
        double average;
        s=a.nextInt();
        x=b.nextInt();
        sum=s+x;
        average=(s+x) /2;
        max=Math.max(s,x);
        min=Math.min(s,x);
        difference=s-x;
        product=s*x;
        distance=Math.abs(difference);
        System.out.println("Sum :"+sum);
        System.out.println("Difference :"+difference);
        System.out.println("Product :"+product);
        System.out.println("Average :"+average);
        System.out.println("Distance :"+distance);
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);

    }
}
