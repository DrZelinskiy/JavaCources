package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface{
    private ICalculator calculator;

    public CalculatorWithCounterAutoAgregationInterface(ICalculator calc){
        this.calculator = calc;
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
        return calculator.addition(addendFirst, addendSecond);
    }
    public double subtraction(double minuendFirst, double subtrahendSecond){
        incrementCountOperation();
        return calculator.subtraction(minuendFirst, subtrahendSecond);
    }
    public double multiplication(double multiplierFirst, double multiplierSecond){
        incrementCountOperation();
        return calculator.multiplication(multiplierFirst, multiplierSecond);
    }
    public double division(double dividendFirst, double divisorSecond){
        incrementCountOperation();
        return calculator.division(dividendFirst, divisorSecond);
    }
    public double exponent(double base, int exponent){
        incrementCountOperation();
        return calculator.exponent(base, exponent);
    }
    public double module(double baseModule){
        incrementCountOperation();
        return calculator.module(baseModule);
    }
    public double squareRoot(int baseRoot){
        incrementCountOperation();
        return calculator.squareRoot(baseRoot);
    }
}
