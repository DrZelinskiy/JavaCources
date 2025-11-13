package home_work_3_old.calcs.simple;

public class CalculatorWithOperator {

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
        double expResult = 1;
        for (int i = 1; i <= exponent; i++) {
            expResult = expResult * base;
        }
        return expResult;
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
        double moduleResult;
        if (baseModule < 0){
            moduleResult = baseModule * (-1);
        } else {
            moduleResult = baseModule;
        }
        return moduleResult;
    }

    //----------------------------------------------------------------------------------------------------------------//

    private double baseRoot;

    public double getBaseRoot() {
        return baseRoot;
    }

    public void setBaseRoot(double baseRoot) {
        this.baseRoot = baseRoot;
    }

    public double SquareRoot(int baseRoot) {
        baseRoot = baseRoot / 2;
        System.out.println("Тут просто класс, который не считает квадратный корень, а просто существует для переопределения");
        return baseRoot;
    }
}
