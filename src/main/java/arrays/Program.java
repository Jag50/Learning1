package arrays;

public class Program {
    public static void main(String[] args) {
        double myArray[] = {2.5, 4.1, 18.1, 22.3};
        double sum = 0.0;
        for (int x = 0; x < 4; x++) {
            sum += myArray[x];
        }
        System.out.println(sum);
    }
}