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
        //CoreCalculator coreCalculator;




        System.out.println("Enter task: +, -, *, /, Square, Square Root, Exponent, Inverse, Reverse");
        System.out.println("Sine, Cosine, Tangent, Inverse Sine, Inverse Cosine, Inverse Tangent");
        System.out.println("Log, Natural Log, Inverse Log, Inverse Natural Log, Factorial");
        // System.out.println("Ent 2nd digit");

        Scanner input = new Scanner(System.in);
        userInput = input.nextLine().toLowerCase();
        System.out.println("Enter 1st digit");
        digit1 = input.nextDouble();

        //digit2 = input.nextDouble();


        switch (userInput) {
            case "+" -> {
                System.out.println("Enter 2nd digit");
                digit2 = input.nextDouble();
                //Ans = digit1 + digit2;
                Ans = CoreCalculator.add(digit1,digit2);
                System.out.println(Ans);
                break;
            }
            case "-" -> {
                System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.subtract(digit1,digit2);
                System.out.println(Ans);
                break;
            }
            case "*" -> {
                System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.multiply(digit1, digit2);
                System.out.println(Ans);
                break;
            }
            case "/" -> {
                System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.divide(digit1, digit2);
                System.out.println(Ans);
                break;
            }
            case "square" -> {
                Ans = CoreCalculator.square(digit1);
                System.out.println(Ans);
                break;
            }
            case "square root" -> {
                Ans = CoreCalculator.squareRoot(digit1);
                System.out.println(Ans);
                break;
            }
            case "exponent" -> {
                System.out.println("Ent 2nd digit");
                digit2 = input.nextDouble();
                Ans = CoreCalculator.exponent(digit1, digit2);
                System.out.println(Ans);
                break;
            }
            case "inverse" -> {
                Ans = CoreCalculator.inverse(digit1);
                System.out.println(Ans);
                break;
            }
            case "reverse" -> {
                Ans = CoreCalculator.reverse(digit1);
                System.out.println(Ans);
                break;
            }
            case "sine" -> {
                Ans = ScienCalc.sine(digit1);
                System.out.println(Ans);
                break;
            }
            case "cosine" -> {
                Ans = ScienCalc.cosine(digit1);
                System.out.println(Ans);
                break;
            }
            case "tangent" -> {
                Ans = ScienCalc.tangent(digit1);
                System.out.println(Ans);
                break;
            }
            case "inverse sine" -> {
                Ans = ScienCalc.inverseSine(digit1);
                System.out.println(Ans);
                break;
            }
            case "inverse cosine" -> {
                Ans = ScienCalc.inverseCosine(digit1);
                System.out.println(Ans);
                break;
            }
            case "inverse tangent" -> {
                Ans = ScienCalc.inverseTangent(digit1);
                System.out.println(Ans);
                break;
            }
            case "natural log" -> {
                Ans = ScienCalc.naturalLog(digit1);
                System.out.println(Ans);
                break;
            }
            case "log" -> {
                Ans = ScienCalc.log(digit1);
                System.out.println(Ans);
                break;
            }
            case "inverse natural log" -> {
                Ans = ScienCalc.inverseNatLog(digit1);
                System.out.println(Ans);
                break;
            }
            case "inverse log" -> {
                Ans = ScienCalc.inverseLog(digit1);
                System.out.println(Ans);
                break;
            }
            case "factorial" -> {
                Ans = ScienCalc.factorial(digit1);
                System.out.println(Ans);
                break;
            }
        }

    }
}
