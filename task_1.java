public class task_1 {
    public static void main(String[] args) {
        System.out.println("Таблица косинусов от 0° до 90° с шагом 5°");
        System.out.println("");
        
        for (int x = 0; x <= 90; x += 5) {
            double radians = Math.toRadians(x);
            
            double y = Math.cos(radians);
            
            System.out.printf("cos(%d°) = %.4f%n", x, y);
        }
    }
}