package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Created by leon on 2/9/18.
 */

//Test Push
public class TestMainApplication {

//    @Test
//    void twoPlusTwoShouldEqualFour() {
//        CoreCalculator add0 = new CoreCalculator();
//        assertEquals(4, add0.add(2, 2));
//    }
//    @Test
//    void tenPlusElevenShouldEqualTwentyOne(){
//        CoreCalculator add1 = new CoreCalculator();
//        assertEquals(21, add1.add(10,11));
//    }
//
//    @Test
//    void oneHundredPlusOneThousandShouldEqualElevenHundred(){
//        CoreCalculator add2 = new CoreCalculator();
//        assertEquals(1100, add2.add(100,1000));
//    }
//
//    @Test
//    void negativeOnePlusNegativeOneShouldEqualNegativeTwo(){
//        CoreCalculator addNeg = new CoreCalculator();
//        assertEquals(-2, addNeg.add(-1,-1));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointTwoShouldEqualOneHundredOne(){
//        CoreCalculator addFloat = new CoreCalculator();
//        assertEquals(101, addFloat.add(50.8,50.2));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointThreeShouldEqualOneHundredOnePointOne(){
//        CoreCalculator addFloat2 = new CoreCalculator();
//        assertEquals(101.1, addFloat2.add(50.8,50.3));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointFourShouldEqualOneHundredOnePointTwo(){
//        CoreCalculator addFloat3 = new CoreCalculator();
//        assertEquals(101.2, addFloat3.add(50.8,50.4));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointFiveShouldEqualOneHundredOnePointThree(){
//        CoreCalculator addFloat4 = new CoreCalculator();
//        assertEquals(101.3, addFloat4.add(50.8,50.5));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointSixShouldEqualOneHundredOnePointFour(){
//        CoreCalculator addFloat5 = new CoreCalculator();
//        assertEquals(101.4, addFloat5.add(50.8,50.6));
//    }
//
//    @Test
//    void fiftyPointEightPlusFiftyPointSevenShouldEqualOneHundredOnePointFive(){
//        CoreCalculator addFloat6 = new CoreCalculator();
//        assertEquals(101.5, addFloat6.add(50.8,50.7));
//    }
//
//    @Test
//    void twoMinusTwoShouldEqualZero() {
//        CoreCalculator subtract0 = new CoreCalculator();
//        assertEquals(0, subtract0.subtract(2, 2));
//    }
//    @Test
//    void tenMinusElevenShouldEqualNegativeOne(){
//        CoreCalculator subtract1 = new CoreCalculator();
//        assertEquals(-1, subtract1.subtract(10,11));
//    }
//
//    @Test
//    void elevenMinusTenShouldEqualOne(){
//        CoreCalculator subtract3 = new CoreCalculator();
//        assertEquals(1, subtract3.subtract(11,10));
//    }
//
//    @Test
//    void twoThousandMinusOneThousandShouldEqualOneThousand(){
//        CoreCalculator subtract2 = new CoreCalculator();
//        assertEquals(1000, subtract2.subtract(2000,1000));
//    }
//
//    @Test
//    void negativeOneMinusNegativeTwoShouldEqualOne(){
//        CoreCalculator subtractNeg = new CoreCalculator();
//        assertEquals(1, subtractNeg.subtract(-1,-2));
//    }
//
//    @Test
//    void fiftyPointEightMinusFiftyPointTwoShouldEqualPointSix(){
//        CoreCalculator subtractFloat = new CoreCalculator();
//        assertEquals(.6, subtractFloat.subtract(50.8,50.2));
//    }
//
//    @Test
//    void pointFiveMinusPointFourShouldEqualPointOne(){
//        CoreCalculator subtractFloat1 = new CoreCalculator();
//        assertEquals(.1, subtractFloat1.subtract(.5,.4));
//    }
//
//    @Test
//    void oneMinusPointOneShouldEqualPointNine(){
//        CoreCalculator subtractFloat2 = new CoreCalculator();
//        assertEquals(.9, subtractFloat2.subtract(1,.1));
//    }
//
//    @Test
//    void pointNineMinusPointFourShouldEqualPointFive(){
//        CoreCalculator subtractFloat3 = new CoreCalculator();
//        assertEquals(.5, subtractFloat3.subtract(.9,.4));
//    }
//
//    @Test
//    void twoTimesTwoShouldEqualFour() {
//        CoreCalculator multiply0 = new CoreCalculator();
//        assertEquals(4, multiply0.multiply(2, 2));
//    }
//    @Test
//    void tenTimesElevenShouldEqualOneHundredTen(){
//        CoreCalculator multiply1 = new CoreCalculator();
//        assertEquals(110, multiply1.multiply(10,11));
//    }
//
//    @Test
//    void elevenTimesTenShouldEqualOneHundredTen(){
//        CoreCalculator multiply3 = new CoreCalculator();
//        assertEquals(110, multiply3.multiply(11,10));
//    }
//
//    @Test
//    void twoThousandTimesOneThousandShouldEqualTwoMillion(){
//        CoreCalculator multiply2 = new CoreCalculator();
//        assertEquals(2000000, multiply2.multiply(2000,1000));
//    }
//
//    @Test
//    void negativeOneTimesNegativeTwoShouldEqualTwo(){
//        CoreCalculator multiplyNeg = new CoreCalculator();
//        assertEquals(2, multiplyNeg.multiply(-1,-2));
//    }
//
//    @Test
//    void negativeOneTimesZeroShouldEqualZero(){
//        CoreCalculator multiplyNeg0 = new CoreCalculator();
//        assertEquals(0, multiplyNeg0.multiply(-1,0));
//    }
//
//    @Test
//    void negativeTwoTimesFiveShouldEqualNegativeTen(){
//        CoreCalculator multiplyNeg2 = new CoreCalculator();
//        assertEquals(-10, multiplyNeg2.multiply(-2,5));
//    }
//
//    @Test
//    void fiftyPointEightTimesFiftyPointTwoShouldEqualTwoThousandFiveHundredFiftyPointOneSix(){
//        CoreCalculator multiplyFloat = new CoreCalculator();
//        assertEquals(2550.16, multiplyFloat.multiply(50.8,50.2));
//    }
//
//    @Test
//    void twoDividedByTwoShouldEqualOne() {
//        CoreCalculator divide0 = new CoreCalculator();
//        assertEquals(1, divide0.divide(2, 2));
//    }
//    @Test
//    void tenDividedByElevenShouldEqualPointNineZeroNineZeroRepeat(){
//        CoreCalculator divide1 = new CoreCalculator();
//        assertEquals(.9090909090909091, divide1.divide(10,11));
//    }
//
//    @Test
//    void elevenDividedByTenShouldEqualOnePointOne(){
//        CoreCalculator divide3 = new CoreCalculator();
//        assertEquals(1.1, divide3.divide(11,10));
//    }
//
//    @Test
//    void twoThousandDividedByOneThousandShouldEqualTwo(){
//        CoreCalculator divide2 = new CoreCalculator();
//        assertEquals(2, divide2.divide(2000,1000));
//    }
//
//    @Test
//    void negativeOneDividedByNegativeTwoShouldEqualPointFive(){
//        CoreCalculator divideNeg = new CoreCalculator();
//        assertEquals(.5, divideNeg.divide(-1,-2));
//    }
//
//    @Test
//    void negativeTwoDividedByTwoShouldEqualNegativeOne(){
//        CoreCalculator divideNeg2 = new CoreCalculator();
//        assertEquals(-1, divideNeg2.divide(-2,2));
//    }
//
//    @Test
//    void zeroDividedByNegativeOneShouldEqualZero(){
//        CoreCalculator divideNeg3 = new CoreCalculator();
//        assertEquals(0, divideNeg3.divide(0,-1));
//    }
//
//    @Test
//    void fiftyPointEightDividedByFiftyPointTwoShouldEqualOnePointZeroOneOneNineFiveTwoOneNineOneTwo(){
//        CoreCalculator divideFloat = new CoreCalculator();
//        assertEquals(1.0119521912350598, divideFloat.divide(50.8,50.2));
//    }
//
//    @Test
//    void twoSquaredShouldEqualFour(){
//        CoreCalculator square0 = new CoreCalculator();
//        assertEquals(4, square0.square(2));
//    }
//
//    @Test
//    void threeSquaredShouldEqualNine(){
//        CoreCalculator square1 = new CoreCalculator();
//        assertEquals(9, square1.square(3));
//    }
//
//    @Test
//    void pointFiveSquaredShouldEqualPointTwoFive(){
//        CoreCalculator square2 = new CoreCalculator();
//        assertEquals(.25, square2.square(.5));
//    }
//
//    @Test
//    void negThreeSquaredShouldEqualNine(){
//        CoreCalculator square3 = new CoreCalculator();
//        assertEquals(9, square3.square(-3));
//    }
//
//    @Test
//    void squareRootOfFourShouldEqualTwo(){
//        CoreCalculator squareRoot0 = new CoreCalculator();
//        assertEquals(2, squareRoot0.squareRoot(4));
//    }
//
//    @Test
//    void squareRootOfNineShouldEqualThree(){
//        CoreCalculator squareRoot1 = new CoreCalculator();
//        assertEquals(3, squareRoot1.squareRoot(9));
//    }
//
//    @Test
//    void squareRootOfPointFiveShouldEqualPointSevenZeroSevenOneZeroEtc(){
//        CoreCalculator squareRoot2 = new CoreCalculator();
//        assertEquals(.7071067811865476, squareRoot2.squareRoot(.5));
//    }
//
//    @Test
//    void squareRootOfThreeThousandSixHundredShouldBeSixty(){
//        CoreCalculator squareRoot3 = new CoreCalculator();
//        assertEquals(60, squareRoot3.squareRoot(3600));
//    }
//
//    @Test
//    void twoToPowerOfThreeShouldBeEight(){
//        CoreCalculator exponent0 = new CoreCalculator();
//        assertEquals(8, exponent0.exponent(2,3));
//    }
//
//    @Test
//    void twoToPowerOfTenShouldBeOneThousandTwoHundredFour(){
//        CoreCalculator exponent1 = new CoreCalculator();
//        assertEquals(1024, exponent1.exponent(2,10));
//    }
//
//    @Test
//    void threeToPowerOfFourShouldBeEightyOne(){
//        CoreCalculator exponent2 = new CoreCalculator();
//        assertEquals(81, exponent2.exponent(3,4));
//    }
//
//    @Test
//    void pointFiveToPowerOfTwoShouldEqualPointTwoFive(){
//        CoreCalculator exponent3 = new CoreCalculator();
//        assertEquals(.25, exponent3.exponent(.5,2));
//    }
//
//    @Test
//    void pointFiveToPowerOfPointFiveShouldEqualPointSevenZeroSevenOneZeroEtc(){
//        CoreCalculator exponent4 = new CoreCalculator();
//        assertEquals(.7071067811865476, exponent4.exponent(.5,.5));
//    }
//
//    @Test
//    void nineToPowerOfNegTwoShouldEqualPointZeroOneTwoThreeFourFiveSixSevenEtc(){
//        CoreCalculator exponent5 = new CoreCalculator();
//        assertEquals(.012345679012345678, exponent5.exponent(9,-2));
//    }
//
//    @Test
//    void negNineToPowerOfThreeShouldEqualNegSevenHundredTwentyNine(){
//        CoreCalculator exponent6 = new CoreCalculator();
//        assertEquals(-729, exponent6.exponent(-9,3));
//    }
//
//    @Test
//    void inverseOneShouldEqualOne(){
//        CoreCalculator inverse0 = new CoreCalculator();
//        assertEquals(1, inverse0.inverse(1));
//    }
//
//    @Test
//    void twoInverseShouldEqualPointFive(){
//        CoreCalculator inverse1 = new CoreCalculator();
//        assertEquals(.5, inverse1.inverse(2));
//    }
//
//    @Test
//    void sixInverseShouldEqualPointOneSixSixSixSixEtc(){
//        CoreCalculator inverse2 = new CoreCalculator();
//        assertEquals(.16666666666666666, inverse2.inverse(6));
//    }
//
//    @Test
//    void negOneInverseShouldEqualNegOne(){
//        CoreCalculator inverse3 = new CoreCalculator();
//        assertEquals(-1, inverse3.inverse(-1));
//    }
//
//    @Test
//    void negFiveInverseShouldEqualNegPointTwo(){
//        CoreCalculator inverse4 = new CoreCalculator();
//        assertEquals(-.2, inverse4.inverse(-5));
//    }
//
//    @Test
//    void pointOneInverseShouldEqualTen(){
//        CoreCalculator inverse5 = new CoreCalculator();
//        assertEquals(10, inverse5.inverse(.1));
//    }
//
//    @Test
//    void oneReverseShouldEqualNegOne(){
//        CoreCalculator reverse0 = new CoreCalculator();
//        assertEquals(-1, reverse0.reverse(1));
//    }
//
//    @Test
//    void twoReverseShouldEqualNegTwo(){
//        CoreCalculator reverse1 = new CoreCalculator();
//        assertEquals(-2, reverse1.reverse(2));
//    }
//
//    @Test
//    void negOneReverseShouldEqualOne(){
//        CoreCalculator reverse2 = new CoreCalculator();
//        assertEquals(1, reverse2.reverse(-1));
//    }
//
//    @Test
//    void pointFiveReverseShouldEqualNegPointFive(){
//        CoreCalculator reverse3 = new CoreCalculator();
//        assertEquals(-.5, reverse3.reverse(.5));
//    }
//
//    @Test
//    void ZeroReverseShouldEqualZero(){
//        CoreCalculator reverse4 = new CoreCalculator();
//        assertEquals(0, reverse4.reverse(0));
//    }
//
//    @Test
//    void tenThousandReverseShouldEqualNegTenThousand(){
//        CoreCalculator reverse5 = new CoreCalculator();
//        assertEquals(-10000, reverse5.reverse(10000));
//    }

}
