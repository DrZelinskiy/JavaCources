package home_work_2.task4.subtask2;

import java.util.Arrays;

import static home_work_2.task2.commons.ArrayUtils.*;
import static home_work_2.task4.subtask1.SortUtils.*;

public class SortMain {

    public static int ARRAY_SIZE = 50;

    public static void main(String[] args) {

        int[] testContainer1 = new int[]{1,2,3,4,5};
        int[] testContainer2 = new int[]{1,1,1,1,1};
        int[] testContainer3 = new int[]{9,1,5,99,9,9};
        int[] testContainer4 = new int[]{};
        int[] testContainer5 = new int[]{6,5,4,3,2,1};

        doAllToArray(testContainer1);
        doAllToArray(testContainer2);
        doAllToArray(testContainer3);
        doAllToArray(testContainer4);
        doAllToArray(testContainer5);

        int[] containerRandom = arrayRandom(ARRAY_SIZE,100);
        doAllToArray(containerRandom);

        int[] containerConsole = arrayFromConsole();
        doAllToArray(containerConsole);


    }

    public static void doAllToArray(int[] arrayInput){
        System.out.println("Какой массив был до сортировки");
        System.out.println(Arrays.toString(arrayInput));

        System.out.println("\n" + "Каким стал массив после сортировки");
        shake(arrayInput);
        System.out.println(Arrays.toString(arrayInput));
        
        System.out.println("\n" + "/----------------------------------------------/" + "\n");
    }
}
