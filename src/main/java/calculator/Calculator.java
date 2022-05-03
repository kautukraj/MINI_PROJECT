package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Calculator-using-DevOps, Choose to perform operation");
            System.out.print("Press 1 to find Multiplication\nPress 2 to find Cube Root\nPress 3 to find Square\nPress 4 to find Subtraction\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do Multiplication
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Multiplication of "+number1+" and "+number2+" is : " + calculator.multiplication(number1,number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }


    public double multiplication(double number1, double number2) {
        logger.info("[MULTIPLICATION - " + number1 + " AND " + number2);
        double result = number1 * number2;
        logger.info("[RESULT - MULTIPLICATION] - " + result);
        return result;
    }


}

