package home_work_3_old.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator{

    public double Exponentiation(double base, int exponent) {
        System.out.println("Вычисление возведения в степень через библиотеку Math");
        return Math.pow(base, exponent);
    }

    public double Module(double baseModule) {
        System.out.println("Получение модуля числа через библиотеку Math");
        return Math.abs(baseModule);
    }

    public double SquareRoot(int baseRoot) {
        System.out.println("Получение квадратного корня числа через библиотеку Math");
        return Math.sqrt(baseRoot);
    }

}
