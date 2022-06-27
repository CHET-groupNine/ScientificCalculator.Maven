package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.CoreCalculator;
import com.zipcodewilmington.scientificcalculator.ScienCalc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
//If an input is negative and is multiplied by 0 the result is -0.0
//If result is -0.0 it should be multiplied by
// Cannot do Square Root of negative number
// Cannot accept string anything other than number will throw error
// Rounding Errors
//If input for log is negative output is null, 0 returns -infinity
    //If input for NaturalLog is negative output is null,  0 returns -infinity
public class TestMainApplication {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        CoreCalculator add0 = new CoreCalculator();
        assertEquals(4, add0.add(2, 2));
    }
    @Test
    public void tenPlusElevenShouldEqualTwentyOne(){
        CoreCalculator add1 = new CoreCalculator();
        assertEquals(21, add1.add(10,11));
    }

    @Test
    public void oneHundredPlusOneThousandShouldEqualElevenHundred(){
        CoreCalculator add2 = new CoreCalculator();
        assertEquals(1100, add2.add(100,1000));
    }

    @Test
    public void negativeOnePlusNegativeOneShouldEqualNegativeTwo(){
        CoreCalculator addNeg = new CoreCalculator();
        assertEquals(-2, addNeg.add(-1,-1));
    }
    //^-0.0 Bug
    @Test
    public void fiftyPointEightPlusFiftyPointTwoShouldEqualOneHundredOne(){
        CoreCalculator addFloat = new CoreCalculator();
        assertEquals(101, addFloat.add(50.8,50.2));
    }

    @Test
    public void fiftyPointEightPlusFiftyPointThreeShouldEqualOneHundredOnePointOne(){
        CoreCalculator addFloat2 = new CoreCalculator();
        assertEquals(101.1, addFloat2.add(50.8,50.3));
    }

    @Test
    public void fiftyPointEightPlusFiftyPointFourShouldEqualOneHundredOnePointTwo(){
        CoreCalculator addFloat3 = new CoreCalculator();
        assertEquals(101.2, addFloat3.add(50.8,50.4));
    }
    // Rounding Err
    @Test
    public void fiftyPointEightPlusFiftyPointFiveShouldEqualOneHundredOnePointThree(){
        CoreCalculator addFloat4 = new CoreCalculator();
        assertEquals(101.3, addFloat4.add(50.8,50.5));
    }

    @Test
    public void fiftyPointEightPlusFiftyPointSixShouldEqualOneHundredOnePointFour(){
        CoreCalculator addFloat5 = new CoreCalculator();
        assertEquals(101.4, addFloat5.add(50.8,50.6));
    }

    @Test
    public void fiftyPointEightPlusFiftyPointSevenShouldEqualOneHundredOnePointFive(){
        CoreCalculator addFloat6 = new CoreCalculator();
        assertEquals(101.5, addFloat6.add(50.8,50.7));
    }

    @Test
    public void twoMinusTwoShouldEqualZero() {
        CoreCalculator subtract0 = new CoreCalculator();
        assertEquals(0, subtract0.subtract(2, 2));
    }
    @Test
    public void tenMinusElevenShouldEqualNegativeOne(){
        CoreCalculator subtract1 = new CoreCalculator();
        assertEquals(-1, subtract1.subtract(10,11));
    }

    @Test
    public void elevenMinusTenShouldEqualOne(){
        CoreCalculator subtract3 = new CoreCalculator();
        assertEquals(1, subtract3.subtract(11,10));
    }

    @Test
    public void twoThousandMinusOneThousandShouldEqualOneThousand(){
        CoreCalculator subtract2 = new CoreCalculator();
        assertEquals(1000, subtract2.subtract(2000,1000));
    }

    @Test
    public void negativeOneMinusNegativeTwoShouldEqualOne(){
        CoreCalculator subtractNeg = new CoreCalculator();
        assertEquals(1, subtractNeg.subtract(-1,-2));
    }

    @Test
    public void fiftyPointEightMinusFiftyPointTwoShouldEqualPointSix(){
        CoreCalculator subtractFloat = new CoreCalculator();
        assertEquals(.6, subtractFloat.subtract(50.8,50.2));
    }
    //^Rounding Err
    @Test
    public void pointFiveMinusPointFourShouldEqualPointOne(){
        CoreCalculator subtractFloat1 = new CoreCalculator();
        assertEquals(.1, subtractFloat1.subtract(.5,.4));
    }
    //^Rounding Err
    @Test
    public void oneMinusPointOneShouldEqualPointNine(){
        CoreCalculator subtractFloat2 = new CoreCalculator();
        assertEquals(.9, subtractFloat2.subtract(1,.1));
    }

    @Test
    public void pointNineMinusPointFourShouldEqualPointFive(){
        CoreCalculator subtractFloat3 = new CoreCalculator();
        assertEquals(.5, subtractFloat3.subtract(.9,.4));
    }

    @Test
    public void twoTimesTwoShouldEqualFour() {
        CoreCalculator multiply0 = new CoreCalculator();
        assertEquals(4, multiply0.multiply(2, 2));
    }
    @Test
    public void tenTimesElevenShouldEqualOneHundredTen(){
        CoreCalculator multiply1 = new CoreCalculator();
        assertEquals(110, multiply1.multiply(10,11));
    }

    @Test
    public void elevenTimesTenShouldEqualOneHundredTen(){
        CoreCalculator multiply3 = new CoreCalculator();
        assertEquals(110, multiply3.multiply(11,10));
    }

    @Test
    public void twoThousandTimesOneThousandShouldEqualTwoMillion(){
        CoreCalculator multiply2 = new CoreCalculator();
        assertEquals(2000000, multiply2.multiply(2000,1000));
    }

    @Test
    public void negativeOneTimesNegativeTwoShouldEqualTwo(){
        CoreCalculator multiplyNeg = new CoreCalculator();
        assertEquals(2, multiplyNeg.multiply(-1,-2));
    }

    @Test
    public void negativeOneTimesZeroShouldEqualZero(){
        CoreCalculator multiplyNeg0 = new CoreCalculator();
        assertEquals(0, multiplyNeg0.multiply(-1,0));
    }

    @Test
    public void negativeTwoTimesFiveShouldEqualNegativeTen(){
        CoreCalculator multiplyNeg2 = new CoreCalculator();
        assertEquals(-10, multiplyNeg2.multiply(-2,5));
    }

    @Test
    public void fiftyPointEightTimesFiftyPointTwoShouldEqualTwoThousandFiveHundredFiftyPointOneSix(){
        CoreCalculator multiplyFloat = new CoreCalculator();
        assertEquals(2550.16, multiplyFloat.multiply(50.8,50.2));
    }

    @Test
    public void twoDividedByTwoShouldEqualOne() {
        CoreCalculator divide0 = new CoreCalculator();
        assertEquals(1, divide0.divide(2, 2));
    }
    @Test
    public void tenDividedByElevenShouldEqualPointNineZeroNineZeroRepeat(){
        CoreCalculator divide1 = new CoreCalculator();
        assertEquals(.9090909090909091, divide1.divide(10,11));
    }

    @Test
    public void elevenDividedByTenShouldEqualOnePointOne(){
        CoreCalculator divide3 = new CoreCalculator();
        assertEquals(1.1, divide3.divide(11,10));
    }

    @Test
    public void twoThousandDividedByOneThousandShouldEqualTwo(){
        CoreCalculator divide2 = new CoreCalculator();
        assertEquals(2, divide2.divide(2000,1000));
    }

    @Test
    public void negativeOneDividedByNegativeTwoShouldEqualPointFive(){
        CoreCalculator divideNeg = new CoreCalculator();
        assertEquals(.5, divideNeg.divide(-1,-2));
    }

    @Test
    public void negativeTwoDividedByTwoShouldEqualNegativeOne(){
        CoreCalculator divideNeg2 = new CoreCalculator();
        assertEquals(-1, divideNeg2.divide(-2,2));
    }

    @Test
    public void zeroDividedByNegativeOneShouldEqualZero(){
        CoreCalculator divideNeg3 = new CoreCalculator();
        assertEquals(0, divideNeg3.divide(0,-1));
    }
    //^-0.0 Bug
    @Test
    public void fiftyPointEightDividedByFiftyPointTwoShouldEqualOnePointZeroOneOneNineFiveTwoOneNineOneTwo(){
        CoreCalculator divideFloat = new CoreCalculator();
        assertEquals(1.0119521912350598, divideFloat.divide(50.8,50.2));
    }

    @Test
    public void twoSquaredShouldEqualFour(){
        CoreCalculator square0 = new CoreCalculator();
        assertEquals(4, square0.square(2));
    }

    @Test
    public void threeSquaredShouldEqualNine(){
        CoreCalculator square1 = new CoreCalculator();
        assertEquals(9, square1.square(3));
    }

    @Test
    public void pointFiveSquaredShouldEqualPointTwoFive(){
        CoreCalculator square2 = new CoreCalculator();
        assertEquals(.25, square2.square(.5));
    }

    @Test
    public void negThreeSquaredShouldEqualNine(){
        CoreCalculator square3 = new CoreCalculator();
        assertEquals(9, square3.square(-3));
    }

    @Test
    public void squareRootOfFourShouldEqualTwo(){
        CoreCalculator squareRoot0 = new CoreCalculator();
        assertEquals(2, squareRoot0.squareRoot(4));
    }

    @Test
    public void squareRootOfNineShouldEqualThree(){
        CoreCalculator squareRoot1 = new CoreCalculator();
        assertEquals(3, squareRoot1.squareRoot(9));
    }

    @Test
    public void squareRootOfPointFiveShouldEqualPointSevenZeroSevenOneZeroEtc(){
        CoreCalculator squareRoot2 = new CoreCalculator();
        assertEquals(.7071067811865476, squareRoot2.squareRoot(.5));
    }

    @Test
    public void squareRootOfThreeThousandSixHundredShouldBeSixty(){
        CoreCalculator squareRoot3 = new CoreCalculator();
        assertEquals(60, squareRoot3.squareRoot(3600));
    }

    @Test
    public void twoToPowerOfThreeShouldBeEight(){
        CoreCalculator exponent0 = new CoreCalculator();
        assertEquals(8, exponent0.exponent(2,3));
    }

    @Test
    public void twoToPowerOfTenShouldBeOneThousandTwoHundredFour(){
        CoreCalculator exponent1 = new CoreCalculator();
        assertEquals(1024, exponent1.exponent(2,10));
    }

    @Test
    public void threeToPowerOfFourShouldBeEightyOne(){
        CoreCalculator exponent2 = new CoreCalculator();
        assertEquals(81, exponent2.exponent(3,4));
    }

    @Test
    public void pointFiveToPowerOfTwoShouldEqualPointTwoFive(){
        CoreCalculator exponent3 = new CoreCalculator();
        assertEquals(.25, exponent3.exponent(.5,2));
    }

    @Test
    public void pointFiveToPowerOfPointFiveShouldEqualPointSevenZeroSevenOneZeroEtc(){
        CoreCalculator exponent4 = new CoreCalculator();
        assertEquals(.7071067811865476, exponent4.exponent(.5,.5));
    }

    @Test
    public void nineToPowerOfNegTwoShouldEqualPointZeroOneTwoThreeFourFiveSixSevenEtc(){
        CoreCalculator exponent5 = new CoreCalculator();
        assertEquals(.012345679012345678, exponent5.exponent(9,-2));
    }

    @Test
    public void negNineToPowerOfThreeShouldEqualNegSevenHundredTwentyNine(){
        CoreCalculator exponent6 = new CoreCalculator();
        assertEquals(-729, exponent6.exponent(-9,3));
    }

    @Test
    public void inverseOneShouldEqualOne(){
        CoreCalculator inverse0 = new CoreCalculator();
        assertEquals(1, inverse0.inverse(1));
    }

    @Test
    public void twoInverseShouldEqualPointFive(){
        CoreCalculator inverse1 = new CoreCalculator();
        assertEquals(.5, inverse1.inverse(2));
    }

    @Test
    public void sixInverseShouldEqualPointOneSixSixSixSixEtc(){
        CoreCalculator inverse2 = new CoreCalculator();
        assertEquals(.16666666666666666, inverse2.inverse(6));
    }

    @Test
    public void negOneInverseShouldEqualNegOne(){
        CoreCalculator inverse3 = new CoreCalculator();
        assertEquals(-1, inverse3.inverse(-1));
    }

    @Test
    public void negFiveInverseShouldEqualNegPointTwo(){
        CoreCalculator inverse4 = new CoreCalculator();
        assertEquals(-.2, inverse4.inverse(-5));
    }

    @Test
    public void pointOneInverseShouldEqualTen(){
        CoreCalculator inverse5 = new CoreCalculator();
        assertEquals(10, inverse5.inverse(.1));
    }

    @Test
    public void oneReverseShouldEqualNegOne(){
        CoreCalculator reverse0 = new CoreCalculator();
        assertEquals(-1, reverse0.reverse(1));
    }

    @Test
    public void twoReverseShouldEqualNegTwo(){
        CoreCalculator reverse1 = new CoreCalculator();
        assertEquals(-2, reverse1.reverse(2));
    }

    @Test
    public void negOneReverseShouldEqualOne(){
        CoreCalculator reverse2 = new CoreCalculator();
        assertEquals(1, reverse2.reverse(-1));
    }

    @Test
    public void pointFiveReverseShouldEqualNegPointFive(){
        CoreCalculator reverse3 = new CoreCalculator();
        assertEquals(-.5, reverse3.reverse(.5));
    }

    @Test
    public void ZeroReverseShouldEqualZero(){
        CoreCalculator reverse4 = new CoreCalculator();
        assertEquals(0, reverse4.reverse(0));
    }
    //^-0.0 Bug
    @Test
    public void tenThousandReverseShouldEqualNegTenThousand(){
        CoreCalculator reverse5 = new CoreCalculator();
        assertEquals(-10000, reverse5.reverse(10000));
    }

    @Test
    void sineOneShouldEqualPointZeroOneSevenFourFiveEtc(){
        ScienCalc sin0 = new ScienCalc();
        assertEquals(.01745240643728351, sin0.sine(1));
    }

    @Test
    void sineNegOneShouldEqualNegPointZeroOneSevenFourFiveEtc(){
        ScienCalc sin1 = new ScienCalc();
        assertEquals(-.01745240643728351, sin1.sine(-1));
    }

    @Test
    void sineZeroShouldEqualZero(){
        ScienCalc sin2 = new ScienCalc();
        assertEquals(0, sin2.sine(0));
    }

    @Test
    void sineThreeHundredSixtyShouldEqualPointNineFiveEightNineOneFiveEtc(){
        ScienCalc sin3 = new ScienCalc();
        assertEquals(0.95891572341, sin3.sine(360));
    }
    //^Fails Unsure Why

    @Test
    void cosOneShouldEqualPointNineNineNineEightFourEtc(){
        ScienCalc cos0 = new ScienCalc();
        assertEquals(.9998476951563913, cos0.cosine(1));
    }


    @Test
    void cosNegOneShouldEqualPointNineNineNineEightFourEtc(){
        ScienCalc cos1 = new ScienCalc();
        assertEquals(.9998476951563913, cos1.cosine(-1));
    }

    @Test
    void cosZeroShouldEqualOne(){
        ScienCalc cos2 = new ScienCalc();
        assertEquals(1, cos2.cosine(0));
    }

    @Test
    void cosThreeHundredSixtyShouldEqualOne(){
        ScienCalc cos3 = new ScienCalc();
        assertEquals(1, cos3.cosine(360));
    }

    @Test
    void tanOneShouldEqualOnePointZeroOneSevenFourFiveEtc(){
        ScienCalc tan0 = new ScienCalc();
        assertEquals(.017455064928217585, tan0.tangent(1));
    }

    @Test
    void tanNegOneShouldEqualNegPointZeroOneSevenFourFiveEtc(){
        ScienCalc tan1 = new ScienCalc();
        assertEquals(-0.017455064928217585, tan1.tangent(-1));
    }

    @Test
    void tanZeroShouldEqualZero(){
        ScienCalc tan2 = new ScienCalc();
        assertEquals(0, tan2.tangent(0));
    }

    @Test
    void tanThreeHundredSixtyShouldEqualNegThreePointThreeEightZeroOneFourEtc(){
        ScienCalc tan3 = new ScienCalc();
        assertEquals(-3.38014041, tan3.tangent(360));
    }
    //^Fails Unsure Why

    @Test
    void asineOneShouldEqualOnePointFiveSevenZeroSevenNineEtc(){
        ScienCalc asin0 = new ScienCalc();
        assertEquals(1.5707963267948966, asin0.inverseSine(1));
    }

    @Test
    void asineNegOneShouldEqualNegOnePointFiveSevenZeroSevenNineEtc(){
        ScienCalc asin1 = new ScienCalc();
        assertEquals(-1.5707963267948966, asin1.inverseSine(-1));
    }

    @Test
    void asineZeroShouldEqualZero(){
        ScienCalc asin2 = new ScienCalc();
        assertEquals(0, asin2.inverseSine(0));
    }

    @Test
    void acosOneShouldEqualZero(){
        ScienCalc acos0 = new ScienCalc();
        assertEquals(0, acos0.inverseCosine(1));
    }

    @Test
    void acosNegOneShouldEqualPi(){
        ScienCalc acos1 = new ScienCalc();
        assertEquals(3.141592653589793, acos1.inverseCosine(-1));
    }

    @Test
    void acosZeroShouldEqualOnePointFiveSevenZeroSevenNineEtc(){
        ScienCalc acos2 = new ScienCalc();
        assertEquals(1.5707963267948966, acos2.inverseCosine(0));
    }

    @Test
    void atanOneShouldEqualPointSevenEightFiveThreeNineEtc(){
        ScienCalc atan0 = new ScienCalc();
        assertEquals(0.785398164928217585, atan0.tangent(1));
    }
    //^Fails Unsure Why

    @Test
    void atanNegOneShouldEqualNegPointSevenEightFiveThreeNineEtc(){
        ScienCalc atan1 = new ScienCalc();
        assertEquals(-0.785398164928217585, atan1.tangent(-1));
    }
    //^Fails Unsure Why

    @Test
    void atanZeroShouldEqualZero(){
        ScienCalc atan2 = new ScienCalc();
        assertEquals(0, atan2.tangent(0));
    }

    @Test
    void atanThreeHundredSixtyShouldEqualOnePointFiveSixEightZeroOne(){
        ScienCalc atan3 = new ScienCalc();
        assertEquals(1.56801856, atan3.tangent(360));
    }
    //^Fails Unsure Why

    @Test
    void logOneShouldEqualZero(){
        ScienCalc log0 = new ScienCalc();
        assertEquals(0, log0.log(1));
    }

    @Test
    void logThreeHundredSixtyShouldEqualTwoPointFiveFiveSixThreeZeroEtc(){
        ScienCalc log1 = new ScienCalc();
        assertEquals(2.5563025007672873, log1.log(360));
    }

    @Test
    void inverseLogOneShouldEqualTen(){
        ScienCalc alog0 = new ScienCalc();
        assertEquals(10, alog0.inverseLog(1));
    }

    @Test
    void inverseLogNegOneShouldEqualPointOne(){
        ScienCalc alog1 = new ScienCalc();
        assertEquals(.1, alog1.inverseLog(-1));
    }

    @Test
    void inverseLogZeroShouldEqualOne(){
        ScienCalc alog2 = new ScienCalc();
        assertEquals(1, alog2.inverseLog(0));
    }

    @Test
    void inverseLogFiveShouldEqualOneHundredThousand(){
        ScienCalc alog3 = new ScienCalc();
        assertEquals(100000, alog3.inverseLog(5));
    }

    @Test
    void natLogOneShouldEqualZero(){
        ScienCalc natlog0 = new ScienCalc();
        assertEquals(0, natlog0.naturalLog(1));
    }

    @Test
    void natLogThreeHundredSixtyShouldEqualFivePointEightEightSixOneZeroEtc(){
        ScienCalc natlog1 = new ScienCalc();
        assertEquals(5.886104031450156, natlog1.naturalLog(360));
    }


}


