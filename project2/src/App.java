import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        // System.out.println("Inout 2 numbers, with 2nd being larger");

        // int begin = input.nextInt();
        // int end = input.nextInt();

        // System.out.println(sumInts(begin, end));
        System.out.println(minChar("ukhfgkfjhgfdjhafhjdghfkh", 0));
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
}
