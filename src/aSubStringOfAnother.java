import java.util.Scanner;

public class aSubStringOfAnother {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Dav;
        System.out.println("Enter Your First string Below:");
        Dav = input.nextLine();

        String Saml;
        System.out.println("Enter Your Second String Below:");
        Saml = input.nextLine();

        String Rog;
        System.out.println("Enter Your Third String Below:");
        Rog = input.nextLine();

        if (Dav.contains(Saml)&&(Dav.contains(Rog))){
            System.out.println(Rog +" and "+ Saml+" is a Substring of "+Dav);
        } else if (Dav.contains(Saml)!=(Dav.contains(Rog))) {
            System.out.println(Saml+" is a Substring of "+Dav+" But "+Rog+" is not a Substring of "+Dav);

        } else{
            System.out.println(Saml+" and "+Rog+" is NOT a Substring of "+Dav);
        }

        input.close();
    }
}
