import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0!");
            System.exit(1);
        }

        int originalN = n;

        int sum = 0;
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            count++;
            n = n / 10;
        }

        System.out.println();
        System.out.println("Исходное число: " + originalN);
        System.out.println("Количество цифр: " + count);
        System.out.println("Сумма цифр: " + sum);

        scanner.close();
    }
}
