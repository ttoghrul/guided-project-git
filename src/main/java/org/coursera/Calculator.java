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
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
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
                result = (number2 / 100) * number1;
                System.out.println(number1 + " % of " + number2 + " = " + result);
                break;
            }
            
            // performs power operation on number
            case '^' : {
                result = 1;
                for(int i = 0; i < number2; i++) result *= number1;
                System.out.println(number1 + " ^ " + number2 + " = " + result);
                break;
            }
            default : System.out.println("Invalid operator");
        }
    }
}
