package home_work_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

import static home_work_4.DataContainer.sort;

public class DataContainerMain {

    public static void main(String[] args) {

        // Task 4.1
        Integer[] input1 = {1, 2, 3, null, null, null};
        DataContainer<Integer> container1 = new DataContainer<>(input1);

        // 4.1.1
        System.out.println("Task 4.1.1: output " + container1.add(777)); //output 3
        System.out.println(Arrays.toString(container1.getItems()) + "\n");

        // 4.1.2
        System.out.println("Task 4.1.2: output " + container1.add(null)); //output -1
        System.out.println(Arrays.toString(container1.getItems()) + "\n");

        // 4.1.3
        Integer[] input2 = {1, null, 3, null, null, null};
        DataContainer<Integer> container2 = new DataContainer<>(input2);

        System.out.println("Task 4.1.3: output " + container2.add(777)); //output 1
        System.out.println(Arrays.toString(container2.getItems()) + "\n");

        // Task 4.2
        //
        // Task 4.2.1
        Integer[] input3 = {1, 2, 3};
        DataContainer<Integer> container3 = new DataContainer<>(input3);
        System.out.println("Task 4.2.1: output " + container3.add(777)); //output 3
        System.out.println(Arrays.toString(container3.getItems()) + "\n");

        // Task 4.2.2
        Integer[] input4 = {};
        DataContainer<Integer> container4 = new DataContainer<>(input4);
        System.out.println("Task 4.2.2: output " + container4.add(777)); //output 0
        System.out.println(Arrays.toString(container4.getItems()) + "\n");

        // Task 5
        Integer[] input5 = {};
        DataContainer<Integer> container5 = new DataContainer<>(input5);
        System.out.println("Task 5.1 output ADD method: " + container5.add(9999)); //output 0
        System.out.println("Task 5.1 output GET method: " + container5.get(0)); //output 9999
        System.out.println(Arrays.toString(container5.getItems()));
        System.out.println("Task 5.2 output GET method: " + container5.get(1) + "\n"); //output null

        // Task 6
        // Возьмем массив container1
        System.out.println("Task 6: " + Arrays.toString(container1.getItems()) + "\n");

        // Task 7
        //
        // Task 7.1 (7.1.1)
        Integer[] input6 = {1, 2, 3, 777};
        DataContainer<Integer> container6 = new DataContainer<>(input6);

        System.out.println("Task 7.1: output " + container6.delete(3)); // output true
        System.out.println(Arrays.toString(container6.getItems()) + "\n");

        // Task 7.2 (7.2.1)
        Integer[] input7 = {1, 2, 3, 777};
        DataContainer<Integer> container7 = new DataContainer<>(input6);

        System.out.println("Task 7.2: output " + container7.delete(9)); // output false
        System.out.println(Arrays.toString(container7.getItems()) + "\n");

        // Task 7.3 (7.3.1)
        System.out.println("Task 7.3: output " + container7.delete(2)); // output true
        System.out.println(Arrays.toString(container7.getItems()) + "\n");

        // Task 8
        Integer[] input811 = {1, 2, 3, 777};
        DataContainer<Integer> container811 = new DataContainer<>(input811);

        Integer[] input812 = {1, 2, 3, 777, null};
        DataContainer<Integer> container812 = new DataContainer<>(input812);

        Integer[] input82 = {1, 2, 3, 777};
        DataContainer<Integer> container82 = new DataContainer<>(input82);

        Integer[] input83 = {1, 2, 3, 777};
        DataContainer<Integer> container83 = new DataContainer<>(input83);

        Integer[] input84 = {1, 2, 3, 777, 3};
        DataContainer<Integer> container84 = new DataContainer<>(input84);

        // Task 8.1
        // Task 8.1.1
        System.out.println("Task 8.1.1: output " + container811.delete(null)); // output false
        System.out.println(Arrays.toString(container811.getItems()) + "\n");

        // Task 8.1.2
        System.out.println("Task 8.1.2: output " + container812.delete(null)); // output false
        System.out.println(Arrays.toString(container812.getItems()) + "\n");

        // Task 8.2
        System.out.println("Task 8.2: output " + container82.delete((Integer) 777)); // output true
        System.out.println(Arrays.toString(container82.getItems()) + "\n");

        // Task 8.3
        System.out.println("Task 8.3: output " + container83.delete((Integer) 111)); // output true
        System.out.println(Arrays.toString(container83.getItems()) + "\n");

        //Task 8.3
        System.out.println("Task 8.4: output " + container84.delete((Integer) 3)); // output true
        System.out.println(Arrays.toString(container84.getItems()) + "\n");

        // Task 9
        Integer[] input91 = {3, 1, 3, 777};
        DataContainer<Integer> container91 = new DataContainer<>(input91);

        String[] input92 = {"i", "hello", "1", "Как домашка"};
        DataContainer<String> container92 = new DataContainer<>(input92);

        // Task 9.1
        System.out.println("Task 9.1");
        System.out.println("До сортировки: " + Arrays.toString(container91.getItems()));
        container91.sort(Comparator.naturalOrder());
        System.out.println("После сортировки: " + Arrays.toString(container91.getItems()) + "\n");

        // Task 9.2
        System.out.println("Task 9.2");
        System.out.println("До сортировки: " + Arrays.toString(container92.getItems()));
        container92.sort(Comparator.comparing(String::length));
        System.out.println("После сортировки: " + Arrays.toString(container92.getItems()) + "\n");

        // Task 10
        Integer[] input101 = {1, 2, 3, 777, 3};
        DataContainer<Integer> container101 = new DataContainer<>(input101);

        Integer[] input102 = {1, 2, 3, null};
        DataContainer<Integer> container102 = new DataContainer<>(input102);

        Integer[] input103 = {};
        DataContainer<Integer> container103 = new DataContainer<>(input103);

        // Task 10.1
        System.out.println("Task 10.1: output " + container101 + "\n");

        // Task 10.2
        System.out.println("Task 10.2: output " + container102 + "\n");

        // Task 10.3
        System.out.println("Task 10.3: output " + container103 + "\n");

        // Task 11
        Integer[] input11 = {3, 29, 1, 98, 7, 42, 13, 24, 5};
        DataContainer<Integer> container11 = new DataContainer<>(input11);
        System.out.println("Task 11");
        System.out.println("До сортировки: " + Arrays.toString(container11.getItems()));
        sort(container11);
        System.out.println("После сортировки: " + Arrays.toString(container11.getItems()) + "\n");

        // Task 12
        Integer[] input12 = {3, 29, 1, 98, 7, 42, 13, 24, 5};
        DataContainer<Integer> container12 = new DataContainer<>(input12);
        System.out.println("Task 12");
        System.out.println("До сортировки: " + Arrays.toString(container12.getItems()));
        sort(container12, Comparator.reverseOrder());
        System.out.println("После сортировки: " + Arrays.toString(container12.getItems()) + "\n");

        // Task 13
        Integer[] input13 = {3, 29, 1, 98, 7, 42, 13, 24, 5};
        DataContainer<Integer> container13 = new DataContainer<>(input13);

        Iterator<Integer> iterator = container13.iterator();

        System.out.print("Task 13 output: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}
