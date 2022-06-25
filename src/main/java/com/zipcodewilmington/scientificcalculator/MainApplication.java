package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    //public CoreCalculator coreCalculator;
//    public MainApplication(){
//    coreCalculator = new CoreCalculator();
//    }
    public static void main(String[] args) {
        /* Console.println("Welcome to my calculator!");
        *String s = Console.getStringInput("Enter a string");
        *Integer i = Console.getIntegerInput("Enter an integer");
        *Double d = Console.getDoubleInput("Enter a double.");

        *Console.println("The user input %s as a string", s);
        *Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */

        String userInput;
        double digit1, digit2, Ans;
        String sqr, sqrt, exp, clr;
        //CoreCalculator coreCalculator;



        //System.out.println("Ent 1st digit");
        System.out.println("Ent task : +, -, *, /, sqr, sqrt, exp, inv, reverse");
       // System.out.println("Ent 2nd digit");

        Scanner input = new Scanner(System.in);
        digit1 = input.nextDouble();
        userInput = input.next();
        //digit2 = input.nextDouble();


        switch (userInput) {
            case "+" -> {
                //System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                //Ans = digit1 + digit2;
                Ans = CoreCalculator.add(digit1,digit2);
                System.out.println(Ans);
            }
            case "-" -> {
                //System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.subtract(digit1,digit2);
                System.out.println(Ans);
            }
            case "*" -> {
                //System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.multiply(digit1, digit2);
                System.out.println(Ans);
            }
            case "/" -> {
                //System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.divide(digit1, digit2);
                System.out.println(Ans);
            }
            case "sqr" -> {
                Ans = CoreCalculator.square(digit1);
                System.out.println(Ans);

            }
            case "sqrt" -> {
                Ans = CoreCalculator.squareRoot(digit1);
                System.out.println(Ans);
            }
            case "exp" -> {
                //System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.exponent(digit1, digit2);
                System.out.println(Ans);
            }
            case "inv" -> {
                Ans = CoreCalculator.inverse(digit1);
                System.out.println(Ans);
            }
            case "reverse" -> {
                Ans = CoreCalculator.reverse(digit1);
                System.out.println(Ans);
            }
        }

    }
}
