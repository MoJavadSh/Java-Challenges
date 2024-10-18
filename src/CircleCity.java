import java.util.Scanner;

// Question Link:
// https://quera.org/problemset/218362?tab=description
public class CircleCity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String S1 = input.nextLine();
        String S2 = input.nextLine();
        String S3 = input.nextLine();

        if (S2.contains("1") && S2.contains("0"))
            System.out.println("YES");
        else System.out.println("No");


    }
}
