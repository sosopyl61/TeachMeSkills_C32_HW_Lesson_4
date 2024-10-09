import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (100 * Math.random() + 1);
        }
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.print("Enter the number from 1 to 10 you want to delete: ");
        int number = scanner.nextInt();
        int j = 0;
        for (int el : array) {
            if (el == number) {
                j++;
            }
        }
        if (j == 0)
            System.out.println("There is no such number in the array.");
        else {
            int[] newArray = new int[n - j];
            j = 0;
            for (int el : array) {
                if (el != number) {
                    newArray[j] = el;
                    j++;
                }
            }
            System.out.println("New array without your number: " + Arrays.toString(newArray));
        }
    }
}
