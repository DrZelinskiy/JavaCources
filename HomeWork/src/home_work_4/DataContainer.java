package home_work_4;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;

public class DataContainer<T> implements Iterable<T>{

    private T input;
    
    private T[] data;

    public DataContainer(T[] dataIn){
        this.data = dataIn;
    }

    public String print(T[] data){

        return null;
    }

    public int add(T item){
        int position;
        if (item == null){
            return -1;
        } else {
            if (data.length == 0){
                data = Arrays.copyOf(data, 1);
                data[0] = item;
                return 0;
            } else {
                for(position = 0; position < data.length; position++){
                    if(data[position] == null){
                        data[position] = item;
                        break;
                    } else if (data[position] != null && position == data.length - 1){
                        data = Arrays.copyOf(data, data.length + 1);
                        position = data.length - 1;
                        data[position] = item;
                        break;
                    }
                }
                return position;
            }
        }
    }

    public T get(int index){
        if (index >=0 && index < data.length){
            //System.out.println(data[index]);
            return data[index];
        } else {
            //System.out.println("null");
            return null;
        }
    }

    public T[] getItems() {
        return data;
    }

    public boolean delete(int index){
        if (index >= data.length){
            return false;
        } else {
            for (int i = index; i < data.length - 1; i++){
                data[i] = data[i+1];
            }
            data = Arrays.copyOf(data, data.length - 1);
            return true;
        }
    }

    public boolean delete(T item){
        boolean resultDelete;
        int index = 0;
        int deleteSwitch = 0;
        if (item == null){
            //System.out.println(resultDelete = false);
            return false;
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    continue;
                }
                if (data[i].equals(item)) {
                    this.data[i] = null;
                    index = i;
                    deleteSwitch++;
                    break;
                }
            }

            if (deleteSwitch > 0) {
                for (int k = index; k < data.length - 1; k++) {
                    data[k] = data[k + 1];
                }

                data = Arrays.copyOf(data, data.length - 1);

                //System.out.println(resultDelete = true);
                return true;
            } else {
                //System.out.println(resultDelete = false);
                return false;
            }
        }
    }

    public void sort(Comparator<? super T> comparator){

        if (data == null || data.length < 2){
            System.out.println("Некорректные данные!");
        }

        if (comparator == null){
            System.out.println("Не передан компаратор!");
        } else {
            for(int i = 0; i < data.length; i++){
                for(int j = data.length - 1; j > i; j--){
                    if (comparator.compare(data[j], data[j-1]) < 0){
                        T temp = data[j];
                        data[j] = data[j - 1];
                        data[j - 1] = temp;
                    }
                }
            }
        }
    }

    @Override
    public String toString(){
        int shrinkSwitch = 0;

        if (data == null || data.length < 2){
            return "[]";
        } else {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null){
                    shrinkSwitch++;
                    for (int k = i; k < data.length - 1; k++){
                        data[k] = data[k+1];
                    }
                }
            }
            for(int l = 0; l < shrinkSwitch; l++){
                data = Arrays.copyOf(data, data.length - 1);
            }
        }

        StringBuilder builder = new StringBuilder("[");

        for(int p = 0; p < data.length; p++){
            if(p != data.length - 1){
                builder.append(data[p]).append(", ");
            } else {
                builder.append(data[p]);
            }

        }

        builder.append("]");
        return builder.toString();
    }

    public static <T extends Comparable<T>> void sort(DataContainer<T> container){
        if (container == null || container.data == null || container.data.length < 2){
            return;
        }

        for(int i = 0; i < container.data.length; i++){
            for(int j = container.data.length - 1; j > i; j--){
                if (container.data[j].compareTo(container.data[j-1]) < 0){
                    T temp = container.data[j];
                    container.data[j] = container.data[j - 1];
                    container.data[j - 1] = temp;
                }
            }
        }
    }

    public static <T> void sort(DataContainer<T> container, Comparator<T> comparator){
        if (container == null || container.data == null || container.data.length < 2 || comparator == null){
            System.out.println("Некорректные данные!");
        } else {
            for(int i = 0; i < container.data.length; i++){
                for(int j = container.data.length - 1; j > i; j--){
                    if (comparator.compare(container.data[j], container.data[j-1]) < 0){
                        T temp = container.data[j];
                        container.data[j] = container.data[j - 1];
                        container.data[j - 1] = temp;
                    }
                }
            }
        }
    }

    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    private class DataContainerIterator implements Iterator<T> {
        private int position = 0;
        @Override
        public boolean hasNext() {
            return position < data.length;
        }

        @Override
        public T next() {
            if (!hasNext()){
                throw new NoSuchElementException("Нет больше элементов");
                //System.out.println("Нет элемента!");
            }
            return data[position++];
        }
    }

}
