package home_work_2.task2.sub3;

import static home_work_2.task2.commons.ArrayUtils.arrayRandom;
import static home_work_2.task2.commons.IArraysOperation.*;
public class Task3 {
    public static void main(String[] args) {
        int[] container = arrayRandom(50, 100);
        DoWhileOperation(container);
        WhileOperation(container);
        ForOperation(container);
        ForEachOperation(container);
    }
}
