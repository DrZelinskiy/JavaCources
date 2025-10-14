package home_work_1.task4;
//Определить нечётное число
import java.util.Scanner;

public class Subtask1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = console.nextInt();
        System.out.println("Enter number 2");
        int b = console.nextInt();

        boolean aIsOdd = isOdd(a);
        boolean bIsOdd = isOdd(b);

        if(aIsOdd && bIsOdd){
            System.out.println("Оба числа нечетные");
        } else if (aIsOdd){
            System.out.println(a);
        } else if (bIsOdd) {
            System.out.println(b);
        } else {
            System.out.println("Оба числа четные");
        }
    }

    private static boolean isOdd(int number){
        return number % 2 != 0;
    }
}
