import java.util.ArrayList;

public class creatingMethods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> hometown = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        names.add("Gauis");
        names.add("Esi");
        names.add("Prince");
        names.add("Bernice");
        names.add("Gauis");
        names.add("Erskine");

        hometown.add("Takoradi");
        hometown.add("Anaji");
        hometown.add("Tarkwa");
        hometown.add("JamesTown");
        hometown.add("Accra");
        hometown.add("Tema");

        ages.add(25);
        ages.add(21);
        ages.add(45);
        ages.add(19);
        ages.add(2);
        ages.add(31);


        int a = 25;
        int b = 32;

        Addition(a, b);


        printContentStringArrayList(names);
        printContentStringArrayList(hometown);


    }

    private static int Addition(int a, int b) {
        return a + b;
    }

    private static void printContentStringArrayList(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {

            System.out.println(names.get(i));
        }

    }

}