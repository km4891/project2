import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inout 2 numbers, with 2nd being larger");

        int begin = input.nextInt();
        int end = input.nextInt();

        System.out.println(sumInts(begin, end));
    }

    public static int sumInts(int begin, int end){
        
        if (begin == end)
            return end; // return the last number
        else
            return begin + sumInts(begin+1,end); // sum the current number with the recursion result
    }
}
