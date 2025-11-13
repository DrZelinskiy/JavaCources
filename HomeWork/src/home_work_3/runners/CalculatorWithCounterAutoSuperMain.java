package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {

    static CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

    public static void main(String[] args) {
        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result = calc.addition(calc.addition(4.1, calc.multiplication(15, 7)), calc.exponent(calc.division(28, 5), 2));
        System.out.println(input + " = " + result);
        System.out.println("Счётчик использования калькулятора: " + calc.getCountOperation());
    }
}
