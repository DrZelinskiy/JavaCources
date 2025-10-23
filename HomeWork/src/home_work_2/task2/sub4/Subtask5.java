package home_work_2.task2.sub4;

import java.util.Arrays;
import java.util.Scanner;

import static home_work_2.task2.commons.ArrayUtils.arrayRandom;

//Сжать массив, удалив элементы, принадлежащие интервалу
public class Subtask5 {

    public static int SIZE_ARAY = 50;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] container = arrayRandom(SIZE_ARAY,100);
        int[] shrinkContainer = new int[SIZE_ARAY];

        int indexArray = 0;

        System.out.println(Arrays.toString(container));

        System.out.println("Введите границы интервала!");
        int lowGround = console.nextInt();
        if (lowGround < 0 || lowGround > container.length){
            System.out.println("Введено недопустимое значение!");
            System.out.println("Выход!");
            System.exit(500);
        }

        int highGround = console.nextInt();
        if (highGround < lowGround || highGround > container.length){
            System.out.println("Введено недопустимое значение!");
            System.out.println("Выход!");
            System.exit(500);
        }
        System.out.printf("Интервал номеров элементов: [%s,%s] \n", lowGround, highGround);

        for (indexArray = 0; indexArray < container.length; indexArray++) {
            if (indexArray < lowGround - 1){
                shrinkContainer[indexArray] = container[indexArray];
            } else if (indexArray >= highGround){
                shrinkContainer[indexArray - (highGround - lowGround) - 1] = container[indexArray];
            } else {
                shrinkContainer[indexArray + (SIZE_ARAY - highGround)] = 0;
            }
        }
        System.out.println("'Сжатый' массив!");
        System.out.println(Arrays.toString(shrinkContainer));
    }
}
