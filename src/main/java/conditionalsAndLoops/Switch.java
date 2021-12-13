package conditionalsAndLoops;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        int day;
        Scanner dayNumber = new Scanner(System.in);
        day = dayNumber.nextInt();

        if (day >0 && day <8) {
            switch (day){
                case 6:
                    System.out.println("Saturday");
                break;
                case 7:
                    System.out.println("Sunday");
                break;
                default:
                    System.out.println("weekday");
            }
        } else {
            System.out.println("please enter a valid day");
        }
    }
}
