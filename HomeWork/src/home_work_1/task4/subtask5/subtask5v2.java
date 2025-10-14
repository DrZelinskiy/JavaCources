package home_work_1.task4.subtask5;
//Буква или иной символ

import java.util.Scanner;


public class subtask5v2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любую букву или символ!");
        char input = console.nextLine().charAt(0);
        String inputCharAsString = String.valueOf(input);
        System.out.println(inputCharAsString);
        boolean checkForLetterOrSymbol = inputCharAsString.matches("^[a-zA-Zа-яА-Я]$");
        if (checkForLetterOrSymbol) {
            System.out.println("Введена буква!");
        } else {
            System.out.println("Введен символ!");
        }
    }
}

//Этот вариант уже после лекции, где было использовано console.nextLine.charAt(0)
//Да, оно берет конечно первый символ, но все равно переводить чар в строку, единственное, что длину проверять не надо, и можно сколько угодно символов вводить.
//Но как вариант вводить несколько символов и разбивать и проверять каждый например, тоже прикольно char[] charArray = str.toCharArray();
