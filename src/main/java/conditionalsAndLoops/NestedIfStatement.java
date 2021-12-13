package conditionalsAndLoops;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too Young");
            }
        } else {
            System.out.println("Error");
        }
    }
}
