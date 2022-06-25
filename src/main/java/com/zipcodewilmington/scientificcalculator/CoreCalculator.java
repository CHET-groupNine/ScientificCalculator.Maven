package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;
public class CoreCalculator {

    private static double ans;
   public CoreCalculator(){
    ans = 0.0;
   }

    public static double add(double digit1, double digit2){
        ans = digit1 + digit2;
        return ans;
    }
    public static double subtract(double digit1, double digit2){
       ans = digit1 - digit2;
       return ans;
    }
    public static double multiply(double digit1, double digit2){
       ans = digit1 * digit2;
       return ans;
    }
    public static double divide(double digit1, double digit2){
       ans = digit1 / digit2;
       return ans;
    }

    public static double square(double digit1){
        ans = Math.pow(digit1, 2);
        return ans;
    }
    public static double squareRoot(double digit1){
        ans = Math.sqrt(digit1);
        return ans;
    }
    public static double exponent(double digit1, double digit2){
        ans = Math.pow(digit1, digit2);
        return ans;
    }
    public static double inverse(double digit1){
        ans = 1 / digit1;
        return ans;
    }
    public static double reverse(double digit1){
        ans = -1 * digit1;
        return ans;
    }













    }



