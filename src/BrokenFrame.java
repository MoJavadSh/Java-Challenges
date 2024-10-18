// Question Link:
// https://quera.org/problemset/218360

import java.util.Scanner;

public class BrokenFrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRectangles = input.nextInt();
        int[] partsArea = new int[numberOfRectangles];

        for (int i = 0; i < numberOfRectangles ; i++ ){
            int a = input.nextInt();
            int b = input.nextInt();
            partsArea[i] = a*b ;
        }

        int partsAreaSum = 0;
        for (int i = 0; i < numberOfRectangles ; i++ ){
            partsAreaSum += partsArea[i];
        }
        int partsAreaSumSq = (int)(Math.sqrt(partsAreaSum));

        boolean canMakeFrame;
        canMakeFrame = Math.sqrt(partsAreaSum) == partsAreaSumSq;


        // if all are square
        for (int i = numberOfRectangles -1 ; i >= 0 ; i-- ){
            if (canMakeFrame){
                if (partsArea[i] == partsArea[i-1]) {
                    if (partsArea[0] == partsArea[1]) {
                        System.out.println(1);
                        System.exit(0);
                    }
                } else break;
            } else break;
        }

        if (canMakeFrame)
            System.out.println((int)(Math.pow(2 , numberOfRectangles)));
    }
}
