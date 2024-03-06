import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //floating point division by zero
        int y = 0;
        int x = 0;
        int z = 0;
        boolean Conditionzero = true;
        boolean ConditionWrongINput = true;
        boolean ConditionWrongINPUT = true;

        while (ConditionWrongINput) {
            System.out.println("Enter value for x: ");
            try {
                x = input.nextInt();//INPUT MISMATCH EXCEPTION
                //if user enters an integer break out of while loop
                ConditionWrongINput = false;
            } catch (InputMismatchException QA) {
                System.out.println("Only Integers Allowed");
                input.nextLine();//This line is just saying go back tto console and get user input
            }
        }


        while (Conditionzero) {
            System.out.println("Enter value for y: ");
            try {
                y = input.nextInt();//INPUT MISMATCH EXCEPTION
                ConditionWrongINPUT = false;
            } catch (InputMismatchException f) {
                System.out.println("Only Integers Allowed");
                input.nextLine();
            }

            try {
                z = x / y;//ARITHMETIC EXCEPTION
                //IF VALUE OF Y IS NOT ZERO
                //BREAK OUT OF WHILE LOOP
                Conditionzero = false;
                System.out.println(x + "/" + y + " is: " + z);
            } catch (ArithmeticException Dav) {
                System.out.println("Division by zero not allowed");

            }

        }





        input.close();









    }
}
