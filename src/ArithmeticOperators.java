import java.sql.SQLOutput;

public class ArithmeticOperators {

        public static void main(String[] args) {
            int x=20;
            int y=3;
            double a=20.0;
            double b=3.0;

            System.out.println("X is: "+ x);
            System.out.println("y is: "+ y);
            System.out.println("a is: "+ a);
            System.out.println("b is: "+ b);

            System.out.println("");

            System.out.println("Various Computations performed on the 4 variables");

            System.out.println("");

            //ADDITION
            System.out.println("Int Addition: "+(x+y));
            System.out.println("Decimal Addition: "+(a+b));
            System.out.println("Decimal + Integer: "+(x+b));

            //Multiplication
            System.out.println("Int Multiplication: "+(x*y));
            System.out.println("Decimal Multiplication: "+(a*b));
            System.out.println("Decimal * Integer: "+(x*b));

            //Subtraction
            System.out.println("Int Subtraction: "+(x-y));
            System.out.println("Decimal Subtraction: "+(a-b));
            System.out.println("Decimal - Integer: "+(x-b));

            //Division
            System.out.println("Int Division: "+(x/y));
            System.out.println("Decimal Division: "+(a/b));
            System.out.println("Decimal  Integer: "+(x/b));



        }
    }


