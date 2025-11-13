package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator{

    private ICalculator calculator;

    public CalculatorWithMemoryDecorator(ICalculator calc){
        this.calculator = calc;
    }

    public ICalculator getCalculator(){
        return calculator;
    }

    private double save;

    private double load;


    public void save (){
        this.save = save;
    }

    public double load (){
        this.load = save;
        save = 0;
        return load;
    }

    public double addition(double addendFirst, double addendSecond){
        save = calculator.addition(addendFirst, addendSecond);
        return save;
    }
    public double subtraction(double minuendFirst, double subtrahendSecond){
        save = calculator.subtraction(minuendFirst, subtrahendSecond);
        return save;
    }
    public double multiplication(double multiplierFirst, double multiplierSecond){
        save = calculator.multiplication(multiplierFirst, multiplierSecond);
        return save;
    }
    public double division(double dividendFirst, double divisorSecond){
        save = calculator.division(dividendFirst, divisorSecond);
        return save;
    }
    public double exponent(double base, int exponent){
        save = calculator.exponent(base, exponent);
        return save;
    }
    public double module(double baseModule){
        save = calculator.module(baseModule);
        return save;
    }
    public double squareRoot(int baseRoot){
        save = calculator.squareRoot(baseRoot);
        return save;
    }
}
