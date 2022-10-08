import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число а:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        System.out.println(numberLeonardo(a, b));
    }

    public static int numberLeonardo(int a, int b) {
        int count = 0;
        int first = 1;
        int second = 1;
        while (first <= b) {
            if (first >= a) ++count;
            int next = second;
            second = second + first + 1;
            first = next;
        }
        return count;
    }
}