import java.util.Scanner;

public class ReadingFromKeyBorard {
    public static void main(String[] args) {

            //create scanner variable
            Scanner input = new Scanner(System.in);

            //create string variable to store username

            String username;
            //ask the user to type the name

            System.out.print("Please type your name: ");

            //get username from console and assign to the variable username

            username = input.nextLine();
            //display welcome message

            System.out.println(username + " WELCOME TO JAVA");

            //READ integers with scanner variable

            System.out.print("Please enter an integer: ");

            int x = input.nextInt();

            System.out.print("please enter a decimal: ");
            double y = input.nextDouble();

            System.out.println(x);
            System.out.println(y);



            //close scanner variable
            input.close();




        }

    }

