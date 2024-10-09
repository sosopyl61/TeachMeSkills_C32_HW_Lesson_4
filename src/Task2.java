import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (100 * Math.random() + 1);
        }
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.println("Min value in the array: " + Arrays.stream(array).min().getAsInt());
        System.out.println("Max value in the array: " + Arrays.stream(array).max().getAsInt());
        System.out.println("Average value in the array: " + Arrays.stream(array).average().getAsDouble());
    }
}
