package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long counter;

    public void incrementCountOperation(){
        this.counter++;
    }

    public long getCountOperation(){
        return counter;
    }
    @Override
    public double exponent(double base, int exponent) {
        incrementCountOperation();
        return super.exponent(base, exponent);
    }

    @Override
    public double module(double baseModule) {
        incrementCountOperation();
        return super.module(baseModule);
    }

    @Override
    public double squareRoot(int baseRoot) {
        incrementCountOperation();
        return super.squareRoot(baseRoot);
    }

    @Override
    public double addition(double addendFirst, double addendSecond) {
        incrementCountOperation();
        return super.addition(addendFirst, addendSecond);
    }

    @Override
    public double subtraction(double minuendFirst, double subtrahendSecond) {
        incrementCountOperation();
        return super.subtraction(minuendFirst, subtrahendSecond);
    }

    @Override
    public double multiplication(double multiplierFirst, double multiplierSecond) {
        incrementCountOperation();
        return super.multiplication(multiplierFirst, multiplierSecond);
    }

    @Override
    public double division(double dividendFirst, double divisorSecond) {
        incrementCountOperation();
        return super.division(dividendFirst, divisorSecond);
    }
}
