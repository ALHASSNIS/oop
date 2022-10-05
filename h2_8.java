import java.util.Scanner;
import java.math.*;
/**
 * Created by H on 27/09/2022.
 */
public class h2_8 {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        double number;
        System.out.println("enter a number : ");
        number=n.nextDouble();
        double square=number*number;
        double cube=number*number*number;
        double fourthpower=Math.pow(number,4);
        System.out.println("the square : "+square);
        System.out.println("the cube : "+cube);
        System.out.println("the fourthpower : "+fourthpower);


    }
}
