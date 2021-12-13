package conditionalsAndLoops;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int money = scanner1.nextInt();

        if (age >= 18 && money >= 500){
            System.out.println("Welcome!");
        } else {
            System.out.println("Not Welcome");
        }
    }
}
