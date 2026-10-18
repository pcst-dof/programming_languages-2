import java.util.Scanner;

public class task_4 {
    public static double calculatePowerSum(double a) {
        double power3 = Math.pow(a, 3);
        double power5 = Math.pow(a, 5);
        double power7 = Math.pow(a, 7);
        
        return power3 + power5 + power7;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите число A: ");
        double a = scanner.nextDouble();
        
        double result = calculatePowerSum(a);
        
        System.out.println();
        System.out.println("A = " + a);
        System.out.println("A**3 = " + Math.pow(a, 3));
        System.out.println("A**5 = " + Math.pow(a, 5));
        System.out.println("A**7 = " + Math.pow(a, 7));
        System.out.println();
        System.out.println("A**3 + A**5 + A**7 = " + result);
        
        scanner.close();
    }
}
