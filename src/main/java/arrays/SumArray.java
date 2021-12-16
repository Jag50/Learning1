package arrays;

public class SumArray {
    public static void main(String[] args){

        int classroomAge[] = {21, 50, 20, 23, 26, 29, 22, 22};

        int sum = 0;

        for (int i = 0; i < classroomAge.length; i++){

            sum += classroomAge[i];
        }

        System.out.println(sum);

    }
}
