import java.util.Objects;
import java.util.Scanner;

public class SherlockdaysOff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] weekDays = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        String firstDayOfMonth = input.next();
        int crimeRate = 0;
        int dayOfStart = 0;

        if (Objects.equals(firstDayOfMonth, "Saturday")) {
            dayOfStart = 0;
        } else if (Objects.equals(firstDayOfMonth, "Sunday")){
            dayOfStart = 2;
        }else if (Objects.equals(firstDayOfMonth, "Monday")){
            dayOfStart = 4;
        }else if (Objects.equals(firstDayOfMonth, "Tuesday")){
            dayOfStart = 6;
        }else if (Objects.equals(firstDayOfMonth, "Wednesday")){
            dayOfStart = 8;
        }else if (Objects.equals(firstDayOfMonth, "Thursday")){
            dayOfStart = 10;
        }else if (Objects.equals(firstDayOfMonth, "Friday")){
            dayOfStart = 12;
        }
        for (int i = 0; i < 30; i++) {

            crimeRate = input.nextInt();
            weekDays[dayOfStart] += crimeRate;
            weekDays[dayOfStart+1] += 1;

            if (dayOfStart <= 10) {
                dayOfStart += 2;
            } else {
                dayOfStart = 0;
            }
        }
        int Saturday = weekDays[0]/weekDays[1];
        int Sunday = weekDays[2]/weekDays[3];
        int Monday = weekDays[4]/weekDays[5];
        int Tuesday = weekDays[6]/weekDays[7];
        int Wednesday = weekDays[8]/weekDays[9];
        int Thursday = weekDays[10]/weekDays[11];
        int Friday = weekDays[12]/weekDays[13];

        int MinCrime = Math.min(Saturday, Math.min(Sunday, Math.min(Monday, Math.min(Tuesday, Math.min(Wednesday, Math.min(Thursday, Friday))))));
        if (MinCrime == Saturday){
            System.out.print("Saturday ");
        }else if (MinCrime == Sunday){
            System.out.print("Sunday ");
        }else if (MinCrime == Monday){
            System.out.print("Monday ");
        }else if (MinCrime == Tuesday){
            System.out.print("Tuesday ");
        }else if (MinCrime == Wednesday){
            System.out.print("Wednesday ");
        }else if (MinCrime == Thursday){
            System.out.print("Thursday ");
        }else if (MinCrime == Friday){
            System.out.print("Friday ");
        }

        System.out.print(MinCrime);



    }
}