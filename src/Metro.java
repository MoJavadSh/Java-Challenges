// Question Link:
// https://quera.org/problemset/218361
import java.util.Scanner;

public class Metro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] line1 = new int[8];
        int[] line2 = new int[8];

        for (int i = 0 ; i < 8 ; i++){
            int n = input.nextInt();
            line1[i] = n;
        }
        for (int i = 0 ; i < 8 ; i++){
            int n = input.nextInt();
            line2[i] = n;
        }
        int eyeToEyeCount = 0;
        for (int i = 0 ; i < 8 ; i++){
            if (line1[i]+line2[i] == 2)
                eyeToEyeCount++;
        }

        System.out.println(eyeToEyeCount);

    }
}
