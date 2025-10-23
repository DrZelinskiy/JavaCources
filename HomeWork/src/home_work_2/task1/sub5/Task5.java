package home_work_2.task1.sub5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static float PROB_OF_1000 = 1000;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Поиск максимальной цифры в введенном числе");
        System.out.println("Введите число");
        long number = console.nextLong();
        maxDigit(number);

        System.out.println("/------------------------------------/" + "\n");

        System.out.println("Вероятность четных случайных чисел");
        randomOddProbability();

        System.out.println("/------------------------------------/" + "\n");

        System.out.println("Подсчет четных и нечетных цифр в числе");
        number = console.nextLong();
        digitsOddEvenCounter(number);

        System.out.println("/------------------------------------/" + "\n");

        System.out.println("Ряд Фибоначчи");
        System.out.println("Введите количество выводимых элементов ряда");
        int quantity = console.nextInt();
        sequenceFibonacci(quantity);

        System.out.println("/------------------------------------/" + "\n");

        System.out.println("Вывод последовательность чисел с шагом, задаваемым пользователем");
        System.out.println("Минимальное значение последовательности");
        int sequenseMin = console.nextInt();
        System.out.println("Введите максимальное значние (границу) последовательности");
        int sequenceMax = console.nextInt();
        System.out.println("Введите шаг последовательности");
        int step = console.nextInt();
        sequenceWithStep(sequenseMin,sequenceMax,step);
        System.out.println("/------------------------------------/" + "\n");

        System.out.println("Вывод 'перевернутого' числа");
        System.out.println("Введите число");
        int revertNumber = console.nextInt();
        numberReversion(revertNumber);
        System.out.println("/------------------------------------/" + "\n");


    }

    public static void maxDigit (long inputNumber){
        //Поиск максимальной цифры в введенном числе
        long result = -1;
        long inputNumberOut = inputNumber;

        while (inputNumber > 0){
            long tmp = inputNumber % 10;
            if (tmp > result){
                result = tmp;
            }
            inputNumber = inputNumber / 10;
        }
        System.out.println("Максимальная цифра в числе " + inputNumberOut + " : " + result);
    }

    public static void randomOddProbability (){
        //Вероятность четных случайных чисел
        Random rand = new Random();
        int counterOdd = 0;
        int counterEven = 0;
        for (int i = 1; i <= 1000; i++) {
            int randomNumber = rand.nextInt(1000);
            System.out.print(randomNumber + " ");
            if (randomNumber % 2 == 0){
                counterOdd++;
            } else {
                counterEven++;
            }
        }
        System.out.println(" ");
        System.out.println("Количество четных чисел: " + counterOdd);
        System.out.println("Количество нечетных чисел: " + counterEven);

        float probabilityOdd = (counterOdd / PROB_OF_1000) * 100;
        System.out.println("Вероятность получения случайных положительных чисел в этой выборке: " + probabilityOdd + "%");
    }

    public static void digitsOddEvenCounter (long inputNumber){
        //Поичск количества четных и нечетных цифр введенного числа
        int counterOdd = 0;
        int counterEven = 0;

        while (inputNumber > 0){
            long tmp = inputNumber % 10;
            if (tmp % 2 == 0){
                counterOdd++;
            } else {
                counterEven++;
            }
            inputNumber = inputNumber / 10;
        }
        System.out.println("Количество четных чисел: " + counterOdd);
        System.out.println("Количество нечетных чисел: " + counterEven);
    }

    public static void sequenceFibonacci (int quantityNumber) {
        //1 2 3 5 8 13
        int sequenceElementCurrent = 0;
        int sequenceElementPrevios = 0;
        int sequenceElementNext;
        int sequenceElement = 1;
        if (quantityNumber == 1){
            System.out.println(sequenceElement);
        } else {
            for (int i = 1; i <= quantityNumber; i++) {
                if (i == 1){
                    sequenceElementPrevios = sequenceElement;
                    System.out.print(sequenceElement + " ");
                    sequenceElementNext = sequenceElement + 1;
                    System.out.print(sequenceElementNext + " ");
                    sequenceElementCurrent = sequenceElementNext;
                } else {
                    sequenceElementNext = sequenceElementCurrent + sequenceElementPrevios;
                    sequenceElementPrevios = sequenceElementCurrent;
                    sequenceElementCurrent = sequenceElementNext;
                    System.out.print(sequenceElementNext + " ");
                }
            }
        }
        System.out.println(" ");
    }

    public static void sequenceWithStep (int minInput, int maxInput, int stepInput){
        System.out.println("Вывод последовательности с шагом " + stepInput);
        int sequenceStepNext = 0;
        int sequenceStepCurrent = minInput;
        if (minInput == maxInput){
            System.out.println("Введены недопустимые данные!");
        } else {
            System.out.print(sequenceStepCurrent + " ");
            while (true){
                sequenceStepNext = sequenceStepCurrent + stepInput;
                if (sequenceStepNext < maxInput){
                    System.out.print(sequenceStepNext + " ");
                    sequenceStepCurrent = sequenceStepNext;
                } else {
                    break;
                }
            }
        }
    }

    public static void numberReversion (int numberInput){
        String inputNumberString = String.valueOf(numberInput);
        int digits;
        System.out.print("'Перевернутое' число: ");
        for (int i = 1; i <= inputNumberString.length(); i++) {
            digits = numberInput % 10;
            System.out.print(digits);
            numberInput = numberInput / 10;
        }
        System.out.println(" ");
    }
}
