package home_work_1.task4.subtask5;
//Буква или иной символ

import java.util.Scanner;


public class subtask5v1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любую букву или символ!");
        String input = console.nextLine();
        int inputLength = input.length(); //проверяем длину строки, чтобы убедиться, что введен только один символ или буква, иначе программа посчитает, что при вводе двух букв подряд, это будет символ
        System.out.println(inputLength);
        if (inputLength == 1){
            boolean checkForLetterOrSymbol = input.matches("^[a-zA-Zа-яА-Я]$");
            if (checkForLetterOrSymbol) {
                System.out.println("Введена буква!");
            } else {
                System.out.println("Введен символ!");
            }
        } else {
            System.out.println("Введено символов больше, чем один!");
        }
    }
}

//Эту задачу делал ещё до лекции, где было про чар
//Чёт я тогда не подумал, что можно использовать чар, поэтому проверял длину строки
