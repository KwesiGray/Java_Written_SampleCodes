public class Simple_Loops {
    public static void main(String[] args) {

            //while loops
            //repeatedly execute lines of code provided the loop continuation is true

            int count =0;
            while (count<=15){
                System.out.println("Welcome to java "+ count);
                //count++;
                count = count+4;
            }
            //print 5 multiples of 2
            int multi=1;
            while (multi<=5){
                System.out.println(multi*2);
                multi++;
            }
            //print the sum of the first 8 integers
            int sum =0;
            int i =1;
            while (i<9){
                sum= sum+i;
                i++;
            }
            System.out.println("Sum of 1st 8 ints is(while): " +sum);


            //FOR LOOPS
            int b = 0;
            for (int x =1;x<9;x++){
                b =b+x;
            }
            System.out.println("Sum of 1st 8 INTS is (forloop): "+b);






            for (int y=1;y<=10;y++){
                System.out.println("Welcome to the School"+ y);
            }
    }
}
