package home_work_2.utils;

public class SortUtils {
    public static void sort(int[] arrayInput){
        if (arrayInput == null || arrayInput.length < 2){
            System.out.println("Некорректные данные!");
            return;
        }

        for(int i = 0; i < arrayInput.length; i++){
            for(int j = arrayInput.length - 1; j > i; j--){
                if (arrayInput[j] < arrayInput[j - 1]){
                    int temp = arrayInput[j];
                    arrayInput[j] = arrayInput[j - 1];
                    arrayInput[j - 1] = temp;
                }
            }
        }
    }

    public static void shake(int[] arrayInput){
        if (arrayInput == null || arrayInput.length < 2){
            System.out.println("Некорректные данные!");
            return;
        }

        int lowGround = 0;
        int highGround = arrayInput.length - 1;
        int chekSort = 1;

        while((lowGround < highGround) && chekSort > 0){
            chekSort = 0;

            for (int i = lowGround; i < highGround; i++){
                if (arrayInput[i] > arrayInput[i + 1]){
                    int tmp = arrayInput[i];
                    arrayInput[i] = arrayInput[i + 1];
                    arrayInput[i + 1] = tmp;
                    chekSort++;
                }
            }
            highGround--;

            for (int i = highGround; i > lowGround; i--){
                if (arrayInput[i - 1] > arrayInput[i]){
                    int tmp = arrayInput[i];
                    arrayInput[i] = arrayInput[i - 1];
                    arrayInput[i - 1] = tmp;
                    chekSort++;
                }
            }
            lowGround++;

            if(chekSort == 0){
                break;
            }
        }
    }
}
