package home_work_3.calcs.runners;
//Это исполнение исключительно для посчета результата математического выражения в задании, с автоматическим получаением чисел из него
//Можно только добавлять слагаемые, вычитания в скрипте нету. А, и деления как отдельное слагаемое или вычитаемое тоже нет, но доработать можно
//Но этот скрипт разложит каждое слагаемое, при доработке и вычитаемые

import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Arrays;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperatorMain2 {
    static CalculatorWithOperator clr = new CalculatorWithOperator();
    public static void main(String[] args) {

        String inputMath = "4.1 + 15 * 7 + (28 / 5) ^ 2";
        double resultOfInputMath = 0;
        String inputMathNoWhitespaces = inputMath.replace(" ","");
        int counterPlus = 0;

        String[] additivesInInputMath = inputMathNoWhitespaces.split("[+]");
        for (String additives : additivesInInputMath){
            counterPlus++;
        }
        System.out.println("Массив слагаемых выражения: " + Arrays.toString(additivesInInputMath));
        for (int j = 0; j < additivesInInputMath.length; j++) {
            int getMulti = 0;
            int getExp = 0;
            int getDiv = 0;
            for (int i = 0; i < additivesInInputMath[j].length(); i++) {

                if (additivesInInputMath[j].charAt(i) == '*') {
                    getMulti++;
                } else if (additivesInInputMath[j].charAt(i) == '^') {
                    getExp++;
                } else if (additivesInInputMath[j].charAt(i) == '/') {
                    getDiv++;
                }
            }

            if (getExp > 0) {
                String[] exponentInInputMath = additivesInInputMath[j].split("['^']");
                clr.setExponent(Integer.parseInt(exponentInInputMath[1]));
                exponentInInputMath[0] = checkWhatInExpBase(exponentInInputMath[0]);
                clr.setBase(Double.parseDouble(exponentInInputMath[0]));
                System.out.println("Массив возведения в степень: " + Arrays.toString(exponentInInputMath));
                additivesInInputMath[j] = String.valueOf(clr.Exponentiation(clr.getBase(),clr.getExponent()));
            }

            if (getMulti > 0) {
                String[] multiplyInInputMath = additivesInInputMath[j].split("[*]");
                System.out.println("Массив умножения" + Arrays.toString(multiplyInInputMath));
                clr.setMultiplierFirst(Double.parseDouble(multiplyInInputMath[0]));
                clr.setMultiplierSecond(Double.parseDouble(multiplyInInputMath[1]));
                System.out.println("Первый множитель: " + clr.getMultiplierFirst());
                System.out.println("Второй множитель: " + clr.getMultiplierSecond());
                additivesInInputMath[j] = String.valueOf(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));
                System.out.println("Результат умножения: " + additivesInInputMath[j]);
            }

            /*if (getDiv > 0) {
                String[] divisionInInputMath = additivesInInputMath[j].split("[/]");
                System.out.println("Массив деления" + Arrays.toString(divisionInInputMath));
                clr.setDivisorSecond(Double.parseDouble(divisionInInputMath[0]));
                clr.setDivisorSecond(Double.parseDouble(divisionInInputMath[1]));
                System.out.println("Делимое: " + clr.getMultiplierFirst());
                System.out.println("Делитель: " + clr.getMultiplierSecond());
                additivesInInputMath[j] = String.valueOf(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
                System.out.println("Результат деления: " + additivesInInputMath[j]);
            }*/
        }

        System.out.println("Массив сложения: " + Arrays.toString(additivesInInputMath));

        System.out.println("Количество слагаемых выражения: " + counterPlus);

        for (int i = 0; i < additivesInInputMath.length - 1; i++) {
            clr.setAddendFirst(Double.parseDouble(additivesInInputMath[i]));
            clr.setAddendSecond(Double.parseDouble(additivesInInputMath[i+1]));
            additivesInInputMath[i+1] = String.valueOf(clr.Addition(clr.getAddendFirst(), clr.getAddendSecond()));
        }

        resultOfInputMath = Double.parseDouble(additivesInInputMath[counterPlus - 1]);
        System.out.println(inputMath + " = " + resultOfInputMath);

    }

    public static String checkWhatInExpBase(String elementNullAtStringArrayForExp){
        int countSkobochki = 0;
        for (int i = 0; i < elementNullAtStringArrayForExp.length(); i++) {
            if (elementNullAtStringArrayForExp.charAt(i) == '(' || elementNullAtStringArrayForExp.charAt(i) == ')'){
                countSkobochki++;
            }
        }

        if (countSkobochki > 0){
            elementNullAtStringArrayForExp = elementNullAtStringArrayForExp.replace("(", "");
            elementNullAtStringArrayForExp = elementNullAtStringArrayForExp.replace(")", "");
        }

        String[] elementsOfBaseForDiv = elementNullAtStringArrayForExp.split("[/]");
        System.out.println("Массив для деления в основании степени: " + Arrays.toString(elementsOfBaseForDiv));

        clr.setDividendFirst(Double.parseDouble(elementsOfBaseForDiv[0]));
        clr.setDivisorSecond(Double.parseDouble(elementsOfBaseForDiv[1]));

        elementNullAtStringArrayForExp = Double.toString(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
        System.out.println("Основание степени: " + elementNullAtStringArrayForExp);

        return elementNullAtStringArrayForExp;
    }
}
