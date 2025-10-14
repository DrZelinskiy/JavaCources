package home_work_1.task2;
//(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8
public class Subtask7 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        int d = 7;

        //int res27 = (a + d > 20 ? 68 >= 68 : 22 * b >> b++) / --c;
        //int res271 = a + d > 20 ? 68 >= 68 : 22 * b >> b++;
        Object res272 = (a + d > 20 ? 68 >= 68 : 22 * b >> b++);
        // не выполняется условия применения тернарного опреатора "любой = (булевый, любой, любой)"
        // при этом тип "любой" должен быть одинаковый
    }
}
