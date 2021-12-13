package conditionalsAndLoops;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[]args){

        //AND operator
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int money = scanner1.nextInt();

        if (age >= 18 && money >= 500){
            System.out.println("Welcome!");
        } else {
            System.out.println("Not Welcome");
        }

        //OR operator
        Scanner scanner3 = new Scanner(System.in);
        int age1 = scanner3.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        int money1 = scanner4.nextInt();

        if (age1 >= 18 || money1 >= 500){
            System.out.println("Welcome!");
        } else {
            System.out.println("Not Welcome");
        }

        //NOT operator
        Scanner scanner5 = new Scanner(System.in);
        int age2 = scanner5.nextInt();

        if (!(age2 >= 18)) {
            System.out.println("Too Young");
        } else {
            System.out.println("Welcome!");
        }

    }
}
