package home_work_2.arrays.sub3;

public class IArraysOperation {
    public static void DoWhileOperation(int[] arrayInput){
        //Вывести все элементы в консоль.
        int lengthDoWhile = 0;
        System.out.println("Вывод элементов через do...while");
        do {
            System.out.print(arrayInput[lengthDoWhile] + " ");
            lengthDoWhile++;
        } while (lengthDoWhile < arrayInput.length);
        System.out.println("\n" + "/----------------------------------/" + "\n");

        //Вывести каждый второй элемент массива в консоль
        lengthDoWhile = 0;
        System.out.println("Вывод каждого второго элемента массива через do...while");
        do {
            if (lengthDoWhile % 2 != 0){
                System.out.print(arrayInput[lengthDoWhile] + " ");
            }
            lengthDoWhile++;
        } while (lengthDoWhile < arrayInput.length);
        System.out.println("\n" + "/----------------------------------/" + "\n");

        //Вывести все элементы массива в консоль в обратном порядке
        lengthDoWhile = arrayInput.length - 1;
        System.out.println("Вывод элементов массива в обратном порядке через do...while");
        do {
            System.out.print(arrayInput[lengthDoWhile] + " ");
            lengthDoWhile--;
        } while (lengthDoWhile >= 0);
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }

    public static void WhileOperation(int[] arrayInput){
        int lengthWhile = 0;
        System.out.println("Вывод элементов через while");
        while (lengthWhile < arrayInput.length){
            System.out.print(arrayInput[lengthWhile] + " ");
            lengthWhile++;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        lengthWhile = 0;
        System.out.println("Вывод каждого второго элемента массива через while");
        while (lengthWhile < arrayInput.length){
            if (lengthWhile % 2 != 0){
                System.out.print(arrayInput[lengthWhile] + " ");
            }
            lengthWhile++;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        lengthWhile = arrayInput.length - 1;
        System.out.println("Вывод элементов массива в обратном порядке через while");
        while (lengthWhile >= 0){
            System.out.print(arrayInput[lengthWhile] + " ");
            lengthWhile--;
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }

    public static void ForOperation(int[] arrayInput){
        System.out.println("Вывод элементов через for");
        for (int i = 0; i < arrayInput.length; i++) {
            System.out.print(arrayInput[i] + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод каждого второго элемента массива через for");
        for (int i = 0; i < arrayInput.length; i++) {
            if (i % 2 != 0){
                System.out.print(arrayInput[i] + " ");
            }
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов массива в обратном порядке через for");
        for (int i = arrayInput.length - 1; i >= 0; i--) {
            System.out.print(arrayInput[i] + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }

    public static void ForEachOperation(int[] arrayInput){
        System.out.println("Вывод элементов через foreach");
        for (int element : arrayInput) {
            System.out.print(element + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод каждого второго элемента массива через foreach");
        int indexArray = 0;
        for (int elementForEverySecond : arrayInput) {
            if (indexArray % 2 != 0) {
                System.out.print(elementForEverySecond + " ");
                indexArray++;
            } else {
                indexArray++;
            }
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");

        System.out.println("Вывод элементов массива в обратном порядке через foreach");
        //foreach перечисляет элементы только сначала, поэтому для вывода обратного массива нужно сделать обратный массив
        //а затем просто вывести этот "обратный" массив
        int[] arrayInputReverse = new int[arrayInput.length];
        for (int i = 0; i < arrayInput.length; i++) {
            arrayInputReverse[i] = arrayInput[(arrayInput.length - 1) - i];
        }
        for (int elementForReverse : arrayInputReverse) {
            System.out.print(elementForReverse + " ");
        }
        System.out.println("\n" + "/----------------------------------/" + "\n");
    }
}
