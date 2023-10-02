import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        String[] arr3 = {"Hello", "World"};

        System.out.println("Задача 2");
        System.out.println(Arrays.toString(arr1).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(arr2).replace("[", "").replace("]", ""));
        System.out.println(Arrays.toString(arr3).replace("[", "").replace("]", ""));
        System.out.println();
    }
}
