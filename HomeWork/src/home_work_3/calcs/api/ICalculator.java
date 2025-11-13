package home_work_3.calcs.api;

public interface ICalculator {
    double addition(double addendFirst, double addendSecond);
    double subtraction(double minuendFirst, double subtrahendSecond);
    double multiplication(double multiplierFirst, double multiplierSecond);
    double division(double dividendFirst, double divisorSecond);
    double exponent(double base, int exponent);
    double module(double baseModule);
    double squareRoot(int baseRoot);
}
