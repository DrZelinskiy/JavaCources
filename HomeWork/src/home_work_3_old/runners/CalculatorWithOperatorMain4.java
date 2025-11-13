package home_work_3_old.runners;
//Это исполнение исключительно для подсчета результата математического выражения в задании, с автоматическим получением чисел из него
//Так, тут уже и вычитание работает
//Тут переработка для определения, что в основании возведения в степень, деление или умножение, но только одно

//Вообще вот это вот деление строки по плюсу или минусу исключает использование плюсов и минусов в скобках, а также возникают проблемы с модулем,
//потому что при запихивании под модуль отрицательного числа пока будет проблема, что оно будет считаться как операнд для вычитания, а по факту это положительное число
//Вот так вот(


//Вообще, для нормального определения основания с учетом и умножения, и деления, там в метод надо добавить разбиение на массив, если там больше двух элементов
import home_work_3_old.calcs.simple.CalculatorWithOperator;

import java.util.Arrays;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithOperatorMain4 {
    static CalculatorWithOperator clr = new CalculatorWithOperator();
    public static void main(String[] args) {

        String inputMath = "4.1 + 15 * 7 + ( 28 / 5 ) ^ 2 - 18 / 3";
        double resultOfInputMath = 0;
        String inputMathNoWhitespaces = inputMath.replace(" ","");
        int countPlus = 0;

        String[] elementsInInputMath = inputMathNoWhitespaces.split("[+]");
        for (String elements : elementsInInputMath){
            countPlus++;
        }
        System.out.println("Массив элементов выражения: " + Arrays.toString(elementsInInputMath));

        for (int j = 0; j < elementsInInputMath.length; j++) {
            int countSub = 0;
            int countMulti = 0;
            int countExp = 0;
            int countDiv = 0;

            boolean checkForSubs = elementsInInputMath[j].matches(".*[-].*");

            if (checkForSubs){
                String[] checkForSubsElements = elementsInInputMath[j].split("[-]");
                for (String subs : checkForSubsElements) {
                    countSub++;
                }
                System.out.println("Массив элементов вычитания: " + Arrays.toString(checkForSubsElements));
                for (int subArrayCount = 0; subArrayCount < checkForSubsElements.length; subArrayCount++) {
                    countMulti = 0;
                    countExp = 0;
                    countDiv = 0;
                    for (int subArrayChecker = 0; subArrayChecker < checkForSubsElements[subArrayCount].length(); subArrayChecker++) {

                        if (checkForSubsElements[subArrayCount].charAt(subArrayChecker) == '*') {
                            countMulti++;
                        } else if (checkForSubsElements[subArrayCount].charAt(subArrayChecker) == '^') {
                            countExp++;
                        } else if (checkForSubsElements[subArrayCount].charAt(subArrayChecker) == '/') {
                            countDiv++;
                        }
                    }

                    if (countExp > 0) {
                        countMulti = 0;
                        countDiv = 0;
                        String[] exponentInInputMath = checkForSubsElements[subArrayCount].split("['^']");
                        clr.setExponent(Integer.parseInt(exponentInInputMath[1]));
                        exponentInInputMath[0] = checkWhatInExpBase(exponentInInputMath[0]);
                        clr.setBase(Double.parseDouble(exponentInInputMath[0]));
                        System.out.println("Массив возведения в степень: " + Arrays.toString(exponentInInputMath));
                        checkForSubsElements[subArrayCount] = String.valueOf(clr.Exponentiation(clr.getBase(), clr.getExponent()));
                    }

                    if (countMulti > 0) {
                        countDiv = 0;
                        String[] multiplyInInputMath = checkForSubsElements[subArrayCount].split("[*]");
                        System.out.println("Массив умножения: " + Arrays.toString(multiplyInInputMath));
                        clr.setMultiplierFirst(Double.parseDouble(multiplyInInputMath[0]));
                        clr.setMultiplierSecond(Double.parseDouble(multiplyInInputMath[1]));
                        System.out.println("Первый множитель: " + clr.getMultiplierFirst());
                        System.out.println("Второй множитель: " + clr.getMultiplierSecond());
                        checkForSubsElements[subArrayCount] = String.valueOf(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));
                        System.out.println("Результат умножения: " + checkForSubsElements[subArrayCount]);
                    }

                    if (countDiv > 0) {
                        String[] divisionInInputMath = checkForSubsElements[subArrayCount].split("[/]");
                        System.out.println("Массив деления: " + Arrays.toString(divisionInInputMath));
                        clr.setDividendFirst(Double.parseDouble(divisionInInputMath[0]));
                        clr.setDivisorSecond(Double.parseDouble(divisionInInputMath[1]));
                        System.out.println("Делимое: " + clr.getDividendFirst());
                        System.out.println("Делитель: " + clr.getDivisorSecond());
                        checkForSubsElements[subArrayCount] = String.valueOf(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
                        System.out.println("Результат деления: " + checkForSubsElements[subArrayCount]);
                    }

                }

                System.out.println("Массив вычитания: " + Arrays.toString(checkForSubsElements));

                System.out.println("Количество элементов вычитания: " + countSub);

                for (int k = 0; k < checkForSubsElements.length - 1; k++) {
                    clr.setMinuendFirst(Double.parseDouble(checkForSubsElements[k]));
                    clr.setSubtrahendSecond(Double.parseDouble(checkForSubsElements[k+1]));
                    checkForSubsElements[k+1] = String.valueOf(clr.Subtraction(clr.getMinuendFirst(), clr.getSubtrahendSecond()));
                    elementsInInputMath[j] = checkForSubsElements[k+1];
                }

                countMulti = 0;
                countExp = 0;
                countDiv = 0;
            }

            System.out.println(Arrays.toString(elementsInInputMath));

            for (int i = 0; i < elementsInInputMath[j].length(); i++) {

                if (elementsInInputMath[j].charAt(i) == '*') {
                    countMulti++;
                } else if (elementsInInputMath[j].charAt(i) == '^') {
                    countExp++;
                } else if (elementsInInputMath[j].charAt(i) == '/') {
                    countDiv++;
                } 
            }

            if (countExp > 0) {
                countMulti = 0;
                countDiv = 0;
                String[] exponentInInputMath = elementsInInputMath[j].split("['^']");
                clr.setExponent(Integer.parseInt(exponentInInputMath[1]));
                exponentInInputMath[0] = checkWhatInExpBase(exponentInInputMath[0]);
                clr.setBase(Double.parseDouble(exponentInInputMath[0]));
                System.out.println("Массив возведения в степень: " + Arrays.toString(exponentInInputMath));
                elementsInInputMath[j] = String.valueOf(clr.Exponentiation(clr.getBase(),clr.getExponent()));
            }

            if (countMulti > 0) {
                String[] multiplyInInputMath = elementsInInputMath[j].split("[*]");
                System.out.println("Массив умножения" + Arrays.toString(multiplyInInputMath));
                clr.setMultiplierFirst(Double.parseDouble(multiplyInInputMath[0]));
                clr.setMultiplierSecond(Double.parseDouble(multiplyInInputMath[1]));
                System.out.println("Первый множитель: " + clr.getMultiplierFirst());
                System.out.println("Второй множитель: " + clr.getMultiplierSecond());
                elementsInInputMath[j] = String.valueOf(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));
                System.out.println("Результат умножения: " + elementsInInputMath[j]);
            }

            if (countDiv > 0) {
                String[] divisionInInputMath = elementsInInputMath[j].split("[/]");
                System.out.println("Массив деления" + Arrays.toString(divisionInInputMath));
                clr.setDividendFirst(Double.parseDouble(divisionInInputMath[0]));
                clr.setDivisorSecond(Double.parseDouble(divisionInInputMath[1]));
                System.out.println("Делимое: " + clr.getDividendFirst());
                System.out.println("Делитель: " + clr.getDivisorSecond());
                elementsInInputMath[j] = String.valueOf(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
                System.out.println("Результат деления: " + elementsInInputMath[j]);
            }
        }

        System.out.println("Массив сложения: " + Arrays.toString(elementsInInputMath));

        System.out.println("Количество слагаемых выражения: " + countPlus);

        for (int i = 0; i < elementsInInputMath.length - 1; i++) {
            clr.setAddendFirst(Double.parseDouble(elementsInInputMath[i]));
            clr.setAddendSecond(Double.parseDouble(elementsInInputMath[i+1]));
            elementsInInputMath[i+1] = String.valueOf(clr.Addition(clr.getAddendFirst(), clr.getAddendSecond()));
        }

        resultOfInputMath = Double.parseDouble(elementsInInputMath[countPlus - 1]);
        System.out.println(inputMath + " = " + resultOfInputMath);

    }

    public static String checkWhatInExpBase(String elementNullAtStringArrayForExp){
        int countSkobochki = 0;
        int countModule = 0;
        String[] countBase = new String[0];
        for (int i = 0; i < elementNullAtStringArrayForExp.length(); i++) {
            if (elementNullAtStringArrayForExp.charAt(i) == '(' || elementNullAtStringArrayForExp.charAt(i) == ')'){
                countSkobochki++;
            } else if (elementNullAtStringArrayForExp.charAt(i) == '|'){
                countModule++;
            }
        }

        if (countSkobochki > 0){
            System.out.println("В основании степень выражение в скобках");
            System.out.println("Определяем, что внутри");
            elementNullAtStringArrayForExp = elementNullAtStringArrayForExp.replace("(", "");
            elementNullAtStringArrayForExp = elementNullAtStringArrayForExp.replace(")", "");

            int checkBaseForMulti = 0;
            int checkBaseForDiv = 0;

            for (int stepCheckBase = 0; stepCheckBase < elementNullAtStringArrayForExp.length(); stepCheckBase++){
                if (elementNullAtStringArrayForExp.charAt(stepCheckBase) == '*'){
                    checkBaseForMulti++;
                } else if (elementNullAtStringArrayForExp.charAt(stepCheckBase) == '/'){
                    checkBaseForDiv++;
                }
            }

            if (checkBaseForMulti > 0){
                checkBaseForDiv = 0;
                countBase = elementNullAtStringArrayForExp.split("[*]");
                System.out.println("Массив для умножения в основании степени: " + Arrays.toString(countBase));

                clr.setMultiplierFirst(Double.parseDouble(countBase[0]));
                clr.setMultiplierSecond(Double.parseDouble(countBase[1]));

                elementNullAtStringArrayForExp = Double.toString(clr.Multiplication(clr.getMultiplierFirst(), clr.getMultiplierSecond()));
                System.out.println("Основание степени: " + elementNullAtStringArrayForExp);
            }

            if (checkBaseForDiv > 0){
                countBase = elementNullAtStringArrayForExp.split("[/]");
                System.out.println("Массив для деления в основании степени: " + Arrays.toString(countBase));

                clr.setDividendFirst(Double.parseDouble(countBase[0]));
                clr.setDivisorSecond(Double.parseDouble(countBase[1]));

                elementNullAtStringArrayForExp = Double.toString(clr.Division(clr.getDividendFirst(), clr.getDivisorSecond()));
                System.out.println("Основание степени: " + elementNullAtStringArrayForExp);
            }
        }

        return elementNullAtStringArrayForExp;
    }
}
