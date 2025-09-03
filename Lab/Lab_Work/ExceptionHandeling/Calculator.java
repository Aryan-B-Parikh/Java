import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.println("Operations: +, -, *, /");
        try {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            double result = 0;
            switch (operator) {
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
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero!");
                    }
                    result = num1 / num2;
                    break;
            }
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Calculator session ended.");
        }
    }
}