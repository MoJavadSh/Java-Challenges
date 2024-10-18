import java.util.ArrayList;
import java.util.Scanner;

public class NumberSpliter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        long number = input.nextLong();
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (number > 0){
            long n = number % 1000 ;
            list.add((int)n);
            number /= 1000;
        }

        for (int i = list.size()-1; i >= 0 ; i--){
            System.out.print(list.get(i));
            if (i==0){
                break;
            }
            System.out.print(",");
        }

    }
}

