package se.lexicon.mb.JavaFundamental_Part1;

import java.util.Scanner;
import java.util.List;

public class Workshop_Part1 {
    // Enter a number
    // Enter an operator
    // Continue entering numbers and operators until '=' is pressed
    // Then calculate and show the result
    // The result can be changed by new operations or cleared with 'C' or 'c'
    // Enter a number or press 'E' or 'e' to exit

    public static final List<String> VALID_OPERATORS = List.of("+", "-", "*", "/", "c", "e", "=");
    static Scanner scanner = new Scanner(System.in);
    static String operator = "";
    static int number = 0;
    static int result = 0;

    public static void main(String[] args) {
        Calculator();
    }

    public static void Calculator() {
        System.out.println("Welcome! This calculator will help you perform basic math operations.");

//        System.out.println("\n Enter number");
//        number = scanner.nextInt();
        number = getIntInput("\n Enter number");
        result = number;

        while (!operator.equals("=")) {

            System.out.println("Enter + - * / or =, also you can enter c to clean and e to stop the program");
            operator = scanner.next();

            if (operator.equalsIgnoreCase("E")) {
                System.out.println("Goodbye!");
                break;
            } else if (operator.equalsIgnoreCase("C")) {
                System.out.println("All values have been reset");
                number = 0;
                operator = "";
//                System.out.println("Enter number:");
//                number = scanner.nextInt();
                number = getIntInput("Enter number:");
                result = number;
                continue;
            } else if (operator.equals("=")) {
                System.out.println("Result:" + result);

                while (true) {

                    if (getAnswer()){
                        break;
                    };
                }
                continue;

            } else if (!VALID_OPERATORS.contains(operator.toLowerCase())) {

                System.out.print("Operator doesn't correct. Try again!");
                continue;
            }
//            System.out.println("Enter next number:");
//            int nextNumber = scanner.nextInt();
            int nextNumber = getIntInput("Enter next number:");

            result = applyOperator(result, operator, nextNumber);
            System.out.println("Current result: " + result);
        }

    }

    public static int getIntInput(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.next();
            if (input.equalsIgnoreCase("e")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else {
                try {
                    return Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number. Try again");
                }
            }
        }
    }

    public static int applyOperator(int result, String operator, int nextNumber) {
        switch (operator) {
            case "+":
                result = result + nextNumber;
                break;
            case "-":
                result = result - nextNumber;
                break;
            case "*":
                result = result * nextNumber;
                break;
            case "/":
                if (nextNumber != 0) {
                    result = result / nextNumber;
                } else {
                    System.out.println("Cannot divide by zero! Try again!");
                }
                break;
        }
        return result;
    }

    public static boolean getAnswer() {
        System.out.println("Continue? (y/n):");
        String answer = scanner.next();
        if (answer.equalsIgnoreCase("y")) {
            System.out.println("Enter number:");
            number = scanner.nextInt();
            result = number;
            operator = "";
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            System.out.println("Invalid answer. Try again");
        }
        return false;
    }
}
