package Learning;
import java.util.Scanner;


public class Learn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); //I need this to mitigate pre-prompting of questions being answered
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
    }
}
