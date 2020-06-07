
import java.util.Scanner;
public class inches {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a value in inches: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inches is " + meters + " meters");

    }
}
