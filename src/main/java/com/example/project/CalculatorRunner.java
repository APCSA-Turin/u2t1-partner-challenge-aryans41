package com.example.project;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //test your program here
        //1. create an instance of the calculator class
        Calculator calculator1 = new Calculator ("TI84"); 
        System.out.println("Hi! Welcome to the Calculator!");
        System.out.println("Please enter + - * or / to add, subtract, multiply, or divide."); 
        String operand = scan.nextLine(); 
        System.out.println("Enter your two integers: ");
        int num1 = scan.nextInt(); 
        scan.nextLine(); 
        int num2 = scan.nextInt(); 
        System.out.println("The result of " + num1 + "" + operand + "" + num2 + " is " + calculator1.performOperation(operand, num1, num2));

        System.out.println("Enter an x and a y corrdinate: "); 
        int x = scan.nextInt(); 
        scan.nextLine(); 
        int y = scan.nextInt();
        scan.nextLine(); 
        System.out.println(calculator1.coordinatePair(x, y));

        System.out.println("Enter two numbers that you would like to check for divisibility.");
        int divisible1 = scan.nextInt(); 
        scan.nextLine(); 
        int divisible2 = scan.nextInt(); 
        scan.nextLine(); 
        System.out.println(divisible1 + " is divisible by " + divisible2 + ": " + calculator1.divisibleBy(divisible1, divisible2));

        System.out.println("Enter two numbers you would like to subtract, and we will return the absolute value of the difference.");
        int absoluteValue1 = scan.nextInt(); 
        scan.nextLine();
        int absoluteValue2 = scan.nextInt(); 
        scan.nextLine(); 
        System.out.println("The absolute value of " + absoluteValue1 + " - " + absoluteValue2 + " is " + calculator1.absoluteValue(absoluteValue1, absoluteValue2));

        System.out.println(calculator1.info());
        scan.close(); 
    }
}
