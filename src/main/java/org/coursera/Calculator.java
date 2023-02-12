package org.coursera;

public class Calculator {

    public static void calculate(char operator, double number1, double number2) {
        double result;
        switch (operator) {
            // performs addition between numbers
            case '+' : {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            }

            // performs subtraction between numbers
            case '-' : {
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;
            }

            // performs division between numbers
            case '/' : {
                //TODO Add implementation
                System.out.println("Implementation is missing");
                break;
            }

            // performs multiplication between numbers
            case '*' : {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            }

            // calculates percentage of number
            case '%' : {
                //TODO Add implementation
                System.out.println("Implementation is missing");
                break;
            }
            
            // performs power operation on number
            case '^' : {
                //TODO Add implementation
                System.out.println("Implementation is missing");
                break;
            }
            default : System.out.println("Invalid operator");
        }
    }
}
