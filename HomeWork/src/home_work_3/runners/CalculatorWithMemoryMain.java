package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    static CalculatorWithMemory calcMemory = new CalculatorWithMemory(new CalculatorWithOperator());

    public static void main(String[] args) {
        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        calcMemory.division(28, 5);
        calcMemory.save();
        calcMemory.exponent(calcMemory.load(), 2);
        calcMemory.save();
        calcMemory.addition(4.1, calcMemory.load());
        calcMemory.save();
        calcMemory.addition(calcMemory.load(), calcMemory.multiplication(15, 7));
        System.out.printf(input + " = " + "%.2f%n", calcMemory.load());

    }
}
