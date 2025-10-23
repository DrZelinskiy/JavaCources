package home_work_2.loops.sub2;

//  Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой
//  и вывести ход вычислений в консоль. Пользователь обязан ввести целое число.
//  Если ввели не целое то выдать сообщение о том что пользователь ввёл некорректные данные.

//  1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//	1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//	1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

import java.util.Scanner;

public class Subtask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        int number = console.nextInt(); //181232375
        long result = 1;
        int digits;
        String numberString = Integer.toString(number);
        System.out.println(numberString.length());

        for (int i = (numberString.length() - 1); i >= 0; i--) {
            if (i >= 1) {
                digits = number / ((int) Math.pow(10, i));
                System.out.print(digits + " * ");
            } else {
                digits = number % 10;
                System.out.print(digits);
            }
            number = number - (digits * ((int) Math.pow(10, i)));
            result = result * digits;
        }
        System.out.print(" = " + result);
    }
}
