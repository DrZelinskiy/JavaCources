package home_work_1.task4;
//Проверка делимости одного числа на другое

import java.util.Scanner;

public class Subtask3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();

        boolean result = checkDel(a,b);
        if (result) {
            System.out.println("Первое число a=" + a + " делится на второе число b=" + b + " по признаку делимости");
        } else {
            System.out.println("Первое число a=" + a + " не делится на второе число b=" + b + " по признаку делимости");
        }
    }

    public static boolean checkDel (int firstIn, int secondIn) {
        return firstIn % secondIn == 0;
    }
}
