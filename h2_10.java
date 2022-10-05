import java.util.Scanner;

/**
 * Created by H on 28/09/2022.
 */
public class h2_10 {
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

        System.out.printf("%-20s%3d\n","Sum :",sum);
        System.out.printf("%-20s%3d\n","Difference :",difference);
        System.out.printf("%-20s%3d\n","Product :",product);
        System.out.printf("%-20s%2.2f\n","Average :",average);
        System.out.printf("%-20s%3d\n","Distance :",distance);
        System.out.printf("%-20s%3d\n","Max :",max);
        System.out.printf("%-20s%3d\n","Min :",min);

    }
}
