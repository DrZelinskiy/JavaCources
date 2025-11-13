package home_work_3_old.runners;

import home_work_3_old.calcs.simple.CalculatorWithOperator;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperatorMain {
    public static void main(String[] args) {

        String inputMath = "4.1 + 15 * 7 + (28 / 5) ^ 2";

        CalculatorWithOperator clr = new CalculatorWithOperator();
        clr.setMultiplierFirst(7);
        clr.setMultiplierSecond(15);

        System.out.println(clr.getMultiplierFirst());
        System.out.println(clr.getMultiplierSecond());
        System.out.println("//**********************************//");

        clr.setDividendFirst(28);
        clr.setDivisorSecond(5);

        System.out.println(clr.getDividendFirst());
        System.out.println(clr.getDivisorSecond());
        System.out.println("//**********************************//");

        System.out.println(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));
        System.out.println(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
        System.out.println("//**********************************//");

        clr.setBase(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
        clr.setExponent(2);

        System.out.println(clr.getBase());
        System.out.println(clr.getExponent());
        System.out.println("//**********************************//");

        System.out.println(clr.Exponentiation(clr.getBase(), clr.getExponent()));
        System.out.println("//**********************************//");

        clr.setAddendFirst(4.1);
        clr.setAddendSecond(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));

        System.out.println(clr.getAddendFirst());
        System.out.println(clr.getAddendSecond());
        System.out.println("//**********************************//");

        System.out.println(clr.Addition(clr.getAddendFirst(), clr.getAddendSecond()));
        System.out.println("//**********************************//");

        clr.setAddendFirst((clr.Addition(clr.getAddendFirst(), clr.getAddendSecond())));
        clr.setAddendSecond(clr.Exponentiation(clr.getBase(), clr.getExponent()));

        System.out.println(clr.getAddendFirst());
        System.out.println(clr.getAddendSecond());
        System.out.println("//**********************************//");

        double finalResult = clr.Addition(clr.getAddendFirst(), clr.getAddendSecond());
        System.out.println(inputMath + " = " + finalResult);
    }
}
