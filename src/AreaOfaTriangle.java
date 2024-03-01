import java.util.Scanner;

public class AreaOfaTriangle {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int Length;
        double Height;
        double Area;
        System.out.println("AREA OF A TRIANGLE CALCULATOR IN JAVA FOLLOW THE ONSCREEN INSTRUCTIONS!");
        System.out.println(" ");

        System.out.print("Enter the Length of Your Triangle: ");
        Length = input.nextInt();

        System.out.print("Enter The Height OF Your Triangle: ");
        Height = input.nextDouble();

        Area= 0.5*Length*Height;
        System.out.println("The Area OF The Triangle is: "+ Area+"");


        input.close();

    }
}
