package bmt;

import java.util.Scanner;

/**
 * Simple calculator program.
 */
// package bmt;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // }

    // public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
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
                        System.out.println("Error! Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error! Invalid operation.");
                    return;
            }

            System.out.println("Result: " + result);
        } finally {
            // Close the scanner to release system resources
            scanner.close();
        }
    }
}
