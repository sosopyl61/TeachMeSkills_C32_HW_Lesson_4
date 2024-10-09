import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void task0() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (100 * Math.random() + 1);
        }
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.print("Enter the number from 1 to 10 you want to find: ");
        int number = scanner.nextInt();
        Arrays.sort(array);
        if (Arrays.binarySearch(array, number) >= 0)
            System.out.println("Your number is in the array.");
        else
            System.out.println("Your number is not in the array.");
    }
}
