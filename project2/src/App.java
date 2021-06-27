import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        double dolToPen = 0.01;
        Scanner input = new Scanner(System.in);
        boolean quit = false;
        // System.out.println("Inout 2 numbers, with 2nd being larger");

        // int begin = input.nextInt();
        // int end = input.nextInt();

        // System.out.println(sumInts(begin, end));
        // System.out.println(minChar("ukhfgkfjhgfdjhafhjdghfkh", 0));

        // int days = input.nextInt();
        //  int day = input.nextInt();
        // System.out.println("You would earn $" + payDay(day) / penToDol + "for working " + day + " days");
        while (quit == false) {
        System.out.println("Choose one of the following options");
        System.out.println("Press 1. For a recurisve Java method to add 2 integers from start through end");
        System.out.println("Press 2. To find the smalles letter in a word");
        System.out.println("Press 3. Watch your money double everyday you work");
        System.out.println("Press 0. To exit");
        
        
        int menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Inout 2 numbers, with 2nd being larger");
                    int begin = input.nextInt();
                    int end = input.nextInt();
                    System.out.println(sumInts(begin, end));
                    break;
                
                case 2:
                    System.out.print("Enter a word to find the smallest letter: ");
                    String x = input.next();
                    int z = 0;
                    System.out.println("The smallest letter is: " + minChar(x, z));
                    break;
                
                case 3: 
                    System.out.println("How many days would you like to work? ");
                    int day = input.nextInt();
                    // double total = Math.round(payDay(day) / penToDol);
                    System.out.println("You would earn $" + payDay(day) * dolToPen + " for working " + day + " days");
                    break;
                
                case 0:
                    quit = true;
                    break;
                
                default:
                    System.out.println("Please enter a valid selection");
            }
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
