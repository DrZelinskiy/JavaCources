package home_work_2.arrays.sub4;
//Сумма четных положительных элементов массива
import java.util.Arrays;

import static home_work_2.utils.ArrayUtils.arrayRandom;
public class Subtask1 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50,100);
        System.out.println(Arrays.toString(container));
        int sumOfEverySecondElement = 0;
        int indexArray = 0;
        for (int element : container){
            if (indexArray % 2 != 0){
                if (element > 0){
                    sumOfEverySecondElement += element;
                    System.out.print(element + " ");
                    indexArray++;
                }
            } else {
                indexArray++;
            }
        }
        System.out.println("\n" + "Сумма четных положительных элементов массива: " + sumOfEverySecondElement);
    }
}
