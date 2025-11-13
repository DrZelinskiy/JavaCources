package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {

    private CalculatorWithOperator calcOne;
    private CalculatorWithMathCopy calcTwo;
    private CalculatorWithMathExtends calcThree;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc){
        this.calcOne = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc){
        this.calcTwo = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc){
        this.calcThree = calc;
    }

    private long counter;

    public void incrementCountOperation(){
        this.counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double addition(double addendFirst, double addendSecond){
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.addition(addendFirst,addendSecond);
        } else if (calcTwo != null){
            return calcTwo.addition(addendFirst,addendSecond);
        } else {
            return calcThree.addition(addendFirst,addendSecond);
        }
    }

    public double subtraction(double minuendFirst, double subtrahendSecond){
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.subtraction(minuendFirst, subtrahendSecond);
        } else if (calcTwo != null){
            return calcTwo.subtraction(minuendFirst, subtrahendSecond);
        } else {
            return calcThree.subtraction(minuendFirst, subtrahendSecond);
        }
    }

    public double multiplication(double multiplierFirst, double multiplierSecond){
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.multiplication(multiplierFirst, multiplierSecond);
        } else if (calcTwo != null){
            return calcTwo.multiplication(multiplierFirst, multiplierSecond);
        } else {
            return calcThree.multiplication(multiplierFirst, multiplierSecond);
        }
    }

    public double division(double dividendFirst, double divisorSecond) {
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.division(dividendFirst, divisorSecond);
        } else if (calcTwo != null){
            return calcTwo.division(dividendFirst, divisorSecond);
        } else {
            return calcThree.division(dividendFirst, divisorSecond);
        }
    }

    public double exponent(double base, int exponent) {
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.exponent(base, exponent);
        } else if (calcTwo != null){
            return calcTwo.exponent(base, exponent);
        } else {
            return calcThree.exponent(base, exponent);
        }
    }

    public double module(double baseModule) {
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.module(baseModule);
        } else if (calcTwo != null){
            return calcTwo.module(baseModule);
        } else {
            return calcThree.module(baseModule);
        }
    }

    public double squareRoot(int baseRoot) {
        incrementCountOperation();
        if (calcOne != null){
            return calcOne.squareRoot(baseRoot);
        } else if (calcTwo != null){
            return calcTwo.squareRoot(baseRoot);
        } else {
            return calcThree.squareRoot(baseRoot);
        }
    }
}
