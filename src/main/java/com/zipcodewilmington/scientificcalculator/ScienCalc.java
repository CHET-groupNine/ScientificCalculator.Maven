package com.zipcodewilmington.scientificcalculator;

public class ScienCalc {

    public static double output;
    private static Double memory1;
    private int radDeg = 0;
    private int displayVal = 0;

    public static double memoryAccess() {
        return memory1;
    }
    public static void resetMemory() {
        memory1 = 0.0;
    }
    public static void addToMemory(double currentVal) {
        memory1 = currentVal;
    }

    public static double sine(double digit1) {
        output = Math.sin(Math.toRadians(digit1));
        return output;
    }

    public static double cosine(double digit1) {
        output = Math.cos(Math.toRadians(digit1));
        return output;
    }

    public static double tangent(double digit1) {
        output = Math.tan(Math.toRadians(digit1));
        return output;
    }

    public static double inverseSine(double digit1) {
        output = Math.asin(digit1);
        return output;
    }

    public static double inverseCosine(double digit1) {
        output = Math.acos(digit1);
        return output;
    }

    public static double inverseTangent(double digit1) {
        output = Math.atan(digit1);
        return output;
    }

    public static double naturalLog(double digit1) {
        output = Math.log(digit1);
        return output;
    }

    public static double log(double digit1) {
        output = Math.log10(digit1);
        return output;
    }

    public static double inverseNatLog(double digit1) {
        output = Math.exp(digit1);
        return output;
    }

    public static double inverseLog(double digit1) {
        output = Math.pow(10, digit1);
        return output;
    }

    public static double factorial(double digit1) {
        output = 1;
        if (digit1 < 0) {
            System.out.println("Factorials of negative numbers cannot be found!");
        }
        else {
            for (int i = 1; i <= digit1; i++) {
                output = output * i;
            }
        }
        return output;
    }

}
