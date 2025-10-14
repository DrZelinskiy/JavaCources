package home_work_1.task4;
//Среди трёх чисел найти среднее
import java.util.Scanner;

public class Subtask2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        System.out.println("Введите третье число");
        int c = console.nextInt();

        mediumBetweenThree(a,b,c);

    }

    private static void mediumBetweenThree (int firstIn, int secondIn, int thirdIn) {
        if (firstIn == secondIn && firstIn == thirdIn) {
            System.out.println("Все числа одинаковые! Найти среднее среди них невозможно!");
        } else if ((firstIn < secondIn && secondIn < thirdIn) || (firstIn > secondIn && secondIn > thirdIn)) {
            System.out.println("Число " + secondIn + ", второе введенное число, является средним среди введенных чисел");
        } else if ((firstIn > secondIn && firstIn < thirdIn) || (firstIn > thirdIn && firstIn < secondIn)) {
            System.out.println("Число " + firstIn + ", первое введенное число, является средним среди введенных чисел");
        } else if ((firstIn > secondIn && secondIn < thirdIn)||(firstIn < thirdIn && thirdIn < secondIn)) {
            System.out.println("Число " + thirdIn + ", третье введенное число, является средним среди введенных чисел");
        }
    }
}

//А надо ли проверять равенство двух из трех чисел?