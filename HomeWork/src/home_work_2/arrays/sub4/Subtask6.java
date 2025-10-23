package home_work_2.arrays.sub4;
//Сумма цифр массива
import java.util.Arrays;
import static home_work_2.utils.ArrayUtils.arrayRandom;

public class Subtask6 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50,100);
        System.out.println(Arrays.toString(container));
        int indexArray;
        int result = 0;
        int digits;

        for (indexArray = 0; indexArray < container.length; indexArray++) {
            int element = container[indexArray];
            while (element > 0){
                String elementString = Integer.toString(element);
                for (int i = (elementString.length() - 1); i >= 0; i--) {
                    if (i >= 1) {
                        digits = element / ((int) Math.pow(10, i));
                        System.out.print(digits + " + ");
                    } else {
                        digits = element % 10;
                        if (indexArray != container.length - 1){
                            System.out.print(digits + " + ");
                        } else {
                            System.out.print(digits + " = ");
                        }

                    }
                    element = element - (digits * ((int) Math.pow(10, i)));
                    result = result + digits;
                }
            }
        }
        System.out.println(result);
        System.out.println("Сумма всех цифр элементов массива: " + result);
    }
}
