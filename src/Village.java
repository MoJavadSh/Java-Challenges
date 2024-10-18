import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Village {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfVillage = input.nextInt();
        int waterCapacity = input.nextInt();

        int[] villagesNeeds = new int[numberOfVillage];
        for (int i = 0; i < numberOfVillage; i++){
            villagesNeeds[i] = input.nextInt();
        }

        Arrays.sort(villagesNeeds);

        int maxVillages = -1;
        int sumOfNeeds = 0;
        int i = 0;
        while (sumOfNeeds <= waterCapacity){
            sumOfNeeds += villagesNeeds[i];
            i++;
            maxVillages++;
        }

        System.out.println(maxVillages);
    }
}
