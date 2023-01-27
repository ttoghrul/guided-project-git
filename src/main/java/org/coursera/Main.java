package org.coursera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator = 0;

        while(true) {
            double number1, number2;
            System.out.println("Choose an operator: +, -, *, / or x to stop application");
            operator = input.next().charAt(0);
            if(operator == 'x') break;

            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            Calculator.calculate(operator, number1, number2);
        }
        input.close();
    }
}