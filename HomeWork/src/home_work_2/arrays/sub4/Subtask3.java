package home_work_2.arrays.sub4;

import java.util.Arrays;

import static home_work_2.utils.ArrayUtils.arrayRandom;

//Элементы массива, которые меньше среднего арифметического
public class Subtask3 {

    public static int ARRAY_SIZE = 50;
    public static void main(String[] args) {
        int sumOfElements = 0;
        int[] container = arrayRandom(50, 100);
        System.out.println(Arrays.toString(container));
        for (int element : container){
            sumOfElements += element;
        }
        System.out.println("Сумма элементов массива: " + sumOfElements);
        System.out.println("Среднее арифметическое элементов массива: " + (sumOfElements / ARRAY_SIZE));
        for (int element : container){
            if (element < sumOfElements / ARRAY_SIZE){
                System.out.print(element + " ");
            }
        }
    }
}
