package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithCounterClassic;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {
        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double result = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponent(calc.division(28, 5), 2));
        System.out.printf(input + " = " + "%.2f%n", result);

        System.out.println("calc = " + calc.getClass().getSimpleName());
        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator wrapCalc = (CalculatorWithCounterAutoDecorator) calc;

            ICalculator innerCalc = wrapCalc.getCalculator();
            System.out.println("innerCalc = " + innerCalc.getClass().getSimpleName());

            if (innerCalc instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator baseCalc = (CalculatorWithMemoryDecorator) innerCalc;

                ICalculator coreCalc = baseCalc.getCalculator();
                System.out.println("coreCalc = " + coreCalc.getClass().getSimpleName());
            }
            System.out.println("Счётчик использования калькулятора: " + ((CalculatorWithCounterAutoDecorator) calc).getCountOperation());
        }

        System.out.println("/--------------------------------------------------------------------/");

        calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithCounterClassic()));
        System.out.println("calc = " + calc.getClass().getSimpleName());
        if (calc instanceof CalculatorWithCounterAutoDecorator) {
            CalculatorWithCounterAutoDecorator wrapCalc = (CalculatorWithCounterAutoDecorator) calc;

            ICalculator innerCalc = wrapCalc.getCalculator();
            System.out.println("innerCalc = " + innerCalc.getClass().getSimpleName());

            if (innerCalc instanceof CalculatorWithMemoryDecorator) {
                CalculatorWithMemoryDecorator baseCalc = (CalculatorWithMemoryDecorator) innerCalc;

                ICalculator coreCalc = baseCalc.getCalculator();
                System.out.println("coreCalc = " + coreCalc.getClass().getSimpleName());
            }
        }
    }
}
