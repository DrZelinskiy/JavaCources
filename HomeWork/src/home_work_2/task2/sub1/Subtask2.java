package home_work_2.task2.sub1;

import java.util.Arrays;

import static home_work_2.task2.commons.ArrayUtils.arrayRandom;

public class Subtask2 {
    public static void main(String[] args) {

        /*Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arraySize = console.nextInt();
        System.out.println("Введите врехнюю границу диапазона чисел для заполнения массива");
        int arrayMaxBound = console.nextInt();
        int[]container = arrayRandom(arraySize, arrayMaxBound)*/

        int[] container = arrayRandom(5,100);
        System.out.println(Arrays.toString(container));

    }
}
