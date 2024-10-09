import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the task: ");
        int task = scanner.nextInt();
        switch (task) {
            case 0:
                Task0.task0();
                break;
            case 1:
                Task1.task1();
                break;
            case 2:
                Task2.task2();
                break;
            case 3:
                Task3.task3();
                break;
        }
    }
}
