package home_work_3_old.calcs.simple;

public class CalculatorWithMathCopy {

    private double addendFirst;
    private double addendSecond;

    public double getAddendFirst() {
        return addendFirst;
    }

    public void setAddendFirst(double addendFirst) {
        this.addendFirst = addendFirst;
    }

    public double getAddendSecond() {
        return addendSecond;
    }

    public void setAddendSecond(double addendSecond) {
        this.addendSecond = addendSecond;
    }

    public double Addition(double addendFirst, double addendSecond){
        return addendFirst + addendSecond;
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double minuendFirst;
    private double subtrahendSecond;

    public double getMinuendFirst() {
        return minuendFirst;
    }

    public void setMinuendFirst(double minuendFirst) {
        this.minuendFirst = minuendFirst;
    }

    public double getSubtrahendSecond() {
        return subtrahendSecond;
    }

    public void setSubtrahendSecond(double subtrahendSecond) {
        this.subtrahendSecond = subtrahendSecond;
    }

    public double Subtraction(double minuendFirst, double subtrahendSecond){
        return minuendFirst - subtrahendSecond;
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double multiplierFirst;
    private double multiplierSecond;

    public double getMultiplierFirst() {
        return multiplierFirst;
    }

    public void setMultiplierFirst(double multiplierFirst) {
        this.multiplierFirst = multiplierFirst;
    }

    public double getMultiplierSecond() {
        return multiplierSecond;
    }

    public void setMultiplierSecond(double multiplierSecond) {
        this.multiplierSecond = multiplierSecond;
    }

    public double Multiplication(double multiplierFirst, double multiplierSecond){
        return multiplierFirst * multiplierSecond;
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double dividendFirst;
    private double divisorSecond;

    public double getDividendFirst() {
        return dividendFirst;
    }

    public void setDividendFirst(double dividendFirst) {
        this.dividendFirst = dividendFirst;
    }

    public double getDivisorSecond() {
        return divisorSecond;
    }

    public void setDivisorSecond(double divisorSecond) {
        this.divisorSecond = divisorSecond;
    }

    public double Division(double dividendFirst, double divisorSecond) {
        return dividendFirst / divisorSecond;
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double base;
    private int exponent;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    public double Exponentiation(double base, int exponent) {
        System.out.println("Возведение в степень через библиотеку Math");
        return Math.pow(base, exponent);
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double baseModule;

    public double getBaseModule() {
        return baseModule;
    }

    public void setBaseModule(double baseModule) {
        this.baseModule = baseModule;
    }

    public double Module(double baseModule) {
        System.out.println("Получение модуля числа через библиотеку Math");
        return Math.abs(baseModule);
    }

    //----------------------------------------------------------------------------------------------------------------//

    private int baseRoot;

    public int getBaseRoot() {
        return baseRoot;
    }

    public void setBaseRoot(int baseRoot) {
        this.baseRoot = baseRoot;
    }

    public double SquareRoot(int baseRoot) {
        System.out.println("Получение квадратного корня числа через библиотеку Math");
        return Math.sqrt(baseRoot);
    }
}
