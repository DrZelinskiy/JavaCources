package home_work_1.task3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        int a = newScanner.nextInt();
        System.out.println(a);

        int b = newScanner.nextInt();
        System.out.println(b);

        mathOper(a,b);

    }
    public static int mathOper (int firstNum, int secondNum){
        int result = Math.max(firstNum, secondNum);
        System.out.println("Max of " + firstNum + " and " + secondNum + " is " + result);
        return result;
    }
}
