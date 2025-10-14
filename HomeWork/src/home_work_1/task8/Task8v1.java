package home_work_1.task8;

//Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
//В методе можно использовать только обычную математику которая описана в теории.
//Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
//	8.1 Вводим: 42.  Возвращает: 00101010
//	8.2 Вводим: 15.  Возвращает: 00001111
//	8.3 Вводим: -42. Возвращает: 11010110    -42  11010101
//	8.4 Вводим: -15. Возвращает: 11110001


import java.util.Scanner;
//Код с поиском дополнительного кода для отрицательных чисел с использованием закономерности
public class Task8v1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для конвертации");
        byte inputNumber = console.nextByte();
        byte inputNumberIfNegative = inputNumber;

        if (inputNumber >= 0) {
            if (inputNumber == 0){
                System.out.println("Введен ноль!");
            } else {
                System.out.println("Число " + inputNumber + " положительное! Выводим двоичное представление!");
            }
            System.out.println(toBinaryString(inputNumber));
        } else {
            System.out.println("Число " + inputNumber + " отрицательное! Выводим дополнительный код!");
            inputNumber = (byte) (inputNumberIfNegative + 1); //закономерность по отрицательным числам и доп кодам
            System.out.println(toBinaryString(inputNumber));
        }
    }


    public static String toBinaryString (byte convNumber) {
        //Будем проверять [-128,127], то есть [10000000;01111111]
        int[] arrayOfBinForValue = new int[8];
        byte dig;
        int convNumberIfNegative = convNumber - 1; //для отобржаения в sout

        String result = " ";
        if (convNumber > 0){
            System.out.print(convNumber + "  ");
        } else if (convNumber < 0){
            System.out.print(convNumberIfNegative + "  ");
        } else {
            System.out.print("0  ");
        }

        if (convNumber > 0){
            // Двоичное представление положительного числа
            for (int j = arrayOfBinForValue.length - 1; j >= 0; j--) {
                if(convNumber % 2 == 0){
                    dig = 0;
                    convNumber = (byte) (convNumber / 2);
                } else {
                    dig = 1;
                    convNumber = (byte) (convNumber / 2);
                }
                arrayOfBinForValue[j] = dig;
            }
        } else {
            // Двоичное представление отрицательного числа
            for (int j = arrayOfBinForValue.length - 1; j >= 0; j--) {
                if(convNumber % 2 == 0){
                    dig = 1;
                    convNumber = (byte) (convNumber / 2);
                } else {
                    dig = 0;
                    convNumber = (byte) (convNumber / 2);
                }
                arrayOfBinForValue[j] = dig;
            }
        }

        for (int element : arrayOfBinForValue) {
            System.out.print(element);
        }
        return result;
    }
}
