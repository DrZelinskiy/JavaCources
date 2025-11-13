package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    @Override
    public double exponent(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double module(double baseModule) {
        return Math.abs(baseModule);
    }

    @Override
    public double squareRoot(int baseRoot) {
        return Math.sqrt(baseRoot);
    }
}
