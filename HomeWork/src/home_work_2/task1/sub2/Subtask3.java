package home_work_2.task1.sub2;

//  Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
//  и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
//  Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.

//  1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//	1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//	1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

import java.util.Scanner;

public class Subtask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        String numberInput = console.next(); //181232375
        if(numberInput.matches("^[a-zA-Zа-яА-Я].+")){
            System.out.println("Введено не число");
        } else {
            double numberToDouble = Double.parseDouble(numberInput);
            int numberToInt = (int) numberToDouble;
            String stringNumberToInt = Integer.toString(numberToInt);
            if (stringNumberToInt.matches("^\\d+$")) {
                if (numberToDouble % numberToInt == 0) {
                    long result = 1;
                    int digits;
                    for (int i = (numberInput.length() - 1); i >= 0; i--) {
                        if (i >= 1) {
                            digits = (int) numberToDouble / ((int) Math.pow(10, i));
                            System.out.print(digits + " * ");
                        } else {
                            digits = (int) numberToDouble % 10;
                            System.out.print(digits);
                        }
                        numberToDouble = numberToDouble - (digits * ((int) Math.pow(10, i)));
                        result = result * digits;
                    }
                    System.out.print(" = " + result);
                    System.out.println(" ");
                } else {
                    System.out.println("Введено не целое число");
                }
            }
        }
    }
}
