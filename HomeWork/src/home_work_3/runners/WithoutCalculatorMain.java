package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        String input = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double result;
        result = (4.1 + 15 * 7 + Math.pow(((double)28 / 5),2)); //4.1 + 105 + 5.6^2 ~ 109.1 + 31.36 = 140.46
        System.out.println(input + " = " + result);
    }
}
