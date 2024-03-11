public class EqualityRelations {
    public static void main(String[] args) {
        int A =30;
        int B =30;
        //Equality Operators
        System.out.print("Is The (" +A +") equal to (" +B +"): ");
        System.out.println(A==B);

        System.out.print("Is The (" +A +") not equal to (" +B +"): ");
        System.out.println(A!=B);

        System.out.print("Is The (" +A +") greater than (" +B +"): ");
        System.out.println(A>B);

        System.out.print("Is The (" +A +") less than (" +B +"): ");
        System.out.println(A<B);

        System.out.print("Is The (" +A +") greater than or equal to (" +B +"): ");
        System.out.println(A>=B);

        System.out.print("Is The (" +A +") less than or equal to (" +B +"): ");
        System.out.println(A<=B);

        //Ternary Operator ?
        int x = (A==B)? 45:80;
        System.out.println(x);
    }
}
