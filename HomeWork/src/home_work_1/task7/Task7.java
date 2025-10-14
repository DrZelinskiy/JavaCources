package home_work_1.task7;
//Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр и
//будет возвращать строку в отформатированном виде. В метод будет передаваться массив из 10 цифр (от 0 до 9).
//Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX. Например передан массив: {1,2,3,4,5,6,7,8,9,0},
//возвращаемый результат: (123) 456-7890. В задании нельзя использовать колекции, стрима.

public class Task7 {
    public static void main(String[] args) {
        int[] callNumber = new int[]{0,4,4,5,8,9,5,4,9,5};
        for (int element : callNumber) {
            System.out.print(element + " ");
        }
        System.out.println("\n");

        System.out.println(createPhoneNumber(callNumber));
    }

    public static String createPhoneNumber(int[] numbers) {

        return String.format("(%s%s%s) %s%s%s-%s%s%s%s",
                numbers[0],numbers[1],numbers[2],
                numbers[3],numbers[4],numbers[5],
                numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}


