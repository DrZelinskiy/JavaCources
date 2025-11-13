package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double addition(double addendFirst, double addendSecond){
        return addendFirst + addendSecond;
    }

    public double subtraction(double minuendFirst, double subtrahendSecond){
        return minuendFirst - subtrahendSecond;
    }

    public double multiplication(double multiplierFirst, double multiplierSecond){
        return multiplierFirst * multiplierSecond;
    }

    public double division(double dividendFirst, double divisorSecond) {
        return dividendFirst / divisorSecond;
    }

    public double exponent(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double module(double baseModule) {
        return Math.abs(baseModule);
    }

    public double squareRoot(int baseRoot) {
        return Math.sqrt(baseRoot);
    }
}
