import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Начало работы программы");

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;
        scanner.close();

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                logger.log(Level.WARNING, "Некорректная операция: " + operator);
                System.out.println("Некорректная операция");
                return;
        }
        logger.info("Результат: " + result);
        System.out.println("Результат: " + result);
    }
}