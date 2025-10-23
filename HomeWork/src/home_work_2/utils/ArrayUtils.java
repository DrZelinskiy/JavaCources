package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int sizeArray = console.nextInt();
        int[] arrayConsole = new int[sizeArray];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < arrayConsole.length; i++) {
            int arrayConsoleElement = console.nextInt();
            arrayConsole[i] =  arrayConsoleElement;
        }
        return arrayConsole;
    }

    public static int[] arrayRandom(int size, int maxValueExclusion){
        int[] arrayRand = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arrayRand[i] = rand.nextInt(maxValueExclusion);
        }
        return arrayRand;
    }

}
