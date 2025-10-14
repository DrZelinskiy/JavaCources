package home_work_1.task2;
//(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
//(5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8  =  (14 > 20 ? 68 : 44 >> 2) / 7  =  (false ? 68 : 11) / 7 = 11 / 7 = 1.571 | 1
public class Subtask6 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int d = 7;
        int res26 = (a + d > 20 ? 68 : 22 * b >> b++) / --c;
        // 5 + 7 > 20 ~~ false
        // 22 * 2 >> 2 ~~ 44 >> 2 ~~ 00101100 >> 2 ~~ 00001011 ~~ 11
        // false ? 68 : 11 ~~ 11
        // 11 / 7 = 1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Final reuslt: " + res26);
        System.out.println("//---------------------------------------//");
    }
}
