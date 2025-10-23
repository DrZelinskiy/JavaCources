package home_work_2.loops.sub1;

// Число положительное, максимум long
// Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
// Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
// Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ

import java.util.Scanner;

public class Subtask1 {
    public static void printOutput (long numberInput){
        for (int i = 1; i <= numberInput; i++) {
            if (i != numberInput){
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number = console.nextLong();
        long threshold = Long.MAX_VALUE;
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
            if (result < 0) {
                System.out.println("Результат превышает максимально допустимое значение в " + threshold);
                break;
            }
        }

        if (result > 0){
            printOutput(number);
            System.out.println(result);
        }
    }
}
