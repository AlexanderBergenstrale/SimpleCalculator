package se.bergenstrale;

import java.util.InputMismatchException;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        var input = "8 / 2 + -2 * 5 - 4";
        System.out.println(calculate(input));
    }

    protected static int calculate(String input) {
        var numericPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        int result = 0;
        String currentOperation = "+";

        var splitInput = input.split(" ");

        for (String element : splitInput) {
            if (numericPattern.matcher(element).matches()) {
                result = arithmetize(currentOperation, result, Integer.parseInt(element));
            } else if ("+-*/".contains(element)) {
                currentOperation = element;
            } else throw new InputMismatchException();
        }
        return result;
    }

    private static int arithmetize(String operation, int left, int right) {
        return switch (operation) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            case "/" -> left / right;
            default -> throw new InputMismatchException("Should be one of the four standard arithmetic operators");
        };
    }
}
