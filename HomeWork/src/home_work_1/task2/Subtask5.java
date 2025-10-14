package home_work_1.task2;
//(5 * 2 >> 2++) / --8
//(5 * 2 >> 2++) / --8  =  (10 >> 2) / 7  =  2 / 7 = 0.285 | 0
public class Subtask5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int res25 = (a * b >> b++) / --c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Final reuslt: " + res25);
        System.out.println("//---------------------------------------//");
    }
}
