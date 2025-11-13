package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateChoiceAgregationMain {

    static CalculatorWithCounterAutoChoiceAgregation calcWithMathExtends = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
    static CalculatorWithCounterAutoChoiceAgregation calcWithMathCopy = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
    static CalculatorWithCounterAutoChoiceAgregation calcWithOperator = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());


    public static void main(String[] args) {
        solveInput(calcWithOperator);
        System.out.println("/------------------------------------------------------/");
        solveInput(calcWithMathCopy);
        System.out.println("/------------------------------------------------------/");
        solveInput(calcWithMathExtends);
    }

    public static void solveInput(CalculatorWithCounterAutoChoiceAgregation calc){
        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponent(calc.division(28, 5), 2));
        System.out.println(input + " = " + result);
        System.out.println("Счётчик использования калькулятора: " + calc.getCountOperation());
    }
}
