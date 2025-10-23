package home_work_2.arrays.sub2;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class ArraysIteration {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        allElements(container);
        everySecondElement(container);
        visaVersaElements(container);
    }

    public static void allElements(int[] arrayInput){
        //do....while, while, for, foreach
        //Вывести все элементы в консоль.
        int lengthDoWhile = 0;
        int lengthWhile = 0;
        System.out.println("Вывод элементов через do...while");
        do {
            System.out.print(arrayInput[lengthDoWhile] + " ");
            lengthDoWhile++;
        } while (lengthDoWhile < arrayInput.length);
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов через while");
        while (lengthWhile < arrayInput.length){
            System.out.print(arrayInput[lengthWhile] + " ");
            lengthWhile++;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов через for");
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов через foreach");
        for (int element : arrayInput) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

    }

    public static void everySecondElement(int[] arrayInput){
        //Вывести каждый второй элемент массива в консоль
        int lengthDoWhile = 0;
        int lengthWhile = 0;
        System.out.println("Вывод каждого второго элемента массива через do...while");
        do {
            if (lengthDoWhile % 2 != 0){
                System.out.print(arrayInput[lengthDoWhile] + " ");
            }
            lengthDoWhile++;
        } while (lengthDoWhile < arrayInput.length);
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод каждого второго элемента массива через while");
        while (lengthWhile < arrayInput.length){
            if (lengthWhile % 2 != 0){
                System.out.print(arrayInput[lengthWhile] + " ");
            }
            lengthWhile++;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод каждого второго элемента массива через for");
        for (int i = 0; i < arrayInput.length; i++) {
            if (i % 2 != 0){
                System.out.print(arrayInput[i] + " ");
            }
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод каждого второго элемента массива через foreach");
        int indexArray = 0;
        for (int element : arrayInput) {
            if (indexArray % 2 != 0){
                System.out.print(element + " ");
                indexArray++;
            } else {
                indexArray++;
            }
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }

    public static void visaVersaElements(int[] arrayInput){
        //Вывести все элементы массива в консоль в обратном порядке
        int lengthDoWhile = arrayInput.length - 1;
        int lengthWhile = arrayInput.length - 1;
        System.out.println("Вывод элементов массива в обратном порядке через do...while");
        do {
            System.out.print(arrayInput[lengthDoWhile] + " ");
            lengthDoWhile--;
        } while (lengthDoWhile >= 0);
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов массива в обратном порядке через while");
        while (lengthWhile >= 0){
            System.out.print(arrayInput[lengthWhile] + " ");
            lengthWhile--;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов массива в обратном порядке через for");
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            System.out.print(arrayInput[i] + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов массива в обратном порядке через foreach");
        //foreach перечисляет элементы только сначала, поэтому для вывода обратного массива нужно сделать обратный массив
        //а затем просто вывести этот "обратный" массив
        int[] arrayInputReverse = new int[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arrayInputReverse[i] = arrayInput[(arrayInput.length - 1) - i];
        }
        for (int element : arrayInputReverse) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }
}
