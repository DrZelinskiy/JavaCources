package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private int operationCount = 0;
    private void incrementCountOperation(){
        operationCount++;
    }

    public int getCountOperation(){
        System.out.print("Счетчик использования: ");
        return operationCount;
    }

    public double Addition(double addendFirst, double addendSecond){
        incrementCountOperation();
        return addendFirst + addendSecond;
    }

    public double Subtraction(double minuendFirst, double subtrahendSecond){
        incrementCountOperation();
        return minuendFirst - subtrahendSecond;
    }

    public double Multiplication(double multiplierFirst, double multiplierSecond){
        incrementCountOperation();
        return multiplierFirst * multiplierSecond;
    }

    public double Division(double dividendFirst, double divisorSecond) {
        incrementCountOperation();
        return dividendFirst / divisorSecond;
    }

    public double Exponentiation(double base, int exponent) {
        System.out.println("Вычисление возведения в степень через библиотеку Math");
        incrementCountOperation();
        return Math.pow(base, exponent);
    }

    public double Module(double baseModule) {
        System.out.println("Получение модуля числа через библиотеку Math");
        incrementCountOperation();
        return Math.abs(baseModule);
    }

    public double SquareRoot(int baseRoot) {
        System.out.println("Получение квадратного корня числа через библиотеку Math");
        incrementCountOperation();
        return Math.sqrt(baseRoot);
    }

}
