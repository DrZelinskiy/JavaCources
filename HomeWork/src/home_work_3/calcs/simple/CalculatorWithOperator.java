package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
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
        double expResult = 1;
        for (int i = 1; i <= exponent; i++) {
            expResult *= base;
        }
        return expResult;
    }

    public double module(double baseModule) {
        double moduleResult;
        if (baseModule < 0){
            moduleResult = baseModule * (-1);
        } else {
            moduleResult = baseModule;
        }
        return moduleResult;
    }

    public double squareRoot(int baseRoot) {
        baseRoot = baseRoot / 2;
        System.out.println("Тут просто класс, который не считает квадратный корень, а просто существует для переопределения");
        return baseRoot;
    }
}
