public class Calculator {
    public static String calc(String input) throws CalculatorException {
        // Убирает пробелы по краям
        input = input.trim();
        String[] parts = input.split("\\s+");

        // Проверяем количество частей
        if (parts.length != 3) {
            throw new CalculatorException("Должно быть 'число оператор число'");
        }

        // Проверка оператора
        String operator = parts[1];
        if (!operator.equals("+") && !operator.equals("-") &&
            !operator.equals("*") && !operator.equals("/")) {
            throw new CalculatorException("Оператор должен быть +, -, * или /");
        }

        // Преобразование строк в числа
        int num1, num2;
        try {
            num1 = Integer.parseInt(parts[0]);
            num2 = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            throw new CalculatorException("Оба значения должны быть числами");
        }

        // Проверка диапазона 
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
            throw new CalculatorException("Числа должны быть от 1 до 10 включительно");
        }

        // ВЫЧИСЛЕНИЯ 
        int result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2; 
                break;
            default:
                throw new CalculatorException("Неизвестная операция");
        }

        // Возвращаем результат как строку
        return String.valueOf(result);
    }
}
