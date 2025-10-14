package home_work_1.task4.subtask6;
//Определить високосный год или нет

import java.util.Scanner;


public class subtask6v2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год!");
        int year = console.nextInt();
        if (year > 0){
            System.out.println("Введен год нашей эры: " + year + " C.E.");
            checkLeapYear(year);
        } else  if (year < 0){
            System.out.println("Введен год до нашей эры: " + Math.abs(year) + " B.C.");
            year = Math.abs(year);
            checkLeapYear(year);
        } else {
            System.out.println("Нулевого года не существует!");
        }
    }

    public static void checkLeapYear (int input){
        System.out.println("Проверяем високосный ли год");
        boolean firstCheck = input % 4 == 0;
        boolean secondCheck = input % 100 != 0;
        if (firstCheck && secondCheck){
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный");
        }
    }
}
