import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int penToDol = 100;
        Scanner input = new Scanner(System.in);
        // System.out.println("Inout 2 numbers, with 2nd being larger");

        // int begin = input.nextInt();
        // int end = input.nextInt();

        // System.out.println(sumInts(begin, end));
        // System.out.println(minChar("ukhfgkfjhgfdjhafhjdghfkh", 0));

        // int days = input.nextInt();
        //  int day = input.nextInt();
        // System.out.println("You would earn $" + payDay(day) / penToDol + "for working " + day + " days");
        int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Inout 2 numbers, with 2nd being larger");
                    int begin = input.nextInt();
                    int end = input.nextInt();
                    System.out.println(sumInts(begin, end));
            }
      


    }

    public static int sumInts(int begin, int end){

        if (begin == end)
            return end; // return the last number
        else
            return begin + sumInts(begin+1,end); // sum the current number with the recursion result
    }

    public static char minChar(String x, int z){
        char c = '~';
        if(z < x.length()){
            if(x.charAt(z) < c){
                c = x.charAt(z);
            }
            char candidate = minChar(x, z+1); // add assignment
            if (candidate < c) c = candidate; // add update
        }
        return c;
    }

    public static double payDay(int day) {
        // double penToDol = 100;
        if (day == 1) {
            return 1;
        }

        return Math.pow(2, day - 1) + payDay(day - 1);
        
    }
}
