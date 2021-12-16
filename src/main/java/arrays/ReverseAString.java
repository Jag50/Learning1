package arrays;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();

        //your code goes here
        String reverse = "";

        for (int i = arr.length - 1; i >= 0; i--){
            reverse += arr[i];
        }
        System.out.println(reverse);

    }
}