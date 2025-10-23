package home_work_2.loops.sub4;

public class Subtask2 {
    public static void main(String[] args) {
        long a = 1;
        long previousStep;
        long nextStep;

        while (true) {
            previousStep = a;
            nextStep = a * 188;
            if (nextStep / 188 != a) {
                System.out.println("Значение до переполнения: " + previousStep);
                System.out.println("Значение после переполнения: " + nextStep);
                break;
            }
            a = nextStep;
        }
    }
}