import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== КАЛЬКУЛЯТОР ===");
        System.out.println("Формат: число оператор число");
        System.out.println("Пример: 1 + 2");
        System.out.println("Числа: от 1 до 10");
        System.out.println("Операторы: + - * /\n");
        System.out.print("Введите выражение: ");

        try {
            
            String input = scanner.nextLine();

            
            String result = Calculator.calc(input);

            
            System.out.println("Результат: " + result);

        } catch (CalculatorException e) {
            
            System.out.println("Ошибка: " + e.getMessage());
            System.exit(1); 
        } catch (Exception e) {
            
            System.out.println("Неожиданная ошибка: " + e.getMessage());
            System.exit(2);
        } finally {
            scanner.close(); 
        }
    }
}
