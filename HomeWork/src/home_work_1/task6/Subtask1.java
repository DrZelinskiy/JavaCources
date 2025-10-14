package home_work_1.task6;

//1. Если имя будет равно имени "Вася" тогда в консоль должно вывести сообщение "Привет!" на одной строке, а на второй "Я тебя так долго ждал".
//2. Если имя будет равно имени "Анастасия" тогда в консоль должно вывести сообщение "Я тебя так долго ждал".
//3. В случае если это будет другое имя то вывести сообщение "Добрый день, а вы кто?".

//Написать в отдельном классе main метод и в нём код который будет выполнять общее условие при помощи if else

import java.util.Objects;
import java.util.Scanner;

public class Subtask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя!");
        String myName = console.nextLine();

        if (Objects.equals(myName, "Вася") | Objects.equals(myName, "Анастасия")){
            if (Objects.equals(myName, "Вася")){
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
            } else {
                System.out.println("Я тебя так долго ждал");
            }
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
