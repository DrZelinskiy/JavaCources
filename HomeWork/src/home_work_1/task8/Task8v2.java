package home_work_1.task8;

//Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа.
//В методе можно использовать только обычную математику которая описана в теории.
//Если число отрицательное то вернуть дополнительный код. Теория https://planetcalc.ru/747. Пример:
//	8.1 Вводим: 42.  Возвращает: 00101010
//	8.2 Вводим: 15.  Возвращает: 00001111
//	8.3 Вводим: -42. Возвращает: 11010110
//	8.4 Вводим: -15. Возвращает: 11110001

import java.util.Scanner;
//Это рабочий с выводом дополнительного кода через перебор элементов массива
public class Task8v2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для конвертации");
        byte inputNumber = console.nextByte();
        System.out.println(toBinaryString(inputNumber));
    }


    public static String toBinaryString (byte convNumber) {
        //Будем проверять [-128,127], то есть [10000000;01111111]
        int[] arrayOfBinForValue = new int[8];
        byte dig;
        int negConvNumber = convNumber;
        String result = " ";
        System.out.print(convNumber + "  ");
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
            // Вывод двоичного представления положительного числа не производится, так как он происходит дальше в конечном выводе.
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
            // Вывод двоичного представления отрицательного числа для (обратный код) для визуального (ручного) исчисления дополнительного кода.
            for (int element : arrayOfBinForValue) {
                System.out.print(element);
            }
            System.out.println(" ");
        }

        // Побитовая конвертация обратного кода отрицательного числа
        if (negConvNumber < 0){
            // Используется новая переменная на проверки отрицательного числа,
            // так как переданная ранее переменная для бинарного представления числа, в этом сценарии отрицательного,
            // после вычисления обратного кода равняется нулю и не может использоваться для передачи как отрицательнго.
            System.out.print(negConvNumber + "  ");
            for (int k = arrayOfBinForValue.length - 1; k >= 1; k--){

                if (arrayOfBinForValue[k] == 0){
                    arrayOfBinForValue[k] = 1;
                    break;
                } else {
                    arrayOfBinForValue[k] = 0;
                    if (arrayOfBinForValue[k-1] == 0){
                        arrayOfBinForValue[k-1] = 1;
                        break;
                    } else {
                        arrayOfBinForValue[k] = 0;
                        arrayOfBinForValue[k-1] = 1;
                    }
                }
            }
        }
        for (int element : arrayOfBinForValue) {
            System.out.print(element);
        }
        return result;
    }
}
