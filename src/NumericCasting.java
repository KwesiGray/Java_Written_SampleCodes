public class NumericCasting {
    public static void main(String[] args) {
        //numeric data types
        int Age = 18;
        double Height = 1.82;
        String weight = "78.19";
        String weight2 = "73";

        //conversions
        double newAge = Age;
        int newHeight = (int)Height;
        double WeightDeci = Double.parseDouble(weight);
        int WeightInt = Integer.parseInt(weight2);

        System.out.println(newAge +" as a double from int");
        System.out.println(newHeight +" as an int from a double");
        System.out.println(WeightDeci +" as a decimal from a string");
        System.out.println(WeightInt +" as an int from a string");

    }

}
