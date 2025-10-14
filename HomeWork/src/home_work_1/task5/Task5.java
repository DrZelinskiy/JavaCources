package home_work_1.task5;
/*
    Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
	5.1 Данный метод будет принима два параметра
	5.2 Будет отвечать на вопрос спать ли дальше (да\нет) (возвращать true либо false).
	5.3 Первый параметр boolean weekday обозначает рабочий день
	5.4 Второй параметр boolean vacation обозначает отпуск.
	5.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
	5.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
*/

import java.util.Objects;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        System.out.println("У вас завтра день отпуска? (Да/Нет)");
        Scanner console = new Scanner(System.in);
        String isVacation = console.nextLine();
        if (Objects.equals(isVacation, "Да") | Objects.equals(isVacation, "Нет")){
            if (Objects.equals(isVacation, "Да")){
                System.out.println("Отдыхаем дальше");
            } else {
                console = new Scanner(System.in);
                System.out.println("Введите день недели!");
                String day = console.nextLine();
                checkDayForWorkOrDayOff(day);
            }
        } else {
            System.out.println("Введено некорректное значение! Введите 'Да/Нет'!");
        }
    }
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if (!weekday && vacation){
            System.out.println("Отдыхаем дальше");
            return true;
        }
        System.out.println("Пора идти на работу");
        return false;
    }

    public static void checkDayForWorkOrDayOff (String chosenDay){

        boolean workDay;
        boolean dayOff;

        switch (chosenDay) {
            case "Понедельник":
            case "Вторник":
            case "Среда":
            case "Четверг":
            case "Пятница":
                System.out.println("Проверяем, рабочий ли завтра день или выходной по графику 5/2");
                System.out.println(chosenDay + " – Рабочий день!");
                workDay = true;
                dayOff = false;
                sleepIn(workDay, dayOff);
                break;
            case "Суббота":
            case "Воскресенье":
                System.out.println("Проверяем, рабочий ли завтра день или выходной по графику 5/2");
                System.out.println(chosenDay + " – Выходной день!");
                workDay = false;
                dayOff = true;
                sleepIn(workDay, dayOff);
                break;
            default:
                System.out.println("Введен не день недели!");
                System.exit(0);
                break;
        }
    }
}
