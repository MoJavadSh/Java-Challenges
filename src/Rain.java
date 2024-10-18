import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String getColoumns = input.nextLine();

        String[] split = getColoumns.trim().split(" ");

        int[] coloumns = new int[split.length];
        for (int i = 0 ; i < coloumns.length ; i++){
            coloumns[i] = Integer.valueOf(split[i]);
        }

        int maxArea = 0;
        int tempArea = 0;

        int min = coloumns[0];
        for (int i = 0; i< coloumns.length;i++){
            if (min > coloumns[i])
                min = coloumns[i];
        }
        maxArea = min * coloumns.length;

        for (int i = 0 ; i < coloumns.length-1;i++){
            if (coloumns[i]<coloumns[i+1]){
                tempArea = 2 * coloumns[i];
            } else if (coloumns[i+1]<coloumns[i]){
                tempArea = 2 * coloumns[i+1];
            } else if (coloumns[i+1] == coloumns[i]){
                tempArea = 2 * coloumns[i];
            }
            if(tempArea > maxArea){
                maxArea = tempArea;
            }
        }

//        int countColoumns = 0;
//        for (int i = 0 ; i < coloumns.length-1; i++) {
//            countColoumns = 0;
//            for (int j = i ; j < coloumns.length-1; j++) {
//                if (coloumns[i] < coloumns[j + 1]) {
//                    countColoumns++;
//                } else break;
//            }
//            if (countColoumns*coloumns[i] > maxArea){
//                maxArea = countColoumns*coloumns[i];
//            }
//        }

        System.out.println(maxArea);

    }
}
