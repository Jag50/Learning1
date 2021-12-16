package conditionalsAndLoops;

import java.util.Scanner;

public class LoanCalculator {
    public LoanCalculator() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        //your code goes here
//        double y = 0.9;
//        double x = amount * y * y * y;
//        int xc = (int) x;
//        System.out.println(xc);
        int months = 3;

        for (int i = 0; i < months; ++i) {
            amount = amount * 90 / 100;
            System.out.println(amount);
        }

    }
}
