package home_work_1.task2;
//(5 + 2++) / --8
//(5 + 2++) / --8  =  7 / 6 = 1.166 | 7 / 6 = 1
public class Subtask4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int res24 = (a + b++) / --c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Final reuslt: " + res24);
        System.out.println("//---------------------------------------//");
    }
}
