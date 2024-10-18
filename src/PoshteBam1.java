import java.util.ArrayList;
import java.util.Scanner;
public class PoshteBam1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfRows = input.nextInt();
        int numberOfTowersInRows = input.nextInt();
        int numberOfTowers = numberOfRows * numberOfTowersInRows;
        ArrayList<Integer> towers = new ArrayList<Integer>();

        for (int j = 0 ; j < numberOfRows ; j++){
            for (int i = 0 ; i < numberOfTowersInRows ; i++){
                towers.add(input.nextInt());
            }
        }
        int nextMaxTowerHeight;
        for (int i = 0 ; i < numberOfTowers;i++){
            nextMaxTowerHeight = -1;
            for (int j = i+1; j < numberOfTowers; j++){
                if(towers.get(i)<towers.get(j)){
                    nextMaxTowerHeight = towers.get(j);
                    break;
                }
            }
            System.out.print(nextMaxTowerHeight+" ");
        }

    }
}
