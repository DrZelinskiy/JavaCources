package home_work_1.task4;
//Перевести байты в килобайты или наоборот
//1 кбайт = 1024 байт

import java.util.Objects;
import java.util.Scanner;

public class Subtask4 {

    public final static int CONVERT_NUMBER = 1024;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float result;
        int resultInt;
        System.out.println("Введите значение!");
        float num = console.nextFloat();
        System.out.println("Байт или Килобайт?");
        console = new Scanner(System.in);
        String type = console.nextLine();
        if (Objects.equals(type, "Байт") | Objects.equals(type, "Килобайт")) {
            switch (type) {
                case "Байт":
                    //System.out.println(num + " Байт");
                    result = num / CONVERT_NUMBER;
                    System.out.println(num + " Байт = " + result + " Килобайт");
                    break;
                case "Килобайт":
                    //System.out.println(num + " Килобайт");
                    result = num * CONVERT_NUMBER;
                    resultInt = (int) result;
                    System.out.println(num + " Килобайт = " + resultInt + " Байт");
                    break;
                default:
            }
        } else {
            System.out.println("Введен непонятный тип! Выберите из предложенных!");
        }
    }
}
