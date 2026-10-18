import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n ГЛАВНОЕ MEНЮ");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("4. Выход");
            System.out.print("Выберите действие (1-4): ");
            
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    runCalculation(scanner);
                    break;
                case "2":
                    printProgramInfo();
                    break;
                case "3":
                    printDeveloperInfo();
                    break;
                case "4":
                    System.out.println("Пока!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Ошибка: неверный выбор. Введите число от 1 до 4.");
            }
        }
        scanner.close();
    }

    private static void printProgramInfo() {
        System.out.println("\n Информация о программе");
        System.out.println("Программа вычисляет площадь треугольника по формуле Герона.");
        System.out.println("Формула: S = (p * (p - a) * (p - b) * (p - c)) **(0.5)");
    }

    private static void printDeveloperInfo() {
        System.out.println("\n Информация о разработчике ");
        System.out.println("Разработчик: Студентка группы РИ-250912");
        System.out.println("Год: 2026");
    }

    private static void runCalculation(Scanner scanner) {
        System.out.println("\n Вычисление площади треугольника по формуле Герона. ");
        System.out.println("Вам нужно ввести длины трёх сторон треугольника (a, b, c).");
        System.out.println("(Подсказка: введите 'exit' вместо числа, чтобы вернуться в меню)");
        System.out.println();

        double a = getValidSide(scanner, "a");
        if (Double.isNaN(a)) return;

        double b = getValidSide(scanner, "b");
        if (Double.isNaN(b)) return;

        double c = getValidSide(scanner, "c");
        if (Double.isNaN(c)) return;

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ошибка: все стороны треугольника должны быть положительными числами!");
            System.out.println("Попробуйте запустить расчёт заново.\n");
            return; 
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ошибка: треугольник с такими сторонами не существует!");
            System.out.println("Сумма любых двух сторон должна быть больше третьей.");
            System.out.println("Попробуйте запустить расчёт заново.\n");
            return;
        }

        double p = (a + b + c) / 2; 
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c)); 

        System.out.println();
        System.out.println("Стороны треугольника: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Полупериметр p = " + p);
        System.out.println("Площадь треугольника S = " + s);
    }

    private static double getValidSide(Scanner scanner, String sideName) {
        while (true) {
            System.out.print("Введите длину стороны " + sideName + ": ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                return Double.NaN; 
            }

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: это не число. Попробуйте еще раз.");
            }
        }
    }
}
