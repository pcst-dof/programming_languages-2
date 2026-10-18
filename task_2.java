import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Формула: exp(X) = 1 + X + X²/2! + X³/3! + ... + X^N/N!");
        System.out.println("");

        System.out.print("Введите вещественное X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите целое N (> 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0.");
            System.exit(1);
        }

        double sum = 1.0;  
        double term = 1.0; 

        for (int i = 1; i <= n; i++) {
            term = term * x / i;  
            sum += term;
        }

        System.out.println("");
        System.out.println("exp(" + x + ") = " + sum);

        scanner.close();
    }
}
