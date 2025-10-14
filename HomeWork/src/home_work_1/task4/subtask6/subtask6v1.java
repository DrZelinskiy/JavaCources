package home_work_1.task4.subtask6;
//Определить високосный год или нет

import java.util.Scanner;


public class subtask6v1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год!");
        String year = console.nextLine();
        int inputLength = year.length();
        System.out.println(inputLength);
        int yearToInt = Integer.parseInt(year);  //если введены символы, то ошибка выполнения
        boolean checkYear = year.matches("^[\\d]{1,4}$"); //пока что от нуля до 9999
        if (inputLength <= 4 && checkYear){
            System.out.println("Введен год " + year);
            checkLeapYear(yearToInt);
        } else {
            System.out.println("Величина года превышает допустимый (до 9999)!");
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

