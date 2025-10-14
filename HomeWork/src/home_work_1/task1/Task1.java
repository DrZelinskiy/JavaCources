package home_work_1.task1;

//1.1 Создать класс и написать код с вводом двух чисел через консоль и применением побитовых операций И и ИЛИ к этим двум числам. Результат операций распечатать.
//1.2 В комментариях напротив каждого ввода значений написать пример выбранного числа в двоичном коде (8 бит), также написать комметарии напротив каждой операции на примере этих двух чисел.
//1.3 В отдельном классе попробуйте сделать побитовую операцию с литералом 42.5, опишите результат в комментариях в классе с заданием.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNum = console.nextInt(); //25 0x11001
        System.out.println("Первое число: " + firstNum);

        System.out.println("Введите второе число");
        int secondNum = console.nextInt(); //14 0x01110
        System.out.println("Второе число: " + secondNum);

        doBinConvert(firstNum);
        doBinConvert(secondNum);

        int resultAnd = firstNum & secondNum;
        //25   0x11001
        //14   0x01110
        //     0x01000  8

        System.out.println("Результат операции И: " + resultAnd);
        doBinConvert(resultAnd);

        int resultOr = firstNum | secondNum;
        //25   0x11001
        //14   0x01110
        //     0x11111  31
        System.out.println("Результат операции ИЛИ: " + resultOr);
        doBinConvert(resultOr);
    }

    //Литерал 42.5 не вялется допустимым типом данных для побитовых опреаций так как он не относится к целочисленному типу (byte, short, int, long)

    public static void doBinConvert (int convNumber) {
        String binary = String.format("%8s", Integer.toBinaryString(convNumber).replace(' ','0'));
        System.out.println("Вывод " + convNumber + " в двоичной системе " + binary);
    }
}