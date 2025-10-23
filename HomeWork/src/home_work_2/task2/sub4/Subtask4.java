package home_work_2.task2.sub4;

import java.util.Arrays;

import static home_work_2.task2.commons.ArrayUtils.arrayRandom;

//Найти два наименьших (минимальных) элемента массива
public class Subtask4 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50, 100);
        System.out.println(Arrays.toString(container));
        int indexArray = 0;
        int tmp = 0;
        int minElementInArrayFirst = container[0];
        int counterOfMinFirstElement = 0;
        int minElementInArraySecond = container[0];
        while (indexArray < container.length){
            if (indexArray <= (container.length - 2)){
                minElementInArrayFirst = Math.min(minElementInArrayFirst, container[indexArray + 1]);
                indexArray++;
            } else {
                indexArray++;
            }
        }
        System.out.println("Первый минимальный элемент массива: " + minElementInArrayFirst);
        indexArray = 0;

        while (indexArray < container.length){
            if (container[indexArray] == minElementInArrayFirst){
                counterOfMinFirstElement++;
                if (counterOfMinFirstElement > 1){
                    minElementInArraySecond = minElementInArrayFirst;
                    System.out.println("Второй минимальный элемент массива: " + minElementInArraySecond);
                    System.out.println("Первый и второй минимальный элементы равны");
                    break;
                }
            }
            indexArray++;
        }
        indexArray = 0;
        while (indexArray < container.length){
            if (indexArray <= (container.length - 2)){
                if (minElementInArrayFirst == container[indexArray + 1]){
                    indexArray++;
                } else {
                    minElementInArraySecond = Math.min(minElementInArraySecond, container[indexArray + 1]);
                    if (minElementInArraySecond <= minElementInArrayFirst){
                        indexArray++;
                    } else {
                        tmp = minElementInArraySecond;
                        indexArray++;
                    }
                }
            } else {
                indexArray++;
            }
        }

        if (counterOfMinFirstElement < 2){
            minElementInArraySecond = tmp;
            System.out.println("Второй минимальный элемент массива: " + minElementInArraySecond);
        }
    }
}
