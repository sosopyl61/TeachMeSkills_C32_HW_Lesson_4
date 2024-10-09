import java.util.Arrays;

public class Task3 {

    private static double averageArithmetical(int[] array) {
        double result = 0;
        for (int el : array)
            result += el;
        return result / array.length;
    }

    public static void task3() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) (100 * Math.random() + 1);
            array2[i] = (int) (100 * Math.random() + 1);
        }
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));
        if (averageArithmetical(array1) == averageArithmetical(array2))
            System.out.println("Average arithmetical of your arrays are equal.");
        else if (averageArithmetical(array1) > averageArithmetical(array2))
            System.out.println("Average arithmetical of the first array is bigger than the second array.");
        else
            System.out.println("Average arithmetical of the second array is bigger than the first array.");
    }
}
