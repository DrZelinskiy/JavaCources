package home_work_2.arrays.sub4;
//Максимальный из элементов массива с четными индексами
import java.util.Arrays;

import static home_work_2.utils.ArrayUtils.arrayRandom;

public class Subtask2 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50,100);
        System.out.println(Arrays.toString(container));
        int indexArray = 0;
        int resultOfMaxElementInArray = container[0];
        while (indexArray < container.length){
            if (indexArray % 2 != 0){
                if (indexArray <= (container.length - 3)){
                    resultOfMaxElementInArray = Math.max(resultOfMaxElementInArray, container[indexArray + 2]);
                    indexArray++;
                } else {
                    break;
                }
            } else {
                indexArray++;
            }
        }
        System.out.println(resultOfMaxElementInArray);
    }
}
