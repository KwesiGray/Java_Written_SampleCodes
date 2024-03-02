import java.util.Arrays;

public class ARRAYS {
    public static void main(String[] args) {
        //create a Single dimensional of doubles of five elements
        double marks [] = new double[5];
        //create a S.D array of integers to take 3 elements
        int newmarks [] = new int[3];

        String doo [] = new String[10];

        //create a S.D Array of doubles and initiate at the same time
        double marks3 []= {20.3, 20, 0.1};
        //print content of S.D Arrays

        System.out.println("Before addition of Content");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(newmarks));
        System.out.println(Arrays.toString(doo));
        System.out.println(Arrays.toString(marks3));
        //Adding content to arrays
        newmarks[0] = -68;
        newmarks[1] = 80;
        newmarks[2] = 59;

        //using a loop to add content to an array
        System.out.println("LOOPS");
        for (int i=0; i< marks.length;i++){
            //at index i, add (i+2)*(Math.pow(i,3)
            marks[i]= (i+2)*(Math.pow(i,3));
            System.out.println(marks[i]);
        }
        for (int k=0;k<doo.length;k++){
            doo[k]= "Students"+(k+1);
            System.out.println(doo[k]);
        }

        //AFTER ADDING ELEMENTS
        System.out.println("AFTER ADDING CONTENTS");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(doo));

        //sorting out elements
        System.out.println("Before Sorting"+Arrays.toString(marks));
        Arrays.sort(marks);
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(marks));


        //CATCH EXCEPTION WHEN LOOPING IN A S.D ARRAYS
        System.out.println("LOOPING WITH TRY AND CATCH");
        for (int i=0;i<=marks.length;i++){
            try {
                System.out.println(marks[i]);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println("Before copy using pointing");
        System.out.println(Arrays.toString(marks));
        double copiedMark []= marks;//
        copiedMark[0] = -99;
        marks[4] = 0.07;

        System.out.println("After copy using pointing and modifying");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(copiedMark));

        //copy a SD array in java Actually creating a copy of the old array
        //modification of the old does not affect the new and vice versa

        System.out.println("Before copy creating a new array");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(copiedMark));
        double clonedMark[] = marks.clone();
        marks[0]= 120;
        clonedMark[4]=-65;

        System.out.println("After clone creating a new array");
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(clonedMark));
    }
}
