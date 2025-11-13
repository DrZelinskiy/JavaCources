package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {

    CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

    private long counter;

    public void incrementCountOperation(){
        this.counter++;
    }

    public long getCountOperation(){
        return counter;
    }

    public double addition(double addendFirst, double addendSecond){
        incrementCountOperation();
        return calc.addition(addendFirst,addendSecond);
    }

    public double subtraction(double minuendFirst, double subtrahendSecond){
        incrementCountOperation();
        return calc.subtraction(minuendFirst, subtrahendSecond);
    }

    public double multiplication(double multiplierFirst, double multiplierSecond){
        incrementCountOperation();
        return calc.multiplication(multiplierFirst, multiplierSecond);
    }

    public double division(double dividendFirst, double divisorSecond) {
        incrementCountOperation();
        return calc.division(dividendFirst, divisorSecond);
    }

    public double exponent(double base, int exponent) {
        incrementCountOperation();
        return calc.exponent(base, exponent);
    }

    public double module(double baseModule) {
        incrementCountOperation();
        return calc.module(baseModule);
    }

    public double squareRoot(int baseRoot) {
        incrementCountOperation();
        return calc.squareRoot(baseRoot);
    }
}
