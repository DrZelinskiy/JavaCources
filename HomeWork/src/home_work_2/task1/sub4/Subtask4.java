package home_work_2.task1.sub4;

import java.util.Scanner;

public class Subtask4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, на которое будем умножать");
        int multiplier = console.nextInt();
        long a = 1;
        long previousStep;
        long nextStep;

        while (true) {
            previousStep = a;
            nextStep = a * multiplier;
            if (nextStep / multiplier != a) {
                System.out.println("Значение до переполнения: " + previousStep);
                System.out.println("Значение после переполнения: " + nextStep);
                break;
            }
            a = nextStep;
        }
    }
}