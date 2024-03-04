import java.util.InputMismatchException;
import java.util.Scanner;

public class Double_Handling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p = 0;
        double v = 0;
        double m = 0;
        boolean ConP = true;
        boolean ConV = true;
        boolean ConM = true;

        while (ConP) {
            System.out.println("Please Enter the value for P:");
            try {
                p = input.nextDouble();
                ConP = false;
            } catch (InputMismatchException Gray) {
                System.out.println("Please Enter only Double values for P");
                input.nextLine();
            }
        }

        while (ConV) {
            System.out.println("Please Enter the value for V:");
            try {
                v = input.nextDouble();
                ConV = false;
            } catch (InputMismatchException Dav) {
                System.out.println("Enter Only Double Values for V");
                input.nextLine();
            }
        }

        while (ConM) {
            try {
                m = p / v;
                System.out.println(p + "/" + v + " is:" + m);
                ConM = false;
            } catch (ArithmeticException Kwesi) {
                System.out.println("Division by 0.0 is not allowed");
            }
        }
        input.close();
    }
}
